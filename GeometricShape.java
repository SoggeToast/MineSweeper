// https://www.developer.com/java/java-geometric-shapes/#:~:text=Java%20provides%20methods%20in%20the,subclass%20of%20Graphics%3C%2Fb.

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

 
class GeometricShape extends JPanel{
    public int w;
    private static MouseEvent recentClick;
    private int previousGuess;
    public static JFrame frame;

      
    public GeometricShape(int w){
        this.w = w*50;
        System.out.println(this.w);
        this.setBounds(0,0,this.w,this.w);
    }

    public void setpreviousguess(int n){
        previousGuess = n;
    }

   public void MyPanel(){
        frame = new JFrame();
        frame.setLayout(null);
        frame.addMouseListener(listener);
       frame.getContentPane().add(new GeometricShape(w));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setSize(w + 10, w + 45 + 100);  
       frame.setVisible(true);
       frame.setResizable(false);
   }
   
   public void paint(Graphics g) {
        //g.drawRect(100, 100, 40, 120);
        //g.setColor(Color.green);
        //g.fillRect(250, 250, 100, 50); 
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, w, 100);
        g.setColor(Color.orange);
        g.fillRect(100, 25, 50, 50);
        g.setColor(Color.red);

        g.fillRect(200, 25, 50, 50);
        System.out.println(w);
        for(int x = 0; x < w/50; x++){
            for(int y = 0; y < w/50; y++){
                if(y%2!=0 && x%2 == 0 || x%2 !=0 && y%2==0){
                    Color lightGreen = new Color(170, 215, 81);
                    g.setColor(lightGreen);
                } else{
                    Color darkGreen = new Color(162, 209, 73);
                    g.setColor(darkGreen);
                }
                for(int j = 0; j < Board.coverBoard[0].length; j++){
                    for(int k = 0; k < Board.coverBoard.length; k++){
                        if(Board.coverBoard[j][k].equals("#")){
                            g.fillRect(x*50, y*50 + 100, 50, 50);
                        } else{
                            if(y%2!=0 && x%2 == 0 || x%2 !=0 && y%2==0){
                                Color lightBrown = new Color(229, 194, 159);
                                g.setColor(lightBrown);
                            } else{
                                Color darkBrown = new Color(215, 184, 153);
                                g.setColor(darkBrown);
                            }
                        }
                    }
                }
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
            System.out.println(w);
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
