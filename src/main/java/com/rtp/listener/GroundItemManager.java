package com.rtp.listener;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.rtp.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;

@Singleton
public class GroundItemManager {

    private final Plugin plugin;
    private final GroundItemRunnable groundItemRunnable;

    @Inject
    GroundItemManager(GroundItemRunnable groundItemRunnable) {
        this.plugin = Plugin.getApplicationContext();
        this.groundItemRunnable = groundItemRunnable;
    }

    public void listen(){
        BukkitScheduler bukkitScheduler = Bukkit.getScheduler();
        bukkitScheduler.scheduleSyncRepeatingTask(plugin, groundItemRunnable, 0L, 100L);
    }
}
