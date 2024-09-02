package com.mentalfrostbyte.jello.module.impl.movement.step;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.ColorUtils;
import mapped.Class9567;
import net.minecraft.network.play.client.CPlayerPacket;

public class AACStep extends Module {
    public AACStep() {
        super(ModuleCategory.MOVEMENT, "AAC", "Step for AAC");
    }

    @EventTarget
    @LowerPriority
    private void method16145(Class4434 var1) {
        if (this.isEnabled() && !var1.isCancelled()) {
            double var4 = var1.method13988();
            if (!ColorUtils.method17730(mc.player, 1.0E-4F)) {
                var1.method13900(true);
            } else {
                if (!Class9567.method37081() && var4 >= 0.625) {
                    double var6 = mc.player.getPosX();
                    double var8 = mc.player.getPosY();
                    double var10 = mc.player.getPosZ();
                    if (var4 < 1.1) {
                        double[] var12 = new double[]{0.41999998688698 * var4, 0.754 * var4};

                        for (double var16 : var12) {
                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var6, var8 + var16, var10, false));
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16146(SafeWalkEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!var1.method13967()) {
                mc.player.stepHeight = 1.0F;
            } else {
                mc.player.stepHeight = 0.5F;
            }
        }
    }
}
