package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3d;

public class VanillaPhase extends Module {
    public VanillaPhase() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Vanilla phase");
    }

    @EventTarget
    private void EventUpdate(EventUpdate event) {
        if (this.isEnabled()) {
            if (mc.player.collidedHorizontally) {
                Class9629 var4 = MultiUtilities.method17760(1.0E-4);
                double var5 = /*JelloPortal.getCurrentVersionApplied() != ViaVerList._1_8_x.getVersionNumber() ? 1.0E-6 :*/ 0.0625;
                if (((Direction) var4.method37538()).getAxis() != Direction.Axis.X) {
                    event.setZ(
                            (double) Math.round((((Vector3d) var4.method37539()).z + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).getZOffset() * var5
                    );
                } else {
                    event.setX(
                            (double) Math.round((((Vector3d) var4.method37539()).x + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).getXOffset() * var5
                    );
                }
            }
        }
    }

    @EventTarget
    private void EventMove(EventMove event) {
        if (this.isEnabled()) {
            if (mc.player.collidedHorizontally || MultiUtilities.method17761()) {
                MovementUtils.setSpeed(event, 0.0);
                MovementUtils.method37095(1.7);
            }
        }
    }

    @EventTarget
    private void EventPushBlock(EventPushBlock event) {
        if (this.isEnabled()) {
            event.setCancelled(true);
        }
    }
}
