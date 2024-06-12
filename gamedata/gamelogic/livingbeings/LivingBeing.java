package gamedata.gamelogic.livingbeings;

import gamedata.gamelogic.BeingType;
import gamedata.gamelogic.consumables.Consumable;

public abstract class LivingBeing {
    public Integer joy;
    public BeingType beingType;
    public LivingBeing(BeingType type) {
        beingType = type;
    }
    /**
    * consume a consumable item and update joy
    */
    public void consume(Consumable consumable) throws Exception {
        joy += consumable.consumed();
    }
}