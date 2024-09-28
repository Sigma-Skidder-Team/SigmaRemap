package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IWorldReader;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public final class VoxelShapes {
   private static String[] field34461;
   private static final VoxelShape field34462 = Util.<Class6410>method38507(() -> {
      Class7937 var2 = new Class7937(1, 1, 1);
      var2.method26718(0, 0, 0, true, true);
      return new Class6410(var2);
   });
   public static final VoxelShape INFINITY = create(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final VoxelShape field34464 = new Class6409(
      new Class7937(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static VoxelShape method27425() {
      return field34464;
   }

   public static VoxelShape method27426() {
      return field34462;
   }

   public static VoxelShape create(double var0, double var2, double var4, double var6, double var8, double var10) {
      return create(new AxisAlignedBB(var0, var2, var4, var6, var8, var10));
   }

   public static VoxelShape create(AxisAlignedBB var0) {
      int var3 = method27429(var0.minX, var0.maxX);
      int var4 = method27429(var0.minY, var0.maxY);
      int var5 = method27429(var0.minZ, var0.maxZ);
      if (var3 >= 0 && var4 >= 0 && var5 >= 0) {
         if (var3 == 0 && var4 == 0 && var5 == 0) {
            return !var0.method19674(0.5, 0.5, 0.5) ? method27425() : method27426();
         } else {
            int var6 = 1 << var3;
            int var7 = 1 << var4;
            int var8 = 1 << var5;
            int var9 = (int)Math.round(var0.minX * (double)var6);
            int var10 = (int)Math.round(var0.maxX * (double)var6);
            int var11 = (int)Math.round(var0.minY * (double)var7);
            int var12 = (int)Math.round(var0.maxY * (double)var7);
            int var13 = (int)Math.round(var0.minZ * (double)var8);
            int var14 = (int)Math.round(var0.maxZ * (double)var8);
            Class7937 var15 = new Class7937(var6, var7, var8, var9, var11, var13, var10, var12, var14);

            for (long var16 = (long)var9; var16 < (long)var10; var16++) {
               for (long var18 = (long)var11; var18 < (long)var12; var18++) {
                  for (long var20 = (long)var13; var20 < (long)var14; var20++) {
                     var15.method26718((int)var16, (int)var18, (int)var20, false, true);
                  }
               }
            }

            return new Class6410(var15);
         }
      } else {
         return new Class6409(
            field34462.field28033,
            new double[]{var0.minX, var0.maxX},
            new double[]{var0.minY, var0.maxY},
            new double[]{var0.minZ, var0.maxZ}
         );
      }
   }

   private static int method27429(double var0, double var2) {
      if (!(var0 < -1.0E-7) && !(var2 > 1.0000001)) {
         for (int var6 = 0; var6 <= 3; var6++) {
            double var7 = var0 * (double)(1 << var6);
            double var9 = var2 * (double)(1 << var6);
            boolean var11 = Math.abs(var7 - Math.floor(var7)) < 1.0E-7;
            boolean var12 = Math.abs(var9 - Math.floor(var9)) < 1.0E-7;
            if (var11 && var12) {
               return var6;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static long method27430(int var0, int var1) {
      return (long)var0 * (long)(var1 / IntMath.gcd(var0, var1));
   }

   public static VoxelShape or(VoxelShape var0, VoxelShape var1) {
      return combineAndSimplify(var0, var1, IBooleanFunction.field44051);
   }

   public static VoxelShape method27432(VoxelShape var0, VoxelShape... var1) {
      return Arrays.<VoxelShape>stream(var1).reduce(var0, VoxelShapes::or);
   }

   public static VoxelShape combineAndSimplify(VoxelShape var0, VoxelShape var1, IBooleanFunction var2) {
      return method27434(var0, var1, var2).method19518();
   }

   public static VoxelShape method27434(VoxelShape var0, VoxelShape var1, IBooleanFunction var2) {
      if (!var2.method36569(false, false)) {
         if (var0 == var1) {
            return !var2.method36569(true, true) ? method27425() : var0;
         } else {
            boolean var5 = var2.method36569(true, false);
            boolean var6 = var2.method36569(false, true);
            if (!var0.isEmpty()) {
               if (var1.isEmpty()) {
                  return !var5 ? method27425() : var0;
               } else {
                  Class56 var7 = method27445(1, var0.method19511(Direction.Axis.X), var1.method19511(Direction.Axis.X), var5, var6);
                  Class56 var8 = method27445(var7.method194().size() - 1, var0.method19511(Direction.Axis.Y), var1.method19511(Direction.Axis.Y), var5, var6);
                  Class56 var9 = method27445(
                     (var7.method194().size() - 1) * (var8.method194().size() - 1),
                     var0.method19511(Direction.Axis.Z),
                     var1.method19511(Direction.Axis.Z),
                     var5,
                     var6
                  );
                  Class7937 var10 = Class7937.method26724(var0.field28033, var1.field28033, var7, var8, var9, var2);
                  return (VoxelShape)(var7 instanceof Class59 && var8 instanceof Class59 && var9 instanceof Class59
                     ? new Class6410(var10)
                     : new Class6409(var10, var7.method194(), var8.method194(), var9.method194()));
               }
            } else {
               return !var6 ? method27425() : var1;
            }
         }
      } else {
         throw (IllegalArgumentException) Util.pauseDevMode(new IllegalArgumentException());
      }
   }

   public static boolean compare(VoxelShape var0, VoxelShape var1, IBooleanFunction var2) {
      if (var2.method36569(false, false)) {
         throw (IllegalArgumentException) Util.pauseDevMode(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.method36569(true, true);
      } else if (var0.isEmpty()) {
         return var2.method36569(false, !var1.isEmpty());
      } else if (var1.isEmpty()) {
         return var2.method36569(!var0.isEmpty(), false);
      } else {
         boolean var5 = var2.method36569(true, false);
         boolean var6 = var2.method36569(false, true);

         for (Direction.Axis var10 : Class2321.field15907) {
            if (var0.getEnd(var10) < var1.getStart(var10) - 1.0E-7) {
               return var5 || var6;
            }

            if (var1.getEnd(var10) < var0.getStart(var10) - 1.0E-7) {
               return var5 || var6;
            }
         }

         Class56 var11 = method27445(1, var0.method19511(Direction.Axis.X), var1.method19511(Direction.Axis.X), var5, var6);
         Class56 var12 = method27445(var11.method194().size() - 1, var0.method19511(Direction.Axis.Y), var1.method19511(Direction.Axis.Y), var5, var6);
         Class56 var13 = method27445(
            (var11.method194().size() - 1) * (var12.method194().size() - 1),
            var0.method19511(Direction.Axis.Z),
            var1.method19511(Direction.Axis.Z),
            var5,
            var6
         );
         return method27436(var11, var12, var13, var0.field28033, var1.field28033, var2);
      }
   }

   private static boolean method27436(Class56 var0, Class56 var1, Class56 var2, Class7938 var3, Class7938 var4, IBooleanFunction var5) {
      return !var0.method192(
         (var5x, var6, var7) -> var1.method192(
               (var6x, var7x, var8) -> var2.method192(
                     (var7xx, var8x, var9) -> !var5.method36569(var3.method26729(var5x, var6x, var7xx), var4.method26729(var6, var7x, var8x))
                  )
            )
      );
   }

   public static double method27437(Direction.Axis var0, AxisAlignedBB var1, Stream<VoxelShape> var2, double var3) {
      Iterator var7 = var2.iterator();

      while (var7.hasNext()) {
         if (Math.abs(var3) < 1.0E-7) {
            return 0.0;
         }

         var3 = ((VoxelShape)var7.next()).method19528(var0, var1, var3);
      }

      return var3;
   }

   public static double method27438(Direction.Axis var0, AxisAlignedBB var1, IWorldReader var2, double var3, ISelectionContext var5, Stream<VoxelShape> var6, boolean var7) {
      return method27439(var1, var2, var3, var5, Class2321.method9101(var0, Direction.Axis.Z), var6, var7);
   }

   private static double method27439(AxisAlignedBB var0, IWorldReader var1, double var2, ISelectionContext var4, Class2321 var5, Stream<VoxelShape> var6, boolean var7) {
      if (var0.method19676() < 1.0E-6 || var0.method19677() < 1.0E-6 || var0.method19678() < 1.0E-6) {
         return var2;
      } else if (Math.abs(var2) < 1.0E-7) {
         return 0.0;
      } else {
         Class2321 var10 = var5.method9100();
         Direction.Axis var11 = var10.method9099(Direction.Axis.X);
         Direction.Axis var12 = var10.method9099(Direction.Axis.Y);
         Direction.Axis var13 = var10.method9099(Direction.Axis.Z);
         BlockPos.Mutable var14 = new BlockPos.Mutable();
         int var15 = MathHelper.floor(var0.method19658(var11) - 1.0E-7) - 1;
         int var16 = MathHelper.floor(var0.method19659(var11) + 1.0E-7) + 1;
         int var17 = MathHelper.floor(var0.method19658(var12) - 1.0E-7) - 1;
         int var18 = MathHelper.floor(var0.method19659(var12) + 1.0E-7) + 1;
         double var19 = var0.method19658(var13) - 1.0E-7;
         double var21 = var0.method19659(var13) + 1.0E-7;
         boolean var23 = var2 > 0.0;
         int var24 = !var23 ? MathHelper.floor(var0.method19658(var13) + 1.0E-7) + 1 : MathHelper.floor(var0.method19659(var13) - 1.0E-7) - 1;
         int var25 = method27440(var2, var19, var21);
         int var26 = !var23 ? -1 : 1;

         for (int var27 = var24; !var23 ? var27 >= var25 : var27 <= var25; var27 += var26) {
            for (int var28 = var15; var28 <= var16; var28++) {
               for (int var29 = var17; var29 <= var18; var29++) {
                  int var30 = 0;
                  if (var28 == var15 || var28 == var16) {
                     var30++;
                  }

                  if (var29 == var17 || var29 == var18) {
                     var30++;
                  }

                  if (var27 == var24 || var27 == var25) {
                     var30++;
                  }

                  if (var30 < 3) {
                     var14.method8376(var10, var28, var29, var27);
                     BlockState var31 = var1.getBlockState(var14);
                     if ((var30 != 1 || var31.method23390()) && (var30 != 2 || var31.isIn(Blocks.MOVING_PISTON))) {
                        VoxelShape var32 = var31.getCollisionShape(var1, var14, var4);
                        if (var7) {
                           EventBlockCollision var33 = new EventBlockCollision(var14, var32);
                           Client.getInstance().getEventManager().call(var33);
                           var32 = var33.getVoxelShape();
                        }

                        var2 = var32.method19528(
                           var13, var0.offset((double)(-var14.getX()), (double)(-var14.getY()), (double)(-var14.getZ())), var2
                        );
                        if (Math.abs(var2) < 1.0E-7) {
                           return 0.0;
                        }

                        var25 = method27440(var2, var19, var21);
                     }
                  }
               }
            }
         }

         double[] var34 = new double[]{var2};
         var6.forEach(var3 -> var34[0] = var3.method19528(var13, var0, var34[0]));
         return var34[0];
      }
   }

   private static int method27440(double var0, double var2, double var4) {
      return !(var0 > 0.0) ? MathHelper.floor(var2 + var0) - 1 : MathHelper.floor(var4 + var0) + 1;
   }

   public static boolean method27441(VoxelShape var0, VoxelShape var1, Direction var2) {
      if (var0 == method27426() && var1 == method27426()) {
         return true;
      } else if (!var1.isEmpty()) {
         Direction.Axis var5 = var2.getAxis();
         Direction.AxisDirection var6 = var2.getAxisDirection();
         VoxelShape var7 = var6 != Direction.AxisDirection.POSITIVE ? var1 : var0;
         VoxelShape var8 = var6 != Direction.AxisDirection.POSITIVE ? var0 : var1;
         IBooleanFunction var9 = var6 != Direction.AxisDirection.POSITIVE ? IBooleanFunction.field44039 : IBooleanFunction.ONLY_FIRST;
         return DoubleMath.fuzzyEquals(var7.getEnd(var5), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals(var8.getStart(var5), 0.0, 1.0E-7)
            && ! compare(new Class6407(var7, var5, var7.field28033.method26732(var5) - 1), new Class6407(var8, var5, 0), var9);
      } else {
         return false;
      }
   }

   public static VoxelShape method27442(VoxelShape var0, Direction var1) {
      if (var0 != method27426()) {
         Direction.Axis var4 = var1.getAxis();
         boolean var5;
         int var6;
         if (var1.getAxisDirection() != Direction.AxisDirection.POSITIVE) {
            var5 = DoubleMath.fuzzyEquals(var0.getStart(var4), 0.0, 1.0E-7);
            var6 = 0;
         } else {
            var5 = DoubleMath.fuzzyEquals(var0.getEnd(var4), 1.0, 1.0E-7);
            var6 = var0.field28033.method26732(var4) - 1;
         }

         return (VoxelShape)(var5 ? new Class6407(var0, var4, var6) : method27425());
      } else {
         return method27426();
      }
   }

   public static boolean method27443(VoxelShape var0, VoxelShape var1, Direction var2) {
      if (var0 != method27426() && var1 != method27426()) {
         Direction.Axis var5 = var2.getAxis();
         Direction.AxisDirection var6 = var2.getAxisDirection();
         VoxelShape var7 = var6 != Direction.AxisDirection.POSITIVE ? var1 : var0;
         VoxelShape var8 = var6 != Direction.AxisDirection.POSITIVE ? var0 : var1;
         if (!DoubleMath.fuzzyEquals(var7.getEnd(var5), 1.0, 1.0E-7)) {
            var7 = method27425();
         }

         if (!DoubleMath.fuzzyEquals(var8.getStart(var5), 0.0, 1.0E-7)) {
            var8 = method27425();
         }

         return ! compare(
            method27426(),
            method27434(new Class6407(var7, var5, var7.field28033.method26732(var5) - 1), new Class6407(var8, var5, 0), IBooleanFunction.field44051),
            IBooleanFunction.ONLY_FIRST
         );
      } else {
         return true;
      }
   }

   public static boolean method27444(VoxelShape var0, VoxelShape var1) {
      if (var0 == method27426() || var1 == method27426()) {
         return true;
      } else {
         return var0.isEmpty() && var1.isEmpty()
            ? false
            : ! compare(method27426(), method27434(var0, var1, IBooleanFunction.field44051), IBooleanFunction.ONLY_FIRST);
      }
   }

   @VisibleForTesting
   public static Class56 method27445(int var0, DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var7 = var1.size() - 1;
      int var8 = var2.size() - 1;
      if (var1 instanceof Class53 && var2 instanceof Class53) {
         long var9 = method27430(var7, var8);
         if ((long)var0 * var9 <= 256L) {
            return new Class59(var7, var8);
         }
      }

      if (!(var1.getDouble(var7) < var2.getDouble(0) - 1.0E-7)) {
         if (!(var2.getDouble(var8) < var1.getDouble(0) - 1.0E-7)) {
            if (var7 != var8 || !Objects.equals(var1, var2)) {
               return new Class58(var1, var2, var3, var4);
            } else if (!(var1 instanceof Class57)) {
               return (Class56)(!(var2 instanceof Class57) ? new Class57(var1) : (Class56)var2);
            } else {
               return (Class56)var1;
            }
         } else {
            return new Class55(var2, var1, true);
         }
      } else {
         return new Class55(var1, var2, false);
      }
   }
}
