package acidassassin.uno.card.specialCards;

import acidassassin.uno.card.enums.Color;
import acidassassin.uno.card.enums.Special;

public class SkipCard extends SpecialCard {
    public SkipCard(Color color) {
        super(color, Special.SKIP);
    }

    @Override
    public void play() {

    }
}
