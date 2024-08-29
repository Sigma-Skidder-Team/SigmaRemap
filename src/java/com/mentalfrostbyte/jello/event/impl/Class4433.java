package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class Class4433 extends CancellableEvent {
    private static String[] field21579;
    private final Entity field21580;

    public Class4433(Entity var1) {
        this.field21580 = var1;
    }

    public Entity method13987() {
        return this.field21580;
    }
}
