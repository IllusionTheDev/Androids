package me.imillusion.androids.commands;

import me.imillusion.androids.data.common.commands.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import java.util.*;

public class CommandManager {

    private Map<String, List<SubCommand>> subs = new HashMap<>();

    public void registerSubcommand(SubCommand sub)
    {
        String identifier = getIdentifierGroup(sub.getIdentifier());

        subs.putIfAbsent(identifier, new ArrayList<>());

        List<SubCommand> list = subs.get(sub.getIdentifier());
        list.add(sub);

        subs.replace(sub.getIdentifier(), list);
    }

    public List<String> getSubcommands(String[] args, Command command, Player p)
    {
        String id = command.getName() + "." + String.join(".", args);

        if(!subs.containsKey(id))
            return new ArrayList<>();

        List<SubCommand> commands = subs.get(id);
        List<String>     commandNames = new ArrayList<>();

        commands.stream()
                .filter(sub -> p.hasPermission(sub.getPermission()))
                .forEach(s -> commandNames.add(s.getIdentifier().replace(id, "")));

        Collections.sort(commandNames);

        return commandNames;

    }

    private String getIdentifierGroup(String s)
    {
        String[] identifiers = s.split(".");
        identifiers = Arrays.copyOf(identifiers, identifiers.length - 1);
        return String.join(",", identifiers);
    }

}
