import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class RoundBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OvalBalloo extends Balloon
{
    //field(s)
    
    //constructor(s)
    public OvalBalloo()
    {
        super(); //using constructor of supper class
    }
    
    public OvalBalloo(int x, int y, int r, Color c)
    {
        super(x, y, r, c);
    }
   
    //method(s)
    /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(color);
    int xCenter=getx();
    int yCenter=gety();
    int radius = getRadius();
    
    if (makeItFilled)
      g.fillOval(xCenter - radius,
                 yCenter - radius, radius, 2*radius);
    else
      g.drawOval(xCenter - radius,
                 yCenter - radius, 2*radius, 2*radius);
  }
}
