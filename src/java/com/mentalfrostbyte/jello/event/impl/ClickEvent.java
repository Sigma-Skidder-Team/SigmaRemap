package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class ClickEvent extends CancellableEvent {
    private static String[] field21567;
    private final Button field21568;

    public ClickEvent(Button var1) {
        this.field21568 = var1;
    }

    public Button method13976() {
        return this.field21568;
    }

    public enum Button {
        LEFT,
        RIGHT,
        MID;
    }
}
