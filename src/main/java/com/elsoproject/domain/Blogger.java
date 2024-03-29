package com.elsoproject.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Blogger {
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private int age;
  @OneToMany(mappedBy = "blogger")
  private List<Story> stories;
  
  public Blogger() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<Story> getStories() {
    return stories;
  }

  public void setStories(ArrayList<Story> stories) {
    this.stories = stories;
  }
  
  
}
