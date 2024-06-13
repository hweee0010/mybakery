package gamedata.viewcontroller;


import gamedata.gamelogic.Constants;
import gamedata.gamelogic.LivingBeing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Screen {
    public static JFrame frame = new JFrame();
    public static JPanel testPanel = new JPanel();
    private static int width;
    private static int height;

    public Screen() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) dimension.getWidth();
        height = (int) dimension.getHeight();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        setFrame(testPanel);
        testPanel.setLayout(new GridLayout());
    }

    public static int getScreenWidth() {
        return width;
    }

    public static int getScreenHeight() {
        return height;
    }
    private void setFrame(JPanel panel) {
        panel.setSize(width, height);
        panel.setLayout(null);
        panel.setOpaque(false);
        frame.add(panel);
        panel.setVisible(true);
    }
    public static void refresh() {
        frame.revalidate();
        frame.repaint();
    }

    public static BufferedImage readImage(String fileName) {
        String imagePath = Constants.IMAGES_FILEPATH + fileName + ".png";
        try {
            return ImageIO.read(Objects.requireNonNull(LivingBeing.class.getResource(imagePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
