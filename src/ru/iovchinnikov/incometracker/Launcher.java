package ru.iovchinnikov.incometracker;

import ru.iovchinnikov.incometracker.ui.Console;
import ru.iovchinnikov.incometracker.ui.Graphical;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        // Basics
        // define keys -w | --web (do i need it)?
        // TODO define commands -a | --add <sum>, -s | --show [<period> | all], -m | --more <args>

        // switch all possible keys here (could be any argument)
        // ex. `yaap.jar --add 100 -g` should add 100 for today and then open gui
        String[] possibleKeys = Keys.getAllNames();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Graphical(args);
                } catch (HeadlessException e) {
                    new Console(args);
                }
            }
        });
    }
}
