package com.bur1y.tts.Database.Tables;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class App {
    @EmbeddedId
    private AppId id;

    public AppId getId() {
        return id;
    }

    public void setId(AppId id) {
        this.id = id;
    }
}