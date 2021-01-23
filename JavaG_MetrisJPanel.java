
 import java.awt.Font;
 import java.awt.FontMetrics;
 import java.awt.Graphics;
 import javax.swing.JFrame;
 import javax.swing.JPanel;

 public class JavaG_MetrisJPanel extends JPanel
 {
    // display font metrics
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // call superclass's paintComponent

        g.setFont( new Font( "SansSerif", Font.BOLD, 18 ) );
        FontMetrics metrics = g.getFontMetrics();
        g.drawString( "Current font: " + g.getFont(), 10, 40 );
        g.drawString( "Ascent: " + metrics.getAscent(), 10, 55 );
        g.drawString( "Descent: " + metrics.getDescent(), 10, 70 );
        g.drawString( "Height: " + metrics.getHeight(), 10, 85 );
        g.drawString( "Leading: " + metrics.getLeading(), 10, 100 );

        Font font = new Font( "Monospaced", Font.ITALIC + Font.BOLD, 20 );
        metrics = g.getFontMetrics( font );
        g.setFont( font );
        g.drawString( "Current font: " + font, 10, 130 );
        g.drawString( "Ascent: " + metrics.getAscent(), 10, 145 );
        g.drawString( "Descent: " + metrics.getDescent(), 10, 160 );
        g.drawString( "Height: " + metrics.getHeight(), 10, 175 );
        g.drawString( "Leading: " + metrics.getLeading(), 10, 190 );
        } // end method paintComponent
         // end class MetricsJPanel


    // execute application
    public static void main( String args[] )
    {
    // create frame for MetricsJPanel
    JFrame frame = new JFrame( "Demonstrating FontMetrics" );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JavaG_MetrisJPanel metricsJPanel = new JavaG_MetrisJPanel();
    frame.add( metricsJPanel ); // add metricsJPanel to frame
    frame.setSize( 1100, 300 ); // set frame size
    frame.setVisible( true ); // display frame
    } // end main
 } // end class Metrics
 