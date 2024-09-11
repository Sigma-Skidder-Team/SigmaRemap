package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class EventRenderNameTag extends CancellableEvent {
    private final Entity field21580;

    public EventRenderNameTag(Entity var1) {
        this.field21580 = var1;
    }

    public Entity method13987() {
        return this.field21580;
    }
}
