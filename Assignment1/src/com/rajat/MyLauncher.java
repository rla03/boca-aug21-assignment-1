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
        while (name.length() >= 50 || name.length() <3){
            System.out.println("Please enter a valid name!");
            System.out.println("Enter name of student: ");
            name = scanner.nextLine();
        }
        System.out.println("Enter age of student :");
        Integer age = scanner.nextInt();

        while (age <4 || age >17){
            System.out.println("Please enter a valid age!");
            System.out.println("Enter age of student :");
            age = scanner.nextInt();
        }
        System.out.println("Student name is : " +name+ " and Student age is : " +age);

        // With help of age define the grade of student
        GradeType gradeType = null;
        try{
            gradeType = UtilityClass.determineGradeBasedOnAge(age);;
        }catch (AgeNotCorrectException e) {
            System.out.println("Age has to be between 4 and 17");
        }
        // Determining school type
        SchoolType schoolType = null;
        try{
            schoolType = UtilityClass.determineSchoolBasedOnGrade(gradeType);
        } catch (NoSchoolAvailableForThisAgeException e) {
            System.out.println("School not found for this grade!");
        }
//        double feesOfStudent = 0;
//        try{
//            feesOfStudent = UtilityClass.determineFeesOfStudentBasedOnSchool(gradeType);
//        } catch (NoFeesFoundForThisSchool e) {
//            System.out.println("School not found for this grade!");
//        }
    }
}
