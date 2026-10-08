package Graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Elements.Button;
import Elements.Icons;

public class Console extends JPanel {
        Console(GameArea gameArea) {
            this.setLayout(new GridLayout(2, 4, 0, 0));
            this.setPreferredSize(new Dimension(500, 250));
            this.setBackground(Color.white);

            Icons icons = new Icons();
            ImageIcon[] images = icons.resize();
            for(int i = 0; i < 8; i++) {
                Button button = new Button(images[i], i, gameArea); 
                button.setHorizontalAlignment(JButton.CENTER);
                button.setVerticalAlignment(JButton.CENTER);
                this.add(button);
            }
        }
}