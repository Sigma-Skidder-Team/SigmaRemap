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
    private void EventPushBlock(EventPushBlock event) {
        if (this.isEnabled()) {
            event.setCancelled(true);
        }
    }

    @EventTarget
    public void TickEvent(EventBlockCollision event) {
        if (this.isEnabled() && mc.world != null) {
            if ((double) event.getBlockPos().getY() >= mc.player.getPosY()) {
                event.setBoxelShape(VoxelShapes.empty());
            }
        }
    }

    @EventTarget
    public void TickEvent(TickEvent event) {
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
