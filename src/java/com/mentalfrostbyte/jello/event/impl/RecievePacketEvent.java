package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.network.Packet;

public class RecievePacketEvent extends CancellableEvent {
    private static String[] field21480;
    private Packet packet;

    public RecievePacketEvent(Packet var1) {
        this.packet = var1;
    }

    public Packet getPacket() {
        return this.packet;
    }

    public void method13899(Packet var1) {
        this.packet = var1;
    }
}
