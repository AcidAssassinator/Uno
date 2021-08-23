package acidassassin.uno.card.specialCards;

import acidassassin.uno.card.AbstractCard;
import acidassassin.uno.card.enums.Color;
import acidassassin.uno.card.enums.Special;
import acidassassin.uno.gameplay.handlers.TextHandler;

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
