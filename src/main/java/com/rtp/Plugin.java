package com.rtp;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rtp.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Plugin extends JavaPlugin {

    private static final Logger logger = Logger.getLogger("Minecraft");
    private static final Injector injector = Guice.createInjector(new AbstractModule() {});

    @Override
    public void onEnable() {
        logger.info("Enabling Abyss plugin!");
    }
}
