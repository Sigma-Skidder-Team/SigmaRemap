package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Event;
import com.mentalfrostbyte.jello.event.ICancellableEvent;

public class Class4406 implements Event, ICancellableEvent {
    private static String[] field21519;
    public boolean field21520 = false;

    @Override
    public boolean method13900(boolean var1) {
        return this.field21520 = var1;
    }

    @Override
    public boolean isCancelled() {
        return this.field21520;
    }
}
