


// MAJOR PROBLEM LEFT IN THE PROJECT IS OF RESIZING USING LAYOUT MANAGEMENT AND J PANEL
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame{
    JLabel namelabel , maillabel, courselable;
    JTextField namefield, mailfield;
    JRadioButton otherbtn;
    JComboBox<String> courseBox;
    JButton submitBtn, resetBtn;

    JPanel panel;



    StudentRegistration(){
        namelabel = new JLabel("Name:");
        namelabel.setBounds(100, 100, 100, 30);
        namefield = new JTextField();
        namefield.setBounds(100, 150, 200, 30);
    // same for the mail
        maillabel = new JLabel("Email:");
        maillabel.setBounds(100, 190, 100, 30);
        mailfield = new JTextField();
        mailfield.setBounds(100, 200, 200, 30);

        // imp for the courses
       courselable = new JLabel("Course selection");
       courselable.setBounds(50, 250, 100, 30);
       String [] courses = {"Btech", "BCA", "MCA", "Mtech"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 250, 200, 30);
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(150, 370, 100, 30);

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = namefield.getText();
                String email = mailfield.getText();
                String course = (String) courseBox.getSelectedItem();
                String output = "Name: " + name +
                        "\nEmail: " + email +
                        "\nCourse: " + course;

    }
    });

            add(namelabel);
            add(namefield);
            add(maillabel);
            add(mailfield);
            add(courselable);
            add(courseBox);
            add(submitBtn);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            new StudentRegistration();
        }
    }

