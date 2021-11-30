package com.bur1y.tts.Window;

import com.bur1y.tts.Check.Regex;
import com.sun.jna.platform.DesktopWindow;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

import java.util.ArrayList;
import java.util.List;

import static com.sun.jna.platform.WindowUtils.*;

public class WindowInfo {

    public interface User32 extends StdCallLibrary {
        WinDef.HWND hwnd = com.sun.jna.platform.win32.User32.INSTANCE.GetForegroundWindow();
    }

    public static List<WindowApp> windowAppList = new ArrayList<>();


    /**
     * @return Active window name
     */
    public static String getWindowTittle(WinDef.HWND hwnd) {
        return getWindowTitle(hwnd);
    }

    /**
     * @return Path of the executable file of the active window
     */
    public static String getWindowPFP(WinDef.HWND hwnd) {
        return getProcessFilePath(hwnd);
    }

    protected static List<DesktopWindow> getListWindows() {
        return getAllWindows(true);
    }

    public static void getLaunchedApps() {
        windowAppList.clear();
        for (DesktopWindow dw : getListWindows()) {
            WindowApp wApp = new WindowApp(Regex.getWindowPathName(dw.getHWND()), Regex.getWindowTitleName(dw.getHWND()), "Background");
            if (wApp.getAdditionalInfo() != null || !(wApp.getName().equals("explorer"))) {
                windowAppList.add(wApp);
            }
        }
    }

    public static void setActiveWindow() {
        for (WindowApp windowApp : windowAppList) {
            if (windowApp.getName().equals(Regex.getWindowPathName(com.sun.jna.platform.win32.User32.INSTANCE.GetForegroundWindow()))) {
                windowApp.setCondition("Active");
                System.out.println("Активное окно " + windowApp.getName());
            } else {
                windowApp.setCondition("Background");
            }
        }
    }

}
