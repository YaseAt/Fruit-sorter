package Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Elements.Fruits;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.util.Random;
import java.util.Timer;

/**
 * GameArea
 */
public class GameArea extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    
    private int currentFruit;
    
    private int fruitX;
    private int fruitY;

    private Random random = new Random();
    Fruits fruits;

    GameArea() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black); fruits = new Fruits();
        this.generateFruit();
       
    }

    public void generateFruit() {
        currentFruit = random.nextInt(fruits.size());


        fruitX = random.nextInt(PANEL_WIDTH - 80);
        fruitY = random.nextInt(PANEL_HEIGHT - 80);

        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(fruits.get(currentFruit).getImage(), fruitX, fruitY, 80, 80, this); }

    public int getCurrentFruit() {
            return currentFruit;
}



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
