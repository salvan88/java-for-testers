package gerzen777gmail.com.loto.service;
import gerzen777gmail.com.loto.model.Bag;

import java.util.HashSet;

public class RandomBagGeneratorService {
    private final HashSet<Integer> reserved = new HashSet<>();

    public Bag bagGenerate(Bag bag) {
        for (int i = 0; i < 30; i++) {
            int rnd;

            do {
                rnd = ((int) ((90 * Math.random()) + 1));
            } while (reserved.contains(rnd));

            bag.getBag().add(rnd);
            reserved.add(rnd);
        }
        return bag;
    }
}
