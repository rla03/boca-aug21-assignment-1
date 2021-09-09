package com.rajat;

import java.util.Scanner;

public class MyLauncher {
    public static void main(String[] args) {
        System.out.println("*************************************");
        System.out.println("Welcome to the School Admission App!   Press X for exit!!!");
        System.out.println("*************************************");

        System.out.println("Enter name of student: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name.equals("x") || name.equals("X")){
            System.exit(0);
        }
        System.out.println("Enter age of student :");
        Integer age = scanner.nextInt();

        System.out.println("Student name is : " +name+ " and Student age is : " +age);
    }
}
