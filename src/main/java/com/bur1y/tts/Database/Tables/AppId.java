package com.bur1y.tts.Database.Tables;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AppId implements Serializable {
    private static final long serialVersionUID = 9157926657283521073L;
    @Column(name = "idApp", nullable = false)
    private Integer idApp;
    @Column(name = "Users_idUsers", nullable = false)
    private Integer usersIdusers;

    public Integer getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(Integer usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    public Integer getIdApp() {
        return idApp;
    }

    public void setIdApp(Integer idApp) {
        this.idApp = idApp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idApp, usersIdusers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AppId entity = (AppId) o;
        return Objects.equals(this.idApp, entity.idApp) &&
                Objects.equals(this.usersIdusers, entity.usersIdusers);
    }
}