package com.bur1y.tts;

import java.time.Duration;

public class ApplicationInfo {
    private String nameApp;
    private String additionalInfo;
    private Duration activeTime;
    private Duration backgroundTime;

    public ApplicationInfo(String nameApp, String additionalInfo, Duration activeTime, Duration backgroundTime) {
        this.nameApp = nameApp;
        this.additionalInfo = additionalInfo;
        this.activeTime = activeTime;
        this.backgroundTime = backgroundTime;
    }

    //Getters

    public String getNameApp() {
        return nameApp;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public Duration getActiveTime() {
        return activeTime;
    }

    public Duration getBackgroundTime() {
        return backgroundTime;
    }

    //Setters

    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setActiveTime(Duration activeTime) {
        this.activeTime = activeTime;
    }

    public void setBackgroundTime(Duration backgroundTime) {
        this.backgroundTime = backgroundTime;
    }

    @Override
    public String toString() {
        return "ApplicationInfo{" +
                "nameApp='" + nameApp + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", activeTime=" + activeTime +
                ", backgroundTime=" + backgroundTime +
                '}';
    }
}
