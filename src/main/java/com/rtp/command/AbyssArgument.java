package com.rtp.command;

import com.rtp.Plugin;
import org.bukkit.command.CommandSender;

import javax.inject.Singleton;
import java.util.logging.Logger;
@Singleton
class AbyssArgument implements Argument{
    @Override
    public void execute(CommandSender sender) {
        Plugin.getApplicationContext().getLogger().info("AbyssOpen");
    }
}
