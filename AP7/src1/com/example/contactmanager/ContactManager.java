package com.example.contactmanager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts;
    private Map<String, Contact> contactsByName;

    public ContactManager() {
        contacts = new HashSet<>();
        contactsByName = new HashMap<>();
    }

    public boolean addContact(Contact contact) {
        if (contacts.add(contact)) {
            contactsByName.put(contact.getName(), contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(String name) {
        Contact contact = contactsByName.remove(name);
        if (contact != null) {
            return contacts.remove(contact);
        }
        return false;
    }

    public Contact findContactByName(String name) {
        return contactsByName.get(name);
    }

    public Set<Contact> getAllContacts() {
        return contacts;
    }

    public void printAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        Contact contact1 = new Contact("John Doe", "123-456-7890", "john@example.com");
        Contact contact2 = new Contact("Jane Smith", "987-654-3210", "jane@example.com");

        manager.addContact(contact1);
        manager.addContact(contact2);

        System.out.println("All Contacts:");
        manager.printAllContacts();

        System.out.println("\nFinding contact by name 'Jane Smith':");
        System.out.println(manager.findContactByName("Jane Smith"));

        System.out.println("\nRemoving contact 'John Doe':");
        manager.removeContact("John Doe");

        System.out.println("\nAll Contacts after removal:");
        manager.printAllContacts();
    }
}