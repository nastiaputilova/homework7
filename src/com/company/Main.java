package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // 2

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // 3

        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "e");
        System.out.println(fullName);

        }

        // 5

        fullName = "Ivanov Ivan Ivanovich";
        int spaceIndex = fullName.indexOf(" ");
        int spaceIndex1 = fullName.lastIndexOf(" ");
        firstName = fullName.substring(spaceIndex, spaceIndex1);
        middleName = fullName.substring(spaceIndex1);
        lastName = fullName.substring(0, spaceIndex);

        System.out.println("Имя сотрудника — " + firstName);//Ivan
        System.out.println("Фамилия сотрудника — " + lastName); //Ivanov
        System.out.println("Отчество сотрудника — " + middleName); //Ivanovich

    }
}
