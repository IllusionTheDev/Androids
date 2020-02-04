package me.imillusion.androids.commands;

import me.imillusion.androids.Androids;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.List;

public class AndroidTabCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player))
        {
            sender.sendMessage(ChatColor.RED + "{Androids[ - You must be a player to execute this command");
        }
        return Androids.getInstance().getCommandManager().getSubcommands(args, command, (Player) sender);
    }
}
