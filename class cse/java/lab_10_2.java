import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab_10_2 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("User Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10)); 

       
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JLabel dobLabel = new JLabel("Date of Birth:");
        JTextField dobField = new JTextField(); 
        
        JButton submitButton = new JButton("Submit");

        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String dob = dobField.getText();
                JOptionPane.showMessageDialog(frame, "Submitted Data:\nFirst Name: " + firstName + 
                                                       "\nLast Name: " + lastName + 
                                                       "\nDate of Birth: " + dob);
            }
        });

       
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(dobLabel);
        frame.add(dobField);
        frame.add(new JLabel()); 
        frame.add(submitButton);

        
        frame.setVisible(true);
    }
}
