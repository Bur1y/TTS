package com.bur1y.tts.functions;

import com.bur1y.tts.ApplicationInfo;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class WindowFunctions {

    private static List<Application> applicationList = new ArrayList<>();

    private static Duration d = Duration.ofSeconds(1);

    public static void main(String[] args) {
        addApp();
        for (Application as : applicationList) {
            System.out.println("Имя окна: " + as.getNameApp() + " | Время старта: " + as.getListsLifeTime());
        }
    }


    private static void addApp() {
        WindowInfo.updateApp();
        for (ApplicationInfo ai : WindowInfo.applicationInfoList) {
            Application app = new Application(ai.getNameApp(),LocalDateTime.now(Clock.tickSeconds(ZoneId.systemDefault())),d);
            applicationList.add(app);
            System.out.println("Добавленно окно " + ai.getNameApp());
        }
    }

    private static void activeTime(){

    }

    private static void backgroundTime(){

    }

    private static void updateApp() {

    }

    private static void closeApp() {

    }

}
