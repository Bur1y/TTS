package com.bur1y.tts.Database.Tables;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LifeCycleId implements Serializable {
    private static final long serialVersionUID = 5174800149230416352L;
    @Column(name = "idLifeCycle", nullable = false)
    private Integer idLifeCycle;
    @Column(name = "App_idApp", nullable = false)
    private Integer appIdapp;
    @Column(name = "App_Users_idUsers", nullable = false)
    private Integer appUsersIdusers;

    public Integer getAppUsersIdusers() {
        return appUsersIdusers;
    }

    public void setAppUsersIdusers(Integer appUsersIdusers) {
        this.appUsersIdusers = appUsersIdusers;
    }

    public Integer getAppIdapp() {
        return appIdapp;
    }

    public void setAppIdapp(Integer appIdapp) {
        this.appIdapp = appIdapp;
    }

    public Integer getIdLifeCycle() {
        return idLifeCycle;
    }

    public void setIdLifeCycle(Integer idLifeCycle) {
        this.idLifeCycle = idLifeCycle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appUsersIdusers, idLifeCycle, appIdapp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LifeCycleId entity = (LifeCycleId) o;
        return Objects.equals(this.appUsersIdusers, entity.appUsersIdusers) &&
                Objects.equals(this.idLifeCycle, entity.idLifeCycle) &&
                Objects.equals(this.appIdapp, entity.appIdapp);
    }
}