package com.rtp.commandExecutor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class CommandExecutor extends JavaPlugin implements org.bukkit.command.CommandExecutor {
    public static Logger console;
    FileConfiguration config = getConfig();

    public void onEnable() {
        super.onEnable();
        config.options().copyDefaults(true);
        saveConfig();
    }

    public void onDisable () {
        super.onDisable();
    }

    public boolean onCommand(CommandSender sender, String str, Command command, String [] args) {
        if(!(sender instanceof Player)) {
            console.info("Command is available only from client level");
            return true;
        }

        Player player = (Player) sender;

        if(str.equalsIgnoreCase("Abyss Opened")) {
            if(args.length > 0) {
                return false;
            }

        }
        if(str.equalsIgnoreCase("Abyss Closed")) {
            if(args.length > 0) {
                return false;
            }

        }
    }
}
