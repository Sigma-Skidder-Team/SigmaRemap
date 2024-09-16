package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Class8515 {
   private static String[] field38198;
   private Class7219 field38199 = null;
   private int field38200 = 0;
   private int field38201 = 0;
   private float field38202 = 0.0F;
   private float field38203 = 0.0F;
   private float field38204 = 0.0F;
   private int field38205 = 0;
   private int field38206 = 0;
   private int field38207 = 0;
   private float field38208 = 0.0F;
   private float field38209 = 0.0F;
   private float field38210 = 0.0F;
   private float field38211 = 0.0F;
   private float field38212 = 0.0F;

   public Class8515(Class7219 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.field38199 = var1;
      this.field38200 = var2;
      this.field38201 = var3;
      this.field38202 = var4;
      this.field38203 = var5;
      this.field38204 = var6;
      this.field38205 = var7;
      this.field38206 = var8;
      this.field38207 = var9;
      this.field38208 = var10;
      this.field38209 = (float)var2 / var1.field31028;
      this.field38210 = (float)var3 / var1.field31029;
      this.field38211 = (float)(var2 + var7) / var1.field31028;
      this.field38212 = (float)(var3 + var8) / var1.field31029;
   }

   public void method30159(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      float var11 = 0.0625F;
      var1.translate((double)(this.field38202 * var11), (double)(this.field38203 * var11), (double)(this.field38204 * var11));
      float var12 = this.field38209;
      float var13 = this.field38211;
      float var14 = this.field38210;
      float var15 = this.field38212;
      if (this.field38199.field31038) {
         var12 = this.field38211;
         var13 = this.field38209;
      }

      if (this.field38199.field31043) {
         var14 = this.field38212;
         var15 = this.field38210;
      }

      method30160(
         var1,
         var2,
         var12,
         var14,
         var13,
         var15,
         this.field38205,
         this.field38206,
         var11 * (float)this.field38207,
         this.field38199.field31028,
         this.field38199.field31029,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
      var1.translate((double)(-this.field38202 * var11), (double)(-this.field38203 * var11), (double)(-this.field38204 * var11));
   }

   public static void method30160(
      MatrixStack var0,
      Class5422 var1,
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
      float var21 = MathHelper.method37771(var19) * (var9 / 16.0F);
      float var22 = MathHelper.method37771(var20) * (var10 / 16.0F);
      float var23 = 0.0F;
      float var24 = 0.0F;
      float var25 = -1.0F;
      method30161(var0, var1, 0.0F, var22, 0.0F, var13, var14, var15, var16, var2, var5, var12, var11, var23, var24, var25);
      method30161(var0, var1, var21, var22, 0.0F, var13, var14, var15, var16, var4, var5, var12, var11, var23, var24, var25);
      method30161(var0, var1, var21, 0.0F, 0.0F, var13, var14, var15, var16, var4, var3, var12, var11, var23, var24, var25);
      method30161(var0, var1, 0.0F, 0.0F, 0.0F, var13, var14, var15, var16, var2, var3, var12, var11, var23, var24, var25);
      var23 = 0.0F;
      var24 = 0.0F;
      var25 = 1.0F;
      method30161(var0, var1, 0.0F, 0.0F, var8, var13, var14, var15, var16, var2, var3, var12, var11, var23, var24, var25);
      method30161(var0, var1, var21, 0.0F, var8, var13, var14, var15, var16, var4, var3, var12, var11, var23, var24, var25);
      method30161(var0, var1, var21, var22, var8, var13, var14, var15, var16, var4, var5, var12, var11, var23, var24, var25);
      method30161(var0, var1, 0.0F, var22, var8, var13, var14, var15, var16, var2, var5, var12, var11, var23, var24, var25);
      float var26 = 0.5F * var19 / (float)var6;
      float var27 = 0.5F * var20 / (float)var7;
      var23 = -1.0F;
      var24 = 0.0F;
      var25 = 0.0F;

      for (int var28 = 0; var28 < var6; var28++) {
         float var29 = (float)var28 / (float)var6;
         float var30 = var2 + var19 * var29 + var26;
         method30161(var0, var1, var29 * var21, var22, var8, var13, var14, var15, var16, var30, var5, var12, var11, var23, var24, var25);
         method30161(var0, var1, var29 * var21, var22, 0.0F, var13, var14, var15, var16, var30, var5, var12, var11, var23, var24, var25);
         method30161(var0, var1, var29 * var21, 0.0F, 0.0F, var13, var14, var15, var16, var30, var3, var12, var11, var23, var24, var25);
         method30161(var0, var1, var29 * var21, 0.0F, var8, var13, var14, var15, var16, var30, var3, var12, var11, var23, var24, var25);
      }

      var23 = 1.0F;
      var24 = 0.0F;
      var25 = 0.0F;

      for (int var47 = 0; var47 < var6; var47++) {
         float var50 = (float)var47 / (float)var6;
         float var53 = var2 + var19 * var50 + var26;
         float var31 = var50 + 1.0F / (float)var6;
         method30161(var0, var1, var31 * var21, 0.0F, var8, var13, var14, var15, var16, var53, var3, var12, var11, var23, var24, var25);
         method30161(var0, var1, var31 * var21, 0.0F, 0.0F, var13, var14, var15, var16, var53, var3, var12, var11, var23, var24, var25);
         method30161(var0, var1, var31 * var21, var22, 0.0F, var13, var14, var15, var16, var53, var5, var12, var11, var23, var24, var25);
         method30161(var0, var1, var31 * var21, var22, var8, var13, var14, var15, var16, var53, var5, var12, var11, var23, var24, var25);
      }

      var23 = 0.0F;
      var24 = 1.0F;
      var25 = 0.0F;

      for (int var48 = 0; var48 < var7; var48++) {
         float var51 = (float)var48 / (float)var7;
         float var54 = var3 + var20 * var51 + var27;
         float var56 = var51 + 1.0F / (float)var7;
         method30161(var0, var1, 0.0F, var56 * var22, var8, var13, var14, var15, var16, var2, var54, var12, var11, var23, var24, var25);
         method30161(var0, var1, var21, var56 * var22, var8, var13, var14, var15, var16, var4, var54, var12, var11, var23, var24, var25);
         method30161(var0, var1, var21, var56 * var22, 0.0F, var13, var14, var15, var16, var4, var54, var12, var11, var23, var24, var25);
         method30161(var0, var1, 0.0F, var56 * var22, 0.0F, var13, var14, var15, var16, var2, var54, var12, var11, var23, var24, var25);
      }

      var23 = 0.0F;
      var24 = -1.0F;
      var25 = 0.0F;

      for (int var49 = 0; var49 < var7; var49++) {
         float var52 = (float)var49 / (float)var7;
         float var55 = var3 + var20 * var52 + var27;
         method30161(var0, var1, var21, var52 * var22, var8, var13, var14, var15, var16, var4, var55, var12, var11, var23, var24, var25);
         method30161(var0, var1, 0.0F, var52 * var22, var8, var13, var14, var15, var16, var2, var55, var12, var11, var23, var24, var25);
         method30161(var0, var1, 0.0F, var52 * var22, 0.0F, var13, var14, var15, var16, var2, var55, var12, var11, var23, var24, var25);
         method30161(var0, var1, var21, var52 * var22, 0.0F, var13, var14, var15, var16, var4, var55, var12, var11, var23, var24, var25);
      }
   }

   public static void method30161(
      MatrixStack var0,
      Class5422 var1,
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
      Class8892 var18 = var0.getLast();
      Matrix4f var19 = var18.getMatrix();
      Class8967 var20 = var18.method32362();
      float var21 = var20.method32832(var13, var14, var15);
      float var22 = var20.method32833(var13, var14, var15);
      float var23 = var20.method32834(var13, var14, var15);
      float var24 = var19.method35517(var2, var3, var4, 1.0F);
      float var25 = var19.method35518(var2, var3, var4, 1.0F);
      float var26 = var19.method35519(var2, var3, var4, 1.0F);
      var1.method17032(var24, var25, var26, var5, var6, var7, var8, var9, var10, var11, var12, var21, var22, var23);
   }
}
