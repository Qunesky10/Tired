/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donsoft.service;

import java.util.List;
import com.donsoft.model.Person;

/**
 *
 * @author Donchi4all
 */
public interface PersonService {
     public void addPerson(Person p);
    public List<Person> listPersons();
}
