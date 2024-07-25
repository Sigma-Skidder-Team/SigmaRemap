package remapped;

import com.google.common.base.MoreObjects;
import java.util.Objects;

public class class_9164 {
   private static final class_3581 field_46903 = class_3581.method_16732(new class_4639("textures/map/map_background.png"));
   private static final class_3581 field_46896 = class_3581.method_16732(new class_4639("textures/map/map_background_checkerboard.png"));
   private final class_1893 field_46897;
   private class_6098 field_46899 = class_6098.field_31203;
   private class_6098 field_46898 = class_6098.field_31203;
   private float field_46907;
   private float field_46902;
   private float field_46900;
   private float field_46906;
   private final class_6122 field_46904;
   private final class_8765 field_46901;

   public class_9164(class_1893 var1) {
      this.field_46897 = var1;
      this.field_46904 = var1.method_8587();
      this.field_46901 = var1.method_8511();
   }

   public void method_42248(class_5834 var1, class_6098 var2, class_5612 var3, boolean var4, class_7966 var5, class_2565 var6, int var7) {
      class_3290.method_15104(var4);
      if (!var2.method_28022()) {
         this.field_46901.method_40268(var1, var2, var3, var4, var5, var6, var1.field_41768, var7, class_5367.field_27381);
      }

      class_3290.method_15104(false);
   }

