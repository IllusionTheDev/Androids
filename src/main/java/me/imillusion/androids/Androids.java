package me.imillusion.androids;

import org.bukkit.plugin.java.JavaPlugin;

public class Androids extends JavaPlugin {

    private static Androids instance;
    public static Androids getInstance()
    {
        return instance == null ? instance = JavaPlugin.getPlugin(Androids.class) : instance;
    }

    @Override
    public void onEnable() {
        getLogger().info("Androids - Enabled"); //Enabled message
    }
}
