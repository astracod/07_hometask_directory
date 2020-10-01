package com.company.my_contacts;



public class Person  {

    private String name;
    private String patronymic;
    private String surname;
    private GeneratingUserID id = new GeneratingUserID();
    private int myId;

    public Person() {
    }

    public Person(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        myId = id.getPersonId();
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return myId;
    }

    @Override
    public String toString() {
        return getName() + " " + getPatronymic() + " " + getSurname() + " " + getId();
    }
}
