package game;
import voinici.*;
import boiniPozicii.*;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame{
    public GameBoard() {
        //Razmer i zatvaryane
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //gameTileSetup();
    }
    //private void gameTileSetup(){
    //        getContentPane().setLayout(new FlowLayout());
    //        getContentPane().add(new OrangeTile());
    //    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {
                BoinaPoziciya tile = new BoinaPoziciya(row, col);
                tile.redTile(g);
                tile.blackTile(g);
                tile.grayTile(g);
                tile.dotTile(g);
                tile.setBackground(Color.WHITE);
                GardYellow g1=new GardYellow(row,col);
                g1.render(g);
                GardGreen g2=new GardGreen(row,col);
                g2.render(g);
                LiderGreen l1=new LiderGreen(row,col);
                l1.render(g);
                LiderYellow l2=new LiderYellow(row,col);
                l2.render(g);
            }
        }
    }
}
