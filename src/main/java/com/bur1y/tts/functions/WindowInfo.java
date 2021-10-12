package com.bur1y.tts.functions;

import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

import static com.sun.jna.platform.WindowUtils.*;

public class WindowInfo {

    private interface User32 extends StdCallLibrary {
        WinDef.HWND hwnd = com.sun.jna.platform.win32.User32.INSTANCE.GetForegroundWindow();
    }

    /**
     * @return Active window name
     */
    protected static String getActiveWindowTittle() {
        return getWindowTitle(User32.hwnd);
    }

    /**
     * @return Path of the executable file of the active window
     */
    protected static String getActiveWindowPFP() {
        return getProcessFilePath(User32.hwnd);
    }
}
