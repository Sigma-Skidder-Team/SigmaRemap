package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.step.AACStep;
import com.mentalfrostbyte.jello.module.impl.movement.step.NCPStep;
import com.mentalfrostbyte.jello.module.impl.movement.step.SpiderStep;
import com.mentalfrostbyte.jello.module.impl.movement.step.VanillaStep;
import mapped.*;
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
    private void method16746(Class4434 var1) {
        if (!(var1.method13988() < 0.1)) {
            field23887 = 0;
        }
    }

    @EventTarget
    @Class5631
    private void method16747(Class4399 var1) {
        if (var1.method13921()) {
            field23887++;
        }
    }

    public Class2131 method16748(Class4434 var1) {
        double var4 = mc.player.getPosX() + var1.method13991().field18048;
        double var6 = mc.player.getPosZ() + var1.method13991().field18050;
        double var8 = 0.41;
        double var10 = var1.method13988() - var1.method13990();
        AxisAlignedBB var12 = new AxisAlignedBB(
                var4 - var8, mc.player.boundingBox.field28450, var6 - var8, var4 + var8, mc.player.boundingBox.field28450 + var10, var6 + var8
        );
        Object[] var13 = mc.world.method7055(mc.player, var12).toArray();
        int var14 = var13.length;
        BlockState var15 = null;
        BlockPos var16 = null;
        double var17 = 0.0;

        for (int var19 = 0; var19 < var14; var19++) {
            VoxelShape var20 = (VoxelShape) var13[var19];
            BlockPos var21 = new BlockPos(var20.method19512(Class113.field413), var20.method19512(Class113.field414), var20.method19512(Class113.field415));
            BlockState var22 = mc.world.getBlockState(var21);
            if (var15 == null || var20.method19514().field28453 > var17) {
                var15 = var22;
                var16 = var21;
                var17 = var20.method19514().field28453;
            }
        }

        if (!mc.player.method3250() && !mc.player.method3264()) {
            if (var15 != null) {
                if (!mc.player.onGround) {
                    if (var15.getBlock() instanceof Class3208) {
                        VoxelShape var24 = var15.method23412(mc.world, var16);
                        if (var24.method19514().field28453 == 1.0) {
                            return Class2131.field13904;
                        }
                    }

                    if (var15.getBlock() instanceof Class3421) {
                        return Class2131.field13905;
                    }

                    return Class2131.field13904;
                }

                if (var10 != var1.method13988() && var10 < 0.5) {
                    if (!(var15.getBlock() instanceof Class3208)) {
                        if (var15.getBlock() instanceof Class3421) {
                            return Class2131.field13905;
                        }
                    } else {
                        VoxelShape var23 = var15.method23412(mc.world, var16);
                        if (var23.method19514().field28453 == 1.0) {
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
