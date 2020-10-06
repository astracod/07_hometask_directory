package com.company.my_contacts.menu.menu_implementation;

import com.company.my_contacts.Menu;
import com.company.my_contacts.menu.menu_action.MenuAction;

import java.io.IOException;
import java.io.PrintStream;

public class ExitMethod implements MenuAction {

    private PrintStream out;

    public ExitMethod(PrintStream out) {
        this.out = out;
    }

    @Override
    public String getActionName() {
        return " Выход";
    }

    @Override
    public void execute() throws IOException {
        out.println(" Успехов в изучении Java !!!");
    }

    @Override
    public boolean exitMethod() {
        return true;
    }
}
