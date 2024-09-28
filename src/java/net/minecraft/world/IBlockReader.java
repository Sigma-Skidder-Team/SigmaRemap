package net.minecraft.world;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface IBlockReader {
   @Nullable
   TileEntity getTileEntity(BlockPos var1);

   BlockState getBlockState(BlockPos var1);

   FluidState getFluidState(BlockPos var1);

   default int getLightValue(BlockPos var1) {
      return this.getBlockState(var1).getLightValue();
   }

   default int getMaxLightLevel() {
      return 15;
   }

   default int method7034() {
      return 256;
   }

   default Stream<BlockState> method7035(AxisAlignedBB var1) {
      return BlockPos.method8362(var1).<BlockState>map(this::getBlockState);
   }

   default BlockRayTraceResult rayTraceBlocks(RayTraceContext var1) {
      return doRayTrace(
         var1,
         (var1x, var2) -> {
            BlockState var5 = this.getBlockState(var2);
            FluidState var6 = this.getFluidState(var2);
            Vector3d var7 = var1x.method20745();
            Vector3d var8 = var1x.method20744();
            VoxelShape var9 = var1x.method20746(var5, this, var2);
            BlockRayTraceResult var10 = this.rayTraceBlocks(var7, var8, var2, var9, var5);
            VoxelShape var11 = var1x.method20747(var6, this, var2);
            BlockRayTraceResult var12 = var11.method19525(var7, var8, var2);
            double var13 = var10 != null ? var1x.method20745().method11342(var10.getVec()) : Double.MAX_VALUE;
            double var15 = var12 != null ? var1x.method20745().method11342(var12.getVec()) : Double.MAX_VALUE;
            return !(var13 <= var15) ? var12 : var10;
         },
         var0 -> {
            Vector3d var3 = var0.method20745().method11336(var0.method20744());
            return BlockRayTraceResult.method31420(
               var0.method20744(), Direction.getFacingFromVector(var3.x, var3.y, var3.z), new BlockPos(var0.method20744())
            );
         }
      );
   }

   @Nullable
   default BlockRayTraceResult rayTraceBlocks(Vector3d var1, Vector3d var2, BlockPos var3, VoxelShape var4, BlockState var5) {
      BlockRayTraceResult var8 = var4.method19525(var1, var2, var3);
      if (var8 != null) {
         BlockRayTraceResult var9 = var5.method23418(this, var3).method19525(var1, var2, var3);
         if (var9 != null && var9.getVec().method11336(var1).lengthSquared() < var8.getVec().method11336(var1).lengthSquared()) {
            return var8.method31421(var9.getFace());
         }
      }

      return var8;
   }

   default double method7038(VoxelShape var1, Supplier<VoxelShape> var2) {
      if (var1.isEmpty()) {
         double var5 = ((VoxelShape)var2.get()).getEnd(Direction.Axis.Y);
         return !(var5 >= 1.0) ? Double.NEGATIVE_INFINITY : var5 - 1.0;
      } else {
         return var1.getEnd(Direction.Axis.Y);
      }
   }

   default double method7039(BlockPos var1) {
      return this.method7038(this.getBlockState(var1).method23414(this, var1), () -> {
         BlockPos var4 = var1.down();
         return this.getBlockState(var4).method23414(this, var4);
      });
   }

   static <T> T doRayTrace(RayTraceContext var0, BiFunction<RayTraceContext, BlockPos, T> var1, Function<RayTraceContext, T> var2) {
      Vector3d var5 = var0.method20745();
      Vector3d var6 = var0.method20744();
      if (!var5.equals(var6)) {
         double var7 = MathHelper.lerp(-1.0E-7, var6.x, var5.x);
         double var9 = MathHelper.lerp(-1.0E-7, var6.y, var5.y);
         double var11 = MathHelper.lerp(-1.0E-7, var6.z, var5.z);
         double var13 = MathHelper.lerp(-1.0E-7, var5.x, var6.x);
         double var15 = MathHelper.lerp(-1.0E-7, var5.y, var6.y);
         double var17 = MathHelper.lerp(-1.0E-7, var5.z, var6.z);
         int var19 = MathHelper.floor(var13);
         int var20 = MathHelper.floor(var15);
         int var21 = MathHelper.floor(var17);
         BlockPos.Mutable var22 = new BlockPos.Mutable(var19, var20, var21);
         Object var23 = var1.apply(var0, var22);
         if (var23 == null) {
            double var24 = var7 - var13;
            double var26 = var9 - var15;
            double var28 = var11 - var17;
            int var30 = MathHelper.method37826(var24);
            int var31 = MathHelper.method37826(var26);
            int var32 = MathHelper.method37826(var28);
            double var33 = var30 != 0 ? (double)var30 / var24 : Double.MAX_VALUE;
            double var35 = var31 != 0 ? (double)var31 / var26 : Double.MAX_VALUE;
            double var37 = var32 != 0 ? (double)var32 / var28 : Double.MAX_VALUE;
            double var39 = var33 * (var30 <= 0 ? MathHelper.frac(var13) : 1.0 - MathHelper.frac(var13));
            double var41 = var35 * (var31 <= 0 ? MathHelper.frac(var15) : 1.0 - MathHelper.frac(var15));
            double var43 = var37 * (var32 <= 0 ? MathHelper.frac(var17) : 1.0 - MathHelper.frac(var17));

            while (var39 <= 1.0 || var41 <= 1.0 || var43 <= 1.0) {
               if (!(var39 < var41)) {
                  if (!(var41 < var43)) {
                     var21 += var32;
                     var43 += var37;
                  } else {
                     var20 += var31;
                     var41 += var35;
                  }
               } else if (!(var39 < var43)) {
                  var21 += var32;
                  var43 += var37;
               } else {
                  var19 += var30;
                  var39 += var33;
               }

               Object var45 = var1.apply(var0, var22.method8372(var19, var20, var21));
               if (var45 != null) {
                  return (T)var45;
               }
            }

            return (T)var2.apply(var0);
         } else {
            return (T)var23;
         }
      } else {
         return (T)var2.apply(var0);
      }
   }
}
