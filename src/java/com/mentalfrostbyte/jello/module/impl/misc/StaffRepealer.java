package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.entity.player.PlayerEntity;

import java.util.HashMap;

public class StaffRepealer extends Module {
    private final HashMap<Integer, Integer> field23506 = new HashMap<Integer, Integer>();

    public StaffRepealer() {
        super(ModuleCategory.MISC, "StaffRepealer", "Repeals hypixel's staff ban laws with a simple rage quit!");
    }

    @EventTarget
    private void method16183(TickEvent var1) {
        if (this.isEnabled()) {
            if (ColorUtils.method17716()) {
                mc.gameSettings.method37149();
            }
        }
    }

    @EventTarget
    private void method16184(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof Class5476) {
                Class5476 var4 = (Class5476) var1.getPacket();
            }

            if (var1.getPacket() instanceof Class5503) {
                Class5503 var5 = (Class5503) var1.getPacket();
                new Thread(() -> {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException var8) {
                        var8.printStackTrace();
                    }

                    int var3 = 0;

                    for (Class8790 var5x : var5.method17307()) {
                        PlayerEntity var6 = mc.world.method7196(var5x.method31726().getId());
                        if (var6 == null && var5x.method31728() != null) {
                            ColorUtils.method17678("Detected an anomaly " + var5x + var5x.method31726());
                        } else {
                            System.out.println("all seems good " + var5x + var5x.method31726());
                        }

                        boolean var7 = false;
                        var3++;
                    }
                }).start();
            }
        }
    }
}
