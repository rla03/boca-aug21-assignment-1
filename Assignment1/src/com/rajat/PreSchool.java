package com.rajat;

public class PreSchool extends AbstractSchool {
    @Override
    public Double chargeFees(Student student) {
        double fees = 100 * 1.1;
        fees = Math.round(fees);
        if(student.getGrade() == GradeType.JK_GRADE){
            System.out.println("Fees for JK is " +fees);
        }else if(student.getGrade() == GradeType.SK_GRADE){
            fees = Math.round(fees + (fees *0.25));
            System.out.println("Fees for SK is " +fees);
        }else{
            System.out.println("Fees not available for this grade!");
        }
        return fees;
    }
}
