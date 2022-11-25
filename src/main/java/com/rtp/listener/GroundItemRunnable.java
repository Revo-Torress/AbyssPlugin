package com.rtp.listener;

import com.google.inject.Singleton;
import com.rtp.domain.AbyssService;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.stream.Stream;

@Singleton
class GroundItemRunnable implements Runnable {

    private final AbyssService abyssService;

    GroundItemRunnable(AbyssService abyssService) {
        this.abyssService = abyssService;
    }

    @Override
    public void run() {
        getItemsFromGround();
    }

    private void getItemsFromGround() {
        World world = Bukkit.getWorld("world");
        abyssService.clear();
        Stream.of(world.getLoadedChunks())
                .forEach(chunk -> Stream.of(chunk.getEntities())
                        .forEach(entity -> addToAbyss(entity)));
    }

    private void addToAbyss(Entity entity) {
        if (isDroppedItem(entity)) {
            Item item = (Item) entity;
            ItemStack itemStack = item.getItemStack();
            abyssService.addItem(itemStack.getType(), itemStack.getAmount());
        }
    }

    private boolean isDroppedItem(Entity entity) {
        return entity.getType().equals(EntityType.DROPPED_ITEM);
    }
}
