package card.specialCards;

import card.AbstractCard;
import card.enums.Color;
import card.enums.Special;
import gameplay.handlers.TextHandler;

public abstract class SpecialCard extends AbstractCard {
    Special special;

    public SpecialCard(Color color, Special special) {
        super(color);
        this.special = special;
    }

    public Special getSpecial() {
        return special;
    }

    @Override
    public String getName() {
        return TextHandler.formatString(this.getColor().name() + "_" + this.getSpecial().name());
    }
}
