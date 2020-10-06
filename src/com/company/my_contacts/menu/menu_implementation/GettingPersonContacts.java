package com.company.my_contacts.menu.menu_implementation;

import com.company.my_contacts.AddressBook;
import com.company.my_contacts.Menu;
import com.company.my_contacts.entities.Contact;
import com.company.my_contacts.menu.menu_action.MenuAction;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class GettingPersonContacts implements MenuAction {
    private Scanner scanner;
    private PrintStream out;
    private AddressBook addressBook;
    private String name;

    public GettingPersonContacts(Scanner scanner, PrintStream out, AddressBook addressBook) {
        this.scanner = scanner;
        this.out = out;
        this.addressBook = addressBook;
        this.name = " Получение контактов человека";
    }

    @Override
    public String getActionName() {
        return name;
    }

    @Override
    public void execute() throws IOException {
        out.println(" Введите порядковый номер абонента");
        int number = Integer.parseInt(scanner.nextLine());
        List<Contact> per = addressBook.getInformationAboutPerson(number);
        for (Contact contact : per){
            out.println(contact.getValue()+" "+contact.getType());
        }
    }

    @Override
    public boolean exitMethod() {
        return false;
    }
}
