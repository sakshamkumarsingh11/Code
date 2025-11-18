package project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetApp extends JFrame // did this so that window formation takes place
{     JLabel label;
    JTextField text;
    JButton button;
// building a constructor to define the parameter declared globally
    GreetApp() {
        setTitle("Greeting app");
        setSize(300, 300);
        setLayout(null);
        label = new JLabel("Enter your name");
        label.setBounds(100, 100, 100, 100); // x, y , width, length
        text = new JTextField();
        text.setBounds(100, 200, 120, 30);
        button = new JButton("Greet Me");
        button.setBounds(100, 300, 120, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text.getText();
                label.setText("Hello, " + name + "!");
            }
        });

        add(label);
        add(text);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

        public static void main (String[]args){
            new GreetApp();


        }
    }
