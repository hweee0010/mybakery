package gamedata.gamelogic.livingbeings;

import gamedata.gamelogic.consumables.Consumable;

public abstract class LivingBeing {
    public Integer joy;

    /**
    * consume a consumable item and update joy
    */
    public void consume(Consumable consumable) throws Exception {
        joy += consumable.consumed();
    }
}