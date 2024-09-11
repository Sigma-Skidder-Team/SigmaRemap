package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import mapped.MovementUtils;
import mapped.NumberSetting;

public class SpartanAntiKB extends Module {
    private int field23617;

    public SpartanAntiKB() {
        super(ModuleCategory.COMBAT, "Spartan", "AntiKB for spartan antichet");
        this.registerSetting(new NumberSetting<Float>("Ticks", "Ticks delay", 1.0F, Float.class, 1.0F, 6.0F, 1.0F));
    }

    @EventTarget
    private void method16359(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.field23617 < 10) {
                this.field23617++;
                if (this.field23617 == (int) this.getNumberValueBySettingName("Ticks")) {
                    MovementUtils.method37090(0.0);
                }
            }
        }
    }

    @EventTarget
    private void method16360(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
                SEntityVelocityPacket var4 = (SEntityVelocityPacket) var1.getPacket();
                if (var4.getEntityID() == mc.player.getEntityId()) {
                    this.field23617 = 0;
                }
            }
        }
    }
}
