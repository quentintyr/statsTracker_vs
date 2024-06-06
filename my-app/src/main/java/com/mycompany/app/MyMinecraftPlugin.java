package com.mycompany.app;

import org.bukkit.plugin.java.JavaPlugin;

public class MyMinecraftPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MyMinecraftPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyMinecraftPlugin has been disabled!");
    }
}
