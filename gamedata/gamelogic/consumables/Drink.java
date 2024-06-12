package gamedata.gamelogic.consumables;

import gamedata.gamelogic.CafeMenuItem;
import gamedata.gamelogic.Consumable;
import gamedata.gamelogic.PrepStatus;

public class Drink extends Consumable {
    Drink(CafeMenuItem item) {
        super(item,20,
                new PrepStatus[]{PrepStatus.Null,
                        PrepStatus.Pour, PrepStatus.Decorate, PrepStatus.Ready, PrepStatus.Consumed});
    }
}
