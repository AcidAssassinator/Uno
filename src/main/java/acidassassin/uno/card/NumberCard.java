package acidassassin.uno.card;

import acidassassin.uno.card.enums.Color;
import acidassassin.uno.gameplay.handlers.TextHandler;

public class NumberCard extends AbstractCard {
    int value;

    public NumberCard(Color color, int value) {
       super(color);
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void play() {

    }

    @Override
    public String getName() {
        return TextHandler.formatString(this.getColor().name() + " " + this.getValue());
    }
}
