package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.VoxelShapes;

public class NoClipPhase extends Module {
    public NoClipPhase() {
        super(ModuleCategory.MOVEMENT, "NoClip", "NoClip phase");
    }

    @EventTarget
    private void method16580(Class4425 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    public void method16581(Class4398 var1) {
        if (this.isEnabled() && mc.world != null) {
            if ((double) var1.method13902().getY() >= mc.player.getPosY()) {
                var1.method13905(VoxelShapes.method27425());
            }
        }
    }

    @EventTarget
    public void method16582(TickEvent var1) {
        if (this.isEnabled()) {
            mc.player.field4999 = 3;
            if (mc.player.ticksExisted % 2 == 0) {
                if (mc.player.onGround) {
                    if (!mc.player.field4981) {
                        if (mc.player.method3331()) {
                            mc.player
                                    .setPosition(mc.player.getPosX(), mc.player.getPosY() - 1.0, mc.player.getPosZ());
                        }
                    } else {
                        mc.player
                                .setPosition(mc.player.getPosX(), mc.player.getPosY() + 1.0, mc.player.getPosZ());
                    }
                }
            }
        }
    }
}
