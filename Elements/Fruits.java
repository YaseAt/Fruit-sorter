package Elements;


import java.util.HashMap;

import javax.swing.ImageIcon;

public class Fruits extends HashMap<Integer, ImageIcon> {
    public Fruits() {
            put(0, new ImageIcon("Fruits/apple.png"));
            put(1, new ImageIcon("Fruits/strawberry.png"));
            put(2, new ImageIcon("Fruits/banana.png"));
            put(3, new ImageIcon("Fruits/ananas.png"));
            put(4, new ImageIcon("Fruits/orange.jpeg"));
            put(5, new ImageIcon("Fruits/watermelon.jpeg"));
            put(6, new ImageIcon("Fruits/blackberry.jpeg"));
            put(7, new ImageIcon("Fruits/cherry.jpeg"));
    }
}
