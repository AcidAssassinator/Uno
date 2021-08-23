import gameplay.Director;
import gameplay.handlers.FileHandler;
import gameplay.handlers.TextHandler;
import gameplay.handlers.CommandHandler;

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Director director = new Director();

        TextHandler.clearConsole();

        FileHandler.doFunctionOnFile("menus/intro.txt", CommandHandler::process);

        if (TextHandler.getInput().equalsIgnoreCase("y"))
            director.newRound();
    }
}
