package gerzen777gmail.com.loto.test;
import gerzen777gmail.com.loto.model.Bag;


public class PredictableBagGenerator {

    public Bag bagGenerate(Bag bag) {
        for (int i = 1; i < 16; i++) {
            bag.getBag().add(i);
        }
        return bag;
    }
}