package Elements;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Graphics.GameArea;

public class Button extends JButton {

   private int fruitId;
    private GameArea gameArea;

    public Button(ImageIcon icon, int fruitId, GameArea gameArea) {

        super(icon);

        this.fruitId = fruitId;
        this.gameArea = gameArea;

        addActionListener(e -> {

            if (gameArea.getCurrentFruit() == fruitId) {
                gameArea.generateFruit();
            }

        });
    }

    

}