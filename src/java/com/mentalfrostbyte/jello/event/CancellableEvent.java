package com.mentalfrostbyte.jello.event;

public class CancellableEvent extends Class4416 implements ICancellableEvent {
    public boolean cancelled;

    @Override
    public boolean method13900(boolean var1) {
        return this.cancelled = var1;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
}
