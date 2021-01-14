package voinici;
import java.awt.*;

public class GardGreen {
    private int row;
    private int col;

    public GardGreen(int row, int col){
        this.row= row;
        this.col= col;
    }
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(120, 40, 50, 50);
        g.fillOval(220,40,50,50);
        g.fillOval(320,40,50,50);
        g.fillOval(420,40,50,50);
    }
}
