package com.example.contactservice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        service.addContact(contact);
        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        service.addContact(contact);
        service.deleteContact("12345");

        assertNull(service.getContact("12345"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        service.addContact(contact);
        service.updateContact("12345", "Jane", "Smith", "0987654321", "456 Elm St");

        Contact updatedContact = service.getContact("12345");
        assertEquals("Jane", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("456 Elm St", updatedContact.getAddress());
    }
}
