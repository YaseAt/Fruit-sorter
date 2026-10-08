package Graphics;

import javax.swing.JFrame;
import java.awt.*;

public class Game extends JFrame{
    Console console;
    GameArea gameArea;
    public Game() {
    
        gameArea = new GameArea();
        console = new Console(gameArea);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FRUIT SORTER");
        this.add(console, BorderLayout.SOUTH);
        this.add(gameArea, BorderLayout.CENTER);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

}
