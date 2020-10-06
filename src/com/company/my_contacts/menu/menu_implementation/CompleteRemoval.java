package com.company.my_contacts.menu.menu_implementation;

import com.company.my_contacts.AddressBook;
import com.company.my_contacts.Menu;
import com.company.my_contacts.menu.menu_action.MenuAction;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CompleteRemoval implements MenuAction {

    private Scanner scanner;
    private PrintStream out;
    private String name;
    private AddressBook addressBook;

    public CompleteRemoval(Scanner scanner, PrintStream out, AddressBook addressBook) {
        this.scanner = scanner;
        this.out = out;
        this.name = " Удаление человека из справочника";
        this.addressBook = addressBook;
    }

    @Override
    public String getActionName() {
        return name;
    }

    @Override
    public void execute() throws IOException {
        out.println(" Введите порядковый номер абонента");
        int serialNumber = Integer.parseInt(scanner.nextLine());
        addressBook.deletingPersonAndContact(serialNumber);
    }

    @Override
    public boolean exitMethod() {
        return false;
    }
}
