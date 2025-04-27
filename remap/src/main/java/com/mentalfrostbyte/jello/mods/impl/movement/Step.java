// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.steps.SpiderStep;
import com.mentalfrostbyte.jello.mods.impl.movement.steps.AACStep;
import com.mentalfrostbyte.jello.mods.impl.movement.steps.NCPStep;
import com.mentalfrostbyte.jello.mods.impl.movement.steps.VanillaStep;
import mapped.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.Direction;

public class Step extends ModuleWithSettings
{
    public static int field15758;
    
    public Step() {
        super(Category.MOVEMENT, "Step", "Allows you to step up more than 0.5 block", new Module[] { new VanillaStep(), new NCPStep(), new AACStep(), new SpiderStep() });
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        Step.mc.player.stepHeight = 0.6f;
    }
    
    @EventListener
    @Class6754
    private void method10297(final Class5745 class5745) {
        if (class5745.method17049() >= 0.1) {
            Step.field15758 = 0;
        }
    }
    
    @EventListener
    @Class6754
    private void method10298(final UpdateWalkingEvent updateWalkingEvent) {
        if (updateWalkingEvent.isPre()) {
            ++Step.field15758;
        }
    }
    
    public Class2166 method10299(final Class5745 class5745) {
        final double n = Step.mc.player.posX + class5745.method17052().x;
        final double n2 = Step.mc.player.posZ + class5745.method17052().z;
        final double n3 = 0.41;
        final double n4 = class5745.method17049() - class5745.method17051();
        final Object[] array = Step.mc.world.method6981(Step.mc.player, new AxisAlignedBB(n - n3, Step.mc.player.boundingBox.minY, n2 - n3, n + n3, Step.mc.player.boundingBox.minY + n4, n2 + n3)).toArray();
        final int length = array.length;
        Class7096 class5746 = null;
        BlockPos class5747 = null;
        double field25077 = 0.0;
        for (int i = 0; i < length; ++i) {
            final VoxelShape class5748 = (VoxelShape)array[i];
            final BlockPos class5749 = new BlockPos(class5748.getStart(Direction.Axis.X), class5748.getStart(Direction.Axis.Y), class5748.getStart(Direction.Axis.Z));
            final Class7096 method6701 = Step.mc.world.getBlockState(class5749);
            if (class5746 == null || class5748.getBoundingBox().maxY > field25077) {
                class5746 = method6701;
                class5747 = class5749;
                field25077 = class5748.getBoundingBox().maxY;
            }
        }
        if (!Step.mc.player.method1706() && !Step.mc.player.method1723()) {
            if (class5746 != null) {
                if (Step.mc.player.onGround) {
                    if (n4 != class5745.method17049()) {
                        if (n4 < 0.5) {
                            if (!(class5746.method21696() instanceof SlabBlock)) {
                                if (class5746.method21696() instanceof Class3916) {
                                    return Class2166.field12885;
                                }
                            }
                            else if (class5746.method21725(Step.mc.world, class5747).method24537().field25077 == 1.0) {
                                return Class2166.field12886;
                            }
                            return Class2166.field12886;
                        }
                    }
                }
                else {
                    if (class5746.method21696() instanceof SlabBlock && class5746.method21725(Step.mc.world, class5747).method24537().field25077 == 1.0) {
                        return Class2166.field12884;
                    }
                    if (class5746.method21696() instanceof Class3916) {
                        return Class2166.field12885;
                    }
                    return Class2166.field12884;
                }
            }
            return Class2166.field12886;
        }
        return Class2166.field12884;
    }
}
