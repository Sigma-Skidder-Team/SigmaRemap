package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.Packet;

import java.util.ArrayList;
import java.util.List;

public class Class4402 extends CancellableEvent {
    private static String[] field21512;
    private Packet field21513;
    private final List<Packet> field21514 = new ArrayList<Packet>();

    public Class4402(Packet var1) {
        this.field21513 = var1;
        this.field21514.add(var1);
    }

    public Packet method13932() {
        return this.field21513;
    }

    public List<Packet> method13933() {
        return this.field21514;
    }

    public void method13934(Packet var1) {
        this.field21513 = var1;
    }
}