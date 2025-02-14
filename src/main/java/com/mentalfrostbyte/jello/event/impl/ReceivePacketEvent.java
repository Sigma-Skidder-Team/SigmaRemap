package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.network.IPacket;

public class ReceivePacketEvent extends CancellableEvent {
    private IPacket packet;

    public ReceivePacketEvent(IPacket var1) {
        this.packet = var1;
    }

    public IPacket getPacket() {
        return this.packet;
    }

    public void method13899(IPacket var1) {
        this.packet = var1;
    }
}
