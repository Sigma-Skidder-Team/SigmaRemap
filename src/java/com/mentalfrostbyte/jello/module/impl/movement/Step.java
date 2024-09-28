package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventStep;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.step.AACStep;
import com.mentalfrostbyte.jello.module.impl.movement.step.NCPStep;
import com.mentalfrostbyte.jello.module.impl.movement.step.SpiderStep;
import com.mentalfrostbyte.jello.module.impl.movement.step.VanillaStep;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Step extends ModuleWithModuleSettings {
    public static int field23887;

    public Step() {
        super(ModuleCategory.MOVEMENT,
                "Step",
                "Allows you to step up more than 0.5 block",
                new VanillaStep(),
                new NCPStep(),
                new AACStep(),
                new SpiderStep());
    }

    @Override
    public void onDisable() {
        super.onDisable();
        mc.player.stepHeight = 0.6F;
    }

    @EventTarget
    @Class5631
    private void method16746(EventStep var1) {
        if (!(var1.getHeight() < 0.1)) {
            field23887 = 0;
        }
    }

    @EventTarget
    @Class5631
    private void method16747(EventUpdate var1) {
        if (var1.isPre()) {
            field23887++;
        }
    }

    public Class2131 method16748(EventStep var1) {
        double var4 = mc.player.getPosX() + var1.getVector().x;
        double var6 = mc.player.getPosZ() + var1.getVector().z;
        double var8 = 0.41;
        double var10 = var1.getHeight() - var1.getY();
        AxisAlignedBB var12 = new AxisAlignedBB(
                var4 - var8, mc.player.boundingBox.minY, var6 - var8, var4 + var8, mc.player.boundingBox.minY + var10, var6 + var8
        );
        Object[] var13 = mc.world.getCollisionShapes(mc.player, var12).toArray();
        int var14 = var13.length;
        BlockState var15 = null;
        BlockPos var16 = null;
        double var17 = 0.0;

        for (int var19 = 0; var19 < var14; var19++) {
            VoxelShape var20 = (VoxelShape) var13[var19];
            BlockPos var21 = new BlockPos(var20.getStart(Direction.Axis.X), var20.getStart(Direction.Axis.Y), var20.getStart(Direction.Axis.Z));
            BlockState var22 = mc.world.getBlockState(var21);
            if (var15 == null || var20.getBoundingBox().maxY > var17) {
                var15 = var22;
                var16 = var21;
                var17 = var20.getBoundingBox().maxY;
            }
        }

        if (!mc.player.isInWater() && !mc.player.isInLava()) {
            if (var15 != null) {
                if (!mc.player.onGround) {
                    if (var15.getBlock() instanceof SlabBlock) {
                        VoxelShape var24 = var15.method23412(mc.world, var16);
                        if (var24.getBoundingBox().maxY == 1.0) {
                            return Class2131.field13904;
                        }
                    }

                    if (var15.getBlock() instanceof StairsBlock) {
                        return Class2131.field13905;
                    }

                    return Class2131.field13904;
                }

                if (var10 != var1.getHeight() && var10 < 0.5) {
                    if (!(var15.getBlock() instanceof SlabBlock)) {
                        if (var15.getBlock() instanceof StairsBlock) {
                            return Class2131.field13905;
                        }
                    } else {
                        VoxelShape var23 = var15.method23412(mc.world, var16);
                        if (var23.getBoundingBox().maxY == 1.0) {
                            return Class2131.field13906;
                        }
                    }

                    return Class2131.field13906;
                }
            }

            return Class2131.field13906;
        } else {
            return Class2131.field13904;
        }
    }
}
