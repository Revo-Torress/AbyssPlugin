package com.rtp.command;

import com.rtp.Plugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.inject.Singleton;

@Singleton
public class AbyssCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("abyss")) {
            if (args.length == 0) {
                AbyssArgument abyssArgument = Plugin.getApplicationContext().getInjector().getInstance(AbyssArgument.class);
                abyssArgument.execute(commandSender);
                return true;
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("open")) {
                    AbyssOpenArgument abyssOpenArgument = Plugin.getApplicationContext().getInjector().getInstance(AbyssOpenArgument.class);
                    abyssOpenArgument.execute(commandSender);
                    return true;
                }
                if (args[0].equalsIgnoreCase("close")) {
                    AbyssCloseArgument abyssCloseArgument = Plugin.getApplicationContext().getInjector().getInstance(AbyssCloseArgument.class);
                    abyssCloseArgument.execute(commandSender);
                    return true;
                }
            }
        }
        return false;
    }
}
