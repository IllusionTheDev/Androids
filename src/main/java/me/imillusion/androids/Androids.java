package me.imillusion.androids;

import lombok.Getter;
import me.imillusion.androids.commands.CommandManager;
import me.imillusion.androids.functions.AndroidManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Androids extends JavaPlugin {

    private static Androids instance;
    public static Androids getInstance()
    {
        return instance == null ? instance = JavaPlugin.getPlugin(Androids.class) : instance;
    }

    private @Getter AndroidManager androidManager;
    private @Getter CommandManager commandManager;

    @Override
    public void onEnable() {
        instance = this;

        androidManager = new AndroidManager();

        getLogger().info("Androids - Enabled"); //Enabled message
    }
}
