package gerzen777gmail.com.loto.model;

import java.util.LinkedHashSet;

public class Bag {
    private final LinkedHashSet<Integer> bag;

    public Bag() {
        this.bag = new LinkedHashSet<>();
    }

    public LinkedHashSet<Integer> getBag() {
        return bag;
    }
}
