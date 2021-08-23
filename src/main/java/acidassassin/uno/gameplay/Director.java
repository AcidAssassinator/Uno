package acidassassin.uno.gameplay;

import acidassassin.uno.card.AbstractCard;
import acidassassin.uno.gameplay.handlers.TextHandler;
import acidassassin.uno.player.AIPlayer;
import acidassassin.uno.player.AbstractPlayer;
import acidassassin.uno.player.Player;

import java.util.ArrayList;
import java.util.Collections;

public class Director {
    public static Director instance;

    public CardHolder deck = new CardHolder();
    public CardHolder discard = new CardHolder();

    public ArrayList<AbstractPlayer> players = new ArrayList<>();
    public AbstractPlayer currentPlayer;
    public AbstractPlayer nextPlayer;

    int direction = 1;

    public Director() {
        Director.instance = this;
    }

    public void newRound()  {
        // Players
        players.add(new Player());
        players.add(new AIPlayer());
        Collections.shuffle(players);
        setPlayerNums();

        // Deck
        deck.generateDeck();
        deck.shuffle();

        // Discard
        AbstractCard d = deck.getTopCard();
        deck.remove(d);
        discard.add(d);

        // Begin game
        dealCards();
        play();
    }


        // GAME METHODS //

    public void dealCards() {
        for (int i = 0; i < 7; i++) {
            for (AbstractPlayer player : players) {
                AbstractCard c = player.draw();
            }
        }
    }

    void play() {
        currentPlayer = players.get(0);
        nextPlayer = players.get(1);

        TextHandler.clearConsole();

        currentPlayer.turn();

        // Next player
        Collections.rotate(players, direction);

        play();
    }


        // DATA //

    void setPlayerNums() {
        for (AbstractPlayer player : players) {
            player.num = players.indexOf(player);
        }
    }
}
