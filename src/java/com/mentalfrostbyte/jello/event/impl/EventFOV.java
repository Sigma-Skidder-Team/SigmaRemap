package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Event;

public class EventFOV implements Event {
    public float fovModifier;

    public EventFOV(float fovModifier) {
        this.fovModifier = fovModifier;
    }
}