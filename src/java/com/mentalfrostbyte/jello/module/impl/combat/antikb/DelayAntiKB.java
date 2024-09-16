package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.network.play.server.SExplosionPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;

import java.util.ArrayList;
import java.util.List;

public class DelayAntiKB extends Module {
    public int field23519 = 0;
    private final List<Packet<?>> field23518 = new ArrayList<Packet<?>>();

    public DelayAntiKB() {
        super(ModuleCategory.COMBAT, "Delay", "For anticheats with \"good\" velocity checks");
        this.registerSetting(new NumberSetting<Float>("Delay", "Ticks delay", 7.0F, Float.class, 1.0F, 20.0F, 1.0F));
        this.registerSetting(new NumberSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
    }

    @EventTarget
    private void method16198(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SExplosionPacket) {
                SExplosionPacket var4 = (SExplosionPacket) var1.getPacket();
                this.field23518.add(var4);
                var1.setCancelled(true);
            }

            if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
                SEntityVelocityPacket var5 = (SEntityVelocityPacket) var1.getPacket();
                if (var5.getEntityID() == mc.player.getEntityId()) {
                    this.field23518.add(var5);
                    var1.setCancelled(true);
                    if (this.field23519 == 0) {
                        this.field23519 = (int) this.getNumberValueBySettingName("Delay");
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16199(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof CUseEntityPacket) {
                CUseEntityPacket var4 = (CUseEntityPacket) var1.getPacket();
                CUseEntityPacket.Action var5 = var4.getAction();
                if (var5 != CUseEntityPacket.Action.ATTACK) {
                }
            }
        }
    }

    @EventTarget
    private void method16200(TickEvent var1) {
        if (this.field23519 != 0) {
            if (this.field23519 > 0) {
                this.field23519--;
            }
        } else {
            this.method16201();
        }
    }

    private void method16201() {
        for (Packet var4 : this.field23518) {
            if (!(var4 instanceof SEntityVelocityPacket)) {
                if (var4 instanceof SExplosionPacket) {
                    SExplosionPacket var5 = (SExplosionPacket) var4;
                    var5.motionX = var5.motionX * this.getNumberValueBySettingName("H-Multiplier");
                    var5.motionZ = var5.motionZ * this.getNumberValueBySettingName("H-Multiplier");
                    var5.motionY = var5.motionY * this.getNumberValueBySettingName("V-Multiplier");
                    mc.getConnection().handleExplosion(var5);
                }
            } else {
                SEntityVelocityPacket var6 = (SEntityVelocityPacket) var4;
                var6.motionX = (int) ((float) var6.motionX * this.getNumberValueBySettingName("H-Multiplier"));
                var6.motionZ = (int) ((float) var6.motionZ * this.getNumberValueBySettingName("H-Multiplier"));
                var6.motionY = (int) ((float) var6.motionY * this.getNumberValueBySettingName("V-Multiplier"));
                mc.getConnection().handleEntityVelocity(var6);
            }
        }

        this.field23518.clear();
    }
}
