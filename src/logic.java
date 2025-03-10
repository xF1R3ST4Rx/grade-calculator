public class logic {

    //method that will execute the grade equation
    public static double add(int grade, int final_exam, double grade_weight, double final_weight){
        if(grade_weight >= 1){
            grade_weight = grade_weight/100;
        }
        if(final_weight >= 1){
            final_weight = final_weight/100;
        }
        double final_grade = (grade_weight * (grade)) + (final_weight * (final_exam));
        return final_grade;
    }
}
