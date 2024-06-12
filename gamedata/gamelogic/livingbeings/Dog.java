package gamedata.gamelogic.livingbeings;

public abstract class Dog extends LivingBeing{

    /**
     * when a dog gets petted, increase joy
     */
    public void petted() {
        joy += 10;
    }
}
