package gamedata.gamelogic.livingbeings;

import gamedata.gamelogic.BeingType;

public class Shiba extends LivingBeing{

    public Shiba() {
        super(BeingType.Shiba);
    }

    /**
     * when a dog gets petted, increase joy
     */

    public void petted() {
        joy += 10;
    }
}
