package com.company.my_contacts;

public class Generating_user_ID {

    private int personId;

public Generating_user_ID(){
    this.personId = createId();
}

    public int getPersonId() {
        return personId;
    }

    public int createId() {
        int min = 100000;
        int max = 999999;
        return min + (int) (Math.random() * max);
    }

    @Override
    public String toString() {
        return String.valueOf(getPersonId());
    }
}
