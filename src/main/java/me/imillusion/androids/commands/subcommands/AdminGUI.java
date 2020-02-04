package me.imillusion.androids.commands.subcommands;

import me.imillusion.androids.data.common.commands.SubCommand;
import org.bukkit.entity.Player;

public class AdminGUI implements SubCommand {

    @Override
    public String getIdentifier() {
        // /android admingui
        //
        // if the user has the permission
        // and the user typed /android
        // all the subcommands that directly
        // affect /android will be represente
        // as long as the user has the required
        // permission.
        //
        // if the identifier is
        // "android.admin.kill"
        // and the input is
        // "android", it would
        // return a list with "admin"
        // if the user has the permission
        // for any subcommand related to "admin"
        //

        return "android.admingui";
    }

    @Override
    public String getPermission() {
        return "androids.admin";
    }

    @Override
    public void call(Player p) {

    }
}
