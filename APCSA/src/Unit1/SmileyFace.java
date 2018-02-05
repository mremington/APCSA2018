package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      //Black left eye
      window.setColor(Color.BLACK);
      window.fillOval( 300, 200, 50, 50 );
      //Black right eye
      window.fillOval( 450, 200, 50, 50 );
      
      //black nose
      int xpoints[] = {400, 450, 350, 400, 400};
      int ypoints[] = {300, 350, 350, 300, 300};
      int npoints = 5;
      window.setColor(Color.BLACK);
      window.fillPolygon(xpoints, ypoints, npoints);
      
      window.drawArc(300, 325, 200, 100, 0, -180);
      
      


   }
}