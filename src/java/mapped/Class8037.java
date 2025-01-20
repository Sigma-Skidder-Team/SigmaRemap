package mapped;

import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class Class8037 {
   @Nullable
   public static Vector3d method27581(CreatureEntity var0, int var1, int var2) {
      return method27592(var0, var1, var2, 0, (Vector3d)null, true, (float) (Math.PI / 2), var0::getBlockPathWeight, false, 0, 0, true);
   }

   @Nullable
   public static Vector3d method27582(CreatureEntity var0, int var1, int var2, int var3, Vector3d var4, double var5) {
      return method27592(var0, var1, var2, var3, var4, true, var5, var0::getBlockPathWeight, true, 0, 0, false);
   }

   @Nullable
   public static Vector3d method27583(CreatureEntity var0, int var1, int var2) {
      return method27584(var0, var1, var2, var0::getBlockPathWeight);
   }

   @Nullable
   public static Vector3d method27584(CreatureEntity var0, int var1, int var2, ToDoubleFunction<BlockPos> var3) {
      return method27592(var0, var1, var2, 0, (Vector3d)null, false, 0.0, var3, true, 0, 0, true);
   }

   @Nullable
   public static Vector3d method27585(CreatureEntity var0, int var1, int var2, Vector3d var3, float var4, int var5, int var6) {
      return method27592(var0, var1, var2, 0, var3, false, (double)var4, var0::getBlockPathWeight, true, var5, var6, true);
   }

   @Nullable
   public static Vector3d method27586(CreatureEntity var0, int var1, int var2, Vector3d var3) {
      Vector3d var6 = var3.method11337(var0.getPosX(), var0.getPosY(), var0.getPosZ());
      return method27592(var0, var1, var2, 0, var6, false, (float) (Math.PI / 2), var0::getBlockPathWeight, true, 0, 0, true);
   }

   @Nullable
   public static Vector3d method27587(CreatureEntity var0, int var1, int var2, Vector3d var3) {
      Vector3d var6 = var3.method11337(var0.getPosX(), var0.getPosY(), var0.getPosZ());
      return method27592(var0, var1, var2, 0, var6, true, (float) (Math.PI / 2), var0::getBlockPathWeight, false, 0, 0, true);
   }

   @Nullable
   public static Vector3d method27588(CreatureEntity var0, int var1, int var2, Vector3d var3, double var4) {
      Vector3d var8 = var3.method11337(var0.getPosX(), var0.getPosY(), var0.getPosZ());
      return method27592(var0, var1, var2, 0, var8, true, var4, var0::getBlockPathWeight, false, 0, 0, true);
   }

   @Nullable
   public static Vector3d method27589(CreatureEntity var0, int var1, int var2, int var3, Vector3d var4, double var5) {
      Vector3d var9 = var4.method11337(var0.getPosX(), var0.getPosY(), var0.getPosZ());
      return method27592(var0, var1, var2, var3, var9, false, var5, var0::getBlockPathWeight, true, 0, 0, false);
   }

   @Nullable
   public static Vector3d method27590(CreatureEntity var0, int var1, int var2, Vector3d var3) {
      Vector3d var6 = var0.getPositionVec().subtract(var3);
      return method27592(var0, var1, var2, 0, var6, true, (float) (Math.PI / 2), var0::getBlockPathWeight, false, 0, 0, true);
   }

   @Nullable
   public static Vector3d method27591(CreatureEntity var0, int var1, int var2, Vector3d var3) {
      Vector3d var6 = var0.getPositionVec().subtract(var3);
      return method27592(var0, var1, var2, 0, var6, false, (float) (Math.PI / 2), var0::getBlockPathWeight, true, 0, 0, true);
   }

   @Nullable
   private static Vector3d method27592(
      CreatureEntity var0,
      int var1,
      int var2,
      int var3,
      Vector3d var4,
      boolean var5,
      double var6,
      ToDoubleFunction<BlockPos> var8,
      boolean var9,
      int var10,
      int var11,
      boolean var12
   ) {
      Class6990 var15 = var0.method4230();
      Random var16 = var0.getRNG();
      boolean var17;
      if (!var0.method4291()) {
         var17 = false;
      } else {
         var17 = var0.method4289().method8317(var0.getPositionVec(), (double)(var0.method4290() + (float)var1) + 1.0);
      }

      boolean var18 = false;
      double var19 = Double.NEGATIVE_INFINITY;
      BlockPos var21 = var0.getPosition();

      for (int var22 = 0; var22 < 10; var22++) {
         BlockPos var23 = method27593(var16, var1, var2, var3, var4, var6);
         if (var23 != null) {
            int var24 = var23.getX();
            int var25 = var23.getY();
            int var26 = var23.getZ();
            if (var0.method4291() && var1 > 1) {
               BlockPos var27 = var0.method4289();
               if (!(var0.getPosX() > (double)var27.getX())) {
                  var24 += var16.nextInt(var1 / 2);
               } else {
                  var24 -= var16.nextInt(var1 / 2);
               }

               if (!(var0.getPosZ() > (double)var27.getZ())) {
                  var26 += var16.nextInt(var1 / 2);
               } else {
                  var26 -= var16.nextInt(var1 / 2);
               }
            }

            BlockPos var31 = new BlockPos((double)var24 + var0.getPosX(), (double)var25 + var0.getPosY(), (double)var26 + var0.getPosZ());
            if (var31.getY() >= 0
               && var31.getY() <= var0.world.method7034()
               && (!var17 || var0.method4287(var31))
               && (!var12 || var15.method21672(var31))) {
               if (var9) {
                  var31 = method27594(
                     var31,
                     var16.nextInt(var10 + 1) + var11,
                     var0.world.method7034(),
                     var1x -> var0.world.getBlockState(var1x).getMaterial().isSolid()
                  );
               }

               if (var5 || !var0.world.getFluidState(var31).method23486(FluidTags.WATER)) {
                  PathNodeType var28 = Class6762.method20633(var0.world, var31.method8354());
                  if (var0.method4223(var28) == 0.0F) {
                     double var29 = var8.applyAsDouble(var31);
                     if (var29 > var19) {
                        var19 = var29;
                        var21 = var31;
                        var18 = true;
                     }
                  }
               }
            }
         }
      }

      return !var18 ? null : Vector3d.method11330(var21);
   }

   @Nullable
   private static BlockPos method27593(Random var0, int var1, int var2, int var3, Vector3d var4, double var5) {
      if (var4 != null && !(var5 >= Math.PI)) {
         double var12 = MathHelper.method37814(var4.z, var4.x) - (float) (Math.PI / 2);
         double var14 = var12 + (double)(2.0F * var0.nextFloat() - 1.0F) * var5;
         double var16 = Math.sqrt(var0.nextDouble()) * (double) MathHelper.SQRT_2 * (double)var1;
         double var18 = -var16 * Math.sin(var14);
         double var20 = var16 * Math.cos(var14);
         if (!(Math.abs(var18) > (double)var1) && !(Math.abs(var20) > (double)var1)) {
            int var22 = var0.nextInt(2 * var2 + 1) - var2 + var3;
            return new BlockPos(var18, (double)var22, var20);
         } else {
            return null;
         }
      } else {
         int var9 = var0.nextInt(2 * var1 + 1) - var1;
         int var10 = var0.nextInt(2 * var2 + 1) - var2 + var3;
         int var11 = var0.nextInt(2 * var1 + 1) - var1;
         return new BlockPos(var9, var10, var11);
      }
   }

   public static BlockPos method27594(BlockPos var0, int var1, int var2, Predicate<BlockPos> var3) {
      if (var1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + var1 + ", expected >= 0");
      } else if (!var3.test(var0)) {
         return var0;
      } else {
         BlockPos var6 = var0.up();

         while (var6.getY() < var2 && var3.test(var6)) {
            var6 = var6.up();
         }

         BlockPos var7 = var6;

         while (var7.getY() < var2 && var7.getY() - var6.getY() < var1) {
            BlockPos var8 = var7.up();
            if (var3.test(var8)) {
               break;
            }

            var7 = var8;
         }

         return var7;
      }
   }
}
