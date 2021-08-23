package acidassassin.uno.gameplay;

import acidassassin.uno.card.AbstractCard;
import acidassassin.uno.card.NumberCard;
import acidassassin.uno.card.specialCards.SpecialCard;
import acidassassin.uno.card.specialCards.DrawCard;
import acidassassin.uno.card.specialCards.ReverseCard;
import acidassassin.uno.card.WildCard;
import acidassassin.uno.card.enums.Color;
import acidassassin.uno.card.specialCards.SkipCard;
import acidassassin.uno.gameplay.handlers.TextHandler;

import java.util.ArrayList;
import java.util.Collections;

public class CardHolder extends ArrayList<AbstractCard> {
    public CardHolder() {
        super();
    }

    public void generateDeck() {
        this.clear();

        // Generate Colors
        for (Color color : Color.values()) {
            // Generate 0's
            add(new NumberCard(color, 0));

            // Generate Other Number Cards
            for (int i = 1; i <= 9; i++) {
                add(new NumberCard(color, i));
                add(new NumberCard(color, i));
            }

            // Generate Special Cards
            add(new ReverseCard(color));
            add(new ReverseCard(color));

            add(new SkipCard(color));
            add(new SkipCard(color));

            add(new DrawCard(color));
            add(new DrawCard(color));
        }


        // Generate Wild Cards
        for (int i = 0; i < 4; i++) {
            add(new WildCard(false));
            add(new WildCard(true));
        }
    }

    public void shuffle() {
        Collections.shuffle(this);
    }

    public AbstractCard getTopCard() {
        try {
            return this.get(this.size() - 1);
        } catch (IndexOutOfBoundsException e) {
			// TODO replace with actual logic handling
            return new NumberCard(Color.RED, 0);
        }
    }

    public void announceContents() {
        // Loop over each card
        for (AbstractCard card : this) {
            TextHandler.println(card.getName());
        }
    }
}
