package school;

public class ElementarySchool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student) {
        double fees = 100 * 1.5;
        fees = Math.round(fees);
        if(student.getGrade() == GradeType.GRADE_1){
            System.out.println("Fees for Grade 1 is " +fees); //150
        }else if(student.getGrade() == GradeType.SECOND_GRADE){
            fees = fees + (fees * 0.3); //195
            System.out.println("Fees for Grade 2 is " +fees);
        }else if(student.getGrade() == GradeType.THIRD_GRADE){
            fees = fees + (fees * 0.69); //253.5
            System.out.println("Fees for Grade 3 is " +fees);
        }else if(student.getGrade() == GradeType.FOURTH_GRADE){
            fees = fees + (fees * 1.197);//329.55
            System.out.println("Fees for Grade 4 is " +fees);
        }else if(student.getGrade() == GradeType.FIFTH_GRADE){
            fees = fees + (fees * 1.856);//428.41
            System.out.println("Fees for Grade 5 is " +fees);
        }else{
            System.out.println("Fees not available for this grade!");
        }
        return fees;
    }
}
