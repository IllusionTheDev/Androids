package me.imillusion.androids.data.common.commands;

import org.bukkit.entity.Player;

public interface SubCommand {

    String getIdentifier();
    String getPermission();

    void   call(Player player);

}
