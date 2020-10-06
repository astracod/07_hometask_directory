package com.company.my_contacts.menu.menu_implementation;

import com.company.my_contacts.AddressBook;
import com.company.my_contacts.entities.Person;
import com.company.my_contacts.menu.menu_action.MenuAction;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class ViewingTheDirectory implements MenuAction {

    private Scanner scanner;
    private PrintStream out;
    private String name;
    private AddressBook addressBook;

    public ViewingTheDirectory(Scanner scanner, PrintStream out, AddressBook addressBook) {
        this.scanner = scanner;
        this.out = out;
        this.name = " Просмотр людей в справочнике";
        this.addressBook = addressBook;
    }

    @Override
    public String getActionName() {
        return name;
    }

    @Override
    public void execute() throws IOException {
       List<Person> per = addressBook.showDirectory();
        for (Person person : per) {
            System.out.println(person.getSurname() + " " + person.getName() + " " + person.getPatronymic() + " " + person.getId());
        }
    }

    @Override
    public boolean exitMethod() {
        return false;
    }
}
