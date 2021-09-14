import school.GradeType;
import school.PreSchool;
import school.Student;
import org.junit.Assert;
import org.junit.Test;

public class testSchoolFees {

    @Test
        public void testPreschoolFees(){
        Student student = new Student("Rajat", 4, GradeType.JK_GRADE);

        PreSchool preSchool = new PreSchool();
        double fees = preSchool.chargeFees(student);;
        Assert.assertTrue(fees == 110.00);
    }
}
