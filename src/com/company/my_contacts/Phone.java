package com.company.my_contacts;


public class Phone {

    private String personNumber;
    private int id = 0;

    public Phone() {
    }

    public Phone(int id, String personNumber) {
        this.id = id;
        this.personNumber = checkingContactType(personNumber);
    }

    public String checkingContactType(String contact) {
        char marker = '@';
        for (int i = 0; i < contact.length(); i++) {
            if (contact.charAt(i) != marker) {
                personNumber = "+" + contact + " phone ";
                break;
            } else {
                personNumber = contact + " email ";
                break;
            }
        }
        return personNumber;
    }


    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }


    @Override
    public String toString() {
        return personNumber + " " + id;
    }
}
