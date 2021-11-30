package com.bur1y.tts.functions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private String nameApp;
    private List<List<LocalDateTime>> listsUsageTime;
    private List<LocalDateTime> listsLifeTime = new ArrayList<>();
    private Duration backgroundDuration;

    public Application(String nameApp, LocalDateTime listsLifeTime, Duration backgroundDuration){
        this.nameApp = nameApp;
        this.listsLifeTime.add(listsLifeTime);
        this.backgroundDuration = backgroundDuration;
    }
    public Application(String nameApp){
        this.nameApp = nameApp;
    }

    public String getNameApp() {
        return nameApp;
    }

    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }



    public Duration getBackgroundDuration() {
        return backgroundDuration;
    }

    public void setBackgroundDuration(Duration backgroundDuration) {
        this.backgroundDuration = backgroundDuration;
    }

    public List<LocalDateTime> getListsLifeTime() {
        return listsLifeTime;
    }

    public void setListsLifeTime(List<LocalDateTime> listsLifeTime) {
        this.listsLifeTime = listsLifeTime;
    }
}
