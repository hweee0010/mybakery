package gamedata.viewcontroller;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity implements Showable{
    public BufferedImage image;
    public int x;
    public int y;
    protected int width;
    protected int height;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display() {
        Image scaledImage = image.getScaledInstance(80,80, Image.SCALE_DEFAULT);
        JLabel newLabel = new JLabel(new ImageIcon(scaledImage));
        newLabel.setSize(80,80);
        newLabel.setOpaque(true);
        Screen.testPanel.add(newLabel);
        newLabel.setVisible(true);
        newLabel.repaint();
    }
}
