package gamedata.gamelogic.consumables;

import gamedata.gamelogic.CafeMenuItem;
import gamedata.gamelogic.Consumable;
import gamedata.gamelogic.PrepStatus;

public class BakedGood extends Consumable {
    public BakedGood(CafeMenuItem item) {
        super(item,30,
                new PrepStatus[]{PrepStatus.Mix,
                        PrepStatus.Bake, PrepStatus.Decorate, PrepStatus.Ready});
    }
}
