package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import mapped.BowItem;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class FastBow extends Module {
    private int field23627;

    public FastBow() {
        super(ModuleCategory.COMBAT, "FastBow", "Shoots arrows faster");
    }

    @EventTarget
    private void method16373(TickEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.getHeldItemMainhand() != null
                    && mc.player.getHeldItemMainhand().getItem() instanceof BowItem
                    && mc.player.onGround) {
                for (int var4 = 0; var4 < 25; var4++) {
                    mc.getConnection().sendPacket(new CPlayerPacket(true));
                }

                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.RELEASE_USE_ITEM, BlockPos.ZERO, Direction.DOWN));
            }
        }
    }
}
