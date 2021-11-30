package com.bur1y.tts.NewFiles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    /** Scheme App class
     *
     * LvL 3 Sessions - [[Session 1], [Session 2], [Session n]]
     * LvL 2 Session - [[LifeCycle], [Active 1], [Active n]]
     * LvL 1 LifeCycle - [TimeLaunchApp, TimeCloseApp]
     *       Active - [StartOfUse, EndOfUse]
     * LvL 0 StartOfUse - [...]
     *       EndOfUse - [...]
     *
     * [...] - LocalDateTime
     */

    private List<List<List<LocalDateTime>>> sessions = new ArrayList<>();
    private LocalDateTime name;

    public App(LocalDateTime name, List<List<LocalDateTime>> session){
        this.name = name;
        this.sessions.add(session);
    }

    public LocalDateTime getName() {
        return name;
    }

    public void setName(LocalDateTime name) {
        this.name = name;
    }

    public void addSession(List<List<LocalDateTime>> session){
        this.sessions.add(session);
    }
    public void addActive(List<LocalDateTime> active){
        this.sessions.get(sessions.size() - 1).add(active);
    }

    @Override
    public String toString(){
        return "App{" +
                "nameApp = '" + name + '\'' +
                ", Sessions = '" + sessions + '\'' +
                '}';
    }
}
