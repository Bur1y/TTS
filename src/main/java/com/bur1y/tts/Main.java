package com.bur1y.tts;


import com.bur1y.tts.App.App;
import com.bur1y.tts.App.AppInfo;
import com.bur1y.tts.Check.WindowToApp;
import com.bur1y.tts.Window.WindowApp;
import com.bur1y.tts.Window.WindowInfo;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        App test1 = new App("test");
        AppInfo.apps.add(test1);

        while (true) {
            WindowInfo.getLaunchedApps();
            WindowInfo.setActiveWindow();

            System.out.println(AppInfo.apps);
            Thread.sleep(10000);
        }
    }
}
