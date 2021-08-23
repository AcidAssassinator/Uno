package acidassassin.uno.gameplay.handlers;

import acidassassin.uno.card.AbstractCard;
import acidassassin.uno.gameplay.CardHolder;
import acidassassin.uno.gameplay.Director;

public class CommandHandler {
	public static String process(String line) {
		if (!isCommand(line)) return line;

		// Process command
		String[] cmd = line.split(":");
		switch (cmd[0]) {
			case "!line":
				return line(cmd[1]);
			case "!center":
				return center(cmd[1]);
			case "!discard":
				AbstractCard discardTop = Director.instance.discard.getTopCard();
				return center(discardTop.getName());
			case "!hand":
				return hand();
			default:
				return line;
		}
	}

	static String line(String input) {
		String output = "";
		for (int i = 0; i < (int) Math.floor((float) TextHandler.CONSOLE_WIDTH / input.length()); i++) {
			output = output.concat(input);
		}
		return output;
	}

	static String center(String input) {
		String spaces = "";
		for (int i = 0; i < (TextHandler.CONSOLE_WIDTH - input.length()) / 2; i++) {
			spaces = spaces.concat(" ");
		}
		return spaces + input;
	}

	static String hand() {
		CardHolder hand = Director.instance.currentPlayer.hand;
		String cardNames = "";

		for (AbstractCard card : hand) {
			cardNames = cardNames.concat(center((hand.indexOf(card) + 1) + ") " + card.getName()) + "\n");
		}

		cardNames = cardNames.stripTrailing();

		return cardNames;
	}

	static boolean isCommand(String line) {
		// Test for command
		try {
			if (line.charAt(0) != '!') return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
