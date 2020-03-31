package com.xsclt.udemyproject.utilities;


import com.xsclt.udemyproject.people.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.xsclt.udemyproject.utilities.Util.*;

public class Menu {

    private String[] mainMenu = {"Welcome to Udemy", "Enter your choice", "1- Student", "2- Teacher", "0- Exit"};
    private String[] studentMenu = {"", "2- Teacher", "3-"};
    private String[] teacherMenu = {"Enter your choice", "1- Login", "2- Register", "0- Exit"};

    private HashMap<Integer, Integer> accountList = new HashMap<>();

    private ArrayList<Teacher> teacherList = new ArrayList<>();

    public void getLogin(){

        print(mainMenu);

        switch (getInt()) {
            case 1:
                getStudentMenu();
                break;
            case 2:
                getTeacherChoice();
                break;
            case 0:
                System.out.println("Exiting..");
                System.exit(0);
            default:
                System.out.println("Please enter numbers are the following !");
                getLogin();
        }
    }

    private void getStudentMenu() {
        System.out.println("Öğrenci menüsüne girildi.");
    }

    public void addAccount(int id, int password) {

        accountList.put(id, password);

    }

    private void getTeacherChoice() {

        print(teacherMenu);

        switch (getInt()) {
            case 1:
                signUp();
                break;
            case 2:
                signIn();
                break;
            case 0:
                System.exit(0);
        }

    }

    private void signIn() {

        System.out.println("Enter your name");
        String name = getString();

        System.out.println("Enter your email");
        String email = getString();

        System.out.println("Enter your age");
        int age = getInt();

        System.out.println("Enter your experience year");
        int experienceYear = getInt();

        Teacher teacher = new Teacher(name, email, age, experienceYear);
        teacherList.add(teacher);

        System.out.println("Create a password (Only Numbers)");
        int password = getInt();

        addAccount(teacher.getId(), password);

        System.out.println("You registered successfully.");

        getTeacherMenu(teacher);


    }

    private void signUp(){

        System.out.println("Enter your idNumber");
        int idNumber = getInt();

        System.out.println("Enter your password");
        int password = getInt();

        for (Map.Entry<Integer, Integer> entry : accountList.entrySet()) {

            if (entry.getKey().equals(idNumber) && entry.getValue().equals(password)) {
                System.out.println("You have successfully logged in.");

                for (Teacher temp : teacherList) {
                    if (temp.getId() == idNumber){
                        getTeacherMenu(temp);
                        return;
                    }
                }

            }

        }

        System.out.println("Wrong Id or Number ! Please try again !");
        getTeacherChoice();

    }

    private void getTeacherMenu(Teacher teacher) {

        System.out.println("Chosee 1 for back");
        switch (getInt()){

            case 1 : getTeacherChoice();
            case 2 : System.exit(2);

        }
    }


}
