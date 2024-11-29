package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.server.SEntityPacket;
import net.minecraft.network.play.server.SPlayerListItemPacket;

import java.util.HashMap;

public class StaffRepealer extends Module {
    private final HashMap<Integer, Integer> field23506 = new HashMap<Integer, Integer>();

    public StaffRepealer() {
        super(ModuleCategory.MISC, "StaffRepealer", "Repeals hypixel's staff ban laws with a simple rage quit!");
    }

    @EventTarget
    private void method16183(TickEvent var1) {
        if (this.isEnabled()) {
            if (MultiUtilities.isHypixel()) {
                mc.gameSettings.method37149();
            }
        }
    }

    @EventTarget
    private void method16184(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SEntityPacket) {
                SEntityPacket var4 = (SEntityPacket) var1.getPacket();
            }

            if (var1.getPacket() instanceof SPlayerListItemPacket) {
                SPlayerListItemPacket var5 = (SPlayerListItemPacket) var1.getPacket();
                new Thread(() -> {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException var8) {
                        var8.printStackTrace();
                    }

                    int var3 = 0;

                    for (SPlayerListItemPacket.AddPlayerData var5x : var5.getEntries()) {
                        PlayerEntity var6 = mc.world.method7196(var5x.getProfile().getId());
                        if (var6 == null && var5x.getGameMode() != null) {
                            MultiUtilities.addChatMessage("Detected an anomaly " + var5x + var5x.getProfile());
                        } else {
                            System.out.println("all seems good " + var5x + var5x.getProfile());
                        }

                        boolean var7 = false;
                        var3++;
                    }
                }).start();
            }
        }
    }
}
