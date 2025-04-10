import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args){
        JFrame jf = new JFrame("Chess");
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);

        Board bd = new Board();
        jf.add(bd);
    }
}
