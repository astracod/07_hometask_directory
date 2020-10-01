package com.company.my_contacts;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public class Contact_book {
    private ArrayList<Person> book;
    private ArrayList<String> contacts;


    public Contact_book() {

        book = new ArrayList<>();
        contacts = new ArrayList<>();
    }

    public void outStreamHumans() throws IOException {
        Writer outward1 = new FileWriter("C:/Users/Admin/Desktop/humans.txt");
        PrintWriter out1 = new PrintWriter(outward1);
        out1.print(book);
        out1.flush();
        out1.close();
    }

    public void outStreamContacts() throws IOException {
        Writer outward = new FileWriter("C:/Users/Admin/Desktop/contacts.txt");
        PrintWriter out = new PrintWriter(outward);
        out.print(contacts);
        out.flush();
        out.close();
    }

    public void addPerson(Person person) throws IOException {
        book.add(person);
        outStreamHumans();
    }

    /*   contacts.txt
        —————————————————————
        +380687747270 phone 214739
        vasia@gmail.com email 214739
        +380660002211 phone 471104
        */

    public int getNam(int i) {
        i -= 1;
        return book.get(i).getId();
    }

    public void createContact(int num, String contact) throws IOException {
        contacts.add(String.valueOf(new Phone(num, contact)));
        outStreamContacts();
    }

    public void show() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

    @Override
    public String toString() {
        String a = "";
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }
        return a;
    }


}
