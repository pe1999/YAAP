package ru.iovchinnikov.incometracker;

import ru.iovchinnikov.incometracker.ui.Console;
import ru.iovchinnikov.incometracker.ui.Graphical;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        // Basics
        // define keys -w | --web (do i need it)?
        // todo define commands -a | --add <sum>, -s | --show [<period> | all], -m | --more <args>

        // switch all possible keys here (could be any argument)
        // ex. `yaap.jar --add 100 -g` should add 100 for today and then open gui
        String[] possibleKeys = Keys.getAllNames();

        // these checks are obviously for console only
        boolean tryGraphics = false;
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                //check if we try to launch graphics mode
                if (Keys.KEY_GUI_S.getName().equals(args[i]) || Keys.KEY_GUI_F.getName().equals(args[i]))
                    tryGraphics = true;

                if (Keys.KEY_HLP_S.getName().equals(args[i]) || Keys.KEY_HLP_F.getName().equals(args[i])) {
                    //show helping info and exit app, even if -g key is used
                    System.exit(0);
                }
            }
        }

        boolean finalTryGraphics = tryGraphics;
        SwingUtilities.invokeLater(() -> {
            try {
                new Graphical(args, finalTryGraphics);
            } catch (HeadlessException e) {
                new Console(args, finalTryGraphics);
            }
        });
    }
}
