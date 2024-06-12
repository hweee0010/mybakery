package gamedata.gamelogic.consumables;

import gamedata.gamelogic.CafeMenuItem;
import gamedata.gamelogic.PrepStatus;

public class BakedGood extends Consumable {
    BakedGood(CafeMenuItem item) {
        super(item,30,
                new PrepStatus[]{PrepStatus.Mix,
                        PrepStatus.Bake, PrepStatus.Decorate, PrepStatus.Ready});
    }
}
