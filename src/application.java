import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class application {
    public static void main(String[] args) {
        //sets up the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,400);

        //sets up the panel to allow for multiple components
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        //sets up the calculate button that the user will click for their results
        JButton calculate = new JButton("Get Grade");
        calculate.setBounds(300, 200,100,50);
        panel.add(calculate);


        //texts areas for the user input
        JTextArea finalexam = new JTextArea("final grade");
        finalexam.setBounds(400,100,100,25);
        finalexam.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                finalexam.setText("");
            }
        });
        panel.add(finalexam);

        JTextArea final_grade_percent = new JTextArea("final weight");
        final_grade_percent.setBounds(400,50,100,25);
        panel.add(final_grade_percent);
        final_grade_percent.addMouseListener(new MouseAdapter() {
                                                 @Override
                                                 public void mouseClicked(MouseEvent e) {
                                                     super.mouseClicked(e);
                                                     final_grade_percent.setText("");
                                                 }
        });

        JTextArea full_grade = new JTextArea("grade in class");
        full_grade.setBounds(200,100,100,25);
        panel.add(full_grade);
        full_grade.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                full_grade.setText("");
            }
        });

        JTextArea letter_grade = new JTextArea("Letter Grade");
        letter_grade.setBounds(400,150, 100, 25);
        panel.add(letter_grade);



        JTextArea full_grade_percent = new JTextArea("class weight");
        full_grade_percent.setBounds(200,50,100,25);
        panel.add(full_grade_percent);
        full_grade_percent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                full_grade_percent.setText("");
            }
        });

        JTextArea output = new JTextArea("output final grade");
        output.setBounds(200,150,100,25);
        panel.add(output);

        //UI choice that just makes the basic ui look better
        JLabel plus = new JLabel("+");
        plus.setBounds(350,100,20,20);
        panel.add(plus);

        //adds functionality to the button
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String grade = full_grade.getText();
                String final_exam = finalexam.getText();
                String grade_percent = full_grade_percent.getText();
                String final_percent = final_grade_percent.getText();
                double real_grade = logic.add(Integer.parseInt(grade), Integer.parseInt(final_exam), Double.parseDouble(grade_percent), Double.parseDouble(final_percent));
                output.setText(String.valueOf(real_grade));
                letter_grade.setText(logic.getLetter(real_grade));

            }
        });
        //makes sure that the frame is visible
        frame.setVisible(true);
    }
}
