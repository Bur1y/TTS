package com.bur1y.tts.NewFiles;

import com.bur1y.tts.ApplicationInfo;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class WindowInfo {
    protected static List<App> apps = new ArrayList<>();

    private static void startSession() throws InterruptedException {
        com.bur1y.tts.functions.WindowInfo.updateApp();
        for (ApplicationInfo ai : com.bur1y.tts.functions.WindowInfo.applicationInfoList) {
            App app = new App(ai.getNameApp());
            apps.add(updateApp("open",app));
//            apps.set(apps.size() - 1, updateApp("close",app));
        }
        Thread.sleep(1000);
    }

    private static App updateApp(String action, App app){
        switch (action){
            case "open" -> {
                List<List<LocalDateTime>> lifeCycle = new ArrayList<>();
                List<LocalDateTime> launchApp = new ArrayList<>();
                lifeCycle.add(launchApp);
                launchApp.add(LocalDateTime.now(Clock.tickSeconds(ZoneId.systemDefault())));
                app.getFullLifeCycle().add(lifeCycle);
                return app;
            }
            case "close" -> {
                List<LocalDateTime> closeApp = new ArrayList<>();
                closeApp.add(LocalDateTime.now(Clock.tickSeconds(ZoneId.systemDefault())));
                app.getFullLifeCycle().get(app.getFullLifeCycle().size() - 1).add(closeApp);
                return app;
            }

            default -> {
                return app;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        startSession();
        System.out.println(apps);
    }

}
