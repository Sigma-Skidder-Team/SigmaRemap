package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.Class7377;

public class EventRenderBlocks extends CancellableEvent {
    private final Class7377 field21559;
    private boolean field21560 = false;

    public EventRenderBlocks(Class7377 var1) {
        this.field21559 = var1;
    }

    public Class7377 method13970() {
        return this.field21559;
    }

    public boolean method13971() {
        return this.field21560;
    }

    public void method13972(boolean var1) {
        this.field21560 = var1;
    }
}
