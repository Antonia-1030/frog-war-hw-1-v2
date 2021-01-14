package voinici;
import java.awt.*;

public class GardYellow {
    private int row;
    private int col;

    public GardYellow(int row, int col){
        this.row= row;
        this.col= col;
    }
    public void render(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(20, 430, 50, 50);
        g.fillOval(120, 430, 50, 50);
        g.fillOval(220, 430, 50, 50);
        g.fillOval(320, 430, 50, 50);
    }
}
