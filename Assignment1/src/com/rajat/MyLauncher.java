package com.rajat;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MyLauncher {

    public static void main(String[] args) {
        String name = null;
        do {
            System.out.println("*************************************");
            System.out.println("Welcome to the School Admission App!   Press X for exit!!!");
            System.out.println("*************************************");

            System.out.println("Enter name of student: ");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
            if (name.equals("x") || name.equals("X")) {
                System.exit(0);
            }
            while (name.length() >= 50 || name.length() < 3) {
                System.out.println("Please enter a valid name!");
                System.out.println("Enter name of student: ");
                name = scanner.nextLine();
            }

            int month, day, year;
            LocalDate today = LocalDate.now();                          //Today’s date
            System.out.println("Enter date of birth in MM/DD/YYYY format :");
            System.out.println("Please enter your birth month (in digit)");
            month = scanner.nextInt();
            while (month > 12) {
                System.out.println("Please enter a valid month!");
                System.out.println("Please enter your birth month (in digit)");
                month = scanner.nextInt();
            }
            System.out.println("Please enter your birth date ");
            day = scanner.nextInt();
            while (day > 31) {
                System.out.println("Please enter a valid day!");
                System.out.println("Please enter your birth date ");
                day = scanner.nextInt();
            }
            System.out.println("Please enter your birth year ");
            year = scanner.nextInt();
            while (year < 2004 || year > 2017) {
                System.out.println("Please enter a valid year!");
                System.out.println("Please enter your birth year: ");
                year = scanner.nextInt();
            }
            LocalDate birthday = LocalDate.of(year, month, day);  //Birth date
            Period period = Period.between(birthday, today);
//            System.out.println(period.getDays());
//            System.out.println(period.getMonths());
//            System.out.println(period.getYears());

            Integer age = period.getYears();

            while (age < 4 || age > 17) {
                System.out.println("Please enter a valid age!");
                System.out.println("Enter age of student :");
                age = scanner.nextInt();
            }
            System.out.println("Student name is : " + name + " and Student age is : " + age);

            // With help of age define the grade of student
            GradeType gradeType = null;
            try {
                gradeType = UtilityClass.determineGradeBasedOnAge(age);
            } catch (AgeNotCorrectException e) {
                System.out.println("Age has to be between 4 and 17");
            }
            // Determining school type
            SchoolType schoolType = null;
            try {
                schoolType = UtilityClass.determineSchoolBasedOnGrade(gradeType);
            } catch (NoSchoolAvailableForThisAgeException e) {
                System.out.println("School not found for this grade!");
            }

            Student student = new Student(name, age, gradeType);
            School school = null;
            try {
                school = UtilityClass.retrieveSchoolObjectBasedOnSchoolType(schoolType);
                school.admitStudent(student);
                school.chargeFees(student);
            } catch (ClassFullException e) {
                System.out.println("Sorry the class for grade #" + gradeType + " is full, please try another student");
            }
        } while (!name.equals("X") || !name.equals("x"));
    }
}