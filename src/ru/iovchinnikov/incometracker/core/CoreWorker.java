package ru.iovchinnikov.incometracker.core;

public interface CoreWorker {

    void outCoreStats(Core c, String stats);
    String inCoreAdd(CoreWorker src, int sum);
    void onCoreException(Core c, Exception e);

}
