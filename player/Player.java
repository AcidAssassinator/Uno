package player;

import gameplay.Director;
import gameplay.handlers.CommandHandler;
import gameplay.handlers.FileHandler;
import gameplay.handlers.TextHandler;

public class Player extends AbstractPlayer{
    @Override
    public void turn() {
        FileHandler.doFunctionOnFile("menus/player_screen.txt", CommandHandler::process);
        getCommand();
    }

    public void getCommand() {
        String input = TextHandler.getInput();
        if (input.equalsIgnoreCase("D")) {
            draw();
            return;
        }
        try {
            play(hand.get(Integer.parseInt(input) - 1));
            return;
			
        } catch (NumberFormatException e) {
            TextHandler.println("Please input a valid command");
            getCommand();

        } catch (IndexOutOfBoundsException e) {
            TextHandler.println("Card does not exist");
            getCommand();
        }
        TextHandler.println("Error in command");
        getCommand();
    }
}
