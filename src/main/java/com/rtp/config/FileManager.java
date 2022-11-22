package com.rtp.config;

import com.google.inject.Singleton;
import com.rtp.Plugin;

import java.io.File;

@Singleton
public class FileManager {

    private final Plugin plugin;

    public FileManager() {
        this.plugin = Plugin.getApplicationContext();
    }

    public void checkFiles(){
        File configFile = new File(plugin.getDataFolder() + "/plugins/Abyss/config.yml");
        if(!configFile.exists()){
            plugin.saveDefaultConfig();
        }
    }
}
