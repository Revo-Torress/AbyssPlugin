package com.rtp;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rtp.listener.GroundItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private final Injector injector = Guice.createInjector(new AbstractModule() {});
    private static Plugin applicationContext;

    @Override
    public void onEnable() {
        applicationContext = this;
        getLogger().info("Enabling Abyss plugin!");
        injector.getInstance(GroundItemManager.class).listen();
    }

    public Injector getInjector() {
        return injector;
    }

    public static Plugin getApplicationContext() {
        return applicationContext;
    }
}
