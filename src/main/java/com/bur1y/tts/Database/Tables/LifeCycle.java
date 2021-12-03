package com.bur1y.tts.Database.Tables;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.Instant;

@Entity
public class LifeCycle {
    @EmbeddedId
    private LifeCycleId id;

    @Column(name = "startApp")
    private Instant startApp;

    @Column(name = "closeApp")
    private Instant closeApp;

    public Instant getCloseApp() {
        return closeApp;
    }

    public void setCloseApp(Instant closeApp) {
        this.closeApp = closeApp;
    }

    public Instant getStartApp() {
        return startApp;
    }

    public void setStartApp(Instant startApp) {
        this.startApp = startApp;
    }

    public LifeCycleId getId() {
        return id;
    }

    public void setId(LifeCycleId id) {
        this.id = id;
    }
}