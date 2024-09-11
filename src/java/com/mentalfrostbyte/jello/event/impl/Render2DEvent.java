package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Event;

public class Render2DEvent implements Event {
    public final float field21554;
    public final long field21555;

    public Render2DEvent() {
        this.field21555 = 0L;
        this.field21554 = 0.0F;
    }

    public Render2DEvent(float var1, long var2) {
        this.field21555 = var2;
        this.field21554 = var1;
    }
}
