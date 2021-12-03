package com.bur1y.tts.Database.Tables;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.Instant;

@Entity
public class Activity {
    @EmbeddedId
    private ActivityId id;

    @Column(name = "startOfUse")
    private Instant startOfUse;

    @Column(name = "endOfUse")
    private Instant endOfUse;

    public Instant getEndOfUse() {
        return endOfUse;
    }

    public void setEndOfUse(Instant endOfUse) {
        this.endOfUse = endOfUse;
    }

    public Instant getStartOfUse() {
        return startOfUse;
    }

    public void setStartOfUse(Instant startOfUse) {
        this.startOfUse = startOfUse;
    }

    public ActivityId getId() {
        return id;
    }

    public void setId(ActivityId id) {
        this.id = id;
    }
}