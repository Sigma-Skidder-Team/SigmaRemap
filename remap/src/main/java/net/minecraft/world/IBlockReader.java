// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.world;

import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.function.Function;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public interface IBlockReader
{
    @Nullable
    TileEntity getTileEntity(final BlockPos p0);
    
    BlockState getBlockState(final BlockPos p0);
    
    IFluidState getFluidState(final BlockPos p0);
    
    default int getLightValue(final BlockPos class354) {
        return this.getBlockState(class354).getLightValue();
    }
    
    default int getMaxLightLevel() {
        return 15;
    }
    
    default int getHeight() {
        return 256;
    }

    default BlockRayTraceResult rayTraceBlocks(RayTraceContext context) {
        return func_217300_a(context, (p_217297_1_, p_217297_2_) ->
        {
            BlockState blockstate = this.getBlockState(p_217297_2_);
            IFluidState ifluidstate = this.getFluidState(p_217297_2_);
            Vec3d vec3d = p_217297_1_.func_222253_b();
            Vec3d vec3d1 = p_217297_1_.func_222250_a();
            VoxelShape voxelshape = p_217297_1_.getBlockShape(blockstate, this, p_217297_2_);
            BlockRayTraceResult blockraytraceresult = this.rayTraceBlocks(vec3d, vec3d1, p_217297_2_, voxelshape, blockstate);
            VoxelShape voxelshape1 = p_217297_1_.getFluidShape(ifluidstate, this, p_217297_2_);
            BlockRayTraceResult blockraytraceresult1 = voxelshape1.rayTrace(vec3d, vec3d1, p_217297_2_);
            double d0 = blockraytraceresult == null ? Double.MAX_VALUE : p_217297_1_.func_222253_b().squareDistanceTo(blockraytraceresult.getHitVec());
            double d1 = blockraytraceresult1 == null ? Double.MAX_VALUE : p_217297_1_.func_222253_b().squareDistanceTo(blockraytraceresult1.getHitVec());
            return d0 <= d1 ? blockraytraceresult : blockraytraceresult1;
        }, (p_217302_0_) ->
        {
            Vec3d vec3d = p_217302_0_.func_222253_b().subtract(p_217302_0_.func_222250_a());
            return BlockRayTraceResult.createMiss(p_217302_0_.func_222250_a(), Direction.getFacingFromVector(vec3d.x, vec3d.y, vec3d.z), new BlockPos(p_217302_0_.func_222250_a()));
        });
    }
    
    @Nullable
    default BlockRayTraceResult rayTraceBlocks(final Vec3d class5487, final Vec3d class5488, final BlockPos class5489, final VoxelShape class5490, final BlockState class5491) {
        final BlockRayTraceResult method24550 = class5490.rayTrace(class5487, class5488, class5489);
        if (method24550 != null) {
            final BlockRayTraceResult method24551 = class5491.method21730(this, class5489).rayTrace(class5487, class5488, class5489);
            if (method24551 != null) {
                if (method24551.getHitVec().subtract(class5487).lengthSquared() < method24550.getHitVec().subtract(class5487).lengthSquared()) {
                    return method24550.withFace(method24551.getFace());
                }
            }
        }
        return method24550;
    }
    
    default <T> T func_217300_a(final RayTraceContext rayTraceContext, final BiFunction<RayTraceContext, BlockPos, T> biFunction, final Function<RayTraceContext, T> function) {
        final Vec3d method28308 = rayTraceContext.func_222253_b();
        final Vec3d method28309 = rayTraceContext.func_222250_a();
        if (method28308.equals(method28309)) {
            return function.apply(rayTraceContext);
        }
        final double method28310 = MathHelper.lerp(-1.0E-7, method28309.x, method28308.x);
        final double method28311 = MathHelper.lerp(-1.0E-7, method28309.y, method28308.y);
        final double method28312 = MathHelper.lerp(-1.0E-7, method28309.z, method28308.z);
        final double method28313 = MathHelper.lerp(-1.0E-7, method28308.x, method28309.x);
        final double method28314 = MathHelper.lerp(-1.0E-7, method28308.y, method28309.y);
        final double method28315 = MathHelper.lerp(-1.0E-7, method28308.z, method28309.z);
        int method28316 = MathHelper.floor(method28313);
        int method28317 = MathHelper.floor(method28314);
        int method28318 = MathHelper.floor(method28315);
        final Mutable class8479 = new Mutable(method28316, method28317, method28318);
        final T apply = biFunction.apply(rayTraceContext, class8479);
        if (apply != null) {
            return apply;
        }
        final double n = method28310 - method28313;
        final double n2 = method28311 - method28314;
        final double n3 = method28312 - method28315;
        final int method28319 = MathHelper.method35705(n);
        final int method28320 = MathHelper.method35705(n2);
        final int method28321 = MathHelper.method35705(n3);
        final double n4 = (method28319 != 0) ? (method28319 / n) : Double.MAX_VALUE;
        final double n5 = (method28320 != 0) ? (method28320 / n2) : Double.MAX_VALUE;
        final double n6 = (method28321 != 0) ? (method28321 / n3) : Double.MAX_VALUE;
        double n7 = n4 * ((method28319 <= 0) ? MathHelper.method35687(method28313) : (1.0 - MathHelper.method35687(method28313)));
        double n8 = n5 * ((method28320 <= 0) ? MathHelper.method35687(method28314) : (1.0 - MathHelper.method35687(method28314)));
        double n9 = n6 * ((method28321 <= 0) ? MathHelper.method35687(method28315) : (1.0 - MathHelper.method35687(method28315)));
        while (true) {
            if (n7 > 1.0) {
                if (n8 > 1.0) {
                    if (n9 > 1.0) {
                        return function.apply(rayTraceContext);
                    }
                }
            }
            if (n7 >= n8) {
                if (n8 >= n9) {
                    method28318 += method28321;
                    n9 += n6;
                }
                else {
                    method28317 += method28320;
                    n8 += n5;
                }
            }
            else if (n7 >= n9) {
                method28318 += method28321;
                n9 += n6;
            }
            else {
                method28316 += method28319;
                n7 += n4;
            }
            final T apply2 = biFunction.apply(rayTraceContext, class8479.setPos(method28316, method28317, method28318));
            if (apply2 == null) {
                continue;
            }
            return apply2;
        }
    }
}
