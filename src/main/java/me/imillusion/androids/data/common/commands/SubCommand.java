package me.imillusion.androids.data.common.commands;

public interface SubCommand {

    String getIdentifier();
    void   call();


}
