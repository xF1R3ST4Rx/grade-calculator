import javax.swing.*;
import java.awt.*;
public class application {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,400);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JButton calculate = new JButton("Get Grade");
        calculate.setBounds(300, 200,100,50);
        panel.add(calculate);

        JTextArea finalexam = new JTextArea("final grade");
        finalexam.setBounds(600,100,100,25);
        panel.add(finalexam);

        frame.setVisible(true);
    }
}
