package card.specialCards;

import card.enums.Color;
import card.enums.Special;

public class ReverseCard extends SpecialCard {
    public ReverseCard(Color color) {
        super(color, Special.REVERSE);
    }

    @Override
    public void play() {

    }
}
