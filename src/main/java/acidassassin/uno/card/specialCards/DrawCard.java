package acidassassin.uno.card.specialCards;

import acidassassin.uno.card.enums.Color;
import acidassassin.uno.card.enums.Special;

public class DrawCard extends SpecialCard {
    public DrawCard(Color color) {
        super(color, Special.DRAW_TWO);
    }

    @Override
    public void play() {

    }
}
