package gamedata.gamelogic.consumables;

import gamedata.gamelogic.CafeMenuItem;
import gamedata.gamelogic.Constants;
import gamedata.gamelogic.PrepStatus;
import gamedata.gamelogic.livingbeings.LivingBeing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public abstract class Consumable {
    public Integer maxJoy;
    public float quality = 1; // starting quality
    public Integer currentStepIndex = 0; // denotes current step
    public CafeMenuItem item;
    public PrepStatus[] prepSteps;
    public Integer prepTime; // currently unused attribute
    public BufferedImage image;

    public Consumable(CafeMenuItem item, Integer maxJoy, PrepStatus[] prepSteps) {
        this.item = item;
        this.maxJoy = maxJoy;
        this.prepSteps = prepSteps;
        // open image from resources
        String imagePath = Constants.RESOURCES_FILEPATH + item + "jpg";
        try {
            this.image = ImageIO.read(Objects.requireNonNull(Consumable.class.getResource(imagePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * sets prep status to Consumed, and
     * returns actual joy value according to food quality
     */
    public Integer consumed() throws Exception {
        if (prepSteps[currentStepIndex]  != PrepStatus.Consumed) {
            throw new Exception("Food is not ready for consumption!");
        }
        else {
            return Math.round(maxJoy*quality);
        }
    }

    /**
     * update the quality and move to the next step
     */
    public void updateStatus(float newQuality) {
        quality = newQuality*quality;
        currentStepIndex ++;
    }
}
