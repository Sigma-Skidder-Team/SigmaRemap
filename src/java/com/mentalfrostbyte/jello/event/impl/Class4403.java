package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class Class4403 extends CancellableEvent {
    private static String[] field21515;
    private Entity field21516;
    private boolean field21517;

    public Class4403(Entity var1, boolean var2) {
        this.field21516 = var1;
        this.field21517 = var2;
    }

    public Entity method13935() {
        return this.field21516;
    }

    public void method13936(Entity var1) {
        this.field21516 = var1;
    }

    public boolean method13937() {
        return this.field21517;
    }

    public void method13938() {
        this.field21517 = false;
    }
}
