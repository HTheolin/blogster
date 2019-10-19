package com.blogster.entity;

import javax.persistence.*;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @ManyToOne
    private Blogger blogger;

    @ManyToOne
    private Comment comment;

    private String headLine;
    private String post;

    @Override
    public String toString() {
        return "BlogPost{" +
                "Id=" + Id +
                ", blogger=" + blogger +
                ", comment=" + comment +
                ", headLine='" + headLine + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public void setId(long id) {
        Id = id;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
