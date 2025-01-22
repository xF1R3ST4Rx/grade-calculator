public class logic {

    //method that will execute the grade equation
    public static double add(int grade, int final_exam, double grade_weight, double final_weight){
        double final_grade = (grade_weight * (grade)) + (final_weight * (final_exam));
        return final_grade;
    }
}
