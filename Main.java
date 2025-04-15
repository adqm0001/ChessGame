import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args){
        JFrame jf = new JFrame("Chess");
        GameWindow gameWindow = new GameWindow();
        jf.add(gameWindow);
        jf.pack();

        jf.setResizable(false);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
