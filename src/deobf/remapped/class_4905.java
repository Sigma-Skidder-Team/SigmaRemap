package remapped;

public class class_4905 {
   private static String[] field_25361;
   private class_1549 field_25358 = null;
   private int field_25359 = 0;
   private int field_25355 = 0;
   private float field_25360 = 0.0F;
   private float field_25365 = 0.0F;
   private float field_25366 = 0.0F;
   private int field_25367 = 0;
   private int field_25368 = 0;
   private int field_25363 = 0;
   private float field_25357 = 0.0F;
   private float field_25364 = 0.0F;
   private float field_25362 = 0.0F;
   private float field_25356 = 0.0F;
   private float field_25369 = 0.0F;

   public class_4905(class_1549 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.field_25358 = var1;
      this.field_25359 = var2;
      this.field_25355 = var3;
      this.field_25360 = var4;
      this.field_25365 = var5;
      this.field_25366 = var6;
      this.field_25367 = var7;
      this.field_25368 = var8;
      this.field_25363 = var9;
      this.field_25357 = var10;
      this.field_25364 = (float)var2 / var1.field_8198;
      this.field_25362 = (float)var3 / var1.field_8202;
      this.field_25356 = (float)(var2 + var7) / var1.field_8198;
      this.field_25369 = (float)(var3 + var8) / var1.field_8202;
   }

