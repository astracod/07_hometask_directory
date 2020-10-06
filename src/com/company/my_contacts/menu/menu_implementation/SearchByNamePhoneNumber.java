package com.company.my_contacts.menu.menu_implementation;

import com.company.my_contacts.AddressBook;
import com.company.my_contacts.Menu;
import com.company.my_contacts.menu.menu_action.MenuAction;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SearchByNamePhoneNumber implements MenuAction {

    private Scanner scanner;
    private PrintStream out;
    private AddressBook addressBook;
    private String name;

    public SearchByNamePhoneNumber(Scanner scanner, PrintStream out, AddressBook addressBook) {
        this.scanner = scanner;
        this.out = out;
        this.addressBook = addressBook;
        this.name = " Поиск человека по номеру телефона";
    }

    @Override
    public String getActionName() {
        return name;
    }

    @Override
    public void execute() throws IOException {
        out.println(" Введите номер или почту абонента");
        String marker = scanner.nextLine();
        String res = addressBook.searchByPhoneNumber(marker);
        out.println(res);
    }

    @Override
    public boolean exitMethod() {
        return false;
    }
}
