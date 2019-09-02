package com.elsoproject.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Story {
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String content;
  private Date posted;
  @ManyToOne
  private Blogger blogger;

  public Story() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  public Date getPosted() {
    return posted;
  }

  public void setPosted(Date posted) {
    this.posted = posted;
  }

  public Blogger getBlogger() {
    return blogger;
  }

  public void setBlogger(Blogger blogger) {
    this.blogger = blogger;
  }

  @Override
  public String toString() {
    return "Story{" + "title=" + title + '}';
  }
  
}
