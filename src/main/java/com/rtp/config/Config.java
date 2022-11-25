package com.rtp.config;

import com.google.inject.Singleton;
import com.rtp.Plugin;
import org.bukkit.configuration.file.FileConfiguration;

@Singleton
public class Config {

    private final Plugin plugin;

    public Config() {
        this.plugin = Plugin.getApplicationContext();
    }

    public int getSchedulingTime(){
        FileConfiguration config = plugin.getConfig();
        return config.getInt("time");
    }
}
