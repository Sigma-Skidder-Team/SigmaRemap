package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5012 extends class_4285<class_2045> {
   public class_5012(Codec<class_2045> var1) {
      super(var1);
   }

   public boolean method_23067(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_2045 var5) {
      var4 = new BlockPos(var4.getX(), var2.method_29816(), var4.method_12185());
      boolean var8 = var3.nextDouble() > 0.7;
      class_2522 var9 = var5.field_10356;
      double var10 = var3.nextDouble() * 2.0 * Math.PI;
      int var12 = 11 - var3.nextInt(5);
      int var13 = 3 + var3.nextInt(3);
      boolean var14 = var3.nextDouble() > 0.7;
      byte var15 = 11;
      int var16 = !var14 ? var3.nextInt(15) + 3 : var3.nextInt(6) + 6;
      if (!var14 && var3.nextDouble() > 0.9) {
         var16 += var3.nextInt(19) + 7;
      }

      int var17 = Math.min(var16 + var3.nextInt(11), 18);
      int var18 = Math.min(var16 + var3.nextInt(7) - var3.nextInt(5), 11);
      int var19 = !var14 ? 11 : var12;

      for (int var20 = -var19; var20 < var19; var20++) {
         for (int var21 = -var19; var21 < var19; var21++) {
            for (int var22 = 0; var22 < var16; var22++) {
               int var23 = !var14 ? this.method_23066(var3, var22, var16, var18) : this.method_23070(var22, var16, var18);
               if (var14 || var20 < var23) {
                  this.method_23072(var1, var3, var4, var16, var20, var22, var21, var23, var19, var14, var13, var10, var8, var9);
               }
            }
         }
      }

      this.method_23069(var1, var4, var18, var16, var14, var12);

      for (int var26 = -var19; var26 < var19; var26++) {
         for (int var28 = -var19; var28 < var19; var28++) {
            for (int var29 = -1; var29 > -var17; var29--) {
               int var30 = !var14 ? var19 : MathHelper.ceil((float)var19 * (1.0F - (float)Math.pow((double)var29, 2.0) / ((float)var17 * 8.0F)));
               int var24 = this.method_23061(var3, -var29, var17, var18);
               if (var26 < var24) {
                  this.method_23072(var1, var3, var4, var17, var26, var29, var28, var24, var30, var14, var13, var10, var8, var9);
               }
            }
         }
      }

      boolean var27 = !var14 ? var3.nextDouble() > 0.7 : var3.nextDouble() > 0.1;
      if (var27) {
         this.method_23064(var3, var1, var18, var16, var4, var14, var12, var10, var13);
      }

      return true;
   }

   private void method_23064(Random var1, class_9379 var2, int var3, int var4, BlockPos var5, boolean var6, int var7, double var8, int var10) {
      int var13 = !var1.nextBoolean() ? 1 : -1;
      int var14 = !var1.nextBoolean() ? 1 : -1;
      int var15 = var1.nextInt(Math.max(var3 / 2 - 2, 1));
      if (var1.nextBoolean()) {
         var15 = var3 / 2 + 1 - var1.nextInt(Math.max(var3 - var3 / 2 - 1, 1));
      }

      int var16 = var1.nextInt(Math.max(var3 / 2 - 2, 1));
      if (var1.nextBoolean()) {
         var16 = var3 / 2 + 1 - var1.nextInt(Math.max(var3 - var3 / 2 - 1, 1));
      }

      if (var6) {
         var15 = var16 = var1.nextInt(Math.max(var7 - 5, 1));
      }

      BlockPos var17 = new BlockPos(var13 * var15, 0, var14 * var16);
      double var18 = !var6 ? var1.nextDouble() * 2.0 * Math.PI : var8 + (Math.PI / 2);

      for (int var20 = 0; var20 < var4 - 3; var20++) {
         int var21 = this.method_23066(var1, var20, var4, var3);
         this.method_23060(var21, var20, var5, var2, false, var18, var17, var7, var10);
      }

      for (int var22 = -1; var22 > -var4 + var1.nextInt(5); var22--) {
         int var23 = this.method_23061(var1, -var22, var4, var3);
         this.method_23060(var23, var22, var5, var2, true, var18, var17, var7, var10);
      }
   }

   private void method_23060(int var1, int var2, BlockPos var3, class_9379 var4, boolean var5, double var6, BlockPos var8, int var9, int var10) {
      int var13 = var1 + 1 + var9 / 3;
      int var14 = Math.min(var1 - 3, 3) + var10 / 2 - 1;

      for (int var15 = -var13; var15 < var13; var15++) {
         for (int var16 = -var13; var16 < var13; var16++) {
            double var17 = this.method_23071(var15, var16, var8, var13, var14, var6);
            if (var17 < 0.0) {
               BlockPos var19 = var3.method_6104(var15, var2, var16);
               class_6414 var20 = var4.method_28262(var19).method_8360();
               if (this.method_23073(var20) || var20 == class_4783.field_23813) {
                  if (!var5) {
                     this.method_19906(var4, var19, class_4783.field_23184.method_29260());
                     this.method_23065(var4, var19);
                  } else {
                     this.method_19906(var4, var19, class_4783.field_23900.method_29260());
                  }
               }
            }
         }
      }
   }

   private void method_23065(class_9379 var1, BlockPos var2) {
      if (var1.method_28262(var2.method_6081()).method_8350(class_4783.field_23552)) {
         this.method_19906(var1, var2.method_6081(), class_4783.field_23184.method_29260());
      }
   }

   private void method_23072(
      class_9379 var1,
      Random var2,
      BlockPos var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      boolean var10,
      int var11,
      double var12,
      boolean var14,
      class_2522 var15
   ) {
      double var18 = !var10
         ? this.method_23068(var5, var7, BlockPos.field_7306, var8, var2)
         : this.method_23071(var5, var7, BlockPos.field_7306, var9, this.method_23074(var6, var4, var11), var12);
      if (var18 < 0.0) {
         BlockPos var20 = var3.method_6104(var5, var6, var7);
         double var21 = !var10 ? (double)(-6 - var2.nextInt(3)) : -0.5;
         if (var18 > var21 && var2.nextDouble() > 0.9) {
            return;
         }

         this.method_23063(var20, var1, var2, var4 - var6, var4, var10, var14, var15);
      }
   }

   private void method_23063(BlockPos var1, class_9379 var2, Random var3, int var4, int var5, boolean var6, boolean var7, class_2522 var8) {
      class_2522 var11 = var2.method_28262(var1);
      if (var11.method_8362() == class_5371.field_27403
         || var11.method_8350(class_4783.field_23813)
         || var11.method_8350(class_4783.field_23496)
         || var11.method_8350(class_4783.field_23900)) {
         boolean var12 = !var6 || var3.nextDouble() > 0.05;
         int var13 = !var6 ? 2 : 3;
         if (var7
            && !var11.method_8350(class_4783.field_23900)
            && (double)var4 <= (double)var3.nextInt(Math.max(1, var5 / var13)) + (double)var5 * 0.6
            && var12) {
            this.method_19906(var2, var1, class_4783.field_23813.method_29260());
         } else {
            this.method_19906(var2, var1, var8);
         }
      }
   }

   private int method_23074(int var1, int var2, int var3) {
      int var6 = var3;
      if (var1 > 0 && var2 - var1 <= 3) {
         var6 = var3 - (4 - (var2 - var1));
      }

      return var6;
   }

   private double method_23068(int var1, int var2, BlockPos var3, int var4, Random var5) {
      float var8 = 10.0F * MathHelper.clamp(var5.nextFloat(), 0.2F, 0.8F) / (float)var4;
      return (double)var8
         + Math.pow((double)(var1 - var3.getX()), 2.0)
         + Math.pow((double)(var2 - var3.method_12185()), 2.0)
         - Math.pow((double)var4, 2.0);
   }

   private double method_23071(int var1, int var2, BlockPos var3, int var4, int var5, double var6) {
      return Math.pow(((double)(var1 - var3.getX()) * Math.cos(var6) - (double)(var2 - var3.method_12185()) * Math.sin(var6)) / (double)var4, 2.0)
         + Math.pow(((double)(var1 - var3.getX()) * Math.sin(var6) + (double)(var2 - var3.method_12185()) * Math.cos(var6)) / (double)var5, 2.0)
         - 1.0;
   }

   private int method_23066(Random var1, int var2, int var3, int var4) {
      float var7 = 3.5F - var1.nextFloat();
      float var8 = (1.0F - (float)Math.pow((double)var2, 2.0) / ((float)var3 * var7)) * (float)var4;
      if (var3 > 15 + var1.nextInt(5)) {
         int var9 = var2 >= 3 + var1.nextInt(6) ? var2 : var2 / 2;
         var8 = (1.0F - (float)var9 / ((float)var3 * var7 * 0.4F)) * (float)var4;
      }

      return MathHelper.ceil(var8 / 2.0F);
   }

   private int method_23070(int var1, int var2, int var3) {
      float var6 = 1.0F;
      float var7 = (1.0F - (float)Math.pow((double)var1, 2.0) / ((float)var2 * 1.0F)) * (float)var3;
      return MathHelper.ceil(var7 / 2.0F);
   }

   private int method_23061(Random var1, int var2, int var3, int var4) {
      float var7 = 1.0F + var1.nextFloat() / 2.0F;
      float var8 = (1.0F - (float)var2 / ((float)var3 * var7)) * (float)var4;
      return MathHelper.ceil(var8 / 2.0F);
   }

   private boolean method_23073(class_6414 var1) {
      return var1 == class_4783.field_23829 || var1 == class_4783.field_23813 || var1 == class_4783.field_23437;
   }

   private boolean method_23062(class_6163 var1, BlockPos var2) {
      return var1.method_28262(var2.method_6100()).method_8362() == class_5371.field_27403;
   }

   private void method_23069(class_9379 var1, BlockPos var2, int var3, int var4, boolean var5, int var6) {
      int var9 = !var5 ? var3 / 2 : var6;

      for (int var10 = -var9; var10 <= var9; var10++) {
         for (int var11 = -var9; var11 <= var9; var11++) {
            for (int var12 = 0; var12 <= var4; var12++) {
               BlockPos var13 = var2.method_6104(var10, var12, var11);
               class_6414 var14 = var1.method_28262(var13).method_8360();
               if (this.method_23073(var14) || var14 == class_4783.field_23552) {
                  if (this.method_23062(var1, var13)) {
                     this.method_19906(var1, var13, class_4783.field_23184.method_29260());
                     this.method_19906(var1, var13.method_6081(), class_4783.field_23184.method_29260());
                  } else if (this.method_23073(var14)) {
                     class_6414[] var15 = new class_6414[]{
                        var1.method_28262(var13.method_6108()).method_8360(),
                        var1.method_28262(var13.method_6090()).method_8360(),
                        var1.method_28262(var13.method_6094()).method_8360(),
                        var1.method_28262(var13.method_6073()).method_8360()
                     };
                     int var16 = 0;

                     for (class_6414 var20 : var15) {
                        if (!this.method_23073(var20)) {
                           var16++;
                        }
                     }

                     if (var16 >= 3) {
                        this.method_19906(var1, var13, class_4783.field_23184.method_29260());
                     }
                  }
               }
            }
         }
      }
   }
}
