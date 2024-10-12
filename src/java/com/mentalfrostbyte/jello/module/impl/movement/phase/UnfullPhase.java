package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import com.mentalfrostbyte.jello.event.impl.EventWalkingUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;

public class UnfullPhase extends Module {
    private int field23843;
    private double field23844;

    public UnfullPhase() {
        super(ModuleCategory.MOVEMENT, "Unfull", "Weird Hypixel VClip for some blocks");
    }

    @EventTarget
    private void method16680(EventWalkingUpdate var1) {
        if (this.isEnabled()) {
            if ((int) mc.player.getPosY() == this.field23843 && !mc.player.isJumping) {
                MultiUtilities.setPlayerYMotion(-2.0);
            }

            if (mc.player.getPosY() > (double) this.field23843 && mc.player.isJumping && !mc.player.isServerSneakState()) {
                this.field23843++;
            }

            if (mc.player.getPosY() % 1.0 == 0.0 && mc.player.isServerSneakState()) {
                this.field23843--;
            }
        }
    }

    @EventTarget
    private void method16681(EventBlockCollision var1) {
        if (this.isEnabled()) {
            if (var1.getVoxelShape() != null && var1.getBlockPos().getY() == this.field23843 - 1
                    || var1.getBlockPos().getY() == this.field23843
                    || var1.getBlockPos().getY() == this.field23843 + 1 && mc.world.getBlockState(var1.getBlockPos()).getBlock() instanceof SlabBlock
                    || mc.world.getBlockState(var1.getBlockPos()).getBlock() instanceof Class3465
                    || mc.world.getBlockState(var1.getBlockPos()).getBlock() instanceof StairsBlock
                    || mc.world.getBlockState(var1.getBlockPos()).getBlock() instanceof Class3415
                    || mc.world.getBlockState(var1.getBlockPos()).getBlock() instanceof Class3377) {
                var1.setBoxelShape(null);
            }
        }
    }

    @EventTarget
    private void method16682(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @Override
    public void onEnable() {
        this.field23843 = (int) mc.player.getPosY();
        this.field23844 = (double) this.field23843 - mc.player.getPosY();
    }
}
