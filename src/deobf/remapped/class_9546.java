package remapped;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import javax.annotation.Nullable;

public class class_9546 extends class_2266 {
   private static String[] field_48565;

   @Override
   public void method_7014(class_9525 var1, class_5886 var2) {
      super.method_7014(var1, var2);
      this.field_11276 = var2.method_26931(class_1108.field_6359);
   }

   @Override
   public void method_7005() {
      this.field_8166.method_26895(class_1108.field_6359, this.field_11276);
      super.method_7005();
   }

   @Override
   public class_5851 method_7003() {
      int var3;
      if (this.method_7015() && this.field_8166.method_37285()) {
         var3 = class_9299.method_42847(this.field_8166.method_37309());
         class_2921 var4 = new class_2921(this.field_8166.method_37302(), (double)var3, this.field_8166.method_37156());

         for (class_6414 var5 = this.field_8165.method_28262(var4).method_8360();
            var5 == class_4783.field_23900;
            var5 = this.field_8165.method_28262(var4).method_8360()
         ) {
            var4.method_13361(this.field_8166.method_37302(), (double)(++var3), this.field_8166.method_37156());
         }
      } else {
         var3 = class_9299.method_42847(this.field_8166.method_37309() + 0.5);
      }

      BlockPos var10 = this.field_8166.method_37075();
      class_1108 var11 = this.method_44059(this.field_8166, var10.method_12173(), var3, var10.method_12185());
      if (this.field_8166.method_26931(var11) < 0.0F) {
         HashSet var6 = Sets.newHashSet();
         var6.add(new BlockPos(this.field_8166.method_37241().field_19941, (double)var3, this.field_8166.method_37241().field_19938));
         var6.add(new BlockPos(this.field_8166.method_37241().field_19941, (double)var3, this.field_8166.method_37241().field_19942));
         var6.add(new BlockPos(this.field_8166.method_37241().field_19940, (double)var3, this.field_8166.method_37241().field_19938));
         var6.add(new BlockPos(this.field_8166.method_37241().field_19940, (double)var3, this.field_8166.method_37241().field_19942));

         for (BlockPos var8 : var6) {
            class_1108 var9 = this.method_44060(this.field_8166, var8);
            if (this.field_8166.method_26931(var9) >= 0.0F) {
               return super.method_7016(var8.method_12173(), var8.method_12165(), var8.method_12185());
            }
         }
      }

      return super.method_7016(var10.method_12173(), var3, var10.method_12185());
   }

   @Override
   public class_1478 method_7013(double var1, double var3, double var5) {
      return new class_1478(super.method_7016(class_9299.method_42847(var1), class_9299.method_42847(var3), class_9299.method_42847(var5)));
   }

