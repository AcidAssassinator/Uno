package acidassassin.uno.card;

import acidassassin.uno.card.enums.Color;
import acidassassin.uno.gameplay.handlers.TextHandler;

public class WildCard extends AbstractCard {
    boolean isPlusFour;

    public WildCard(boolean isPlusFour) {
        super(null);
        this.isPlusFour = isPlusFour;
    }

    public boolean isPlusFour() {
        return isPlusFour;
    }

    @Override
    public void play() {

    }

    @Override
    public String getName() {
        String colorName = "NONE";
        if (this.color != null)
            colorName = this.color.name();
        return "Wild " + "(" + TextHandler.formatString(colorName) + ")" + (this.isPlusFour() ? " Plus Four" : "");
    }
}
