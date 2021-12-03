package com.bur1y.tts.Check;

import com.bur1y.tts.App.App;
import com.bur1y.tts.App.AppInfo;
import com.bur1y.tts.Window.WindowApp;

public class WindowToApp {
    public static void setInfo(WindowApp windowApp){
        switch (windowApp.getCondition()){
            case "Active" -> {

            }
            case "Closed" -> {

            }
            case "Background" -> {

            }
        }
    }

    public static void addApp(WindowApp windowApp){
        App app = new App(windowApp.getName());
        AppInfo.apps.add(app);
    }

    public static void launchApp(App app){

    }

    public static void closeApp(App app){

    }

    public static void updateApp(App app){

    }

    public static void startOfUseApp(App app){

    }

    public static void endOfUseApp(App app){

    }




}