   @Override
   public int method_7002(class_5851[] var1, class_5851 var2) {
      int var5 = 0;
      class_5851 var6 = this.method_7016(var2.field_29731, var2.field_29735, var2.field_29736 + 1);
      if (this.method_44061(var6)) {
         var1[var5++] = var6;
      }

      class_5851 var7 = this.method_7016(var2.field_29731 - 1, var2.field_29735, var2.field_29736);
      if (this.method_44061(var7)) {
         var1[var5++] = var7;
      }

      class_5851 var8 = this.method_7016(var2.field_29731 + 1, var2.field_29735, var2.field_29736);
      if (this.method_44061(var8)) {
         var1[var5++] = var8;
      }

      class_5851 var9 = this.method_7016(var2.field_29731, var2.field_29735, var2.field_29736 - 1);
      if (this.method_44061(var9)) {
         var1[var5++] = var9;
      }

      class_5851 var10 = this.method_7016(var2.field_29731, var2.field_29735 + 1, var2.field_29736);
      if (this.method_44061(var10)) {
         var1[var5++] = var10;
      }

      class_5851 var11 = this.method_7016(var2.field_29731, var2.field_29735 - 1, var2.field_29736);
      if (this.method_44061(var11)) {
         var1[var5++] = var11;
      }

      class_5851 var12 = this.method_7016(var2.field_29731, var2.field_29735 + 1, var2.field_29736 + 1);
      if (this.method_44061(var12) && this.method_44062(var6) && this.method_44062(var10)) {
         var1[var5++] = var12;
      }

      class_5851 var13 = this.method_7016(var2.field_29731 - 1, var2.field_29735 + 1, var2.field_29736);
      if (this.method_44061(var13) && this.method_44062(var7) && this.method_44062(var10)) {
         var1[var5++] = var13;
      }

      class_5851 var14 = this.method_7016(var2.field_29731 + 1, var2.field_29735 + 1, var2.field_29736);
      if (this.method_44061(var14) && this.method_44062(var8) && this.method_44062(var10)) {
         var1[var5++] = var14;
      }

      class_5851 var15 = this.method_7016(var2.field_29731, var2.field_29735 + 1, var2.field_29736 - 1);
      if (this.method_44061(var15) && this.method_44062(var9) && this.method_44062(var10)) {
         var1[var5++] = var15;
      }

      class_5851 var16 = this.method_7016(var2.field_29731, var2.field_29735 - 1, var2.field_29736 + 1);
      if (this.method_44061(var16) && this.method_44062(var6) && this.method_44062(var11)) {
         var1[var5++] = var16;
      }

      class_5851 var17 = this.method_7016(var2.field_29731 - 1, var2.field_29735 - 1, var2.field_29736);
      if (this.method_44061(var17) && this.method_44062(var7) && this.method_44062(var11)) {
         var1[var5++] = var17;
      }

      class_5851 var18 = this.method_7016(var2.field_29731 + 1, var2.field_29735 - 1, var2.field_29736);
      if (this.method_44061(var18) && this.method_44062(var8) && this.method_44062(var11)) {
         var1[var5++] = var18;
      }

      class_5851 var19 = this.method_7016(var2.field_29731, var2.field_29735 - 1, var2.field_29736 - 1);
      if (this.method_44061(var19) && this.method_44062(var9) && this.method_44062(var11)) {
         var1[var5++] = var19;
      }

      class_5851 var20 = this.method_7016(var2.field_29731 + 1, var2.field_29735, var2.field_29736 - 1);
      if (this.method_44061(var20) && this.method_44062(var9) && this.method_44062(var8)) {
         var1[var5++] = var20;
      }

      class_5851 var21 = this.method_7016(var2.field_29731 + 1, var2.field_29735, var2.field_29736 + 1);
      if (this.method_44061(var21) && this.method_44062(var6) && this.method_44062(var8)) {
         var1[var5++] = var21;
      }

      class_5851 var22 = this.method_7016(var2.field_29731 - 1, var2.field_29735, var2.field_29736 - 1);
      if (this.method_44061(var22) && this.method_44062(var9) && this.method_44062(var7)) {
         var1[var5++] = var22;
      }

      class_5851 var23 = this.method_7016(var2.field_29731 - 1, var2.field_29735, var2.field_29736 + 1);
      if (this.method_44061(var23) && this.method_44062(var6) && this.method_44062(var7)) {
         var1[var5++] = var23;
      }

      class_5851 var24 = this.method_7016(var2.field_29731 + 1, var2.field_29735 + 1, var2.field_29736 - 1);
      if (this.method_44061(var24)
         && this.method_44062(var20)
         && this.method_44062(var9)
         && this.method_44062(var8)
         && this.method_44062(var10)
         && this.method_44062(var15)
         && this.method_44062(var14)) {
         var1[var5++] = var24;
      }

      class_5851 var25 = this.method_7016(var2.field_29731 + 1, var2.field_29735 + 1, var2.field_29736 + 1);
      if (this.method_44061(var25)
         && this.method_44062(var21)
         && this.method_44062(var6)
         && this.method_44062(var8)
         && this.method_44062(var10)
         && this.method_44062(var12)
         && this.method_44062(var14)) {
         var1[var5++] = var25;
      }

      class_5851 var26 = this.method_7016(var2.field_29731 - 1, var2.field_29735 + 1, var2.field_29736 - 1);
      if (this.method_44061(var26)
         && this.method_44062(var22)
         && this.method_44062(var9)
         && this.method_44062(var7) & this.method_44062(var10)
         && this.method_44062(var15)
         && this.method_44062(var13)) {
         var1[var5++] = var26;
      }

      class_5851 var27 = this.method_7016(var2.field_29731 - 1, var2.field_29735 + 1, var2.field_29736 + 1);
      if (this.method_44061(var27)
         && this.method_44062(var23)
         && this.method_44062(var6)
         && this.method_44062(var7) & this.method_44062(var10)
         && this.method_44062(var12)
         && this.method_44062(var13)) {
         var1[var5++] = var27;
      }

      class_5851 var28 = this.method_7016(var2.field_29731 + 1, var2.field_29735 - 1, var2.field_29736 - 1);
      if (this.method_44061(var28)
         && this.method_44062(var20)
         && this.method_44062(var9)
         && this.method_44062(var8)
         && this.method_44062(var11)
         && this.method_44062(var19)
         && this.method_44062(var18)) {
         var1[var5++] = var28;
      }

      class_5851 var29 = this.method_7016(var2.field_29731 + 1, var2.field_29735 - 1, var2.field_29736 + 1);
      if (this.method_44061(var29)
         && this.method_44062(var21)
         && this.method_44062(var6)
         && this.method_44062(var8)
         && this.method_44062(var11)
         && this.method_44062(var16)
         && this.method_44062(var18)) {
         var1[var5++] = var29;
      }

      class_5851 var30 = this.method_7016(var2.field_29731 - 1, var2.field_29735 - 1, var2.field_29736 - 1);
      if (this.method_44061(var30)
         && this.method_44062(var22)
         && this.method_44062(var9)
         && this.method_44062(var7)
         && this.method_44062(var11)
         && this.method_44062(var19)
         && this.method_44062(var17)) {
         var1[var5++] = var30;
      }

      class_5851 var31 = this.method_7016(var2.field_29731 - 1, var2.field_29735 - 1, var2.field_29736 + 1);
      if (this.method_44061(var31)
         && this.method_44062(var23)
         && this.method_44062(var6)
         && this.method_44062(var7)
         && this.method_44062(var11)
         && this.method_44062(var16)
         && this.method_44062(var17)) {
         var1[var5++] = var31;
      }

      return var5;
   }

