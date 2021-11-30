package com.bur1y.tts.NewFiles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WindowInfo {
    protected static List<App> apps = new ArrayList<>();

    private static List<LocalDateTime> getActive(LocalDateTime startOfUse, LocalDateTime endOfUse){
        List<LocalDateTime> active = new ArrayList<>();
        active.add(startOfUse);
        active.add(endOfUse);
        return active;
    }

    private static List<LocalDateTime> getLifeCycle(LocalDateTime launchApp, LocalDateTime closeApp){
        List<LocalDateTime> lifeCycle = new ArrayList<>();
        lifeCycle.add(launchApp);
        lifeCycle.add(closeApp);
        return lifeCycle;
    }

    private static List<List<LocalDateTime>> getSession(List<LocalDateTime> lifeCycle, List<LocalDateTime> active){
        List<List<LocalDateTime>> session = new ArrayList<>();
        session.add(lifeCycle);
        session.add(active);
        return session;
    }

    public static void main(String[] args) {

    }

}
