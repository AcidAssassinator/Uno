package acidassassin.uno;

import acidassassin.uno.gameplay.Director;
import acidassassin.uno.gameplay.handlers.FileHandler;
import acidassassin.uno.gameplay.handlers.TextHandler;
import acidassassin.uno.gameplay.handlers.CommandHandler;

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
