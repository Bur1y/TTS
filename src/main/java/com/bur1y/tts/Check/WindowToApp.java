package com.bur1y.tts.Check;

import com.bur1y.tts.App.App;
import com.bur1y.tts.App.AppInfo;
import com.bur1y.tts.Window.WindowApp;
import com.bur1y.tts.Window.WindowInfo;

public class WindowToApp {
    public static void firstInit(){
        WindowInfo.getLaunchedApps();
        for(WindowApp windowApp : WindowInfo.windowAppList){
            App app = new App(windowApp.getName());
            System.out.println(windowApp);
            System.out.println(app);
            AppInfo.apps.add(app);
        }
        System.out.println(AppInfo.apps);
    }
}
