package gerzen777gmail.com.loto.model;

import gerzen777gmail.com.loto.service.CardGeneratorService;
import gerzen777gmail.com.loto.service.RandomBagGeneratorService;
import gerzen777gmail.com.loto.service.RandomGameMaster;
import gerzen777gmail.com.loto.test.PredictableBagGenerator;
import gerzen777gmail.com.loto.test.PredictableCardGenerator;
import gerzen777gmail.com.loto.test.PredictableGameMaster;

import java.util.HashSet;


public class GameMaster implements RandomGameMaster, PredictableGameMaster {
    private final HashSet<Integer> playableBag = new HashSet<>();

    @Override
    public GameMaster randomGameMaster(GameMaster gameMaster, Card card1, Card card2, Bag bag,
                                 RandomBagGeneratorService randomBagGeneratorService,
                                 CardGeneratorService cardGeneratorService) {

        cardGeneratorService.cardGenerate(card1);
        cardGeneratorService.cardGenerate(card2);
        playableBag.addAll(randomBagGeneratorService.bagGenerate(bag).getBag());

        return gameMaster;
    }

    @Override
    public GameMaster predictableGameMaster(GameMaster gameMaster, Card card1, Card card2, Bag bag,
                                            PredictableBagGenerator predictableBagGenerator,
                                            PredictableCardGenerator predictableCardGenerator)
    {
        predictableCardGenerator.cardGenerate(card1);
        predictableCardGenerator.cardGenerate(card2);
        playableBag.addAll(predictableBagGenerator.bagGenerate(bag).getBag());

        return gameMaster;
    }

    public int pullNumber() {
        int number = playableBag.iterator().next();
        playableBag.remove(number);
        return number;
    }

    public HashSet<Integer> getPlayableBag() {
        return playableBag;
    }
}
