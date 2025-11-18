package java_awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaAwt  {


    public static void main(String[] args) {
        Frame f = new Frame("My first awt window");
        f.setVisible(true);
        // the frame is visible
        Button b = new Button("Click");
        b.setBounds(100,100,50,50); // x,y , width, height
        f.add(b);
        //adding is required
        //button visible
        Label l = new Label("Welcome");
        l.setBounds(80, 50, 150, 30);
        f.add(l);
        f.setSize(1500,1500);
    //now we will be adding an action by clicking the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }
}
