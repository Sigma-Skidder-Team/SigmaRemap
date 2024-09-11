package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Class4416;
import mapped.Situation;

public class SafeWalkEvent extends Class4416 {
    public boolean onEdge;
    public Situation situation;

    public SafeWalkEvent(boolean var1) {
        this.onEdge = var1;
        this.situation = Situation.field11097;
    }

    public Situation method13965() {
        return this.situation;
    }

    public void setSafe(boolean var1) {
        this.situation = !var1 ? Situation.SAFE : Situation.PLAYER;
    }

    public boolean method13967() {
        return this.onEdge;
    }
}
