package gamedata.gamelogic.livingbeings;

import gamedata.gamelogic.BeingType;
import gamedata.gamelogic.Constants;
import gamedata.gamelogic.consumables.Consumable;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public abstract class LivingBeing {
    public Integer joy;
    public BeingType beingType;
    public BufferedImage image;
    public LivingBeing(BeingType beingType) {
        this.beingType = beingType;
        // open image from resources
        String imagePath = Constants.RESOURCES_FILEPATH + beingType + "jpg";
        try {
            this.image = ImageIO.read(Objects.requireNonNull(LivingBeing.class.getResource(imagePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
    * consume a consumable item and update joy
    */
    public void consume(Consumable consumable) throws Exception {
        joy += consumable.consumed();
    }
}