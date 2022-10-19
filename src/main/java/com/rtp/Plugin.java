package com.rtp;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Plugin extends JavaPlugin {

    private static final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        logger.info("Enabling Abyss plugin!");
    }
}
