// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.events;

public class DeferredTrueState extends DeferredEventState {
    public DeferredTrueState(final String name) {
        super(name);
    }

    @Override
    public boolean shouldDefer() {
        return true;
    }
}
