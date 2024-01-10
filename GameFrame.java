import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameFrame extends JFrame implements MouseListener {
    public GameFrame()
     {
          this.add(new GamePanel());
          this.setTitle("Snake game");
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setResizable(false);
          this.pack();
          this.setVisible(true);
          this.setLocationRelativeTo(null);
          this.addMouseListener(this);
          Image cursorImage = Toolkit.getDefaultToolkit().getImage("hmr.png");
          Point hotSpot = new Point(cursorImage.getWidth(null) / 2, cursorImage.getHeight(null) / 2);
          Cursor c = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, hotSpot, "c");
          this.setCursor(c);
     }
     @Override
    public void mouseClicked(MouseEvent e) {}

     @Override
     public void mouseEntered(MouseEvent e) {}
 
     @Override
     public void mouseExited(MouseEvent e) {}
 
     @Override
     public void mousePressed(MouseEvent e) {}
 
     @Override
     public void mouseReleased(MouseEvent e) {}
}
