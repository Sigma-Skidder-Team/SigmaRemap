package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class RenderFireEvent extends CancellableEvent {
    private float fireHeight;

    public RenderFireEvent() {
        this.fireHeight = 1.0F;
    }

    public RenderFireEvent(float fireHeight) {
        this.fireHeight = fireHeight;
    }

    public void setFireHeight(float fireHeightIn) {
        this.fireHeight = fireHeightIn;
    }

    public float getFireHeight() {
        return this.fireHeight;
    }
}
