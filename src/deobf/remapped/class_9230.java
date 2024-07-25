package remapped;

public class class_9230 {
   private static String[] field_47185;
   private final class_1900[] field_47178;
   public final float field_47182;
   public final float field_47180;
   public final float field_47183;
   public final float field_47181;
   public final float field_47184;
   public final float field_47179;

   public class_9230(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      float var13,
      float var14
   ) {
      this.field_47182 = var3;
      this.field_47180 = var4;
      this.field_47183 = var5;
      this.field_47181 = var3 + var6;
      this.field_47184 = var4 + var7;
      this.field_47179 = var5 + var8;
      this.field_47178 = new class_1900[6];
      float var17 = var3 + var6;
      float var18 = var4 + var7;
      float var19 = var5 + var8;
      var3 -= var9;
      var4 -= var10;
      var5 -= var11;
      var17 += var9;
      var18 += var10;
      var19 += var11;
      if (var12) {
         float var20 = var17;
         var17 = var3;
         var3 = var20;
      }

      class_3802 var43 = new class_3802(var3, var4, var5, 0.0F, 0.0F);
      class_3802 var21 = new class_3802(var17, var4, var5, 0.0F, 8.0F);
      class_3802 var22 = new class_3802(var17, var18, var5, 8.0F, 8.0F);
      class_3802 var23 = new class_3802(var3, var18, var5, 8.0F, 0.0F);
      class_3802 var24 = new class_3802(var3, var4, var19, 0.0F, 0.0F);
      class_3802 var25 = new class_3802(var17, var4, var19, 0.0F, 8.0F);
      class_3802 var26 = new class_3802(var17, var18, var19, 8.0F, 8.0F);
      class_3802 var27 = new class_3802(var3, var18, var19, 8.0F, 0.0F);
      float var28 = (float)var1;
      float var29 = (float)var1 + var8;
      float var30 = (float)var1 + var8 + var6;
      float var31 = (float)var1 + var8 + var6 + var6;
      float var32 = (float)var1 + var8 + var6 + var8;
      float var33 = (float)var1 + var8 + var6 + var8 + var6;
      float var34 = (float)var2;
      float var35 = (float)var2 + var8;
      float var36 = (float)var2 + var8 + var7;
      this.field_47178[2] = new class_1900(new class_3802[]{var25, var24, var43, var21}, var29, var34, var30, var35, var13, var14, var12, class_240.field_802);
      this.field_47178[3] = new class_1900(new class_3802[]{var22, var23, var27, var26}, var30, var35, var31, var34, var13, var14, var12, class_240.field_817);
      this.field_47178[1] = new class_1900(new class_3802[]{var43, var24, var27, var23}, var28, var35, var29, var36, var13, var14, var12, class_240.field_809);
      this.field_47178[4] = new class_1900(new class_3802[]{var21, var43, var23, var22}, var29, var35, var30, var36, var13, var14, var12, class_240.field_818);
      this.field_47178[0] = new class_1900(new class_3802[]{var25, var21, var22, var26}, var30, var35, var32, var36, var13, var14, var12, class_240.field_804);
      this.field_47178[5] = new class_1900(new class_3802[]{var24, var25, var26, var27}, var32, var35, var33, var36, var13, var14, var12, class_240.field_800);
   }

   public class_9230(
      int[][] var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      boolean var11,
      float var12,
      float var13
   ) {
      this.field_47182 = var2;
      this.field_47180 = var3;
      this.field_47183 = var4;
      this.field_47181 = var2 + var5;
      this.field_47184 = var3 + var6;
      this.field_47179 = var4 + var7;
      this.field_47178 = new class_1900[6];
      float var16 = var2 + var5;
      float var17 = var3 + var6;
      float var18 = var4 + var7;
      var2 -= var8;
      var3 -= var9;
      var4 -= var10;
      var16 += var8;
      var17 += var9;
      var18 += var10;
      if (var11) {
         float var19 = var16;
         var16 = var2;
         var2 = var19;
      }

      class_3802 var33 = new class_3802(var2, var3, var4, 0.0F, 0.0F);
      class_3802 var20 = new class_3802(var16, var3, var4, 0.0F, 8.0F);
      class_3802 var21 = new class_3802(var16, var17, var4, 8.0F, 8.0F);
      class_3802 var22 = new class_3802(var2, var17, var4, 8.0F, 0.0F);
      class_3802 var23 = new class_3802(var2, var3, var18, 0.0F, 0.0F);
      class_3802 var24 = new class_3802(var16, var3, var18, 0.0F, 8.0F);
      class_3802 var25 = new class_3802(var16, var17, var18, 8.0F, 8.0F);
      class_3802 var26 = new class_3802(var2, var17, var18, 8.0F, 0.0F);
      this.field_47178[2] = this.method_42582(new class_3802[]{var24, var23, var33, var20}, var1[1], true, var12, var13, var11, class_240.field_802);
      this.field_47178[3] = this.method_42582(new class_3802[]{var21, var22, var26, var25}, var1[0], true, var12, var13, var11, class_240.field_817);
      this.field_47178[1] = this.method_42582(new class_3802[]{var33, var23, var26, var22}, var1[5], false, var12, var13, var11, class_240.field_809);
      this.field_47178[4] = this.method_42582(new class_3802[]{var20, var33, var22, var21}, var1[2], false, var12, var13, var11, class_240.field_818);
      this.field_47178[0] = this.method_42582(new class_3802[]{var24, var20, var21, var25}, var1[4], false, var12, var13, var11, class_240.field_804);
      this.field_47178[5] = this.method_42582(new class_3802[]{var23, var24, var25, var26}, var1[3], false, var12, var13, var11, class_240.field_800);
   }

   private class_1900 method_42582(class_3802[] var1, int[] var2, boolean var3, float var4, float var5, boolean var6, class_240 var7) {
      if (var2 != null) {
         return !var3
            ? new class_1900(var1, (float)var2[0], (float)var2[1], (float)var2[2], (float)var2[3], var4, var5, var6, var7)
            : new class_1900(var1, (float)var2[2], (float)var2[3], (float)var2[0], (float)var2[1], var4, var5, var6, var7);
      } else {
         return null;
      }
   }
}
