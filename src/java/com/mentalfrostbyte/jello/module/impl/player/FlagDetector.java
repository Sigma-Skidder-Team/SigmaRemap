package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class FlagDetector extends Module {
    public FlagDetector() {
        super(ModuleCategory.PLAYER, "FlagDetector", "Detects flags");
    }

    @EventTarget
    public void RecievePacketEvent(ReceivePacketEvent event) {
        if (event.getPacket() instanceof SPlayerPositionLookPacket && mc.player != null) {
            Client.getInstance().notificationManager.send(new Notification("FlagDetector", "Detected Flag"));
        }
    }
}