   private float method_42251(float var1) {
      float var4 = 1.0F - var1 / 45.0F + 0.1F;
      var4 = class_9299.method_42828(var4, 0.0F, 1.0F);
      return -class_9299.method_42840(var4 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void method_42247(class_7966 var1, class_2565 var2, int var3, class_1736 var4) {
      this.field_46897.method_8577().method_35674(this.field_46897.field_9632.method_44889());
      class_6670 var7 = (class_6670)this.field_46904.<class_9716>method_28131(this.field_46897.field_9632);
      var1.method_36063();
      float var8 = var4 != class_1736.field_8943 ? -1.0F : 1.0F;
      var1.method_36060(class_2426.field_12074.method_11074(92.0F));
      var1.method_36060(class_2426.field_12080.method_11074(45.0F));
      var1.method_36060(class_2426.field_12076.method_11074(var8 * -41.0F));
      var1.method_36065((double)(var8 * 0.3F), -1.1F, 0.45F);
      if (var4 != class_1736.field_8943) {
         var7.method_30610(var1, var2, var3, this.field_46897.field_9632);
      } else {
         var7.method_30608(var1, var2, var3, this.field_46897.field_9632);
      }

      var1.method_36064();
   }

   private void method_42241(class_7966 var1, class_2565 var2, int var3, float var4, class_1736 var5, float var6, class_6098 var7) {
      float var10 = var5 != class_1736.field_8943 ? -1.0F : 1.0F;
      var1.method_36065((double)(var10 * 0.125F), -0.125, 0.0);
      if (!this.field_46897.field_9632.method_37109()) {
         var1.method_36063();
         var1.method_36060(class_2426.field_12076.method_11074(var10 * 10.0F));
         this.method_42245(var1, var2, var3, var4, var6, var5);
         var1.method_36064();
      }

      var1.method_36063();
      var1.method_36065((double)(var10 * 0.51F), (double)(-0.08F + var4 * -1.2F), -0.75);
      float var11 = class_9299.method_42843(var6);
      float var12 = class_9299.method_42818(var11 * (float) Math.PI);
      float var13 = -0.5F * var12;
      float var14 = 0.4F * class_9299.method_42818(var11 * (float) (Math.PI * 2));
      float var15 = -0.3F * class_9299.method_42818(var6 * (float) Math.PI);
      var1.method_36065((double)(var10 * var13), (double)(var14 - 0.3F * var12), (double)var15);
      var1.method_36060(class_2426.field_12080.method_11074(var12 * -45.0F));
      var1.method_36060(class_2426.field_12074.method_11074(var10 * var12 * -30.0F));
      this.method_42240(var1, var2, var3, var7);
      var1.method_36064();
   }

   private void method_42239(class_7966 var1, class_2565 var2, int var3, float var4, float var5, float var6) {
      float var9 = class_9299.method_42843(var6);
      float var10 = -0.2F * class_9299.method_42818(var6 * (float) Math.PI);
      float var11 = -0.4F * class_9299.method_42818(var9 * (float) Math.PI);
      var1.method_36065(0.0, (double)(-var10 / 2.0F), (double)var11);
      float var12 = this.method_42251(var4);
      var1.method_36065(0.0, (double)(0.04F + var5 * -1.2F + var12 * -0.5F), -0.72F);
      var1.method_36060(class_2426.field_12080.method_11074(var12 * -85.0F));
      if (!this.field_46897.field_9632.method_37109()) {
         var1.method_36063();
         var1.method_36060(class_2426.field_12074.method_11074(90.0F));
         this.method_42247(var1, var2, var3, class_1736.field_8943);
         this.method_42247(var1, var2, var3, class_1736.field_8940);
         var1.method_36064();
      }

      float var13 = class_9299.method_42818(var9 * (float) Math.PI);
      var1.method_36060(class_2426.field_12080.method_11074(var13 * 20.0F));
      var1.method_36062(2.0F, 2.0F, 2.0F);
      this.method_42240(var1, var2, var3, this.field_46899);
   }

   private void method_42240(class_7966 var1, class_2565 var2, int var3, class_6098 var4) {
      var1.method_36060(class_2426.field_12074.method_11074(180.0F));
      var1.method_36060(class_2426.field_12076.method_11074(180.0F));
      var1.method_36062(0.38F, 0.38F, 0.38F);
      var1.method_36065(-0.5, -0.5, 0.0);
      var1.method_36062(0.0078125F, 0.0078125F, 0.0078125F);
      class_2134 var7 = class_2143.method_10005(var4, this.field_46897.field_9601);
      class_7907 var8 = var2.method_11645(var7 != null ? field_46896 : field_46903);
      class_8107 var9 = var1.method_36058().method_28620();
      var8.method_35762(var9, -7.0F, 135.0F, 0.0F).method_35743(255, 255, 255, 255).method_35745(0.0F, 1.0F).method_35747(var3).method_35735();
      var8.method_35762(var9, 135.0F, 135.0F, 0.0F).method_35743(255, 255, 255, 255).method_35745(1.0F, 1.0F).method_35747(var3).method_35735();
      var8.method_35762(var9, 135.0F, -7.0F, 0.0F).method_35743(255, 255, 255, 255).method_35745(1.0F, 0.0F).method_35747(var3).method_35735();
      var8.method_35762(var9, -7.0F, -7.0F, 0.0F).method_35743(255, 255, 255, 255).method_35745(0.0F, 0.0F).method_35747(var3).method_35735();
      if (var7 != null) {
         this.field_46897.field_9590.method_35928().method_38860(var1, var2, var7, false, var3);
      }
   }

   private void method_42245(class_7966 var1, class_2565 var2, int var3, float var4, float var5, class_1736 var6) {
      boolean var9 = var6 != class_1736.field_8940;
      float var10 = !var9 ? -1.0F : 1.0F;
      float var11 = class_9299.method_42843(var5);
      float var12 = -0.3F * class_9299.method_42818(var11 * (float) Math.PI);
      float var13 = 0.4F * class_9299.method_42818(var11 * (float) (Math.PI * 2));
      float var14 = -0.4F * class_9299.method_42818(var5 * (float) Math.PI);
      var1.method_36065((double)(var10 * (var12 + 0.64000005F)), (double)(var13 + -0.6F + var4 * -0.6F), (double)(var14 + -0.71999997F));
      var1.method_36060(class_2426.field_12074.method_11074(var10 * 45.0F));
      float var15 = class_9299.method_42818(var5 * var5 * (float) Math.PI);
      float var16 = class_9299.method_42818(var11 * (float) Math.PI);
      var1.method_36060(class_2426.field_12074.method_11074(var10 * var16 * 70.0F));
      var1.method_36060(class_2426.field_12076.method_11074(var10 * var15 * -20.0F));
      class_5989 var17 = this.field_46897.field_9632;
      this.field_46897.method_8577().method_35674(var17.method_44889());
      var1.method_36065((double)(var10 * -1.0F), 3.6F, 3.5);
      var1.method_36060(class_2426.field_12076.method_11074(var10 * 120.0F));
      var1.method_36060(class_2426.field_12080.method_11074(200.0F));
      var1.method_36060(class_2426.field_12074.method_11074(var10 * -135.0F));
      var1.method_36065((double)(var10 * 5.6F), 0.0, 0.0);
      class_6670 var18 = (class_6670)this.field_46904.<class_9716>method_28131(var17);
      if (!var9) {
         var18.method_30610(var1, var2, var3, var17);
      } else {
         var18.method_30608(var1, var2, var3, var17);
      }
   }

   private void method_42249(class_7966 var1, float var2, class_1736 var3, class_6098 var4) {
      float var7 = (float)this.field_46897.field_9632.method_26466() - var2 + 1.0F;
      float var8 = var7 / (float)var4.method_28004();
      if (var8 < 0.8F) {
         float var9 = class_9299.method_42804(class_9299.method_42840(var7 / 4.0F * (float) Math.PI) * 0.1F);
         var1.method_36065(0.0, (double)var9, 0.0);
      }

      float var11 = 1.0F - (float)Math.pow((double)var8, 27.0);
      int var10 = var3 != class_1736.field_8943 ? -1 : 1;
      var1.method_36065((double)(var11 * 0.6F * (float)var10), (double)(var11 * -0.5F), (double)(var11 * 0.0F));
      var1.method_36060(class_2426.field_12074.method_11074((float)var10 * var11 * 90.0F));
      var1.method_36060(class_2426.field_12080.method_11074(var11 * 10.0F));
      var1.method_36060(class_2426.field_12076.method_11074((float)var10 * var11 * 30.0F));
   }

   private void method_42253(class_7966 var1, class_1736 var2, float var3) {
      int var6 = var2 != class_1736.field_8943 ? -1 : 1;
      float var7 = class_9299.method_42818(var3 * var3 * (float) Math.PI);
      var1.method_36060(class_2426.field_12074.method_11074((float)var6 * (45.0F + var7 * -20.0F)));
      float var8 = class_9299.method_42818(class_9299.method_42843(var3) * (float) Math.PI);
      var1.method_36060(class_2426.field_12076.method_11074((float)var6 * var8 * -20.0F));
      var1.method_36060(class_2426.field_12080.method_11074(var8 * -80.0F));
      var1.method_36060(class_2426.field_12074.method_11074((float)var6 * -45.0F));
   }

   private void method_42242(class_7966 var1, class_1736 var2, float var3) {
      int var6 = var2 != class_1736.field_8943 ? -1 : 1;
      var1.method_36065((double)((float)var6 * 0.56F), (double)(-0.52F + var3 * -0.6F), -0.72F);
   }

   public void method_42243(float var1, class_7966 var2, class_3758 var3, class_5989 var4, int var5) {
      float var8 = var4.method_26533(var1);
      class_2584 var9 = (class_2584)MoreObjects.firstNonNull(var4.field_29616, class_2584.field_12791);
      float var10 = class_9299.method_42795(var1, var4.field_41762, var4.field_41755);
      boolean var11 = true;
      boolean var12 = true;
      if (!var4.method_26554()) {
         class_6098 var13 = var4.method_26446();
         class_6098 var14 = var4.method_26568();
         if (var13.method_27960() instanceof class_4380 && class_4380.method_20408(var13)) {
            var12 = !var11;
         }

         if (var14.method_27960() instanceof class_4380 && class_4380.method_20408(var14)) {
            var11 = !var13.method_28022();
            var12 = !var11;
         }
      } else {
         class_6098 var17 = var4.method_26576();
         if (var17.method_27960() instanceof class_551) {
            var11 = var4.method_26500() == class_2584.field_12791;
            var12 = !var11;
         }

         class_2584 var19 = var4.method_26500();
         if (var19 == class_2584.field_12791) {
            class_6098 var15 = var4.method_26568();
            if (var15.method_27960() instanceof class_4380 && class_4380.method_20408(var15)) {
               var12 = false;
            }
         }
      }

      float var18 = class_9299.method_42795(var1, var4.field_30515, var4.field_30529);
      float var20 = class_9299.method_42795(var1, var4.field_30520, var4.field_30531);
      var2.method_36060(class_2426.field_12080.method_11074((var4.method_37184(var1) - var18) * 0.1F));
      var2.method_36060(class_2426.field_12074.method_11074((var4.method_37291(var1) - var20) * 0.1F));
      if (var11) {
         float var21 = var9 != class_2584.field_12791 ? 0.0F : var8;
         float var16 = 1.0F - class_9299.method_42795(var1, this.field_46902, this.field_46907);
         if (!class_7860.field_40073.method_3596()
            || !class_7860.method_35566(class_7860.field_40073, class_2584.field_12791, var2, var3, var5, var1, var10, var21, var16, this.field_46899)) {
            this.method_42244(var4, var1, var10, class_2584.field_12791, var21, this.field_46899, var16, var2, var3, var5);
         }
      }

      if (var12) {
         float var22 = var9 != class_2584.field_12794 ? 0.0F : var8;
         float var23 = 1.0F - class_9299.method_42795(var1, this.field_46906, this.field_46900);
         if (!class_7860.field_40073.method_3596()
            || !class_7860.method_35566(class_7860.field_40073, class_2584.field_12794, var2, var3, var5, var1, var10, var22, var23, this.field_46898)) {
            this.method_42244(var4, var1, var10, class_2584.field_12794, var22, this.field_46898, var23, var2, var3, var5);
         }
      }

      var3.method_17415();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_42244(
      class_9716 var1, float var2, float var3, class_2584 var4, float var5, class_6098 var6, float var7, class_7966 var8, class_2565 var9, int var10
   ) {
      if (!class_3111.method_14424() || !class_6588.method_30230(var4)) {
         boolean var13 = var4 == class_2584.field_12791;
         class_1736 var14 = var13 ? var1.method_26432() : var1.method_26432().method_7745();
         var8.method_36063();
         if (var6.method_28022()) {
            if (var13 && !var1.method_37109()) {
               this.method_42245(var8, var9, var10, var7, var5, var14);
            }
         } else if (var6.method_27960() instanceof class_2143) {
            if (var13 && this.field_46898.method_28022()) {
               this.method_42239(var8, var9, var10, var3, var7, var5);
            } else {
               this.method_42241(var8, var9, var10, var7, var14, var5, var6);
            }
         } else if (var6.method_27960() instanceof class_4380) {
            boolean var25 = class_4380.method_20408(var6);
            boolean var27 = var14 == class_1736.field_8943;
            int var30 = var27 ? 1 : -1;
            if (var1.method_26554() && var1.method_26466() > 0 && var1.method_26500() == var4) {
               this.method_42242(var8, var14, var7);
               var8.method_36065((double)((float)var30 * -0.4785682F), -0.094387F, 0.05731531F);
               var8.method_36060(class_2426.field_12080.method_11074(-11.935F));
               var8.method_36060(class_2426.field_12074.method_11074((float)var30 * 65.3F));
               var8.method_36060(class_2426.field_12076.method_11074((float)var30 * -9.785F));
               float var33 = (float)var6.method_28004() - ((float)this.field_46897.field_9632.method_26466() - var2 + 1.0F);
               float var37 = var33 / (float)class_4380.method_20403(var6);
               if (var37 > 1.0F) {
                  var37 = 1.0F;
               }

               if (var37 > 0.1F) {
                  float var41 = class_9299.method_42818((var33 - 0.1F) * 1.3F);
                  float var43 = var37 - 0.1F;
                  float var45 = var41 * var43;
                  var8.method_36065((double)(var45 * 0.0F), (double)(var45 * 0.004F), (double)(var45 * 0.0F));
               }

               var8.method_36065((double)(var37 * 0.0F), (double)(var37 * 0.0F), (double)(var37 * 0.04F));
               var8.method_36062(1.0F, 1.0F, 1.0F + var37 * 0.2F);
               var8.method_36060(class_2426.field_12081.method_11074((float)var30 * 45.0F));
            } else {
               float var32 = -0.4F * class_9299.method_42818(class_9299.method_42843(var5) * (float) Math.PI);
               float var36 = 0.2F * class_9299.method_42818(class_9299.method_42843(var5) * (float) (Math.PI * 2));
               float var40 = -0.2F * class_9299.method_42818(var5 * (float) Math.PI);
               var8.method_36065((double)((float)var30 * var32), (double)var36, (double)var40);
               this.method_42242(var8, var14, var7);
               this.method_42253(var8, var14, var5);
               if (var25 && var5 < 0.001F) {
                  var8.method_36065((double)((float)var30 * -0.641864F), 0.0, 0.0);
                  var8.method_36060(class_2426.field_12074.method_11074((float)var30 * 10.0F));
               }
            }

            this.method_42248(var1, var6, var27 ? class_5612.field_28499 : class_5612.field_28498, !var27, var8, var9, var10);
         } else {
            boolean var15 = var14 == class_1736.field_8943;
            class_5396 var16 = new class_5396(true, var5, var7, var14, var6, var8);
            class_727.method_3328().method_3302().method_7914(var16);
            if (var1.method_26554() && var1.method_26466() > 0 && var1.method_26500() == var4) {
               int var29 = var15 ? 1 : -1;
               switch (var6.method_27952()) {
                  case field_31737:
                     this.method_42242(var8, var14, var7);
                     break;
                  case field_31732:
                  case field_31739:
                     this.method_42249(var8, var2, var14, var6);
                     this.method_42242(var8, var14, var7);
                     break;
                  case field_31740:
                     this.method_42242(var8, var14, var7);
                     break;
                  case field_31738:
                     this.method_42242(var8, var14, var7);
                     var8.method_36065((double)((float)var29 * -0.2785682F), 0.18344387F, 0.15731531F);
                     var8.method_36060(class_2426.field_12080.method_11074(-13.935F));
                     var8.method_36060(class_2426.field_12074.method_11074((float)var29 * 35.3F));
                     var8.method_36060(class_2426.field_12076.method_11074((float)var29 * -9.785F));
                     float var31 = (float)var6.method_28004() - ((float)this.field_46897.field_9632.method_26466() - var2 + 1.0F);
                     float var34 = var31 / 20.0F;
                     var34 = (var34 * var34 + var34 * 2.0F) / 3.0F;
                     if (var34 > 1.0F) {
                        var34 = 1.0F;
                     }

                     if (var34 > 0.1F) {
                        float var39 = class_9299.method_42818((var31 - 0.1F) * 1.3F);
                        float var42 = var34 - 0.1F;
                        float var44 = var39 * var42;
                        var8.method_36065((double)(var44 * 0.0F), (double)(var44 * 0.004F), (double)(var44 * 0.0F));
                     }

                     var8.method_36065((double)(var34 * 0.0F), (double)(var34 * 0.0F), (double)(var34 * 0.04F));
                     var8.method_36062(1.0F, 1.0F, 1.0F + var34 * 0.2F);
                     var8.method_36060(class_2426.field_12081.method_11074((float)var29 * 45.0F));
                     break;
                  case field_31736:
                     this.method_42242(var8, var14, var7);
                     var8.method_36065((double)((float)var29 * -0.5F), 0.7F, 0.1F);
                     var8.method_36060(class_2426.field_12080.method_11074(-55.0F));
                     var8.method_36060(class_2426.field_12074.method_11074((float)var29 * 35.3F));
                     var8.method_36060(class_2426.field_12076.method_11074((float)var29 * -9.785F));
                     float var38 = (float)var6.method_28004() - ((float)this.field_46897.field_9632.method_26466() - var2 + 1.0F);
                     float var21 = var38 / 10.0F;
                     if (var21 > 1.0F) {
                        var21 = 1.0F;
                     }

                     if (var21 > 0.1F) {
                        float var22 = class_9299.method_42818((var38 - 0.1F) * 1.3F);
                        float var23 = var21 - 0.1F;
                        float var24 = var22 * var23;
                        var8.method_36065((double)(var24 * 0.0F), (double)(var24 * 0.004F), (double)(var24 * 0.0F));
                     }

                     var8.method_36065(0.0, 0.0, (double)(var21 * 0.2F));
                     var8.method_36062(1.0F, 1.0F, 1.0F + var21 * 0.2F);
                     var8.method_36060(class_2426.field_12081.method_11074((float)var29 * 45.0F));
               }
            } else if (var1.method_26600()) {
               this.method_42242(var8, var14, var7);
               int var17 = var15 ? 1 : -1;
               var8.method_36065((double)((float)var17 * -0.4F), 0.8F, 0.3F);
               var8.method_36060(class_2426.field_12074.method_11074((float)var17 * 65.0F));
               var8.method_36060(class_2426.field_12076.method_11074((float)var17 * -85.0F));
            } else if (!var16.method_29716()) {
               float var28 = -0.4F * class_9299.method_42818(class_9299.method_42843(var5) * (float) Math.PI);
               float var18 = 0.2F * class_9299.method_42818(class_9299.method_42843(var5) * (float) (Math.PI * 2));
               float var19 = -0.2F * class_9299.method_42818(var5 * (float) Math.PI);
               int var20 = var15 ? 1 : -1;
               var8.method_36065((double)((float)var20 * var28), (double)var18, (double)var19);
               this.method_42242(var8, var14, var7);
               this.method_42253(var8, var14, var5);
            }

            if (var16 == null || var16.method_24568()) {
               this.method_42248(var1, var6, var15 ? class_5612.field_28499 : class_5612.field_28498, !var15, var8, var9, var10);
            }

            var16 = new class_5396(false, var5, var7, var14, var6, var8);
            class_727.method_3328().method_3302().method_7914(var16);
         }

         var8.method_36064();
      }
   }

   public void method_42246() {
      this.field_46902 = this.field_46907;
      this.field_46906 = this.field_46900;
      class_5989 var3 = this.field_46897.field_9632;
      class_6098 var4 = var3.method_26446();
      class_6098 var5 = var3.method_26568();
      if (class_6098.method_27982(this.field_46899, var4)) {
         this.field_46899 = var4;
      }

      if (class_6098.method_27982(this.field_46898, var5)) {
         this.field_46898 = var5;
      }

      if (!var3.method_27320()) {
         float var6 = var3.method_3203(1.0F);
         if (class_7860.field_40064.method_3596()) {
            boolean var7 = class_7860.method_35566(class_7860.field_40064, this.field_46899, var4, var3.field_3853.field_36404);
            boolean var8 = class_7860.method_35566(class_7860.field_40064, this.field_46898, var5, -1);
            if (!var7 && !Objects.equals(this.field_46899, var4)) {
               this.field_46899 = var4;
            }

            if (!var8 && !Objects.equals(this.field_46898, var5)) {
               this.field_46898 = var5;
            }
         }

         this.field_46907 = this.field_46907 + class_9299.method_42828((this.field_46899 != var4 ? 0.0F : var6 * var6 * var6) - this.field_46907, -0.4F, 0.4F);
         this.field_46900 = this.field_46900 + class_9299.method_42828((float)(this.field_46898 != var5 ? 0 : 1) - this.field_46900, -0.4F, 0.4F);
      } else {
         this.field_46907 = class_9299.method_42828(this.field_46907 - 0.4F, 0.0F, 1.0F);
         this.field_46900 = class_9299.method_42828(this.field_46900 - 0.4F, 0.0F, 1.0F);
      }

      if (this.field_46907 < 0.1F) {
         this.field_46899 = var4;
         if (class_3111.method_14424()) {
            class_6588.method_30156(this.field_46899);
         }
      }

      if (this.field_46900 < 0.1F) {
         this.field_46898 = var5;
         if (class_3111.method_14424()) {
            class_6588.method_30271(this.field_46898);
         }
      }
   }

   public void method_42250(class_2584 var1) {
      if (var1 != class_2584.field_12791) {
         this.field_46900 = 0.0F;
      } else {
         this.field_46907 = 0.0F;
      }
   }
}
