package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.network.Packet;

import java.util.ArrayList;
import java.util.List;

public class SendPacketEvent extends CancellableEvent {
    private static String[] field21512;
    private Packet packet;
    private final List<Packet> field21514 = new ArrayList<Packet>();

    public SendPacketEvent(Packet var1) {
        this.packet = var1;
        this.field21514.add(var1);
    }

    public Packet getPacket() {
        return this.packet;
    }

    public List<Packet> method13933() {
        return this.field21514;
    }

    public void method13934(Packet var1) {
        this.packet = var1;
    }
}
