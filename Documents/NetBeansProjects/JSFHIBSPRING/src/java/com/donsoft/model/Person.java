/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donsoft.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Donchi4all
 */
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity(name="PERSON")
//@Table(name="PERSON")
@ManagedBean(name="person")
public class Person {
//	@Id
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@GeneratedValue(generator = "increment")
//@GenericGenerator(name = "increment", strategy = "increment")
    private int id;
     
    @Column (name ="name")
    private String name;
     
    @Column (name = "country")
    private String country;
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
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
     
    @Override
    public String toString(){
        return "id="+id+", name="+name+", country="+country;
    }
}