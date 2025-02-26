import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This program has a mouse counter that increments count whenever a mouse is clicked inside the window, a clears count whenever 
 * clear is clicked. 
 * 
 * @author Julien
 * @author Riley
 * @version Spring 2025
 */

public class MousePressCounter extends MouseAdapter implements Runnable, ActionListener {
    //Instance variables for class
    private JLabel counter;
    private int count;
    private JButton clear;

    /**
     * The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        // the usual JFrame setup steps
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MousePressCounter");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel to place other panels within
        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);

        //Listening for mouse input
        panel.addMouseListener(this);

        //Initializing clicks to zero and adding the count to the label
        count = 0;
        counter = new JLabel("Mouse Press Count: " + count);

        //Panel for count visualization
        JPanel panel1 = new JPanel();
        panel.add(panel1);

        //Adding counter label to our panel that goes on main panel
        panel1.add(counter);

        //Creating button for clearing the count
        clear = new JButton("Clear");
        clear.addActionListener(this);

        //Adding clear to panel2 and assigning it to the bottom of the screen
        JPanel panel2 = new JPanel();
        panel.add(panel2, BorderLayout.SOUTH);
        panel2.add(clear);
       

        // display the window we've created
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        //Up our count and reset text to appropriate count
        count++;
        counter.setText("Mouse Press Count: " + count);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //If the clear button is pressed, we decrement the count to 0
        if(e.getSource() == clear){
            count = 0;
            counter.setText("Mouse Press Count: " + count);
        }
    }


    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new MousePressCounter());
    }
}

