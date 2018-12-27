package com.sclience.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 王克强 on 2018/9/25.
 */
@Table(name = "poetries")
public class Poetry implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    @Column(name="created_at")
    @Temporal(value=TemporalType.DATE)
    private Date createDate;
    @Column(name="update_at")
    @Temporal(value=TemporalType.DATE)
    private Date updateDate;

    private String port_id;
//    private Poet poet;

    public Poetry() {
    }

    public Poetry(String title, String content, Date createDate, Date updateDate, String port_id) {
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.port_id = port_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getPort_id() {
        return port_id;
    }

    public void setPort_id(String port_id) {
        this.port_id = port_id;
    }

    @Override
    public String toString() {
        return "Poetry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", port_id='" + port_id + '\'' +
                '}';
    }
}
