package com.bur1y.tts.functions;

import com.bur1y.tts.ApplicationInfo;
import com.sun.jna.platform.DesktopWindow;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.sun.jna.platform.WindowUtils.*;

public class WindowInfo {

    private static Duration d = Duration.ZERO;
    public static List<ApplicationInfo> applicationInfoList = new ArrayList<>();

    public interface User32 extends StdCallLibrary {
        WinDef.HWND hwnd = com.sun.jna.platform.win32.User32.INSTANCE.GetForegroundWindow();
    }

    /**
     * @return Active window name
     */
    protected static String getWindowTittle(WinDef.HWND hwnd) {
        return getWindowTitle(hwnd);
    }

    /**
     * @return Path of the executable file of the active window
     */
    protected static String getWindowPFP(WinDef.HWND hwnd) {
        return getProcessFilePath(hwnd);
    }

    protected static List<DesktopWindow> getListWindows(){
        return getAllWindows(true);
    }

    public static void updateApp() {

        for (DesktopWindow dw : getListWindows()) {
            ApplicationInfo ai = new ApplicationInfo(Regex.getActiveWindowPathName(dw.getHWND()),Regex.getActiveWindowTitleName(dw.getHWND()),d,d);
            if(ai.getAdditionalInfo() != null || !(ai.getNameApp().equals("explorer"))){
                applicationInfoList.add(ai);
            }
        }
    }
}
