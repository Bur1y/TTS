package com.bur1y.tts.functions;

import com.bur1y.tts.ApplicationInfo;
import com.sun.jna.platform.win32.User32;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cheker {

    private static Duration s = Duration.ofSeconds(1);

    public static void main(String[] args) throws InterruptedException {

        WindowInfo.updateApp();
        getInfo();
        System.out.println(applicationList.toArray());
    }

    public static List<Application> applicationList = new ArrayList<>();

    public static void getInfo() {
        for (ApplicationInfo ai : WindowInfo.applicationInfoList) {

                Application app = new Application(ai.getNameApp());
                applicationList.add(app);
                System.out.println("Добавленно окно " + ai.getNameApp());
        }
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
