package gamedata.gamelogic.livingbeings;

import gamedata.gamelogic.BeingType;

public abstract class Human extends LivingBeing{
    public Human(BeingType type) {
        super(type);
    }

    /**
     * pet a shiba & induce joy
     * @param shiba dog to be petted
     */
    public void pet(Shiba shiba) {
        shiba.petted();
    }
}
