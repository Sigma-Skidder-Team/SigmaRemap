package com.mentalfrostbyte.jello.module.impl.combat.antikb;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

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
    public void method16697(EventUpdate var1) {
        if (var1.isPre()) {
            if (MultiUtilities.isAboveBounds(mc.player, 1.0E-5F)) {
                this.field23852 = true;
                var1.setY(var1.getY() - 5.0E-7);
                var1.setGround(false);
            } else {
                if (this.field23852 && mc.player.getMotion().y < 0.0) {
                    this.field23852 = false;
                    var1.setGround(true);
                }
            }
        }
    }

    @EventTarget
    public void method16698(EventMove var1) {
        if (this.field23853) {
            if (!mc.player.onGround) {
                if (mc.player.fallDistance > 1.0F) {
                    this.field23853 = false;
                }
            } else {
                var1.setY(MovementUtils.method37080());
                this.field23853 = false;
            }
        }

        MultiUtilities.setPlayerYMotion(var1.getY());
    }

    @EventTarget
    private void method16699(ReceivePacketEvent var1) {
        if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
            SEntityVelocityPacket var5 = (SEntityVelocityPacket) var1.getPacket();
            if (var5.getEntityID() == mc.player.getEntityId() && var5.motionY < 0 && mc.player.onGround) {
                var1.setCancelled(true);
            }
        } else if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
            SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
            this.field23853 = true;
        }
    }
}
