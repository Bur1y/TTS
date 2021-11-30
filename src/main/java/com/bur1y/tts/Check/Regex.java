package com.bur1y.tts.Check;

import com.bur1y.tts.Window.WindowInfo;
import com.sun.jna.platform.win32.WinDef;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final Pattern titleName = Pattern.compile(".+", Pattern.CASE_INSENSITIVE);
    private static final Pattern appName = Pattern.compile("[\\s\\d\\w]+(?=\\.exe$)", Pattern.CASE_INSENSITIVE);

    private static Matcher matcher;


    public static String getWindowTitleName(WinDef.HWND hwnd) {
        try {
            matcher = titleName.matcher(WindowInfo.getWindowTittle(hwnd));
            matcher.find();
            return matcher.group();
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }

    public static String getWindowPathName(WinDef.HWND hwnd) {
        try {
            matcher = appName.matcher(WindowInfo.getWindowPFP(hwnd));
            matcher.find();
            return matcher.group();
        } catch (Exception e) {
            // e.printStackTrace();
            return null;
        }
    }

}
