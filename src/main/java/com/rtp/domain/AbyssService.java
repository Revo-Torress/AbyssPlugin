package com.rtp.domain;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class AbyssService {
    private final Abyss abyss;
    @Inject
    public AbyssService(Abyss abyss) {
        this.abyss = abyss;
    }

    public void addItem (Material material, int amount){
        AbyssItem abyssItem = new AbyssItem(material, amount);
        List <AbyssItem> abyssItems = abyss.getAbyssItems();
        abyssItems.add(abyssItem);
    }

    public void removeItem (Material material, int amount) {
        AbyssItem abyssItem = new AbyssItem(material, amount);
        List <AbyssItem> abyssItems = abyss.getAbyssItems();
        abyssItems.remove(abyssItem);
    }
    public boolean open () {
        if (abyss.isOpen()) {
            return false;
        }
        abyss.setOpen(true);
        return true;
    }

    public boolean close () {
        if (!abyss.isOpen()){
            return false;
        }
        abyss.setOpen(false);
        return true;
    }

    public List<AbyssItem> getItemsOnCurrentPage (int page ){
        List<AbyssItem> result = new ArrayList<>();
        List<AbyssItem> abyssItems = abyss.getAbyssItems();
        for(int x = page * 25 ; x < ((page + 1) * 25 ); x++){
            try{
                result.add(abyssItems.get(x));
            } catch (IndexOutOfBoundsException exception){
                break;
            }
        }
        return result;
    }

    public void clear() {
        abyss.clear();
    }
}
