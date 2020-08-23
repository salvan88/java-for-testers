package gerzen777gmail.com.loto;

import gerzen777gmail.com.loto.model.Card;
import gerzen777gmail.com.loto.service.CardGeneratorService;
import gerzen777gmail.com.loto.test.PredictableCardGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PredictableCardGeneratorServiceTest {

    @Test
    public void newPredictableCardGeneratorTest() {
        PredictableCardGenerator predictableCardGenerator = new PredictableCardGenerator();

        Card card1 = new Card("Иван");

        Assertions.assertEquals("[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]", predictableCardGenerator.cardGenerate(card1).getCard().toString());
    }
}
