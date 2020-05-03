package com.climpy.library.bungee;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.logging.Level;

public class BungeePlugin extends Plugin {

    private static BungeePlugin instance;

    public void onEnable() {
        instance = this;
        getLogger().log(Level.INFO, "Bungee Library");
    }

    public void onDisable() {
        instance = null;
    }

    public static BungeePlugin getInstance() {
        return instance;
    }
}
