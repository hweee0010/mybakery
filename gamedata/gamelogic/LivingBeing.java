package gamedata.gamelogic;

import gamedata.viewcontroller.Entity;
import gamedata.viewcontroller.Screen;

public abstract class LivingBeing extends Entity {
    public Integer joy;
    public BeingType beingType;
    public LivingBeing(BeingType beingType) {
        this.beingType = beingType;
        // open image from resources
        try {
            this.image = Screen.readImage(beingType.toString());
        } catch (Exception e) {
            System.out.println("Image read failed");
            e.printStackTrace();
        }


    }
    /**
    * consume a consumable item and update joy
    */
    public void consume(Consumable consumable) throws Exception {
        joy += consumable.consumed();
    }

    public void updateDisplay() {

    }
}