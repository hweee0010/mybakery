package gamedata.gamelogic;

import gamedata.viewcontroller.Entity;
import gamedata.viewcontroller.Screen;

public abstract class Consumable extends Entity {
    public Integer maxJoy;
    public float quality = 1; // starting quality
    public Integer currentStepIndex = 0; // denotes current step
    public CafeMenuItem item;
    public PrepStatus[] prepSteps;
    public Integer prepTime; // currently unused attribute
    //public BufferedImage image;

    public Consumable(CafeMenuItem item, Integer maxJoy, PrepStatus[] prepSteps) {
        this.item = item;
        this.maxJoy = maxJoy;
        this.prepSteps = prepSteps;
        this.image = Screen.readImage(item.toString());
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

    @Override public void updateDisplay() {
        // i genuinely have no idea what this is for lol
    }
}
