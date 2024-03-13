package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.pojo.Contact;

public interface ContactService {
    List<Contact> getContacts();

    Contact getContactById(String id);

    void saveContact(Contact contact);
}
