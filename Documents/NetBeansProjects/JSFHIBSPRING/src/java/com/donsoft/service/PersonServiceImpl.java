/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donsoft.service;

import com.donsoft.dao.PersonDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.transaction.Transactional;
import com.donsoft.model.Person;
import org.springframework.stereotype.Service;

/**
 *
 * @author Donchi4all
 */
@Service
@ManagedBean(name="personService")
@SessionScoped
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;
	 
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
 
    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }
 
    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
 
}