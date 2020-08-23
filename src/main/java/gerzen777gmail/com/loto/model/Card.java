package gerzen777gmail.com.loto.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Card {
    private final ArrayList<HashSet<Integer>> card;
    private final String playerName;

    public Card(String playerName) {
        this.card = new ArrayList<>();
        this.playerName = playerName;
    }

    public ArrayList<HashSet<Integer>> checkNumber(int number) {
        boolean result = false;
        int deleteNumber = 0;

        for (int i = 0; i < 3; i++) {
            Iterator<Integer> iterator = card.get(i).iterator();
            while (iterator.hasNext()) {
                deleteNumber = iterator.next();
                if (deleteNumber == number) {
                    iterator.remove();
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return card;
    }

    public ArrayList<HashSet<Integer>> getCard() {
        return card;
    }

    public String getPlayerName() {
        return playerName;
    }
}
