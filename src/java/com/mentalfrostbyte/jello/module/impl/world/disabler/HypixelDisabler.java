package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

import java.util.ArrayList;
import java.util.List;

public class HypixelDisabler extends Module {
    private final List<Packet<?>> field23983 = new ArrayList<Packet<?>>();
    private boolean field23984;
    private final TimerUtil field23985 = new TimerUtil();

    public HypixelDisabler() {
        super(ModuleCategory.EXPLOIT, "Hypixel", "Disable watchdog.");
    }

    @Override
    public void onEnable() {
        if (!mc.player.onGround) {
            this.field23984 = false;
        } else {
            double var3 = mc.player.getPosX();
            double var5 = mc.player.getPosY();
            double var7 = mc.player.getPosZ();
            this.field23984 = false;
            mc.getConnection().sendPacket(new Class5605(var3, var5 + 0.2, var7, false));
            mc.getConnection().sendPacket(new Class5605(var3, var5 + 0.1, var7, false));
            this.field23984 = true;
            this.field23985.method27120();
            this.field23985.start();
            if (!this.getBooleanValueFromSetttingName("Instant")) {
                Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Wait 5s..."));
            } else {
                Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Move where you want"));
            }
        }
    }

    @Override
    public void onDisable() {
        this.field23985.method27120();
        this.field23985.start();
        if (this.field23984) {
            int var3 = this.field23983.size();

            for (int var4 = 0; var4 < var3; var4++) {
                mc.getConnection().sendPacket(this.field23983.get(var4));
            }

            Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Disabler canceled"));
        }

        this.field23983.clear();
    }

    @EventTarget
    public void method16898(Class4399 var1) {
        if (mc.player != null) {
            if (!this.field23984 && mc.player.onGround) {
                if (!this.getBooleanValueFromSetttingName("Instant")) {
                    Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Wait 5s..."));
                } else {
                    Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Move where you want"));
                }

                this.field23985.method27120();
                this.field23985.start();
                this.field23984 = true;
            }
        }
    }

    @EventTarget
    public void method16899(Class4435 var1) {
        if (mc.player != null) {
            if (!this.getBooleanValueFromSetttingName("Instant") && this.field23984) {
                var1.method13993(0.0);
                var1.method13995(0.0);
                var1.method13997(0.0);
            }

            if (this.field23985.method27121() > 10000L && this.field23984) {
                this.field23984 = false;
                int var4 = this.field23983.size();

                for (int var5 = 0; var5 < var4; var5++) {
                    mc.getConnection().sendPacket(this.field23983.get(var5));
                }

                this.field23983.clear();
                this.field23985.method27120();
                this.field23985.stop();
                this.method16004().method16000();
                Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Disabler failed"));
            }
        }
    }

    @EventTarget
    private void method16900(SendPacketEvent var1) {
        if (mc.getConnection() != null) {
            if (this.field23984) {
                if (var1.method13932() instanceof CEntityActionPacket
                        || var1.method13932() instanceof CPlayerPacket
                        || var1.method13932() instanceof CUseEntityPacket
                        || var1.method13932() instanceof CAnimateHandPacket
                        || var1.method13932() instanceof CPlayerTryUseItemPacket) {
                    if (this.getBooleanValueFromSetttingName("Instant")) {
                        this.field23983.add(var1.method13932());
                    }

                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    public void method16901(RecievePacketEvent var1) {
        if (mc.player != null && this.field23984) {
            if (this.isEnabled() || this.getBooleanValueFromSetttingName("Instant")) {
                if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                    this.method16004().method16000();
                    if (!this.getBooleanValueFromSetttingName("Instant")) {
                        Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "You can do what you want for 5s"));
                    } else {
                        SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
                        var1.method13900(true);
                        mc.getConnection()
                                .sendPacket(new Class5604(var4.field24297, var4.field24298, var4.field24299, var4.field24300, var4.field24301, false));
                        int var5 = this.field23983.size();

                        for (int var6 = 0; var6 < var5; var6++) {
                            mc.getConnection().sendPacket(this.field23983.get(var6));
                        }

                        this.field23983.clear();
                        Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Successfully sent packets"));
                    }

                    this.field23984 = false;
                }
            }
        }
    }
}
