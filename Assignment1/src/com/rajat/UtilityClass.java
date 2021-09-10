package com.rajat;

public class UtilityClass {

    private static School PreSchool = new PreSchool();
    private static School HighSchool = new HighSchool();
    private static School ElementarySchool = new ElementarySchool();
    private static School MiddleSchool = new MiddleSchool();

    public static GradeType determineGradeBasedOnAge(int age) throws AgeNotCorrectException{
        System.out.println("Grade determining in process! ");
        switch (age) {
            case 4:
                System.out.println("Grade will be " +GradeType.JK_GRADE);
                return GradeType.JK_GRADE;
            case 5:
                System.out.println("Grade will be " +GradeType.SK_GRADE);
                return GradeType.SK_GRADE;
            case 6:
                System.out.println("Grade will be " +GradeType.GRADE_1);
                return GradeType.GRADE_1;
            case 7:
                System.out.println("Grade will be " +GradeType.SECOND_GRADE);
                return GradeType.SECOND_GRADE;
            case 8:
                System.out.println("Grade will be " +GradeType.THIRD_GRADE);
                return GradeType.THIRD_GRADE;
            case 9:
                System.out.println("Grade will be " +GradeType.FOURTH_GRADE);
                return GradeType.FOURTH_GRADE;
            case 10:
                System.out.println("Grade will be " +GradeType.FIFTH_GRADE);
                return GradeType.FIFTH_GRADE;
            case 11:
                System.out.println("Grade will be " +GradeType.SIXTH_GRADE);
                return GradeType.SIXTH_GRADE;
            case 12:
                System.out.println("Grade will be " +GradeType.SEVENTH_GRADE);
                return GradeType.SEVENTH_GRADE;
            case 13:
                System.out.println("Grade will be " +GradeType.EIGHTH_GRADE);
                return GradeType.EIGHTH_GRADE;
            case 14:
                System.out.println("Grade will be " +GradeType.NINTH_GRADE);
                return GradeType.NINTH_GRADE;
            case 15:
                System.out.println("Grade will be " +GradeType.TENTH_GRADE);
                return GradeType.TENTH_GRADE;
            case 16:
                System.out.println("Grade will be " +GradeType.ELEVENTH_GRADE);
                return GradeType.ELEVENTH_GRADE;
            case 17:
                System.out.println("Grade will be " +GradeType.TWELFTH_GRADE);
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
                    System.out.println("Welcome to "+String.valueOf(SchoolType.ELEMENTARY_SCHOOL));
                    return SchoolType.ELEMENTARY_SCHOOL;
                case SIXTH_GRADE:case SEVENTH_GRADE:case EIGHTH_GRADE:
                System.out.println("Welcome to "+String.valueOf(SchoolType.MIDDLE_SCHOOL));
                return SchoolType.MIDDLE_SCHOOL;
                case NINTH_GRADE:
                case TENTH_GRADE:
                case ELEVENTH_GRADE: case TWELFTH_GRADE:
                System.out.println("Welcome to "+String.valueOf(SchoolType.HIGH_SCHOOL));
                return SchoolType.HIGH_SCHOOL;
                default:
                    throw new NoSchoolAvailableForThisAgeException("No school available for this age! ");
            }

    }
    public static School retrieveSchoolObjectBasedOnSchoolType(SchoolType schoolType) {
        switch (schoolType) {
            case HIGH_SCHOOL:
                return HighSchool;
            case ELEMENTARY_SCHOOL:
                return ElementarySchool;
            case MIDDLE_SCHOOL:
                return MiddleSchool;
            case PRE_SCHOOL:
                return PreSchool;
            default:
                throw new IllegalArgumentException("Wrong school type");
        }
    }
}
