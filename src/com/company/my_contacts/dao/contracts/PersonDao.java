package com.company.my_contacts.dao.contracts;

import com.company.my_contacts.entities.Person;

import java.util.List;

public interface PersonDao {
    List<Person> getAll();
    void addPerson(Person p);
    void removePerson(Long id);
}
