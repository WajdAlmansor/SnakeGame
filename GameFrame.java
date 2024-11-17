import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class GameFrame extends JFrame  {

    
    GameFrame(){
        
        JFrame frame = new JFrame();
        frame.add(new GamePanel());
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());
        frame.setLocationRelativeTo(null);

        }


        
    }

    


    

