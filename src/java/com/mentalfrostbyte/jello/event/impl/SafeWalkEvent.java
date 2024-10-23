package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.Situation;

public class SafeWalkEvent extends CancellableEvent {
    public boolean onEdge;
    public Situation situation;

    public SafeWalkEvent(boolean onEdge) {
        this.onEdge = onEdge;
        this.situation = Situation.DEFAULT;
    }

    public Situation getSituation() {
        return this.situation;
    }

    public void setSafe(boolean safe) {
        this.situation = safe ? Situation.SAFE : Situation.PLAYER;
    }

    public boolean isOnEdge() {
        return this.onEdge;
    }
}
