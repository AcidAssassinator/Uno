package player;

import card.AbstractCard;
import gameplay.CardHolder;
import gameplay.Director;

public abstract class AbstractPlayer {
    Director director = Director.instance;

    public CardHolder hand = new CardHolder();
    public int num = 0;

    public abstract void turn();

    public void play(AbstractCard card) {
        hand.remove(card);
        director.discard.add(card);
        card.play();

    }

    public AbstractCard draw() {
        AbstractCard c = director.deck.getTopCard();
        director.deck.remove(c);
        this.hand.add(c);
        return c;
    }
}
