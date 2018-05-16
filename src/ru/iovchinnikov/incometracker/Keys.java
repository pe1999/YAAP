package ru.iovchinnikov.incometracker;

public enum Keys {

    KEY_HLP_S { public String getName() { return "-?"; } },
    KEY_HLP_F { public String getName() { return "--help"; } },
    KEY_VER_S { public String getName() { return "-v"; } },
    KEY_VER_F { public String getName() { return "--version"; } },
    KEY_CLI_S { public String getName() { return "-c"; } },
    KEY_CLI_F { public String getName() { return "--console"; } },
    KEY_GUI_S { public String getName() { return "-g"; } },
    KEY_GUI_F { public String getName() { return "--graphical"; } };

    public abstract String getName();

    public static String[] getAllNames() {
        String[] r = new String[Keys.values().length];
        for (int i = 0; i < Keys.values().length; i++)
            r[i] = Keys.values()[i].getName();
        return r;
    }
}
