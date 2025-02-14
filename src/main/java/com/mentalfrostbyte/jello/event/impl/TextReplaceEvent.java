package com.mentalfrostbyte.jello.event.impl;

public class TextReplaceEvent extends CancellableEvent {
    private String text;

    public TextReplaceEvent(String var1) {
        this.text = var1;
    }

    public String setText() {
        return this.text;
    }

    public void setText(String var1) {
        this.text = var1;
    }
}
