package com.mentalfrostbyte.jello.event;

public class CancellableEvent implements ICancellableEvent {
    public boolean cancelled;

    @Override
    public boolean setCancelled(boolean var1) {
        return this.cancelled = var1;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
}
