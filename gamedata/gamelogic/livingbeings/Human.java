package gamedata.gamelogic.livingbeings;

public abstract class Human extends LivingBeing{
    /**
     * pet a dog & induce joy
     * @param dog dog to be petted
     */
    public void pet(Dog dog) {
        dog.petted();
    }
}
