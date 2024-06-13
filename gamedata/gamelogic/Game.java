package gamedata.gamelogic;

import gamedata.gamelogic.consumables.BakedGood;
import gamedata.gamelogic.consumables.Drink;
import gamedata.gamelogic.livingbeings.Baker;
import gamedata.gamelogic.livingbeings.Customer;
import gamedata.gamelogic.livingbeings.Shiba;

public class Game {
    public Game() {
    }

    public void testDisplay() {
        BakedGood shortcake = new BakedGood(CafeMenuItem.StrawberryShortcake);
        shortcake.display();
        BakedGood croissant = new BakedGood(CafeMenuItem.AlmondCroissant);
        croissant.display();
        Drink drink = new Drink(CafeMenuItem.MatchaLatte);
        drink.display();
        Baker baker = new Baker();
        baker.display();
        Customer customer = new Customer();
        customer.display();
        Shiba shiba = new Shiba();
        shiba.display();
    }
}
