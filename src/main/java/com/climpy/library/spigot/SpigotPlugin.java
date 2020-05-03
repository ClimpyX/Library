package com.climpy.library.spigot;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

import static org.bukkit.Bukkit.getLogger;

public class SpigotPlugin extends JavaPlugin {
    private static SpigotPlugin instance;

    public void onEnable() {
        instance = this;
        getLogger().log(Level.INFO, "Spigot Library");
    }

    public void onDisable() {
        instance = null;
    }

    public static SpigotPlugin getInstance() {
        return instance;
    }
}
