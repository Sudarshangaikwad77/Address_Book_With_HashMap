package com.bl.address__book;
import java.util.*;

public class AddressBook

{
    private Map<String, Contact> contacts;

    public AddressBook()
    {
        contacts = new HashMap<>();
    }

    public void addContact(String firstName, String lastName, String address, String city, String state, int zip, String phone, String email) {
        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
        contacts.put(firstName + " " + lastName, contact);
    }

    public Contact getContact(String name) {
        return contacts.get(name);
    }

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        book.addContact("sudarshan", "Gaikwad", "Pandharpur", "Pnadharpur", "MH", 673883, "8308622248", "sgaikwad@gmail.com");
        book.addContact("samir", "Jagtap", "Solapur", "Solapuur", "MH", 413304, "7463837933", "samirjagtap77@gmail.com");

        //  Contact sudarshan = book.getContact("samir jagtap");
        // System.out.println(sudarshan.getAddress()); // should print "first contact"

        List<Contact> allContacts = book.getAllContacts();
        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName()+ "  "+contact.getEmail()+" "+contact.getAddress()+" "+contact.getCity()+" "+contact.getState()+" "+contact.getZip()+" "+contact.getPhone()
            );
        }
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

