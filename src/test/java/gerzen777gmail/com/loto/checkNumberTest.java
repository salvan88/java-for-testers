package gerzen777gmail.com.loto;

import gerzen777gmail.com.loto.model.Bag;
import gerzen777gmail.com.loto.model.Card;
import gerzen777gmail.com.loto.model.GameMaster;
import gerzen777gmail.com.loto.test.PredictableBagGenerator;
import gerzen777gmail.com.loto.test.PredictableCardGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class checkNumberTest {
    @Test
    public void newCheckNumberTest() {
        Bag bag = new Bag();
        GameMaster gameMaster = new GameMaster();
        PredictableCardGenerator predictableCardGenerator = new PredictableCardGenerator();
        Card card1 = new Card("Иван");

        predictableCardGenerator.cardGenerate(card1);

        card1.checkNumber(3);

        Assertions.assertEquals("[[1, 2, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]", card1.checkNumber(1).toString());
    }
}
