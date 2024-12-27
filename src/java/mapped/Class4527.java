package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ICollisionReader;

import javax.annotation.Nullable;
import java.util.function.Function;

public class Class4527 {
   private static String[] field21839;

   public static int[][] method14422(Direction var0) {
      Direction var3 = var0.rotateY();
      Direction var4 = var3.getOpposite();
      Direction var5 = var0.getOpposite();
      return new int[][]{
         {var3.getXOffset(), var3.getZOffset()},
         {var4.getXOffset(), var4.getZOffset()},
         {var5.getXOffset() + var3.getXOffset(), var5.getZOffset() + var3.getZOffset()},
         {var5.getXOffset() + var4.getXOffset(), var5.getZOffset() + var4.getZOffset()},
         {var0.getXOffset() + var3.getXOffset(), var0.getZOffset() + var3.getZOffset()},
         {var0.getXOffset() + var4.getXOffset(), var0.getZOffset() + var4.getZOffset()},
         {var5.getXOffset(), var5.getZOffset()},
         {var0.getXOffset(), var0.getZOffset()}
      };
   }

   public static boolean method14423(double var0) {
      return !Double.isInfinite(var0) && var0 < 1.0;
   }

   public static boolean method14424(ICollisionReader var0, LivingEntity var1, AxisAlignedBB var2) {
      return var0.getCollisionShapes(var1, var2).allMatch(VoxelShape::isEmpty);
   }

   @Nullable
   public static Vector3d method14425(ICollisionReader var0, double var1, double var3, double var5, LivingEntity var7, Pose var8) {
      if (method14423(var3)) {
         Vector3d var11 = new Vector3d(var1, var3, var5);
         if (method14424(var0, var7, var7.getPoseAABB(var8).offset(var11))) {
            return var11;
         }
      }

      return null;
   }

   public static VoxelShape method14426(IBlockReader var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      return !var4.isIn(BlockTags.field32804) && (!(var4.getBlock() instanceof Class3206) || !var4.<Boolean>get(Class3206.field18594))
         ? var4.method23414(var0, var1)
         : VoxelShapes.empty();
   }

   public static double method14427(BlockPos var0, int var1, Function<BlockPos, VoxelShape> var2) {
      BlockPos.Mutable var5 = var0.method8354();
      int var6 = 0;

      while (var6 < var1) {
         VoxelShape var7 = (VoxelShape)var2.apply(var5);
         if (!var7.isEmpty()) {
            return (double)(var0.getY() + var6) + var7.getStart(Direction.Axis.Y);
         }

         var6++;
         var5.method8379(Direction.UP);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static Vector3d method14428(EntityType<?> var0, ICollisionReader var1, BlockPos var2, boolean var3) {
      if (var3 && var0.method33220(var1.getBlockState(var2))) {
         return null;
      } else {
         double var6 = var1.method7038(method14426(var1, var2), () -> method14426(var1, var2.down()));
         if (method14423(var6)) {
            if (var3 && var6 <= 0.0 && var0.method33220(var1.getBlockState(var2.down()))) {
               return null;
            } else {
               Vector3d var8 = Vector3d.method11331(var2, var6);
               return !var1.getCollisionShapes((Entity)null, var0.getSize().method32097(var8)).allMatch(VoxelShape::isEmpty) ? null : var8;
            }
         } else {
            return null;
         }
      }
   }
}
