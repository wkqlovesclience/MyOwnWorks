package com.sclience.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 王克强 on 2018/9/25.
 */
@Table(name = "poets")
@Entity
public class Poet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name="created_at")
    @Temporal(value=TemporalType.DATE)
    private Date createDate;
    @Column(name="update_at")
    @Temporal(value=TemporalType.DATE)
    private Date updateDate;

    public Poet() {
    }

    public Poet(int id, String name, Date createDate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Poet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
