package com.bur1y.tts.functions;

import com.bur1y.tts.ApplicationInfo;
import com.sun.jna.platform.win32.User32;

import java.time.Duration;

public class Cheker {

    private static Duration s = Duration.ofSeconds(1);

    public static void main(String[] args) throws InterruptedException {

        WindowInfo.updateApp();
        for (int i = 0; i < 20; i++) {
            addActiveTime();
            addBackGrountTime();
            Thread.sleep(1000);
        }
        System.out.println(WindowInfo.applicationInfoList);

    }

    public static void addActiveTime() {
        for (ApplicationInfo ai : WindowInfo.applicationInfoList) {
            if (ai.getNameApp().equals(Regex.getActiveWindowPathName(User32.INSTANCE.GetForegroundWindow()))) {
                ai.setActiveTime(ai.getActiveTime().plus(s));
                System.out.println("Активное окно " + ai.getNameApp() + " | " + ai.getActiveTime() + " +1");
            }
        }
    }

    public static void addBackGrountTime() {
        for (ApplicationInfo ai : WindowInfo.applicationInfoList) {
            if (!(ai.getNameApp().equals(Regex.getActiveWindowPathName(User32.INSTANCE.GetForegroundWindow())))) {
                ai.setBackgroundTime(ai.getBackgroundTime().plus(s));
                System.out.println("Пассивное " + ai.getNameApp() + " | " + ai.getBackgroundTime() + " +1");
            }
        }
    }
}
