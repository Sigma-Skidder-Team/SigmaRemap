package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.network.IPacket;

import java.util.ArrayList;
import java.util.List;

public class SendPacketEvent extends CancellableEvent {
    private IPacket packet;
    private final List<IPacket> field21514 = new ArrayList<IPacket>();

    public SendPacketEvent(IPacket var1) {
        this.packet = var1;
        this.field21514.add(var1);
    }

    public IPacket getPacket() {
        return this.packet;
    }

    public List<IPacket> method13933() {
        return this.field21514;
    }

    public void method13934(IPacket var1) {
        this.packet = var1;
    }
}
