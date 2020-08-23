package gerzen777gmail.com.loto;

import gerzen777gmail.com.loto.model.Bag;
import gerzen777gmail.com.loto.model.Card;
import gerzen777gmail.com.loto.model.Game;
import gerzen777gmail.com.loto.model.GameMaster;
import gerzen777gmail.com.loto.test.PredictableBagGenerator;
import gerzen777gmail.com.loto.test.PredictableCardGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PredictableGameTest {
    @Test
    public void newPredictableGameTest() {
        Game game = new Game();
        Bag bag = new Bag();
        GameMaster gameMaster = new GameMaster();

        PredictableBagGenerator predictableBagGenerator = new PredictableBagGenerator();
        PredictableCardGenerator predictableCardGenerator = new PredictableCardGenerator();

        Card card1 = new Card("Иван");
        Card card2 = new Card("Яна");

        gameMaster.predictableGameMaster(gameMaster, card1, card2, bag, predictableBagGenerator, predictableCardGenerator);

        Assertions.assertEquals("У нас есть победители: Иван и Яна", game.newGame(card1, card2, gameMaster));
    }
}