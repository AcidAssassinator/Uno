package acidassassin.uno.card;

import acidassassin.uno.card.enums.Color;

public abstract class AbstractCard {
    Color color;

    public AbstractCard(Color color) {
        this.color = color;
    }


		// Get & Set //

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

	
		// Abstract methods //

    public abstract void play();

    public abstract String getName();
}
