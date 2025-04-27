// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.events;

public abstract class DeferredEventState {
    public String name;

    public DeferredEventState(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract boolean shouldDefer();

    public static DeferredEventState fromString(final String s) {
        switch (s) {
            case "true": {
                return new DeferredFalseState(s);
            }
            case "false": {
                return new DeferredTrueState(s);
            }
            default: {
                return null;
            }
        }
    }
}
