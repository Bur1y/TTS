package com.bur1y.tts.NewFiles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    /**
     * [...] - LocalDateTime
     * [[launch app n, close app n, [[Start of use n],[End Of use n] , [Start of use n],[End Of use n]]]    ,   [... , ..., [[...],[...] , [...],[...]]]]
     */
    private List<List<List<LocalDateTime>>> fullLifeCycle = new ArrayList<>();
    private String name;

    public App(String name, List<List<LocalDateTime>> lifeCycle){
        this.name = name;
        this.fullLifeCycle.add(lifeCycle);
    }

    public App(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<List<LocalDateTime>>> getFullLifeCycle(){
        return fullLifeCycle;
    }

    @Override
    public String toString(){
        return "App{" +
                "nameApp = '" + name + '\'' +
                ", Full life cycle = '" + fullLifeCycle + '\'' +
                '}';
    }

}
