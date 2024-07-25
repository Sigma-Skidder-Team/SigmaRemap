package remapped;

public class class_4498 extends class_3289 {
   private int field_21999;
   private final class_9326 field_21998;
   private class_3416 field_21996;
   private boolean field_21997;

   public class_4498(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_9326 var14, class_5734 var15) {
      super(var1, var2, var4, var6);
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.field_21998 = var14;
      this.field_49476 = 8;
      if (var15 != null) {
         this.field_21996 = var15.method_25927("Explosions", 10);
         if (!this.field_21996.isEmpty()) {
            this.field_49476 = this.field_21996.size() * 2 - 1;

            for (int var18 = 0; var18 < this.field_21996.size(); var18++) {
               class_5734 var19 = this.field_21996.method_15764(var18);
               if (var19.method_25933("Flicker")) {
                  this.field_21997 = true;
                  this.field_49476 += 15;
                  break;
               }
            }
         } else {
            this.field_21996 = null;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_44949() {
      if (this.field_21999 == 0 && this.field_21996 != null) {
         boolean var3 = this.method_20904();
         boolean var4 = false;
         if (this.field_21996.size() >= 3) {
            var4 = true;
         } else {
            for (int var5 = 0; var5 < this.field_21996.size(); var5++) {
               class_5734 var6 = this.field_21996.method_15764(var5);
               if (class_3917.method_18129(var6.method_25950("Type")) == class_3917.field_19031) {
                  var4 = true;
                  break;
               }
            }
         }

         class_8461 var19;
         if (var4) {
            var19 = var3 ? class_463.field_2596 : class_463.field_2303;
         } else {
            var19 = var3 ? class_463.field_2695 : class_463.field_2655;
         }

         this.field_49469
            .method_29527(
               this.field_49462, this.field_49473, this.field_49465, var19, class_562.field_3325, 20.0F, 0.95F + this.field_49466.nextFloat() * 0.1F, true
            );
      }

      if (this.field_21999 % 2 == 0 && this.field_21996 != null && this.field_21999 / 2 < this.field_21996.size()) {
         int var15 = this.field_21999 / 2;
         class_5734 var17 = this.field_21996.method_15764(var15);
         class_3917 var20 = class_3917.method_18129(var17.method_25950("Type"));
         boolean var21 = var17.method_25933("Trail");
         boolean var7 = var17.method_25933("Flicker");
         int[] var8 = var17.method_25922("Colors");
         int[] var9 = var17.method_25922("FadeColors");
         if (var8.length == 0) {
            var8 = new int[]{class_9077.field_46496.method_41793()};
         }

         switch (var20) {
            case field_19023:
            default:
               this.method_20900(0.25, 2, var8, var9, var21, var7);
               break;
            case field_19031:
               this.method_20900(0.5, 4, var8, var9, var21, var7);
               break;
            case field_19029:
               this.method_20903(
                  0.5,
                  new double[][]{
                     {0.0, 1.0},
                     {0.3455, 0.309},
                     {0.9511, 0.309},
                     {0.3795918367346939, -0.12653061224489795},
                     {0.6122448979591837, -0.8040816326530612},
                     {0.0, -0.35918367346938773}
                  },
                  var8,
                  var9,
                  var21,
                  var7,
                  false
               );
               break;
            case field_19025:
               this.method_20903(
                  0.5,
                  new double[][]{
                     {0.0, 0.2},
                     {0.2, 0.2},
                     {0.2, 0.6},
                     {0.6, 0.6},
                     {0.6, 0.2},
                     {0.2, 0.2},
                     {0.2, 0.0},
                     {0.4, 0.0},
                     {0.4, -0.6},
                     {0.2, -0.6},
                     {0.2, -0.4},
                     {0.0, -0.4}
                  },
                  var8,
                  var9,
                  var21,
                  var7,
                  true
               );
               break;
            case field_19027:
               this.method_20901(var8, var9, var21, var7);
         }

         int var10 = var8[0];
         float var11 = (float)((var10 & 0xFF0000) >> 16) / 255.0F;
         float var12 = (float)((var10 & 0xFF00) >> 8) / 255.0F;
         float var13 = (float)((var10 & 0xFF) >> 0) / 255.0F;
         class_9733 var14 = this.field_21998.method_43062(class_3090.field_15345, this.field_49462, this.field_49473, this.field_49465, 0.0, 0.0, 0.0);
         var14.method_44953(var11, var12, var13);
      }

      this.field_21999++;
      if (this.field_21999 > this.field_49476) {
         if (this.field_21997) {
            boolean var16 = this.method_20904();
            class_8461 var18 = var16 ? class_463.field_2265 : class_463.field_2507;
            this.field_49469
               .method_29527(
                  this.field_49462, this.field_49473, this.field_49465, var18, class_562.field_3325, 20.0F, 0.9F + this.field_49466.nextFloat() * 0.15F, true
               );
         }

         this.method_44948();
      }
   }

   private boolean method_20904() {
      MinecraftClient var3 = MinecraftClient.method_8510();
      return var3.field_9590.method_35949().method_41627().method_6203(this.field_49462, this.field_49473, this.field_49465) >= 256.0;
   }

   private void method_20902(
      double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16
   ) {
      class_5820 var19 = (class_5820)this.field_21998.method_43062(class_3090.field_15366, var1, var3, var5, var7, var9, var11);
      var19.method_26339(var15);
      var19.method_26340(var16);
      var19.method_44956(0.99F);
      int var20 = this.field_49466.nextInt(var13.length);
      var19.method_1081(var13[var20]);
      if (var14.length > 0) {
         var19.method_1082(class_9665.method_44676(var14, this.field_49466));
      }
   }

   private void method_20900(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      double var10 = this.field_49462;
      double var12 = this.field_49473;
      double var14 = this.field_49465;

      for (int var16 = -var3; var16 <= var3; var16++) {
         for (int var17 = -var3; var17 <= var3; var17++) {
            for (int var18 = -var3; var18 <= var3; var18++) {
               double var19 = (double)var17 + (this.field_49466.nextDouble() - this.field_49466.nextDouble()) * 0.5;
               double var21 = (double)var16 + (this.field_49466.nextDouble() - this.field_49466.nextDouble()) * 0.5;
               double var23 = (double)var18 + (this.field_49466.nextDouble() - this.field_49466.nextDouble()) * 0.5;
               double var25 = (double)class_9299.method_42842(var19 * var19 + var21 * var21 + var23 * var23) / var1 + this.field_49466.nextGaussian() * 0.05;
               this.method_20902(var10, var12, var14, var19 / var25, var21 / var25, var23 / var25, var4, var5, var6, var7);
               if (var16 != -var3 && var16 != var3 && var17 != -var3 && var17 != var3) {
                  var18 += var3 * 2 - 1;
               }
            }
         }
      }
   }

   private void method_20903(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var11 = var3[0][0];
      double var13 = var3[0][1];
      this.method_20902(this.field_49462, this.field_49473, this.field_49465, var11 * var1, var13 * var1, 0.0, var4, var5, var6, var7);
      float var15 = this.field_49466.nextFloat() * (float) Math.PI;
      double var16 = !var8 ? 0.34 : 0.034;

      for (int var18 = 0; var18 < 3; var18++) {
         double var19 = (double)var15 + (double)((float)var18 * (float) Math.PI) * var16;
         double var21 = var11;
         double var23 = var13;

         for (int var25 = 1; var25 < var3.length; var25++) {
            double var26 = var3[var25][0];
            double var28 = var3[var25][1];

            for (double var30 = 0.25; var30 <= 1.0; var30 += 0.25) {
               double var32 = class_9299.method_42794(var30, var21, var26) * var1;
               double var34 = class_9299.method_42794(var30, var23, var28) * var1;
               double var36 = var32 * Math.sin(var19);
               var32 *= Math.cos(var19);

               for (double var38 = -1.0; var38 <= 1.0; var38 += 2.0) {
                  this.method_20902(this.field_49462, this.field_49473, this.field_49465, var32 * var38, var34, var36 * var38, var4, var5, var6, var7);
               }
            }

            var21 = var26;
            var23 = var28;
         }
      }
   }

   private void method_20901(int[] var1, int[] var2, boolean var3, boolean var4) {
      double var7 = this.field_49466.nextGaussian() * 0.05;
      double var9 = this.field_49466.nextGaussian() * 0.05;

      for (int var11 = 0; var11 < 70; var11++) {
         double var12 = this.field_49481 * 0.5 + this.field_49466.nextGaussian() * 0.15 + var7;
         double var14 = this.field_49471 * 0.5 + this.field_49466.nextGaussian() * 0.15 + var9;
         double var16 = this.field_49486 * 0.5 + this.field_49466.nextDouble() * 0.5;
         this.method_20902(this.field_49462, this.field_49473, this.field_49465, var12, var16, var14, var1, var2, var3, var4);
      }
   }
}
