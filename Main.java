import gamedata.gamelogic.Game;
import gamedata.viewcontroller.Screen;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JFrame frame = new JFrame();

        //frame.setBackground(Color.GREEN);
        //frame.setVisible(true);
        new Screen();
        Game game = new Game();
        game.testDisplay();
    }
}
