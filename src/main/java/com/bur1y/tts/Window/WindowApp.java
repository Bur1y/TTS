package com.bur1y.tts.Window;

public class WindowApp {
    private String name;
    private String additionalInfo;
    private String condition;

    public WindowApp(String name, String additionalInfo, String condition){
        this.name = name;
        this.additionalInfo = additionalInfo;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString(){
        return "App{" +
                "Name = '" + name + '\'' +
                ", Additional info = '" + additionalInfo + '\'' +
                "condition = '" + condition + '\'' +
                '}';
    }
}
