package ru.iovchinnikov.incometracker;

import ru.iovchinnikov.incometracker.ui.Console;
import ru.iovchinnikov.incometracker.ui.Graphical;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        // Basics
        // TODO define keys -?, -c | --console, -g | --grapical, (-w | --web)
        // TODO define commands -a | --add <sum>, -s | --show [<period> | all], -m | --more <args>
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
