package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class Render2DEvent extends CancellableEvent {
    public final float partialTicks;
    public final long field21555;

    public Render2DEvent() {
        this.field21555 = 0L;
        this.partialTicks = 0.0F;
    }

    public Render2DEvent(float var1, long var2) {
        this.field21555 = var2;
        this.partialTicks = var1;
    }
}
