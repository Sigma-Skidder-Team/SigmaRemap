package com.mentalfrostbyte.jello.module.impl.combat.criticals;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Step;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.Packet;
import mapped.RayTraceResult;

public class HoverCriticals extends Module {
    private double field23997;

    public HoverCriticals() {
        super(ModuleCategory.COMBAT, "Hover", "Hover criticals");
    }

    @Override
    public void onEnable() {
        this.field23997 = 1.0E-11;
    }

    @EventTarget
    public void method16921(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                this.field23997 = 1.0E-11;
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16922(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            boolean var4 = mc.objectMouseOver != null && mc.objectMouseOver.getType() == RayTraceResult.Type.BLOCK;
            boolean var5 = mc.playerController.getIsHittingBlock() || mc.gameSettings.keyBindAttack.isKeyDown() && var4;
            if (Client.getInstance().method19939().method31329() > 0 && !var5) {
                this.field23997 -= 1.0E-14;
                if (this.field23997 < 0.0 || Step.field23887 == 0) {
                    this.field23997 = 1.0E-11;
                }

                var1.method13908(true);
                var1.method13912(var1.method13911() + this.field23997);
                var1.method13920(false);
            } else {
                this.field23997 = 1.0E-11;
            }
        }
    }
}
