package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class EventRayTraceResult extends CancellableEvent {
    private Entity field21516;
    private boolean field21517;

    public EventRayTraceResult(Entity var1, boolean var2) {
        this.field21516 = var1;
        this.field21517 = var2;
    }

    public Entity getEntity() {
        return this.field21516;
    }

    public void method13936(Entity var1) {
        this.field21516 = var1;
    }

    public boolean isHovering() {
        return this.field21517;
    }

    public void method13938() {
        this.field21517 = false;
    }
}
