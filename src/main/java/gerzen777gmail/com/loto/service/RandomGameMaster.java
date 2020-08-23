package gerzen777gmail.com.loto.service;

import gerzen777gmail.com.loto.model.Bag;
import gerzen777gmail.com.loto.model.Card;
import gerzen777gmail.com.loto.model.GameMaster;

public interface RandomGameMaster {
    GameMaster randomGameMaster(GameMaster gameMaster, Card card1, Card card2, Bag bag,
                          RandomBagGeneratorService randomBagGeneratorService,
                          CardGeneratorService cardGeneratorService);
}
