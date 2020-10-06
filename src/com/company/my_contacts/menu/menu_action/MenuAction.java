package com.company.my_contacts.menu.menu_action;

import com.company.my_contacts.Menu;

import java.io.IOException;

public interface MenuAction {
    String getActionName();
    void execute() throws IOException;
    boolean exitMethod();
}