   public void method_22453(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      float var11 = 0.0625F;
      var1.method_36065((double)(this.field_25360 * var11), (double)(this.field_25365 * var11), (double)(this.field_25366 * var11));
      float var12 = this.field_25364;
      float var13 = this.field_25356;
      float var14 = this.field_25362;
      float var15 = this.field_25369;
      if (this.field_25358.field_8197) {
         var12 = this.field_25356;
         var13 = this.field_25364;
      }

      if (this.field_25358.field_8204) {
         var14 = this.field_25369;
         var15 = this.field_25362;
      }

      method_22454(
         var1,
         var2,
         var12,
         var14,
         var13,
         var15,
         this.field_25367,
         this.field_25368,
         var11 * (float)this.field_25363,
         this.field_25358.field_8198,
         this.field_25358.field_8202,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
      var1.method_36065((double)(-this.field_25360 * var11), (double)(-this.field_25365 * var11), (double)(-this.field_25366 * var11));
   }

   public static void method_22454(
      class_7966 var0,
      class_7907 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      if (var8 < 6.25E-4F) {
         var8 = 6.25E-4F;
      }

      float var19 = var4 - var2;
      float var20 = var5 - var3;
      float var21 = class_9299.method_42804(var19) * (var9 / 16.0F);
      float var22 = class_9299.method_42804(var20) * (var10 / 16.0F);
      float var23 = 0.0F;
      float var24 = 0.0F;
      float var25 = -1.0F;
      method_22455(var0, var1, 0.0F, var22, 0.0F, var13, var14, var15, var16, var2, var5, var12, var11, var23, var24, var25);
      method_22455(var0, var1, var21, var22, 0.0F, var13, var14, var15, var16, var4, var5, var12, var11, var23, var24, var25);
      method_22455(var0, var1, var21, 0.0F, 0.0F, var13, var14, var15, var16, var4, var3, var12, var11, var23, var24, var25);
      method_22455(var0, var1, 0.0F, 0.0F, 0.0F, var13, var14, var15, var16, var2, var3, var12, var11, var23, var24, var25);
      var23 = 0.0F;
      var24 = 0.0F;
      var25 = 1.0F;
      method_22455(var0, var1, 0.0F, 0.0F, var8, var13, var14, var15, var16, var2, var3, var12, var11, var23, var24, var25);
      method_22455(var0, var1, var21, 0.0F, var8, var13, var14, var15, var16, var4, var3, var12, var11, var23, var24, var25);
      method_22455(var0, var1, var21, var22, var8, var13, var14, var15, var16, var4, var5, var12, var11, var23, var24, var25);
      method_22455(var0, var1, 0.0F, var22, var8, var13, var14, var15, var16, var2, var5, var12, var11, var23, var24, var25);
      float var26 = 0.5F * var19 / (float)var6;
      float var27 = 0.5F * var20 / (float)var7;
      var23 = -1.0F;
      var24 = 0.0F;
      var25 = 0.0F;

      for (int var28 = 0; var28 < var6; var28++) {
         float var29 = (float)var28 / (float)var6;
         float var30 = var2 + var19 * var29 + var26;
         method_22455(var0, var1, var29 * var21, var22, var8, var13, var14, var15, var16, var30, var5, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var29 * var21, var22, 0.0F, var13, var14, var15, var16, var30, var5, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var29 * var21, 0.0F, 0.0F, var13, var14, var15, var16, var30, var3, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var29 * var21, 0.0F, var8, var13, var14, var15, var16, var30, var3, var12, var11, var23, var24, var25);
      }

      var23 = 1.0F;
      var24 = 0.0F;
      var25 = 0.0F;

      for (int var47 = 0; var47 < var6; var47++) {
         float var50 = (float)var47 / (float)var6;
         float var53 = var2 + var19 * var50 + var26;
         float var31 = var50 + 1.0F / (float)var6;
         method_22455(var0, var1, var31 * var21, 0.0F, var8, var13, var14, var15, var16, var53, var3, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var31 * var21, 0.0F, 0.0F, var13, var14, var15, var16, var53, var3, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var31 * var21, var22, 0.0F, var13, var14, var15, var16, var53, var5, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var31 * var21, var22, var8, var13, var14, var15, var16, var53, var5, var12, var11, var23, var24, var25);
      }

      var23 = 0.0F;
      var24 = 1.0F;
      var25 = 0.0F;

      for (int var48 = 0; var48 < var7; var48++) {
         float var51 = (float)var48 / (float)var7;
         float var54 = var3 + var20 * var51 + var27;
         float var56 = var51 + 1.0F / (float)var7;
         method_22455(var0, var1, 0.0F, var56 * var22, var8, var13, var14, var15, var16, var2, var54, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var21, var56 * var22, var8, var13, var14, var15, var16, var4, var54, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var21, var56 * var22, 0.0F, var13, var14, var15, var16, var4, var54, var12, var11, var23, var24, var25);
         method_22455(var0, var1, 0.0F, var56 * var22, 0.0F, var13, var14, var15, var16, var2, var54, var12, var11, var23, var24, var25);
      }

      var23 = 0.0F;
      var24 = -1.0F;
      var25 = 0.0F;

      for (int var49 = 0; var49 < var7; var49++) {
         float var52 = (float)var49 / (float)var7;
         float var55 = var3 + var20 * var52 + var27;
         method_22455(var0, var1, var21, var52 * var22, var8, var13, var14, var15, var16, var4, var55, var12, var11, var23, var24, var25);
         method_22455(var0, var1, 0.0F, var52 * var22, var8, var13, var14, var15, var16, var2, var55, var12, var11, var23, var24, var25);
         method_22455(var0, var1, 0.0F, var52 * var22, 0.0F, var13, var14, var15, var16, var2, var55, var12, var11, var23, var24, var25);
         method_22455(var0, var1, var21, var52 * var22, 0.0F, var13, var14, var15, var16, var4, var55, var12, var11, var23, var24, var25);
      }
   }

   public static void method_22455(
      class_7966 var0,
      class_7907 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15
   ) {
      class_6279 var18 = var0.method_36058();
      class_8107 var19 = var18.method_28620();
      class_6555 var20 = var18.method_28618();
      float var21 = var20.method_29896(var13, var14, var15);
      float var22 = var20.method_29897(var13, var14, var15);
      float var23 = var20.method_29887(var13, var14, var15);
      float var24 = var19.method_36805(var2, var3, var4, 1.0F);
      float var25 = var19.method_36812(var2, var3, var4, 1.0F);
      float var26 = var19.method_36815(var2, var3, var4, 1.0F);
      var1.method_35744(var24, var25, var26, var5, var6, var7, var8, var9, var10, var11, var12, var21, var22, var23);
   }
}
