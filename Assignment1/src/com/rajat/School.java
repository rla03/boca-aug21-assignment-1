package com.rajat;

public interface School {

    Student admitStudent(String name, int age, String grade);
    Double chargeFees(Student student);
}
