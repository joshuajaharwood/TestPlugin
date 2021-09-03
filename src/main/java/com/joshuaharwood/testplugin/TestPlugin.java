package com.joshuaharwood.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class TestPlugin extends JavaPlugin {
    private Logger logger = getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("Registering command...");
        this.getCommand("testCommand").setExecutor(new TestCommand());
        logger.info("Command registered.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
