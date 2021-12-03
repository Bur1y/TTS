package com.bur1y.tts.Database.Tables;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ActivityId implements Serializable {
    private static final long serialVersionUID = 2385944521137021306L;
    @Column(name = "idActivity", nullable = false)
    private Integer idActivity;
    @Column(name = "LifeCycle_idLifeCycle", nullable = false)
    private Integer lifecycleIdlifecycle;
    @Column(name = "LifeCycle_App_idApp", nullable = false)
    private Integer lifecycleAppIdapp;
    @Column(name = "LifeCycle_App_Users_idUsers", nullable = false)
    private Integer lifecycleAppUsersIdusers;

    public Integer getLifecycleAppUsersIdusers() {
        return lifecycleAppUsersIdusers;
    }

    public void setLifecycleAppUsersIdusers(Integer lifecycleAppUsersIdusers) {
        this.lifecycleAppUsersIdusers = lifecycleAppUsersIdusers;
    }

    public Integer getLifecycleAppIdapp() {
        return lifecycleAppIdapp;
    }

    public void setLifecycleAppIdapp(Integer lifecycleAppIdapp) {
        this.lifecycleAppIdapp = lifecycleAppIdapp;
    }

    public Integer getLifecycleIdlifecycle() {
        return lifecycleIdlifecycle;
    }

    public void setLifecycleIdlifecycle(Integer lifecycleIdlifecycle) {
        this.lifecycleIdlifecycle = lifecycleIdlifecycle;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifecycleAppUsersIdusers, lifecycleIdlifecycle, idActivity, lifecycleAppIdapp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ActivityId entity = (ActivityId) o;
        return Objects.equals(this.lifecycleAppUsersIdusers, entity.lifecycleAppUsersIdusers) &&
                Objects.equals(this.lifecycleIdlifecycle, entity.lifecycleIdlifecycle) &&
                Objects.equals(this.idActivity, entity.idActivity) &&
                Objects.equals(this.lifecycleAppIdapp, entity.lifecycleAppIdapp);
    }
}