package gerzen777gmail.com.loto.test;

import gerzen777gmail.com.loto.model.Bag;
import gerzen777gmail.com.loto.model.Card;
import gerzen777gmail.com.loto.model.GameMaster;

public interface PredictableGameMaster {
    GameMaster predictableGameMaster(GameMaster gameMaster, Card card1, Card card2, Bag bag,
                                     PredictableBagGenerator predictableBagGenerator,
                                     PredictableCardGenerator predictableCardGenerator);
}