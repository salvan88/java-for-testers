package gerzen777gmail.com.loto.model;

public class Game {

    private boolean player1Result = false;
    private  boolean player2Result = false;

    public String newGame(Card card1, Card card2, GameMaster gameMaster) {
        String gameResult = null;

        for (int i = 0; i < gameMaster.getPlayableBag().size(); i++) {

            int playableNumber = gameMaster.pullNumber();

            card1.checkNumber(playableNumber);
            card2.checkNumber(playableNumber);

            if (checkWin(card1)) {
                player1Result = true;
            }
            if (checkWin(card2)) {
                player2Result = true;
            }

            if (player1Result || player2Result) {
                gameResult = "У нас есть победители: ";
                if (player1Result && player2Result) {
                    gameResult = gameResult + card1.getPlayerName() + " и " + card2.getPlayerName();
                } else if(player1Result) {
                    gameResult = gameResult + card1.getPlayerName();
                } else {
                    gameResult = gameResult + card2.getPlayerName();
                }
                break;
            } else if (i == gameMaster.getPlayableBag().size() - 1) {
                gameResult = "Бочонки закончились. Победителей нет.";
            }
        }
        return gameResult;
    }

    public boolean checkWin(Card card) {
        for (int i = 0; i < 3; i++) {
            if (card.getCard().get(i).isEmpty()) {
                return true;
            }
        }
        return false;
    }
}