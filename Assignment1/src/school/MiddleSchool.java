package school;

public class MiddleSchool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student) {

        double fees6 = 100 * 1.75;
        double fees7 = fees6 + (fees6 * 0.35);
        double fees8 = fees7 + (fees7 * 0.35);

        if(student.getGrade() == GradeType.SIXTH_GRADE){
            System.out.println("Fees for 6th Grade is "+fees6);
        }else if(student.getGrade() == GradeType.SEVENTH_GRADE){
            System.out.println("Fees for 7th Grade is "+fees7);
        }else if(student.getGrade() == GradeType.EIGHTH_GRADE){
            System.out.println("Fees for 8th Grade is "+fees8);
        }else {
            System.out.println("Fees not available for this grade!");
        }
        return fees6;
    }
}
