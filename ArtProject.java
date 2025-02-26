import java.awt.*;
import javax.swing.*;

/**
 * Lab 6 starter example
 * 
 * @author Julien
 * @author Riley
 * @version Spring 2025
 */

class Shapes extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(super.getWidth()/2, super.getHeight()/2, 100, 125);
        g.drawOval(super.getWidth()/3, super.getHeight()/4, 40, 20);
        g.setColor(Color.blue);
        g.drawArc(super.getWidth()/4, super.getHeight()/3, 232, 325, 90, 115);
        g.setColor(Color.red);
        g.fillRect(super.getWidth()/2, super.getHeight()/2, 100, 125);
        g.setColor(Color.magenta);
        g.fillOval(super.getWidth()/3, super.getHeight()/4, 40, 20);
        
    }
}
public class ArtProject implements Runnable {

    /**
     * The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        // the usual JFrame setup steps
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("ArtProject");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel with a custom paintComponent method
        JPanel panel = new Shapes();
        frame.add(panel);
    

        // display the window we've created
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new ArtProject());
    }
}

