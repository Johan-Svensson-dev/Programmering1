package intro;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Miniaknare extends JFrame {

    private JPanel contentPane;
    private JTextField term1;
    private JTextField term2;
    private JTextField answer;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Miniaknare frame = new Miniaknare();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Miniaknare() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        term1 = new JTextField();
        term1.setBounds(39, 50, 96, 20);
        contentPane.add(term1);
        term1.setColumns(10);

        term2 = new JTextField();
        term2.setBounds(153, 50, 96, 20);
        contentPane.add(term2);
        term2.setColumns(10);

        answer = new JTextField();
        answer.setFont(new Font("Arial", Font.PLAIN, 11));
        answer.setBounds(285, 35, 117, 48);
        contentPane.add(answer);
        answer.setColumns(10);

        JButton addition = new JButton("+");
        addition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("+");
            }
        });
        addition.setBounds(39, 153, 89, 23);
        contentPane.add(addition);

        JButton multiplikation = new JButton("*");
        multiplikation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("*");
            }
        });
        multiplikation.setBounds(39, 207, 89, 23);
        contentPane.add(multiplikation);

        JButton division = new JButton("/");
        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("/");
            }
        });
        division.setBounds(163, 207, 89, 23);
        contentPane.add(division);

        JButton subtraktion = new JButton("-");
        subtraktion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("-");
            }
        });
        subtraktion.setBounds(160, 153, 89, 23);
        contentPane.add(subtraktion);

        JLabel lblNewLabel = new JLabel("Term 1");
        lblNewLabel.setBounds(63, 35, 49, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Term 2");
        lblNewLabel_1.setBounds(176, 35, 49, 14);
        contentPane.add(lblNewLabel_1);
    }

    private void performOperation(String selection) {
        try {
            double num1 = Double.parseDouble(term1.getText());
            double num2 = Double.parseDouble(term2.getText());
            double result = 0;

            switch (selection) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        answer.setText("Kan inte dela med 0");
                        return;
                    }
                    break;
                default:
                    break;
            }

            answer.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            answer.setText("Invalid input");
        }
    }
    
}