package ru.iovchinnikov.incometracker.ui;

import ru.iovchinnikov.incometracker.core.Core;
import ru.iovchinnikov.incometracker.core.CoreWorker;

public class Console implements CoreWorker {
    private static final String ERROR_PREFIX = "user inetrface error: ";
    private static final String ERROR_POSTFIX = " type -? for help.";

    public Console(String[] args) {
        // here we could have only commands
        // -a | --add <sum>: add a sum (insert to DB)
        // -s | --show [<period> | all]: print entries for a given period or all entries (select)
        // -m | --more <args>: TODO determine args
        //TODO create enum for commands for more flexibility

        // chech if args are valid
        boolean isMore = "-m".equals(args[0]) || "--more".equals(args[0]);
        if (args.length > 2 && !isMore) {
            throwErrorAndExit("unexpected arguments amount.");
        }
        switch (args[0]) {
            case "-a":
            case "--add":
                // core insert
                break;
            case "-s":
            case "--show":
                // core request
                break;
            case "-m":
            case "--more":
                // not sure to have anything here yet.
                break;
            default:
                throwErrorAndExit("can't recognize a command.");
        }

    }

    private void throwErrorAndExit(String msg) {
        throw new RuntimeException(ERROR_PREFIX + msg + ERROR_POSTFIX);
    }

    private void consoleWriteLine(String msg) {
        System.out.println(msg);
    }


    /**
     * Core Worker methods
     * */
    @Override
    public void outCoreStats(Core c, String stats) {

    }

    @Override
    public String inCoreAdd(CoreWorker src, int sum) {
        return null;
    }

    @Override
    public void onCoreException(Core c, Exception e) {

    }
}
