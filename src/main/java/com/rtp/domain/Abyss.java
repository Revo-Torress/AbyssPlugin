package com.rtp.domain;

import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
class Abyss {
    private List <AbyssItem> abyssItems;
    private boolean open;

    public Abyss() {
        this.abyssItems = new ArrayList<>();
        this.open = true;
    }

    public List<AbyssItem> getAbyssItems() {
        return abyssItems;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}

