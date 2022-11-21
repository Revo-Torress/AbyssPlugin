package com.rtp.command;

import com.rtp.domain.AbyssService;
import org.bukkit.command.CommandSender;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class AbyssOpenArgument implements Argument {
    private final AbyssService abyssService;

    @Inject
    public AbyssOpenArgument(AbyssService abyssService) {
        this.abyssService = abyssService;
    }

    @Override
    public void execute(CommandSender sender) {
        if (sender.hasPermission("abyss.admin") || sender.hasPermission("abyss.*")){
            if (abyssService.open()){
                sender.sendMessage("Abyss Open");
                return;
            }
            sender.sendMessage("Abyss can not be open");
            return;
        }
        sender.sendMessage("You do not have permission to do this");
    }
}
