// https://www.developer.com/java/java-geometric-shapes/#:~:text=Java%20provides%20methods%20in%20the,subclass%20of%20Graphics%3C%2Fb.

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

 
class GeometricShape extends JPanel{
    public int width;
    private static MouseEvent recentClick;

      
    public GeometricShape(int w){
        width = w*50;
        this.setBounds(0,0,200,200);
    }

   public void MyPanel(){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.addMouseListener(listener);
       frame.getContentPane().add(new GeometricShape(width));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setSize(width + 10, width + 45 + 100);  
       frame.setVisible(true);
   }
   
   public void paint(Graphics g) {
        //g.drawRect(100, 100, 40, 120);
        //g.setColor(Color.green);
        //g.fillRect(250, 250, 100, 50); 
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, WIDTH, 100);
        g.setColor(Color.orange);
        g.fillRect(100, 25, 50, 50);
        g.setColor(Color.red);

        g.fillRect(200, 25, 50, 50);
        System.out.println(width);
        for(int x = 0; x < width/50; x++){
            for(int y = 0; y < width/50; y++){
                if(y%2!=0 && x%2 == 0 || x%2 !=0 && y%2==0){
                    Color lightGreen = new Color(170, 215, 81);
                    g.setColor(lightGreen);
                } else{
                    Color darkGreen = new Color(162, 209, 73);
                    g.setColor(darkGreen);
                }
                g.fillRect(x*50, y*50 + 100, 50, 50);
            }
        }
            
     }

     public static int getxvalue(){
        return recentClick.getX();
     }
     public static int getyvalue(){
        return recentClick.getY();
     }

     private MouseListener listener = new MouseListener() {
        public void mouseClicked(MouseEvent e) {
            System.out.println(width);
            System.out.println(e);
            recentClick = e;
            minesweeper.game.handleInput();
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
