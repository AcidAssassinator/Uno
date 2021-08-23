package acidassassin.uno.card;

import acidassassin.uno.card.enums.Color;

public abstract class AbstractCard {
    Color color;

    public AbstractCard(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void play();

    public abstract String getName();
}
