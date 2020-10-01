package com.company.my_contacts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*
        Имеется 2 текстовых файла, в первом хранится список имен в виде
        —————————————————————
        humans.txt
        —————————————————————
        Пупкин Василий Петрович 214739
        Иванов Иван Иванович 471104
        Петров Сергей Иванович 102507
        —————————————————————
        где последнее числа - уникальные идентификаторы пользователей

        Во втором - список контактов
        —————————————————————
        contacts.txt
        —————————————————————
        +380687747270 phone 214739
        vasia@gmail.com email 214739
        +380660002211 phone 471104
        —————————————————————

        phone, email - тип контакта
        число - идентификатор пользователя, которому пренадлежит контакт

        Реализовать меню со следующим функционалом:
        - Добавление человека в справочник контактов
        - Просмотр людей в справочнике
        - Удаление человека из справочника (должны удалится и все его контакты, (полное удаление васи вместе с его контактами))
        - Поиск человека по номеру телефона
        - Получение контактов человека
        - Добавление нового контакта
        - Удаление контакта (последний - это удалить один из контактов васи (например только телефон))

        Примечание:
        - В случае необходимости не должно возникнуть проблем с заменой хранилищ (сейчас-файлы, в перспективе может быть база....)
        - В данном случае при изменении данных (добавление/удаление), файлы должны меняться сразу
        - Стараться максимально руководствыватся принципами SOLID
        - Обратить внимание на то, что как-то надо генерировать случайный уникальный идентификатор при добавлении человека
    */
    public static void main(String[] args) throws IOException {
        Contact_book p = new Contact_book();
        p.addPerson(new Person("Петров", "Дмитрий", "Васильевич"));
        p.addPerson(new Person("Сидоров", "Илья", "Егорович"));
        p.addPerson(new Person("Иванов ", "Артур", "Львович"));
        System.out.println(p);


       p.createContact(p.getNam(1) ,"380687747270");
       p.createContact(p.getNam(2) ,"380660002211");
       p.createContact(p.getNam(3) ,"380687749999");
       p.createContact(p.getNam(3) ,"artur@gmail.com");


        p.show();
    }
}
