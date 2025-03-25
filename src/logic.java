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
    public static String getLetter(double grade){
        if(grade > 100 || grade < 0){
            return "error";
        }
        else if(grade >= 90 && grade <= 100){
            return "A";
        }
        else if(grade >= 80 && grade <= 89){
            return "B";
        }
        else if(grade >= 70 && grade <= 79){
            return "C";
        }
        else if(grade >= 60 && grade <= 69){
            return "D";
        }
        else{
            return "F";
        }
    }
}
