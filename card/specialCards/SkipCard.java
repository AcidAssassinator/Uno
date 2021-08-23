package card.specialCards;

import card.enums.Color;
import card.enums.Special;

public class SkipCard extends SpecialCard {
    public SkipCard(Color color) {
        super(color, Special.SKIP);
    }

    @Override
    public void play() {

    }
}
