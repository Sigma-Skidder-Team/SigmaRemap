package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class class_2266 extends class_1546 {
   private static String[] field_11277;
   public float field_11276;
   private final Long2ObjectMap<class_1108> field_11279 = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<class_4092> field_11278 = new Object2BooleanOpenHashMap();

   @Override
   public void method_7014(class_9525 var1, class_5886 var2) {
      super.method_7014(var1, var2);
      this.field_11276 = var2.method_26931(class_1108.field_6359);
   }

   @Override
   public void method_7005() {
      this.field_8166.method_26895(class_1108.field_6359, this.field_11276);
      this.field_11279.clear();
      this.field_11278.clear();
      super.method_7005();
   }

   @Override
   public class_5851 method_7003() {
      class_2921 var3 = new class_2921();
      int var4 = class_9299.method_42847(this.field_8166.method_37309());
      class_2522 var5 = this.field_8165.method_28262(var3.method_13361(this.field_8166.method_37302(), (double)var4, this.field_8166.method_37156()));
      if (!this.field_8166.method_26496(var5.method_8364().method_22005())) {
         if (this.method_7015() && this.field_8166.method_37285()) {
            while (true) {
               if (var5.method_8360() != class_4783.field_23900 && var5.method_8364() != class_8532.field_43674.method_17649(false)) {
                  var4--;
                  break;
               }

               var5 = this.field_8165.method_28262(var3.method_13361(this.field_8166.method_37302(), (double)(++var4), this.field_8166.method_37156()));
            }
         } else if (!this.field_8166.method_37360()) {
            BlockPos var6 = this.field_8166.method_37075();

            while (
               (
                     this.field_8165.method_28262(var6).method_8345()
                        || this.field_8165.method_28262(var6).method_8319(this.field_8165, var6, class_2929.field_14271)
                  )
                  && var6.method_12165() > 0
            ) {
               var6 = var6.method_6100();
            }

            var4 = var6.method_6081().method_12165();
         } else {
            var4 = class_9299.method_42847(this.field_8166.method_37309() + 0.5);
         }
      } else {
         while (this.field_8166.method_26496(var5.method_8364().method_22005())) {
            var5 = this.field_8165.method_28262(var3.method_13361(this.field_8166.method_37302(), (double)(++var4), this.field_8166.method_37156()));
         }

         var4--;
      }

      BlockPos var11 = this.field_8166.method_37075();
      class_1108 var7 = this.method_10454(this.field_8166, var11.method_12173(), var4, var11.method_12185());
      if (this.field_8166.method_26931(var7) < 0.0F) {
         class_4092 var8 = this.field_8166.method_37241();
         if (this.method_10453(var3.method_13361(var8.field_19941, (double)var4, var8.field_19938))
            || this.method_10453(var3.method_13361(var8.field_19941, (double)var4, var8.field_19942))
            || this.method_10453(var3.method_13361(var8.field_19940, (double)var4, var8.field_19938))
            || this.method_10453(var3.method_13361(var8.field_19940, (double)var4, var8.field_19942))) {
            class_5851 var9 = this.method_7017(var3);
            var9.field_29730 = this.method_10456(this.field_8166, var9.method_26686());
            var9.field_29729 = this.field_8166.method_26931(var9.field_29730);
            return var9;
         }
      }

      class_5851 var12 = this.method_7016(var11.method_12173(), var4, var11.method_12185());
      var12.field_29730 = this.method_10456(this.field_8166, var12.method_26686());
      var12.field_29729 = this.field_8166.method_26931(var12.field_29730);
      return var12;
   }

   private boolean method_10453(BlockPos var1) {
      class_1108 var4 = this.method_10456(this.field_8166, var1);
      return this.field_8166.method_26931(var4) >= 0.0F;
   }

   @Override
   public class_1478 method_7013(double var1, double var3, double var5) {
      return new class_1478(this.method_7016(class_9299.method_42847(var1), class_9299.method_42847(var3), class_9299.method_42847(var5)));
   }

   @Override
   public int method_7002(class_5851[] var1, class_5851 var2) {
      int var5 = 0;
      int var6 = 0;
      class_1108 var7 = this.method_10454(this.field_8166, var2.field_29731, var2.field_29735 + 1, var2.field_29736);
      class_1108 var8 = this.method_10454(this.field_8166, var2.field_29731, var2.field_29735, var2.field_29736);
      if (this.field_8166.method_26931(var7) >= 0.0F && var8 != class_1108.field_6364) {
         var6 = class_9299.method_42848(Math.max(1.0F, this.field_8166.field_41733));
      }

      double var9 = method_10464(this.field_8165, new BlockPos(var2.field_29731, var2.field_29735, var2.field_29736));
      class_5851 var11 = this.method_10450(var2.field_29731, var2.field_29735, var2.field_29736 + 1, var6, var9, Direction.field_800, var8);
      if (this.method_10462(var11, var2)) {
         var1[var5++] = var11;
      }

      class_5851 var12 = this.method_10450(var2.field_29731 - 1, var2.field_29735, var2.field_29736, var6, var9, Direction.field_809, var8);
      if (this.method_10462(var12, var2)) {
         var1[var5++] = var12;
      }

      class_5851 var13 = this.method_10450(var2.field_29731 + 1, var2.field_29735, var2.field_29736, var6, var9, Direction.field_804, var8);
      if (this.method_10462(var13, var2)) {
         var1[var5++] = var13;
      }

      class_5851 var14 = this.method_10450(var2.field_29731, var2.field_29735, var2.field_29736 - 1, var6, var9, Direction.field_818, var8);
      if (this.method_10462(var14, var2)) {
         var1[var5++] = var14;
      }

      class_5851 var15 = this.method_10450(var2.field_29731 - 1, var2.field_29735, var2.field_29736 - 1, var6, var9, Direction.field_818, var8);
      if (this.method_10460(var2, var12, var14, var15)) {
         var1[var5++] = var15;
      }

      class_5851 var16 = this.method_10450(var2.field_29731 + 1, var2.field_29735, var2.field_29736 - 1, var6, var9, Direction.field_818, var8);
      if (this.method_10460(var2, var13, var14, var16)) {
         var1[var5++] = var16;
      }

      class_5851 var17 = this.method_10450(var2.field_29731 - 1, var2.field_29735, var2.field_29736 + 1, var6, var9, Direction.field_800, var8);
      if (this.method_10460(var2, var12, var11, var17)) {
         var1[var5++] = var17;
      }

      class_5851 var18 = this.method_10450(var2.field_29731 + 1, var2.field_29735, var2.field_29736 + 1, var6, var9, Direction.field_800, var8);
      if (this.method_10460(var2, var13, var11, var18)) {
         var1[var5++] = var18;
      }

      return var5;
   }

   private boolean method_10462(class_5851 var1, class_5851 var2) {
      return var1 != null && !var1.field_29726 && (var1.field_29729 >= 0.0F || var2.field_29729 < 0.0F);
   }

   private boolean method_10460(class_5851 var1, class_5851 var2, class_5851 var3, class_5851 var4) {
      if (var4 == null || var3 == null || var2 == null) {
         return false;
      } else if (var4.field_29726) {
         return false;
      } else if (var3.field_29735 > var1.field_29735 || var2.field_29735 > var1.field_29735) {
         return false;
      } else if (var2.field_29730 != class_1108.field_6363 && var3.field_29730 != class_1108.field_6363 && var4.field_29730 != class_1108.field_6363) {
         boolean var7 = var3.field_29730 == class_1108.field_6353 && var2.field_29730 == class_1108.field_6353 && (double)this.field_8166.method_37086() < 0.5;
         return var4.field_29729 >= 0.0F
            && (var3.field_29735 < var1.field_29735 || var3.field_29729 >= 0.0F || var7)
            && (var2.field_29735 < var1.field_29735 || var2.field_29729 >= 0.0F || var7);
      } else {
         return false;
      }
   }

   private boolean method_10451(class_5851 var1) {
      class_1343 var4 = new class_1343(
         (double)var1.field_29731 - this.field_8166.method_37302(),
         (double)var1.field_29735 - this.field_8166.method_37309(),
         (double)var1.field_29736 - this.field_8166.method_37156()
      );
      class_4092 var5 = this.field_8166.method_37241();
      int var6 = class_9299.method_42815(var4.method_6217() / var5.method_18906());
      var4 = var4.method_6209((double)(1.0F / (float)var6));

      for (int var7 = 1; var7 <= var6; var7++) {
         var5 = var5.method_18920(var4);
         if (this.method_10455(var5)) {
            return false;
         }
      }

      return true;
   }

   public static double method_10464(class_6163 var0, BlockPos var1) {
      BlockPos var4 = var1.method_6100();
      class_4190 var5 = var0.method_28262(var4).method_8324(var0, var4);
      return (double)var4.method_12165() + (!var5.method_19485() ? var5.method_19495(class_9249.field_47216) : 0.0);
   }

   @Nullable
   private class_5851 method_10450(int var1, int var2, int var3, int var4, double var5, Direction var7, class_1108 var8) {
      class_5851 var11 = null;
      class_2921 var12 = new class_2921();
      double var13 = method_10464(this.field_8165, var12.method_13362(var1, var2, var3));
      if (!(var13 - var5 > 1.125)) {
         class_1108 var15 = this.method_10454(this.field_8166, var1, var2, var3);
         float var16 = this.field_8166.method_26931(var15);
         double var17 = (double)this.field_8166.method_37086() / 2.0;
         if (var16 >= 0.0F) {
            var11 = this.method_7016(var1, var2, var3);
            var11.field_29730 = var15;
            var11.field_29729 = Math.max(var11.field_29729, var16);
         }

         if (var8 == class_1108.field_6353 && var11 != null && var11.field_29729 >= 0.0F && !this.method_10451(var11)) {
            var11 = null;
         }

         if (var15 == class_1108.field_6343) {
            return var11;
         } else {
            if ((var11 == null || var11.field_29729 < 0.0F)
               && var4 > 0
               && var15 != class_1108.field_6353
               && var15 != class_1108.field_6346
               && var15 != class_1108.field_6347) {
               var11 = this.method_10450(var1, var2 + 1, var3, var4 - 1, var5, var7, var8);
               if (var11 != null
                  && (var11.field_29730 == class_1108.field_6366 || var11.field_29730 == class_1108.field_6343)
                  && this.field_8166.method_37086() < 1.0F) {
                  double var19 = (double)(var1 - var7.method_1041()) + 0.5;
                  double var21 = (double)(var3 - var7.method_1034()) + 0.5;
                  class_4092 var23 = new class_4092(
                     var19 - var17,
                     method_10464(this.field_8165, var12.method_13361(var19, (double)(var2 + 1), var21)) + 0.001,
                     var21 - var17,
                     var19 + var17,
                     (double)this.field_8166.method_37074()
                        + method_10464(this.field_8165, var12.method_13361((double)var11.field_29731, (double)var11.field_29735, (double)var11.field_29736))
                        - 0.002,
                     var21 + var17
                  );
                  if (this.method_10455(var23)) {
                     var11 = null;
                  }
               }
            }

            if (var15 == class_1108.field_6359 && !this.method_7015()) {
               if (this.method_10454(this.field_8166, var1, var2 - 1, var3) != class_1108.field_6359) {
                  return var11;
               }

               while (var2 > 0) {
                  var15 = this.method_10454(this.field_8166, var1, --var2, var3);
                  if (var15 != class_1108.field_6359) {
                     return var11;
                  }

                  var11 = this.method_7016(var1, var2, var3);
                  var11.field_29730 = var15;
                  var11.field_29729 = Math.max(var11.field_29729, this.field_8166.method_26931(var15));
               }
            }

            if (var15 == class_1108.field_6366) {
               int var24 = 0;
               int var25 = var2;

               while (var15 == class_1108.field_6366) {
                  if (--var2 < 0) {
                     class_5851 var29 = this.method_7016(var1, var25, var3);
                     var29.field_29730 = class_1108.field_6365;
                     var29.field_29729 = -1.0F;
                     return var29;
                  }

                  if (var24++ >= this.field_8166.method_37232()) {
                     class_5851 var28 = this.method_7016(var1, var2, var3);
                     var28.field_29730 = class_1108.field_6365;
                     var28.field_29729 = -1.0F;
                     return var28;
                  }

                  var15 = this.method_10454(this.field_8166, var1, var2, var3);
                  var16 = this.field_8166.method_26931(var15);
                  if (var15 != class_1108.field_6366 && var16 >= 0.0F) {
                     var11 = this.method_7016(var1, var2, var3);
                     var11.field_29730 = var15;
                     var11.field_29729 = Math.max(var11.field_29729, var16);
                     break;
                  }

                  if (var16 < 0.0F) {
                     class_5851 var26 = this.method_7016(var1, var2, var3);
                     var26.field_29730 = class_1108.field_6365;
                     var26.field_29729 = -1.0F;
                     return var26;
                  }
               }
            }

            if (var15 == class_1108.field_6353) {
               var11 = this.method_7016(var1, var2, var3);
               var11.field_29726 = true;
               var11.field_29730 = var15;
               var11.field_29729 = var15.method_4913();
            }

            return var11;
         }
      } else {
         return null;
      }
   }

   private boolean method_10455(class_4092 var1) {
      return (Boolean)this.field_11278.computeIfAbsent(var1, var2 -> !this.field_8165.method_6683(this.field_8166, var1));
   }

   @Override
   public class_1108 method_7011(class_6163 var1, int var2, int var3, int var4, class_5886 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var13 = EnumSet.<class_1108>noneOf(class_1108.class);
      class_1108 var14 = class_1108.field_6365;
      BlockPos var15 = var5.method_37075();
      var14 = this.method_10457(var1, var2, var3, var4, var6, var7, var8, var9, var10, var13, var14, var15);
      if (var13.contains(class_1108.field_6353)) {
         return class_1108.field_6353;
      } else if (var13.contains(class_1108.field_6346)) {
         return class_1108.field_6346;
      } else {
         class_1108 var16 = class_1108.field_6365;

         for (class_1108 var18 : var13) {
            if (var5.method_26931(var18) < 0.0F) {
               return var18;
            }

            if (var5.method_26931(var18) >= var5.method_26931(var16)) {
               var16 = var18;
            }
         }

         return var14 == class_1108.field_6366 && var5.method_26931(var16) == 0.0F && var6 <= 1 ? class_1108.field_6366 : var16;
      }
   }

   public class_1108 method_10457(
      class_6163 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      boolean var8,
      boolean var9,
      EnumSet<class_1108> var10,
      class_1108 var11,
      BlockPos var12
   ) {
      for (int var15 = 0; var15 < var5; var15++) {
         for (int var16 = 0; var16 < var6; var16++) {
            for (int var17 = 0; var17 < var7; var17++) {
               int var18 = var15 + var2;
               int var19 = var16 + var3;
               int var20 = var17 + var4;
               class_1108 var21 = this.method_7010(var1, var18, var19, var20);
               var21 = this.method_10463(var1, var8, var9, var12, var21);
               if (var15 == 0 && var16 == 0 && var17 == 0) {
                  var11 = var21;
               }

               var10.add(var21);
            }
         }
      }

      return var11;
   }

   public class_1108 method_10463(class_6163 var1, boolean var2, boolean var3, BlockPos var4, class_1108 var5) {
      if (var5 == class_1108.field_6355 && var2 && var3) {
         var5 = class_1108.field_6363;
      }

      if (var5 == class_1108.field_6361 && !var3) {
         var5 = class_1108.field_6365;
      }

      if (var5 == class_1108.field_6345
         && !(var1.method_28262(var4).method_8360() instanceof class_6788)
         && !(var1.method_28262(var4.method_6100()).method_8360() instanceof class_6788)) {
         var5 = class_1108.field_6346;
      }

      if (var5 == class_1108.field_6348) {
         var5 = class_1108.field_6365;
      }

      return var5;
   }

   private class_1108 method_10456(class_5886 var1, BlockPos var2) {
      return this.method_10454(var1, var2.method_12173(), var2.method_12165(), var2.method_12185());
   }

   private class_1108 method_10454(class_5886 var1, int var2, int var3, int var4) {
      return (class_1108)this.field_11279
         .computeIfAbsent(
            BlockPos.method_6107(var2, var3, var4),
            var5 -> this.method_7011(
                  this.field_8165, var2, var3, var4, var1, this.field_8164, this.field_8163, this.field_8167, this.method_7006(), this.method_7004()
               )
         );
   }

   @Override
   public class_1108 method_7010(class_6163 var1, int var2, int var3, int var4) {
      return method_10452(var1, new class_2921(var2, var3, var4));
   }

   public static class_1108 method_10452(class_6163 var0, class_2921 var1) {
      int var4 = var1.method_12173();
      int var5 = var1.method_12165();
      int var6 = var1.method_12185();
      class_1108 var7 = method_10461(var0, var1);
      if (var7 == class_1108.field_6366 && var5 >= 1) {
         class_1108 var8 = method_10461(var0, var1.method_13362(var4, var5 - 1, var6));
         var7 = var8 != class_1108.field_6343 && var8 != class_1108.field_6366 && var8 != class_1108.field_6359 && var8 != class_1108.field_6360
            ? class_1108.field_6343
            : class_1108.field_6366;
         if (var8 == class_1108.field_6352) {
            var7 = class_1108.field_6352;
         }

         if (var8 == class_1108.field_6362) {
            var7 = class_1108.field_6362;
         }

         if (var8 == class_1108.field_6351) {
            var7 = class_1108.field_6351;
         }

         if (var8 == class_1108.field_6364) {
            var7 = class_1108.field_6364;
         }
      }

      if (var7 == class_1108.field_6343) {
         var7 = method_10458(var0, var1.method_13362(var4, var5, var6), var7);
      }

      return var7;
   }

   public static class_1108 method_10458(class_6163 var0, class_2921 var1, class_1108 var2) {
      int var5 = var1.method_12173();
      int var6 = var1.method_12165();
      int var7 = var1.method_12185();

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            for (int var10 = -1; var10 <= 1; var10++) {
               if (var8 != 0 || var10 != 0) {
                  var1.method_13362(var5 + var8, var6 + var9, var7 + var10);
                  class_2522 var11 = var0.method_28262(var1);
                  if (var11.method_8350(class_4783.field_23500)) {
                     return class_1108.field_6358;
                  }

                  if (var11.method_8350(class_4783.field_23637)) {
                     return class_1108.field_6367;
                  }

                  if (method_10459(var11)) {
                     return class_1108.field_6357;
                  }

                  if (var0.method_28258(var1).method_22007(class_6503.field_33094)) {
                     return class_1108.field_6356;
                  }
               }
            }
         }
      }

      return var2;
   }

   public static class_1108 method_10461(class_6163 var0, BlockPos var1) {
      class_2522 var4 = var0.method_28262(var1);
      class_6414 var5 = var4.method_8360();
      class_5371 var6 = var4.method_8362();
      if (var4.method_8345()) {
         return class_1108.field_6366;
      } else if (var4.method_8349(class_2351.field_11806) || var4.method_8350(class_4783.field_23860)) {
         return class_1108.field_6347;
      } else if (var4.method_8350(class_4783.field_23500)) {
         return class_1108.field_6362;
      } else if (var4.method_8350(class_4783.field_23637)) {
         return class_1108.field_6351;
      } else if (var4.method_8350(class_4783.field_23899)) {
         return class_1108.field_6364;
      } else if (var4.method_8350(class_4783.field_23666)) {
         return class_1108.field_6344;
      } else {
         class_4774 var7 = var0.method_28258(var1);
         if (var7.method_22007(class_6503.field_33094)) {
            return class_1108.field_6359;
         } else if (var7.method_22007(class_6503.field_33095)) {
            return class_1108.field_6360;
         } else if (method_10459(var4)) {
            return class_1108.field_6352;
         } else if (class_4115.method_19106(var4) && !var4.<Boolean>method_10313(class_4115.field_20051)) {
            return class_1108.field_6355;
         } else if (var5 instanceof class_4115 && var6 == class_5371.field_27408 && !var4.<Boolean>method_10313(class_4115.field_20051)) {
            return class_1108.field_6350;
         } else if (var5 instanceof class_4115 && var4.<Boolean>method_10313(class_4115.field_20051)) {
            return class_1108.field_6361;
         } else if (var5 instanceof class_6788) {
            return class_1108.field_6345;
         } else if (var5 instanceof class_4423) {
            return class_1108.field_6348;
         } else if (!var5.method_29299(class_2351.field_11728)
            && !var5.method_29299(class_2351.field_11759)
            && (!(var5 instanceof class_1645) || var4.<Boolean>method_10313(class_1645.field_8559))) {
            return var4.method_8319(var0, var1, class_2929.field_14271) ? class_1108.field_6366 : class_1108.field_6365;
         } else {
            return class_1108.field_6353;
         }
      }
   }

   private static boolean method_10459(class_2522 var0) {
      return var0.method_8349(class_2351.field_11771)
         || var0.method_8350(class_4783.field_23811)
         || var0.method_8350(class_4783.field_23215)
         || class_8474.method_39004(var0);
   }
}
