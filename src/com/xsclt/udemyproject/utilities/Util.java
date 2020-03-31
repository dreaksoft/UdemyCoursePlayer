package com.xsclt.udemyproject.utilities;

import java.util.LinkedHashSet;
import java.util.Scanner;

abstract public class Util {

    private static Scanner scanner = new Scanner(System.in);

    // Add course at courseList
    public static <T> void add(T type ,LinkedHashSet<T> list) {

        list.add(type);
        System.out.println("Successfully added.");

    }


    // Remove course from courseList
    public static <T> void remove(T type ,LinkedHashSet<T> list) {

        if (list.remove(type)) {
            System.out.println("Successfully removed.");
        } else {
            System.out.println("Dont have this already.");
        }

    }

    public static int getInt(){

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
        }

    }

    public static String getString(){

        return scanner.nextLine();

    }

    public static void print(String[] array) {

        for (String temp : array) {
            System.out.println(temp);
        }

    }

}
