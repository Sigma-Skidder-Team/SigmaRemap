package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class EventRayTraceResult extends CancellableEvent {
    private Entity entity;
    private boolean hover;

    public EventRayTraceResult(Entity entity, boolean hover) {
        this.entity = entity;
        this.hover = hover;
    }

    public Entity getEntity() {
        return this.entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public boolean isHovering() {
        return this.hover;
    }

    public void unhover() {
        this.hover = false;
    }
}
