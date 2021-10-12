package com.bur1y.tts.functions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final Pattern titleName = Pattern.compile("^[T][T][S]", Pattern.CASE_INSENSITIVE);
    private static final Pattern appName = Pattern.compile("[\\d\\w]+(?=\\.exe$)", Pattern.CASE_INSENSITIVE);

    private static Matcher matcher;

    public static String getActiveWindowTitleName() {
        matcher = titleName.matcher(WindowInfo.getActiveWindowTittle());
        matcher.find();
        return matcher.group();
    }

    public static String getActiveWindowPathName() {
        matcher = appName.matcher(WindowInfo.getActiveWindowPFP());
        matcher.find();
        return matcher.group();
    }

}