   private boolean method_44062(class_5851 var1) {
      return var1 != null && var1.field_29729 >= 0.0F;
   }

   private boolean method_44061(class_5851 var1) {
      return var1 != null && !var1.field_29726;
   }

   @Nullable
   @Override
   public class_5851 method_7016(int var1, int var2, int var3) {
      class_5851 var6 = null;
      class_1108 var7 = this.method_44059(this.field_8166, var1, var2, var3);
      float var8 = this.field_8166.method_26931(var7);
      if (var8 >= 0.0F) {
         var6 = super.method_7016(var1, var2, var3);
         var6.field_29730 = var7;
         var6.field_29729 = Math.max(var6.field_29729, var8);
         if (var7 == class_1108.field_6343) {
            var6.field_29729++;
         }
      }

      return var7 != class_1108.field_6366 && var7 != class_1108.field_6343 ? var6 : var6;
   }

   @Override
   public class_1108 method_7011(class_6163 var1, int var2, int var3, int var4, class_5886 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var13 = EnumSet.<class_1108>noneOf(class_1108.class);
      class_1108 var14 = class_1108.field_6365;
      BlockPos var15 = var5.method_37075();
      var14 = this.method_10457(var1, var2, var3, var4, var6, var7, var8, var9, var10, var13, var14, var15);
      if (var13.contains(class_1108.field_6353)) {
         return class_1108.field_6353;
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

         return var14 == class_1108.field_6366 && var5.method_26931(var16) == 0.0F ? class_1108.field_6366 : var16;
      }
   }

   @Override
   public class_1108 method_7010(class_6163 var1, int var2, int var3, int var4) {
      class_2921 var7 = new class_2921();
      class_1108 var8 = method_10461(var1, var7.method_13362(var2, var3, var4));
      if (var8 == class_1108.field_6366 && var3 >= 1) {
         class_2522 var9 = var1.method_28262(var7.method_13362(var2, var3 - 1, var4));
         class_1108 var10 = method_10461(var1, var7.method_13362(var2, var3 - 1, var4));
         if (var10 == class_1108.field_6352
            || var9.method_8350(class_4783.field_23215)
            || var10 == class_1108.field_6360
            || var9.method_8349(class_2351.field_11774)) {
            var8 = class_1108.field_6352;
         } else if (var10 != class_1108.field_6362) {
            if (var10 != class_1108.field_6351) {
               if (var10 != class_1108.field_6344) {
                  if (var10 != class_1108.field_6353) {
                     var8 = var10 != class_1108.field_6343 && var10 != class_1108.field_6366 && var10 != class_1108.field_6359
                        ? class_1108.field_6343
                        : class_1108.field_6366;
                  } else {
                     var8 = class_1108.field_6353;
                  }
               } else {
                  var8 = class_1108.field_6344;
               }
            } else {
               var8 = class_1108.field_6351;
            }
         } else {
            var8 = class_1108.field_6362;
         }
      }

      if (var8 == class_1108.field_6343 || var8 == class_1108.field_6366) {
         var8 = method_10458(var1, var7.method_13362(var2, var3, var4), var8);
      }

      return var8;
   }

   private class_1108 method_44060(class_5886 var1, BlockPos var2) {
      return this.method_44059(var1, var2.method_12173(), var2.method_12165(), var2.method_12185());
   }

   private class_1108 method_44059(class_5886 var1, int var2, int var3, int var4) {
      return this.method_7011(
         this.field_8165, var2, var3, var4, var1, this.field_8164, this.field_8163, this.field_8167, this.method_7006(), this.method_7004()
      );
   }
}
