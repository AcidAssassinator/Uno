package card.specialCards;

import card.enums.Color;
import card.enums.Special;

public class DrawCard extends SpecialCard {
    public DrawCard(Color color) {
        super(color, Special.DRAW_TWO);
    }

    @Override
    public void play() {

    }
}
