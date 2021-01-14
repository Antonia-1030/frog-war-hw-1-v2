package boiniPozicii;
import javax.swing.*;
import java.awt.*;

public class BoinaPoziciya extends JFrame {
    private final int row;
    private final int col;
    private int fieldSize;

    public BoinaPoziciya(int row, int col){
        this.row= row;
        this.col= col;
        this.fieldSize= 100;
        setBackground(Color.WHITE);
    }

    public void redTile(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0,0,100,100);
        g.fillRect(400,0,100,100);
        g.fillRect(100,400,100,100);
        g.fillRect(300,400,100,100);
    }
    public void blackTile(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(100,0,100,100);
        g.fillRect(300,0,100,100);
        g.fillRect(0,400,100,100);
        g.fillRect(400,400,100,100);
    }
    public void grayTile(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(0,100,100,100);
        g.fillRect(100,100,100,100);
        g.fillRect(300,100,100,100);
        g.fillRect(400,100,100,100);

        g.fillRect(0,300,100,100);
        g.fillRect(100,300,100,100);
        g.fillRect(300,300,100,100);
        g.fillRect(400,300,100,100);
    }
    public void dotTile(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillOval(225,225,50,50);
    }
}
