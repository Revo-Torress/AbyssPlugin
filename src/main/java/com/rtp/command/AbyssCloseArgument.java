package com.rtp.command;

import com.rtp.domain.AbyssService;
import org.bukkit.command.CommandSender;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class AbyssCloseArgument implements Argument {

    private final AbyssService abyssService;

    @Inject
    public AbyssCloseArgument(AbyssService abyssService) {
        this.abyssService = abyssService;

    }

    @Override
    public void execute(CommandSender sender) {
        if (sender.hasPermission("abyss.admin") || sender.hasPermission("abyss.*")) {
            if (abyssService.close()){
                sender.sendMessage("Abyss Close");
                return;
            }
            sender.sendMessage("Abyss can not be close");
            return;
        }
        sender.sendMessage("You do not have permission to do this");
    }
}
