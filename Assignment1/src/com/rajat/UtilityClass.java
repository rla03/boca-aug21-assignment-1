package com.rajat;

public class UtilityClass {

    public static GradeType determineGradeBasedOnAge(int age) throws AgeNotCorrectException{
        System.out.println("Grade determining in process! ");
        switch (age) {
            case 4:
                System.out.println("Grade will be " +GradeType.JK_GRADE);
                return GradeType.JK_GRADE;
            case 5:
                return GradeType.SK_GRADE;
            case 6:
                return GradeType.GRADE_1;
            case 7:
                return GradeType.SECOND_GRADE;
            case 8:
                return GradeType.THIRD_GRADE;
            case 9:
                return GradeType.FOURTH_GRADE;
            case 10:
                return GradeType.FIFTH_GRADE;
            case 11:
                return GradeType.SIXTH_GRADE;
            case 12:
                return GradeType.SEVENTH_GRADE;
            case 13:
                return GradeType.EIGHTH_GRADE;
            case 14:
                return GradeType.NINTH_GRADE;
            case 15:
                return GradeType.TENTH_GRADE;
            case 16:
                return GradeType.ELEVENTH_GRADE;
            case 17:
                return GradeType.TWELFTH_GRADE;
            default:
                throw new AgeNotCorrectException("Age has to be between 4 and 17");
        }
    }
        public static SchoolType determineSchoolBasedOnGrade (GradeType gradeType) throws NoSchoolAvailableForThisAgeException{
            System.out.println("School determining in process! ");
        switch (gradeType){
                case JK_GRADE:
                case SK_GRADE:
                   System.out.println("Welcome to "+String.valueOf(SchoolType.PRE_SCHOOL));
                    return SchoolType.PRE_SCHOOL;
                case GRADE_1:
                case SECOND_GRADE:
                case THIRD_GRADE:
                case FOURTH_GRADE:
                case FIFTH_GRADE:
                    return SchoolType.ELEMENTARY_SCHOOL;
                case SIXTH_GRADE:case SEVENTH_GRADE:case EIGHTH_GRADE:
                    return SchoolType.MIDDLE_SCHOOL;
                case NINTH_GRADE:
                case TENTH_GRADE:
                case ELEVENTH_GRADE: case TWELFTH_GRADE:
                    return SchoolType.HIGH_SCHOOL;
                default:
                    throw new NoSchoolAvailableForThisAgeException("No school available for this age! ");
            }

    }

//    public static int determineFeesOfStudentBasedOnSchool(GradeType gradeType) {
//        System.out.println("School determining in process! ");
//        switch (gradeType){
//            case JK_GRADE:
//
//            case SK_GRADE:
//
//
//            case GRADE_1:
//            case SECOND_GRADE:
//            case THIRD_GRADE:
//            case FOURTH_GRADE:
//            case FIFTH_GRADE:
//                return SchoolType.ELEMENTARY_SCHOOL;
//            case SIXTH_GRADE:case SEVENTH_GRADE:case EIGHTH_GRADE:
//                return SchoolType.MIDDLE_SCHOOL;
//            case NINTH_GRADE:
//            case TENTH_GRADE:
//            case ELEVENTH_GRADE: case TWELFTH_GRADE:
//                return SchoolType.HIGH_SCHOOL;
//            default:
//                throw new NoSchoolAvailableForThisAgeException("No school available for this age! ");
//        }
//    }
}
