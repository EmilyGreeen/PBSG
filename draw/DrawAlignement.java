package draw;

/**
 * Write a description of class DrawAlignement2 here.
 *
 * @author MrGreen
 * @version 12/10/2019
 */

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

/** Custom Drawing Code Template */
// A Swing application extends javax.swing.JFrame
public class DrawAlignement extends JFrame {
    // Define constants
    public static final int CANVAS_WIDTH  = 640;
    public static final int CANVAS_HEIGHT = 600;
    public int [] CPValue;
    // Declare an instance of the drawing canvas,
    // which is an inner class called DrawCanvas extending javax.swing.JPanel.
    private DrawCanvas canvas;

    // Constructor to set up the GUI components and event handlers
    public DrawAlignement(int[] CPV) {
        CPValue = CPV;
        canvas = new DrawCanvas(CPValue);    // Construct the drawing canvas
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        // Set the Drawing JPanel as the JFrame's content-pane
        Container cp = getContentPane();
        cp.add(canvas);
        // or "setContentPane(canvas);"

        setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
        pack();              // Either pack() the components; or setSize()
        setTitle("Alignement");  // "super" JFrame sets the title
        setVisible(true);    // "super" JFrame show
    }

    /**
     * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
     */
    private class DrawCanvas extends JPanel {
        // Override paintComponent to perform your own painting
        private int[] CPValue;

        private DrawCanvas(int [] CPV){
            CPValue = CPV;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);     // paint parent's background
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    g.drawRect(25+(i*150),25+j*150,150,150);
                }
            }
            

            if(CPValue[0]<4){g.setColor(Color.BLUE);}
            g.drawString("LAWFUL",75,500);g.setColor(Color.BLACK);
            if(3<CPValue[0] && CPValue[0]<7){g.setColor(Color.BLUE);}
            g.drawString("NEUTRAL",225,500);g.setColor(Color.BLACK);
            if(CPValue[0]>6){g.setColor(Color.BLUE);}
            g.drawString("CHAOTIC",375,500);g.setColor(Color.BLACK);
            
            if(CPValue[1]<4){g.setColor(Color.BLUE);}
            g.drawString("GOOD",500,100);g.setColor(Color.BLACK);
            if(3<CPValue[1] && CPValue[1]<7){g.setColor(Color.BLUE);}
            g.drawString("NEUTRAL",500,250);g.setColor(Color.BLACK);
            if(CPValue[1]>6){g.setColor(Color.BLUE);}
            g.drawString("EVIL",500,400);g.setColor(Color.BLACK);
            
            g.setColor(Color.GRAY);
            for(int i=1;i<10;i++){
                g.drawLine(50*i,25,50*i,475);
                g.drawString(Integer.toString(i),50*i-3,20);
                g.drawLine(25,50*i,475,50*i);
                g.drawString(Integer.toString(i),14,50*i+4);
            }

            int imgX=(CPValue[0]*50)-(25/2);
            int imgY=(CPValue[1]*50)-(25/2);

            g.setColor(Color.RED);
            g.fillOval(imgX, imgY, 25, 25);
        }
    }
}
