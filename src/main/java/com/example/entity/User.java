package com.example.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  @NotNull
  private String name;

  private String email;

}