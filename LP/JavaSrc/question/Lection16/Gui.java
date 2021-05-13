package JavaSrc.question.Lection16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui {
    /** we can use inner classes to build a gui with less and more readable code*/

    private JFrame frame; //the main window
    private JButton btn1,btn2; //the buttons

    public static void main(String[] args) {
        new Gui().go(); //main method wich runs all stuffs
    }

    public void go() {
        frame = new JFrame(); // build the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the closing operations

        /** create buttons */
        btn1 = new JButton("Button 1"); 
        btn1.addActionListener(new listenerBtn1()); //the action listener is the component wich listen for an event

        btn2 = new JButton("Button 2");
        btn2.addActionListener(new listenerBtn2()); // the same code as above

        /** code to add the buttons on the west and the east side of the window
         * setting the size of the window 300 * 300 in this case
         * and then showing the window to the world
         */
        frame.getContentPane().add(BorderLayout.WEST, btn1); 
        frame.getContentPane().add(BorderLayout.EAST, btn2);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    /** this last piece of code is the main part of the programming of a button in java
     * here we are saying:
     * hey! when you listen the click of the user on you do something!
     * in this case the button 1 label, will change in button 1 clicked
     * try yourself
     */
    class listenerBtn1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btn1.setText("Button 1 clicked!");
        }
    }
    class listenerBtn2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btn2.setText("Button 2 clicked!");
        }
    }
}
