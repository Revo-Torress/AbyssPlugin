package com.rtp.listener;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.rtp.Plugin;
import com.rtp.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;

@Singleton
public class GroundItemManager {

    private final Plugin plugin;
    private final GroundItemRunnable groundItemRunnable;
    private final Config config;

    @Inject
    GroundItemManager(GroundItemRunnable groundItemRunnable, Config config) {
        this.config = config;
        this.plugin = Plugin.getApplicationContext();
        this.groundItemRunnable = groundItemRunnable;
    }

    public void listen(){
        BukkitScheduler bukkitScheduler = Bukkit.getScheduler();
        bukkitScheduler.scheduleSyncRepeatingTask(plugin, groundItemRunnable, 0L, (60 * config.getSchedulingTime()) * 20L);
    }
}
