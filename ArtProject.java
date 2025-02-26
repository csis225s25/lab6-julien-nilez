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
        //Nose
        g.drawRect(super.getWidth()/2, super.getHeight()/2, 20, 80);

        //Outer portions of eyes
        g.drawOval(super.getWidth()/3, super.getHeight()/4, 20, 80);
        g.drawOval(2 * super.getWidth()/3, super.getHeight()/4, 20, 80);
        
        //Inner Portions of eyes
        g.drawOval(super.getWidth()/3, (super.getHeight()/3 + super.getHeight()/4)/2, 15, 40);
        g.drawOval(2 * super.getWidth()/3, (super.getHeight()/3 + super.getHeight()/4)/2, 15, 40);
        
        //Smile
        g.drawArc(super.getWidth()/3, 3 * super.getHeight()/4, 200, 100,180, 180);
        g.setColor(Color.red);
        g.fillArc(super.getWidth()/3, 3 * super.getHeight()/4, 200, 100, 180, 180);

        //Coloring the nose
        g.setColor(Color.ORANGE);
        g.fillRect(super.getWidth()/2, super.getHeight()/2, 20, 80);

        //Coloring the eyes and center of eyes
        g.setColor(Color.WHITE);
        g.fillOval(super.getWidth()/3, super.getHeight()/4, 20, 80);
        g.fillOval(2 * super.getWidth()/3, super.getHeight()/4, 20, 80);
        g.setColor(Color.blue);
        g.fillOval(super.getWidth()/3, (super.getHeight()/3 + super.getHeight()/4)/2, 15, 40);
        g.fillOval(2 * super.getWidth()/3, (super.getHeight()/3 + super.getHeight()/4)/2, 15, 40);
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

