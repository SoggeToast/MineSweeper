// https://www.developer.com/java/java-geometric-shapes/#:~:text=Java%20provides%20methods%20in%20the,subclass%20of%20Graphics%3C%2Fb.

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
 
class GeometricShape extends JPanel{
   public static void main(String args[]){
       JFrame frame = new JFrame();
       frame.getContentPane().add(new GeometricShape());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setSize(1000,1000);  
       frame.setVisible(true);
   }
 
   public void paint(Graphics g) {
 
       g.drawRect(100, 100, 40, 120);
       g.setColor(Color.green);
       g.fillRect(120, 120, 40, 60); 
            
     }
}
