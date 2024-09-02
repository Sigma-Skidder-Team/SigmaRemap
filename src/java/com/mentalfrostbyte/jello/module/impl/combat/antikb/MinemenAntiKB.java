package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import mapped.Class9567;
import mapped.ColorUtils;

public class MinemenAntiKB extends Module {
    private boolean field23852 = false;
    private boolean field23853;

    public MinemenAntiKB() {
        super(ModuleCategory.COMBAT, "Minemen", "Minemen Club bypass");
    }

    @Override
    public void onEnable() {
        this.field23852 = false;
        this.field23853 = true;
    }

    @EventTarget
    public void method16697(Class4399 var1) {
        if (var1.method13921()) {
            if (ColorUtils.method17730(mc.player, 1.0E-5F)) {
                this.field23852 = true;
                var1.method13912(var1.method13911() - 5.0E-7);
                var1.method13920(false);
            } else {
                if (this.field23852 && mc.player.method3433().y < 0.0) {
                    this.field23852 = false;
                    var1.method13920(true);
                }
            }
        }
    }

    @EventTarget
    public void method16698(Class4435 var1) {
        if (this.field23853) {
            if (!mc.player.onGround) {
                if (mc.player.fallDistance > 1.0F) {
                    this.field23853 = false;
                }
            } else {
                var1.method13995(Class9567.method37080());
                this.field23853 = false;
            }
        }

        ColorUtils.method17725(var1.method13994());
    }

    @EventTarget
    private void method16699(RecievePacketEvent var1) {
        if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
            SEntityVelocityPacket var5 = (SEntityVelocityPacket) var1.getPacket();
            if (var5.method17565() == mc.player.getEntityId() && var5.field24802 < 0 && mc.player.onGround) {
                var1.method13900(true);
            }
        } else if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
            SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
            this.field23853 = true;
        }
    }
}
