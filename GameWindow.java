import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel {

    public static final int WIDTH  = 1100;
    public static final int HEIGHT = 800;
    Image image;

    public GameWindow(){
        // Testing image stuff
        // image = new ImageIcon("chessicon.jpg").getImage();
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.blue);
        g2d.setStroke(new BasicStroke(2));

        int rows=8;
        int columns=8;

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                if (j%2==0){
                    if (i%2==0){
                        //* Light brown color
                        g2d.setPaint(new Color(255,204,153));
                        g2d.fillRect(i*100, j*100, 100, 100);
                    } else {
                        //* Brown color
                        g2d.setPaint(new Color(150, 77, 34));
                        g2d.fillRect(i*100, j*100, 100, 100); 
                    }
                } else {
                    if (i%2==0){
                        //* Brown color
                        g2d.setPaint(new Color(150, 77, 34));
                        g2d.fillRect(i*100, j*100, 100, 100);
                    } else {
                        //* Light brown color
                        g2d.setPaint(new Color(255,204,153));
                        g2d.fillRect(i*100, j*100, 100, 100); 
                    }
                }
            }
        }

        // Methods I could potentially use later
        //g2d.fillRect(100,200, 100, 200);
        //g2d.setFont(new Font("Ink Free",Font.BOLD, 50));
        //g2d.drawString("Chess Game incoming", 50, 50);
        //g2d.drawImage(image, 0,0, null);
    }
}
