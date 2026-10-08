package Elements;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Icons {

    Fruits fruits = new Fruits();
            

      public  Icons() {
        }
        public ImageIcon[] resize() {
            ImageIcon[] x = new ImageIcon[8];
        
        for(int i = 0; i <8; i ++) {
            ImageIcon original = fruits.get(i);
            Image image = original.getImage();
            Image resize = image.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            ImageIcon last = new ImageIcon(resize);
            x[i] = last;
        }
        return x;
    }
}
