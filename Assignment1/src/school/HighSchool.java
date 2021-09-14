package school;

public class HighSchool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student){

        double fees9 = 100 * 2.00;
        double fees10 = fees9 + (fees9 * 0.45);
        double fees11 = fees10 + (fees10 * 0.45);
        double fees12 = fees11 + (fees11 * 0.45);

        if(student.getGrade() == GradeType.NINTH_GRADE){
        System.out.println("Fees for 9th Grade is "+fees9);
    }else if(student.getGrade() == GradeType.TENTH_GRADE){
        System.out.println("Fees for 10th Grade is "+fees10);
    }else if(student.getGrade() == GradeType.ELEVENTH_GRADE){
        System.out.println("Fees for 11th Grade is "+fees11);
    }else if(student.getGrade() == GradeType.TWELFTH_GRADE){
            System.out.println("Fees for 12th Grade is "+fees12);
        } else {
        System.out.println("Fees not available for this grade!");
    }
        return fees9;

    }
}
