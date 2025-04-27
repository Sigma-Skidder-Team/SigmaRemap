// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.events;

public class DeferredFalseState extends DeferredEventState {

    public DeferredFalseState(final String name) {
        super(name);
    }

    @Override
    public boolean shouldDefer() {
        return false;
    }
}
