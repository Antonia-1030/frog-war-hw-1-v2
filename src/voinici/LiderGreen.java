package voinici;
import java.awt.*;

public class LiderGreen {
    private int row;
    private int col;

    public LiderGreen(int row, int col){
        this.row= row;
        this.col= col;
    }
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(20, 40, 50, 50);
    }
}
