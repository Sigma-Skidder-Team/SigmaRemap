package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import mapped.Class9567;
import mapped.NumberSetting;

public class GommeAntiKB extends Module {
    private int field23610;
    private double field23611;

    public GommeAntiKB() {
        super(ModuleCategory.COMBAT, "Gomme", "AntiKB for GommeHD");
        this.registerSetting(new NumberSetting<Float>("Delay", "Boost delay", 0.5F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("Boost", "Boost strengh", 0.1F, Float.class, 0.05F, 0.25F, 0.01F));
    }

    @EventTarget
    private void method16350(WorldLoadEvent var1) {
        this.field23610 = 0;
    }

    @EventTarget
    private void method16351(Class4435 var1) {
        double var4 = this.field23611 * (double) (1.0F - this.getNumberValueBySettingName("Delay")) - this.field23611 / 2.0;
        if (mc.player.onGround && this.field23610 <= 0) {
        }

        if (this.field23610 == 1 && var1.method13994() < var4) {
            this.field23610++;
            var1.method13993(var1.method13992() * 0.5);
            var1.method13997(var1.method13996() * 0.5);
        } else if (this.field23610 == 2) {
            this.field23610++;
            Class9567.method37088(var1, this.getNumberValueBySettingName("Boost"));
        }
    }

    @EventTarget
    private void method16352(RecievePacketEvent var1) {
        if (var1.getPacket() instanceof SEntityVelocityPacket) {
            SEntityVelocityPacket var4 = (SEntityVelocityPacket) var1.getPacket();
            if (var4.method17565() == mc.player.method3205()) {
                this.field23610 = 1;
                this.field23611 = (double) var4.method17567() / 8000.0;
            }
        }
    }
}
