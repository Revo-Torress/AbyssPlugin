package com.rtp.command;

import com.rtp.Plugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.inject.Singleton;

@Singleton
public class AbyssCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("Abyss")) {
            Plugin.getApplicationContext().getLogger().info("Abyss open");
         return true;
        }

        return false;
    }
}
