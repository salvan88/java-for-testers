package gerzen777gmail.com.loto.test;

import gerzen777gmail.com.loto.model.Card;

import java.util.HashSet;

public class PredictableCardGenerator {

    public Card cardGenerate(Card card) {
        int number = 0;
        for (int i = 0; i < 3; i++) {
            HashSet<Integer> row = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                number++;
                row.add(number);
            }
            card.getCard().add(row);
        }
        return card;
    }
}
