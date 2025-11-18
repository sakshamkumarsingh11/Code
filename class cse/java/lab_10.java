import javax.swing.*;

public class lab_10 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Button Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 

        JLabel label = new JLabel("Press a button");
        label.setBounds(100, 50, 150, 20);
        frame.add(label);

        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(50, 100, 70, 30);
        frame.add(yesButton);

     
        JButton noButton = new JButton("No");
        noButton.setBounds(130, 100, 70, 30);
        frame.add(noButton);

       
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(210, 100, 70, 30);
        frame.add(closeButton);

        
        yesButton.addActionListener(e -> label.setText("Button Yes is pressed"));
        noButton.addActionListener(e -> label.setText("Button No is pressed"));
        closeButton.addActionListener(e -> frame.dispose());

       
        frame.setVisible(true);
    }
}