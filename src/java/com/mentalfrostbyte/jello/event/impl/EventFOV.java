package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class EventFOV extends CancellableEvent {
    public float fovModifier;

    public EventFOV(float fovModifier) {
        this.fovModifier = fovModifier;
    }
}