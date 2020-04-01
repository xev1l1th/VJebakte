package com.server.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "createddate")
    private Date createdDate;

    private String authorname;
    private Long authorid;
    private String text;
    private String filename;

    public Comment() {

    }

    public Comment(Date createdDate, String authorname, Long authorid, String text) {
        this.createdDate = createdDate;
        this.authorname = authorname;
        this.authorid = authorid;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public Long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Long authorid) {
        this.authorid = authorid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
