package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class class_3815 {
   private static final Logger field_18664 = LogManager.getLogger();
   private static final int field_18661 = (int)Math.pow(17.0, 2.0);
   private static final class_4565[] field_18662 = Stream.<class_4565>of(class_4565.values())
      .filter(var0 -> var0 != class_4565.field_22251)
      .<class_4565>toArray(class_4565[]::new);

   public static class_1728 method_17773(int var0, Iterable<Entity> var1, class_5294 var2) {
      class_2393 var5 = new class_2393();
      Object2IntOpenHashMap var6 = new Object2IntOpenHashMap();

      for (Entity var8 : var1) {
         if (var8 instanceof MobEntity) {
            MobEntity var9 = (MobEntity)var8;
            if (var9.method_26925() || var9.method_26915()) {
               continue;
            }
         }

         class_4565 var11 = var8.getType().method_30476();
         if (var11 != class_4565.field_22251) {
            BlockPos var12 = var8.method_37075();
            long var13 = class_2034.method_9540(var12.getX() >> 4, var12.getZ() >> 4);
            var2.method_24143(var13, var5x -> {
               class_2658 var8x = method_17781(var12, var5x).method_28886().method_27798(var8.getType());
               if (var8x != null) {
                  var5.method_10920(var8.method_37075(), var8x.method_12012());
               }

               var6.addTo(var11, 1);
            });
         }
      }

      return new class_1728(var0, var6, var5, null);
   }

   private static class_6325 method_17781(BlockPos var0, class_5990 var1) {
      return class_8354.field_42777.method_28268(0L, var0.getX(), var0.getY(), var0.getZ(), var1.method_27356());
   }

   public static void method_17763(class_6331 var0, class_2654 var1, class_1728 var2, boolean var3, boolean var4, boolean var5) {
      var0.method_29599().startSection("spawner");

      for (class_4565 var11 : field_18662) {
         if ((var3 || !var11.method_21203()) && (var4 || var11.method_21203()) && (var5 || !var11.method_21199()) && class_1728.method_7726(var2, var11)) {
            method_17774(
               var11,
               var0,
               var1,
               (var1x, var2x, var3x) -> class_1728.method_7725(var2, var1x, var2x, var3x),
               (var1x, var2x) -> class_1728.method_7727(var2, var1x, var2x)
            );
         }
      }

      var0.method_29599().endSection();
   }

   public static void method_17774(class_4565 var0, class_6331 var1, class_2654 var2, class_3712 var3, class_6453 var4) {
      BlockPos var7 = method_17766(var1, var2);
      if (var7.getY() >= 1) {
         method_17765(var0, var1, var2, var7, var3, var4);
      }
   }

   public static void method_17765(class_4565 var0, class_6331 var1, class_5990 var2, BlockPos var3, class_3712 var4, class_6453 var5) {
      class_2033 var8 = var1.method_28991();
      class_6541 var9 = var1.method_28945().method_10189();
      int var10 = var3.getY();
      class_2522 var11 = var2.method_28262(var3);
      if (!var11.method_8356(var2, var3)) {
         class_2921 var12 = new class_2921();
         int var13 = 0;

         for (int var14 = 0; var14 < 3; var14++) {
            int var15 = var3.getX();
            int var16 = var3.getZ();
            byte var17 = 6;
            class_3222 var18 = null;
            class_8733 var19 = null;
            int var20 = MathHelper.ceil(var1.field_33033.nextFloat() * 4.0F);
            int var21 = 0;

            for (int var22 = 0; var22 < var20; var22++) {
               var15 += var1.field_33033.nextInt(6) - var1.field_33033.nextInt(6);
               var16 += var1.field_33033.nextInt(6) - var1.field_33033.nextInt(6);
               var12.method_13362(var15, var10, var16);
               double var23 = (double)var15 + 0.5;
               double var25 = (double)var16 + 0.5;
               PlayerEntity var27 = var1.method_25857(var23, (double)var10, var25, -1.0, false);
               if (var27 != null) {
                  double var28 = var27.method_37273(var23, (double)var10, var25);
                  if (method_17776(var1, var2, var12, var28)) {
                     if (var18 == null) {
                        var18 = method_17780(var1, var8, var9, var0, var1.field_33033, var12);
                        if (var18 == null) {
                           break;
                        }

                        var20 = var18.field_16055 + var1.field_33033.nextInt(1 + var18.field_16056 - var18.field_16055);
                     }

                     if (method_17775(var1, var0, var8, var9, var18, var12, var28) && var4.method_17245(var18.field_16053, var12, var2)) {
                        MobEntity var30 = method_17777(var1, var18.field_16053);
                        if (var30 == null) {
                           return;
                        }

                        var30.method_37144(var23, (double)var10, var25, var1.field_33033.nextFloat() * 360.0F, 0.0F);
                        if (method_17771(var1, var30, var28)) {
                           var19 = var30.method_26864(var1, var1.method_43368(var30.method_37075()), class_2417.field_12031, var19, (CompoundNBT)null);
                           var13++;
                           var21++;
                           var1.method_7065(var30);
                           var5.run(var30, var2);
                           if (var13 >= var30.method_26856()) {
                              return;
                           }

                           if (var30.method_26841(var21)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean method_17776(class_6331 var0, class_5990 var1, class_2921 var2, double var3) {
      if (!(var3 <= 576.0)) {
         if (var0.method_28998()
            .method_12170(new class_1343((double)var2.getX() + 0.5, (double)var2.getY(), (double)var2.getZ() + 0.5), 24.0)) {
            return false;
         } else {
            class_2034 var7 = new class_2034(var2);
            return Objects.equals(var7, var1.method_27352()) || var0.method_28945().method_14823(var7);
         }
      } else {
         return false;
      }
   }

   private static boolean method_17775(class_6331 var0, class_4565 var1, class_2033 var2, class_6541 var3, class_3222 var4, class_2921 var5, double var6) {
      EntityType var10 = var4.field_16053;
      if (var10.method_30476() != class_4565.field_22251) {
         if (!var10.method_30466() && var6 > (double)(var10.method_30476().method_21200() * var10.method_30476().method_21200())) {
            return false;
         } else if (var10.method_30465() && method_17768(var0, var2, var3, var1, var4, var5)) {
            class_1257 var11 = class_1136.method_4980(var10);
            if (!method_17767(var11, var0, var5, var10)) {
               return false;
            } else {
               return class_1136.method_4983(var10, var0, class_2417.field_12031, var5, var0.field_33033)
                  ? var0.method_6681(var10.method_30456((double)var5.getX() + 0.5, (double)var5.getY(), (double)var5.getZ() + 0.5))
                  : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static MobEntity method_17777(class_6331 var0, EntityType<?> var1) {
      try {
         Entity var4 = var1.method_30484(var0);
         if (!(var4 instanceof MobEntity)) {
            throw new IllegalStateException("Trying to spawn a non-mob: " + class_8669.field_44400.method_39797(var1));
         } else {
            return (MobEntity)var4;
         }
      } catch (Exception var5) {
         field_18664.warn("Failed to create mob", var5);
         return null;
      }
   }

   private static boolean method_17771(class_6331 var0, MobEntity var1, double var2) {
      return var2 > (double)(var1.getType().method_30476().method_21200() * var1.getType().method_30476().method_21200()) && var1.method_26911(var2)
         ? false
         : var1.method_26889(var0, class_2417.field_12031) && var1.method_26855(var0);
   }

   @Nullable
   private static class_3222 method_17780(class_6331 var0, class_2033 var1, class_6541 var2, class_4565 var3, Random var4, BlockPos var5) {
      class_6325 var8 = var0.method_22561(var5);
      if (var3 == class_4565.field_22248 && var8.method_28887() == class_8862.field_45297 && var4.nextFloat() < 0.98F) {
         return null;
      } else {
         List var9 = method_17769(var0, var1, var2, var3, var5, var8);
         return !var9.isEmpty() ? class_6242.<class_3222>method_28510(var4, var9) : null;
      }
   }

   private static boolean method_17768(class_6331 var0, class_2033 var1, class_6541 var2, class_4565 var3, class_3222 var4, BlockPos var5) {
      return method_17769(var0, var1, var2, var3, var5, (class_6325)null).contains(var4);
   }

   private static List<class_3222> method_17769(class_6331 var0, class_2033 var1, class_6541 var2, class_4565 var3, BlockPos var4, class_6325 var5) {
      return var3 == class_4565.field_22247
            && var0.method_28262(var4.method_6100()).method_8360() == class_4783.field_23484
            && var1.method_9525(var4, false, class_5390.field_27510).method_14731()
         ? class_5390.field_27510.method_24557()
         : var2.method_29836(var5 == null ? var0.method_22561(var4) : var5, var1, var3, var4);
   }

   private static BlockPos method_17766(World var0, class_2654 var1) {
      class_2034 var4 = var1.method_27352();
      int var5 = var4.method_9535() + var0.field_33033.nextInt(16);
      int var6 = var4.method_9545() + var0.field_33033.nextInt(16);
      int var7 = var1.method_27367(class_3801.field_18592, var5, var6) + 1;
      int var8 = var0.field_33033.nextInt(var7 + 1);
      return new BlockPos(var5, var8, var6);
   }

   public static boolean method_17772(class_6163 var0, BlockPos var1, class_2522 var2, class_4774 var3, EntityType<?> var4) {
      if (!var2.method_8306(var0, var1)) {
         if (!var2.method_8355()) {
            if (var3.method_22001()) {
               return !var2.method_8349(class_2351.field_11777) ? !var4.method_30481(var2) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean method_17767(class_1257 var0, class_4924 var1, BlockPos var2, EntityType<?> var3) {
      if (var0 == class_1257.field_6939) {
         return true;
      } else if (var3 != null && var1.method_6673().method_9813(var2)) {
         class_2522 var6 = var1.method_28262(var2);
         class_4774 var7 = var1.method_28258(var2);
         BlockPos var8 = var2.method_6081();
         BlockPos var9 = var2.method_6100();
         switch (var0) {
            case field_6934:
               return var7.method_22007(class_6503.field_33094)
                  && var1.method_28258(var9).method_22007(class_6503.field_33094)
                  && !var1.method_28262(var8).method_8356(var1, var8);
            case field_6937:
               return var7.method_22007(class_6503.field_33095);
            case field_6935:
            default:
               class_2522 var10 = var1.method_28262(var9);
               return !var10.method_8305(var1, var9, var3)
                  ? false
                  : method_17772(var1, var2, var6, var7, var3) && method_17772(var1, var8, var1.method_28262(var8), var1.method_28258(var8), var3);
         }
      } else {
         return false;
      }
   }

   public static void method_17764(class_1556 var0, class_6325 var1, int var2, int var3, Random var4) {
      class_6068 var7 = var1.method_28886();
      List var8 = var7.method_27794(class_4565.field_22239);
      if (!var8.isEmpty()) {
         int var9 = var2 << 4;
         int var10 = var3 << 4;

         while (var4.nextFloat() < var7.method_27797()) {
            class_3222 var11 = class_6242.<class_3222>method_28510(var4, var8);
            int var12 = var11.field_16055 + var4.nextInt(1 + var11.field_16056 - var11.field_16055);
            class_8733 var13 = null;
            int var14 = var9 + var4.nextInt(16);
            int var15 = var10 + var4.nextInt(16);
            int var16 = var14;
            int var17 = var15;

            for (int var18 = 0; var18 < var12; var18++) {
               boolean var19 = false;

               for (int var20 = 0; !var19 && var20 < 4; var20++) {
                  BlockPos var21 = method_17778(var0, var11.field_16053, var14, var15);
                  if (var11.field_16053.method_30465() && method_17767(class_1136.method_4980(var11.field_16053), var0, var21, var11.field_16053)) {
                     float var22 = var11.field_16053.method_30459();
                     double var23 = MathHelper.clamp((double)var14, (double)var9 + (double)var22, (double)var9 + 16.0 - (double)var22);
                     double var25 = MathHelper.clamp((double)var15, (double)var10 + (double)var22, (double)var10 + 16.0 - (double)var22);
                     if (!var0.method_6681(var11.field_16053.method_30456(var23, (double)var21.getY(), var25))
                        || !class_1136.method_4983(
                           var11.field_16053, var0, class_2417.field_12034, new BlockPos(var23, (double)var21.getY(), var25), var0.method_43360()
                        )) {
                        continue;
                     }

                     Entity var27;
                     try {
                        var27 = var11.field_16053.method_30484(var0.method_7066());
                     } catch (Exception var29) {
                        field_18664.warn("Failed to create mob", var29);
                        continue;
                     }

                     var27.method_37144(var23, (double)var21.getY(), var25, var4.nextFloat() * 360.0F, 0.0F);
                     if (var27 instanceof MobEntity) {
                        MobEntity var28 = (MobEntity)var27;
                        if (var28.method_26889(var0, class_2417.field_12034) && var28.method_26855(var0)) {
                           var13 = var28.method_26864(var0, var0.method_43368(var28.method_37075()), class_2417.field_12034, var13, (CompoundNBT)null);
                           var0.method_7065(var28);
                           var19 = true;
                        }
                     }
                  }

                  var14 += var4.nextInt(5) - var4.nextInt(5);

                  for (var15 += var4.nextInt(5) - var4.nextInt(5);
                     var14 < var9 || var14 >= var9 + 16 || var15 < var10 || var15 >= var10 + 16;
                     var15 = var17 + var4.nextInt(5) - var4.nextInt(5)
                  ) {
                     var14 = var16 + var4.nextInt(5) - var4.nextInt(5);
                  }
               }
            }
         }
      }
   }

   private static BlockPos method_17778(class_4924 var0, EntityType<?> var1, int var2, int var3) {
      int var6 = var0.method_22562(class_1136.method_4984(var1), var2, var3);
      class_2921 var7 = new class_2921(var2, var6, var3);
      if (var0.method_22572().method_40244()) {
         do {
            var7.method_13368(Direction.field_802);
         } while (!var0.method_28262(var7).method_8345());

         do {
            var7.method_13368(Direction.field_802);
         } while (var0.method_28262(var7).method_8345() && var7.getY() > 0);
      }

      if (class_1136.method_4980(var1) == class_1257.field_6935) {
         BlockPos var8 = var7.method_6100();
         if (var0.method_28262(var8).method_8319(var0, var8, class_2929.field_14271)) {
            return var8;
         }
      }

      return var7.method_6072();
   }
}
