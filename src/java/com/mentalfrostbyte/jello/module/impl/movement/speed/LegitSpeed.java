package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import mapped.Class9567;

public class LegitSpeed extends Module {
    private double field24010;
    private float field24011;
    private float field24012;
    private boolean field24013;
    private float field24014 = 1.0F;

    public LegitSpeed() {
        super(ModuleCategory.MOVEMENT, "Legit", "Legit Sprint jumping.");
        this.registerSetting(new BooleanSetting("Sprint", "Sprints when walking", true));
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
    }

    @EventTarget
    public void method16943(Class4435 var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround
                    && mc.player.collidedVertically
                    && (mc.player.field4984 != 0.0F || mc.player.field4982 != 0.0F)
                    && this.getBooleanValueFromSetttingName("AutoJump")) {
                mc.player.method2914();
                var1.method13995(mc.player.getVec().y);
            }

            double var4 = var1.method13998().y;
            var1.method13998().y = 0.0;
            double var6 = var1.method13998().method11348();
            var1.method13998().y = var4;
            this.field24010 = var6;
            float var8 = Class9567.method37082()[1];
            float var9 = Class9567.method37082()[2];
            float var10 = Class9567.method37082()[0];
            if (var8 == 0.0F && var9 == 0.0F) {
                var1.method13993(0.0);
                var1.method13997(0.0);
            }

            double var11 = Math.cos(Math.toRadians((double) var10));
            double var13 = Math.sin(Math.toRadians((double) var10));
            this.field24010 = this.field24010 * (double) this.field24014;
            var1.method13993((double) var8 * this.field24010 * var11 + (double) var9 * this.field24010 * var13 + (double) this.field24011);
            var1.method13997((double) var8 * this.field24010 * var13 - (double) var9 * this.field24010 * var11 + (double) this.field24012);
            mc.player.getVec().x = var1.method13992();
            mc.player.getVec().y = var1.method13994();
            if (this.field24011 != 0.0F || this.field24012 != 0.0F) {
                this.field24011 = (float) ((double) this.field24011 * 0.85);
                this.field24012 = (float) ((double) this.field24012 * 0.85);
                this.field24014 = Math.min(1.0F, this.field24014 + 0.1F);
            }

            if (mc.player.onGround && !this.field24013) {
                this.field24011 = 0.0F;
                this.field24012 = 0.0F;
                this.field24014 = Math.min(1.0F, this.field24014 + 0.33F);
            }

            this.field24013 = false;
        }
    }

    @EventTarget
    private void method16944(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
                SEntityVelocityPacket var4 = (SEntityVelocityPacket) var1.getPacket();
                if (var4.method17565() == mc.player.getEntityId()) {
                    this.field24011 = this.field24011 + (float) var4.field24801 / 8000.0F;
                    this.field24012 = this.field24012 + (float) var4.field24803 / 8000.0F;
                    this.field24013 = true;
                    this.field24014 = 0.0F;
                }
            }
        }
    }
}
