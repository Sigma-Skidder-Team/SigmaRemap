package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.Packet;

public class RecievePacketEvent extends CancellableEvent {
    private static String[] field21480;
    private Packet field21481;

    public RecievePacketEvent(Packet var1) {
        this.field21481 = var1;
    }

    public Packet getPacket() {
        return this.field21481;
    }

    public void method13899(Packet var1) {
        this.field21481 = var1;
    }
}
