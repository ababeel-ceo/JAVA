import java.applet.Applet;
import java.awt.*;
public class Car extends Applet {

   public void paint(Graphics g)
   {
       g.setColor(Color.red);
       g.fillArc(50, 390, 115,82,0,180);
       g.setColor(Color.blue);
       g.fillArc(80,370,55,85,0,180);
       g.setColor(Color.black);
       g.fillArc(70,419,20,20,0,360);
       g.fillArc(120,419,20,20,0,360);
   }
    
}
//<applet code="Car" height=1000 width=1500></applet>
