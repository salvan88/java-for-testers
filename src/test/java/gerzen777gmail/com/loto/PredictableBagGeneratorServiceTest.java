package gerzen777gmail.com.loto;

import gerzen777gmail.com.loto.model.Bag;
import gerzen777gmail.com.loto.test.PredictableBagGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PredictableBagGeneratorServiceTest {

    @Test
    public void newBagGeneratorTest() {
        PredictableBagGenerator predictableBagGenerator = new PredictableBagGenerator();

        Bag bag = new Bag();

        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]",  predictableBagGenerator.bagGenerate(bag).getBag().toString());
    }

}
