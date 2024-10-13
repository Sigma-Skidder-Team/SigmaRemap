package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.VoxelShapes;

public class NoClipPhase extends Module {
    public NoClipPhase() {
        super(ModuleCategory.MOVEMENT, "NoClip", "NoClip phase");
    }

    @EventTarget
    private void method16580(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    public void method16581(EventBlockCollision var1) {
        if (this.isEnabled() && mc.world != null) {
            if ((double) var1.getBlockPos().getY() >= mc.player.getPosY()) {
                var1.setBoxelShape(VoxelShapes.empty());
            }
        }
    }

    @EventTarget
    public void method16582(TickEvent var1) {
        if (this.isEnabled()) {
            mc.player.jumpTicks = 3;
            if (mc.player.ticksExisted % 2 == 0) {
                if (mc.player.onGround) {
                    if (!mc.player.isJumping) {
                        if (mc.player.isSneaking()) {
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
