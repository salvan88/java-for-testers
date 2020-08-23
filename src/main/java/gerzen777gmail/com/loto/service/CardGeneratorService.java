package gerzen777gmail.com.loto.service;

import gerzen777gmail.com.loto.model.Card;
import java.util.HashSet;

public class CardGeneratorService {
    private final HashSet<Integer> reserved = new HashSet<>();

    public Card cardGenerate(Card card) {
        for (int i = 0; i < 3; i++) {
            HashSet<Integer> row = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                int rnd;

                do {
                    rnd = ((int) ((30 * Math.random()) + 1));
                } while (reserved.contains(rnd));

                row.add(rnd);
                reserved.add(rnd);
            }
            card.getCard().add(row);
        }
        return card;
    }
}
