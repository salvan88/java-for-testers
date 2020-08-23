package gerzen777gmail.com.loto;

import gerzen777gmail.com.loto.model.Card;
import gerzen777gmail.com.loto.model.Game;
import gerzen777gmail.com.loto.test.PredictableCardGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class checkWinTest {
    @Test
    public void newCheckWinTest() {
        Game game = new Game();

        PredictableCardGenerator predictableCardGenerator = new PredictableCardGenerator();

        Card card1 = new Card("Иван");

        predictableCardGenerator.cardGenerate(card1);

        card1.checkNumber(1);
        card1.checkNumber(2);
        card1.checkNumber(3);
        card1.checkNumber(4);
        card1.checkNumber(5);

        Assertions.assertTrue(game.checkWin(card1));
    }
}
