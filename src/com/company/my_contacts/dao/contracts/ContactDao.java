package com.company.my_contacts.dao.contracts;

import com.company.my_contacts.entities.Contact;

import java.util.List;

public interface ContactDao {

    List<Contact> getAllContact();
    void addPersonContact(Contact contact);
    void removePersonContact(Long id);
    void removeAnIndividualContact(String value);
}
