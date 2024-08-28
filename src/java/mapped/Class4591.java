package mapped;

public class Class4591 extends Class4588 {
   private int field22073;
   private final Class302 field22074;
   private Class41 field22075;
   private boolean field22076;

   public Class4591(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12, Class302 var14, Class39 var15) {
      super(var1, var2, var4, var6);
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.field22074 = var14;
      this.field22056 = 8;
      if (var15 != null) {
         this.field22075 = var15.method131("Explosions", 10);
         if (!this.field22075.isEmpty()) {
            this.field22056 = this.field22075.size() * 2 - 1;

            for (int var18 = 0; var18 < this.field22075.size(); var18++) {
               Class39 var19 = this.field22075.method153(var18);
               if (var19.method132("Flicker")) {
                  this.field22076 = true;
                  this.field22056 += 15;
                  break;
               }
            }
         } else {
            this.field22075 = null;
         }
      }
   }

   @Override
   public void method14500() {
      if (this.field22073 == 0 && this.field22075 != null) {
         boolean var3 = this.method14527();
         boolean var4 = false;
         if (this.field22075.size() >= 3) {
            var4 = true;
         } else {
            for (int var5 = 0; var5 < this.field22075.size(); var5++) {
               Class39 var6 = this.field22075.method153(var5);
               if (Class2119.method8802(var6.method120("Type")) == Class2119.field13808) {
                  var4 = true;
                  break;
               }
            }
         }

         Class9455 var19;
         if (var4) {
            var19 = var3 ? Class6067.field26576 : Class6067.field26575;
         } else {
            var19 = var3 ? Class6067.field26574 : Class6067.field26573;
         }

         this.field22037
            .method6745(this.field22041, this.field22042, this.field22043, var19, Class2266.field14736, 20.0F, 0.95F + this.field22054.nextFloat() * 0.1F, true);
      }

      if (this.field22073 % 2 == 0 && this.field22075 != null && this.field22073 / 2 < this.field22075.size()) {
         int var15 = this.field22073 / 2;
         Class39 var17 = this.field22075.method153(var15);
         Class2119 var20 = Class2119.method8802(var17.method120("Type"));
         boolean var21 = var17.method132("Trail");
         boolean var7 = var17.method132("Flicker");
         int[] var8 = var17.method128("Colors");
         int[] var9 = var17.method128("FadeColors");
         if (var8.length == 0) {
            var8 = new int[]{Class112.field401.method313()};
         }

         switch (Class7868.field33682[var20.ordinal()]) {
            case 1:
            default:
               this.method14529(0.25, 2, var8, var9, var21, var7);
               break;
            case 2:
               this.method14529(0.5, 4, var8, var9, var21, var7);
               break;
            case 3:
               this.method14530(
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
            case 4:
               this.method14530(
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
            case 5:
               this.method14531(var8, var9, var21, var7);
         }

         int var10 = var8[0];
         float var11 = (float)((var10 & 0xFF0000) >> 16) / 255.0F;
         float var12 = (float)((var10 & 0xFF00) >> 8) / 255.0F;
         float var13 = (float)((var10 & 0xFF) >> 0) / 255.0F;
         Class4587 var14 = this.field22074.method1197(Class7940.field34077, this.field22041, this.field22042, this.field22043, 0.0, 0.0, 0.0);
         var14.method14514(var11, var12, var13);
      }

      this.field22073++;
      if (this.field22073 > this.field22056) {
         if (this.field22076) {
            boolean var16 = this.method14527();
            Class9455 var18 = var16 ? Class6067.field26580 : Class6067.field26579;
            this.field22037
               .method6745(
                  this.field22041, this.field22042, this.field22043, var18, Class2266.field14736, 20.0F, 0.9F + this.field22054.nextFloat() * 0.15F, true
               );
         }

         this.method14518();
      }
   }

   private boolean method14527() {
      Minecraft var3 = Minecraft.getInstance();
      return var3.gameRenderer.getActiveRenderInfo().method37504().method11343(this.field22041, this.field22042, this.field22043) >= 256.0;
   }

   private void method14528(
      double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16
   ) {
      Class4603 var19 = (Class4603)this.field22074.method1197(Class7940.field34072, var1, var3, var5, var7, var9, var11);
      var19.method14538(var15);
      var19.method14539(var16);
      var19.method14515(0.99F);
      int var20 = this.field22054.nextInt(var13.length);
      var19.method14535(var13[var20]);
      if (var14.length > 0) {
         var19.method14536(Util.method38519(var14, this.field22054));
      }
   }

   private void method14529(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      double var10 = this.field22041;
      double var12 = this.field22042;
      double var14 = this.field22043;

      for (int var16 = -var3; var16 <= var3; var16++) {
         for (int var17 = -var3; var17 <= var3; var17++) {
            for (int var18 = -var3; var18 <= var3; var18++) {
               double var19 = (double)var17 + (this.field22054.nextDouble() - this.field22054.nextDouble()) * 0.5;
               double var21 = (double)var16 + (this.field22054.nextDouble() - this.field22054.nextDouble()) * 0.5;
               double var23 = (double)var18 + (this.field22054.nextDouble() - this.field22054.nextDouble()) * 0.5;
               double var25 = (double) MathHelper.method37766(var19 * var19 + var21 * var21 + var23 * var23) / var1 + this.field22054.nextGaussian() * 0.05;
               this.method14528(var10, var12, var14, var19 / var25, var21 / var25, var23 / var25, var4, var5, var6, var7);
               if (var16 != -var3 && var16 != var3 && var17 != -var3 && var17 != var3) {
                  var18 += var3 * 2 - 1;
               }
            }
         }
      }
   }

   private void method14530(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var11 = var3[0][0];
      double var13 = var3[0][1];
      this.method14528(this.field22041, this.field22042, this.field22043, var11 * var1, var13 * var1, 0.0, var4, var5, var6, var7);
      float var15 = this.field22054.nextFloat() * (float) Math.PI;
      double var16 = !var8 ? 0.34 : 0.034;

      for (int var18 = 0; var18 < 3; var18++) {
         double var19 = (double)var15 + (double)((float)var18 * (float) Math.PI) * var16;
         double var21 = var11;
         double var23 = var13;

         for (int var25 = 1; var25 < var3.length; var25++) {
            double var26 = var3[var25][0];
            double var28 = var3[var25][1];

            for (double var30 = 0.25; var30 <= 1.0; var30 += 0.25) {
               double var32 = MathHelper.method37822(var30, var21, var26) * var1;
               double var34 = MathHelper.method37822(var30, var23, var28) * var1;
               double var36 = var32 * Math.sin(var19);
               var32 *= Math.cos(var19);

               for (double var38 = -1.0; var38 <= 1.0; var38 += 2.0) {
                  this.method14528(this.field22041, this.field22042, this.field22043, var32 * var38, var34, var36 * var38, var4, var5, var6, var7);
               }
            }

            var21 = var26;
            var23 = var28;
         }
      }
   }

   private void method14531(int[] var1, int[] var2, boolean var3, boolean var4) {
      double var7 = this.field22054.nextGaussian() * 0.05;
      double var9 = this.field22054.nextGaussian() * 0.05;

      for (int var11 = 0; var11 < 70; var11++) {
         double var12 = this.field22044 * 0.5 + this.field22054.nextGaussian() * 0.15 + var7;
         double var14 = this.field22046 * 0.5 + this.field22054.nextGaussian() * 0.15 + var9;
         double var16 = this.field22045 * 0.5 + this.field22054.nextDouble() * 0.5;
         this.method14528(this.field22041, this.field22042, this.field22043, var12, var16, var14, var1, var2, var3, var4);
      }
   }
}
