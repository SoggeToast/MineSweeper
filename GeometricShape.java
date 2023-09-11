// https://www.developer.com/java/java-geometric-shapes/#:~:text=Java%20provides%20methods%20in%20the,subclass%20of%20Graphics%3C%2Fb.

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

 
class GeometricShape extends JPanel{
    private int width = 500;
    private int length = 500;

   public static void main(String args[]){
        GeometricShape shape = new GeometricShape();
        shape.MyPanel();
   }
       

   public void MyPanel(){
        JFrame frame = new JFrame();
        frame.addMouseListener(listener);
       frame.getContentPane().add(new GeometricShape());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setSize(width + 10,length + 40);  
       frame.setVisible(true);

       JLabel label = new JLabel();
       ImageIcon imageIcon = new ImageIcon("image.jpg");
       label.setIcon(imageIcon);
       frame.add(label);

   }
   
 
   public void paint(Graphics g) {


       //g.drawRect(100, 100, 40, 120);
       //g.setColor(Color.green);
       //g.fillRect(250, 250, 100, 50); 
       
       for(int x = 0; x < length/50; x++){
        for(int y = 0; y < width/50; y++){
            if(y%2!=0 && x%2 == 0 || x%2 !=0 && y%2==0){
                Color lightGreen = new Color(170, 215, 81);
                g.setColor(lightGreen);
            } else{
                Color darkGreen = new Color(162, 209, 73);
                g.setColor(darkGreen);
            }
            g.fillRect(x*50, y*50, 50, 50);
        }
       }
       
            
     }

     private MouseListener listener = new MouseListener() {
        public void mouseClicked(MouseEvent e) {
            System.out.println(e);
            
        }

        public void mousePressed(MouseEvent e) {
            // Respond to mouse press
        }

        public void mouseReleased(MouseEvent e) {
            // Respond to mouse release
        }

        public void mouseEntered(MouseEvent e) {
            // Respond to mouse enter
        }

        public void mouseExited(MouseEvent e) {
            // Respond to mouse exit
        }
    };

     
}
