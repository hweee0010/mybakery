package gamedata.gamelogic.consumables;

import gamedata.gamelogic.CafeMenuItem;
import gamedata.gamelogic.PrepStatus;

import java.awt.image.BufferedImage;

public abstract class Consumable {
    public Integer maxJoy;
    public float quality = 1; // starting quality
    public Integer currentStepIndex = 0; // denotes current step
    public CafeMenuItem item;
    public PrepStatus[] prepSteps;
    public Integer prepTime; // currently unused attribute
    public BufferedImage display; // currently unused attribute

    public Consumable(CafeMenuItem item, Integer maxJoy, PrepStatus[] prepSteps) {
        this.item = item;
        this.maxJoy = maxJoy;
        this.prepSteps = prepSteps;
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
