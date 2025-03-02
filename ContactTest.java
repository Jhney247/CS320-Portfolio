package com.example.contactservice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    @Test
    void testContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "1234567890", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345", "John", "Doe", "123", "123 Main St"));
    }
}
