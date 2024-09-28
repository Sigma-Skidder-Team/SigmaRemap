package mapped;

import net.minecraft.util.Direction;

public class Class9661 {
   private static String[] field45148;
   private final Class7394[] field45149;
   public final float field45150;
   public final float field45151;
   public final float field45152;
   public final float field45153;
   public final float field45154;
   public final float field45155;

   public Class9661(
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
      this.field45150 = var3;
      this.field45151 = var4;
      this.field45152 = var5;
      this.field45153 = var3 + var6;
      this.field45154 = var4 + var7;
      this.field45155 = var5 + var8;
      this.field45149 = new Class7394[6];
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

      Class8161 var43 = new Class8161(var3, var4, var5, 0.0F, 0.0F);
      Class8161 var21 = new Class8161(var17, var4, var5, 0.0F, 8.0F);
      Class8161 var22 = new Class8161(var17, var18, var5, 8.0F, 8.0F);
      Class8161 var23 = new Class8161(var3, var18, var5, 8.0F, 0.0F);
      Class8161 var24 = new Class8161(var3, var4, var19, 0.0F, 0.0F);
      Class8161 var25 = new Class8161(var17, var4, var19, 0.0F, 8.0F);
      Class8161 var26 = new Class8161(var17, var18, var19, 8.0F, 8.0F);
      Class8161 var27 = new Class8161(var3, var18, var19, 8.0F, 0.0F);
      float var28 = (float)var1;
      float var29 = (float)var1 + var8;
      float var30 = (float)var1 + var8 + var6;
      float var31 = (float)var1 + var8 + var6 + var6;
      float var32 = (float)var1 + var8 + var6 + var8;
      float var33 = (float)var1 + var8 + var6 + var8 + var6;
      float var34 = (float)var2;
      float var35 = (float)var2 + var8;
      float var36 = (float)var2 + var8 + var7;
      this.field45149[2] = new Class7394(new Class8161[]{var25, var24, var43, var21}, var29, var34, var30, var35, var13, var14, var12, Direction.DOWN);
      this.field45149[3] = new Class7394(new Class8161[]{var22, var23, var27, var26}, var30, var35, var31, var34, var13, var14, var12, Direction.UP);
      this.field45149[1] = new Class7394(new Class8161[]{var43, var24, var27, var23}, var28, var35, var29, var36, var13, var14, var12, Direction.WEST);
      this.field45149[4] = new Class7394(new Class8161[]{var21, var43, var23, var22}, var29, var35, var30, var36, var13, var14, var12, Direction.NORTH);
      this.field45149[0] = new Class7394(new Class8161[]{var25, var21, var22, var26}, var30, var35, var32, var36, var13, var14, var12, Direction.EAST);
      this.field45149[5] = new Class7394(new Class8161[]{var24, var25, var26, var27}, var32, var35, var33, var36, var13, var14, var12, Direction.SOUTH);
   }

   public Class9661(
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
      this.field45150 = var2;
      this.field45151 = var3;
      this.field45152 = var4;
      this.field45153 = var2 + var5;
      this.field45154 = var3 + var6;
      this.field45155 = var4 + var7;
      this.field45149 = new Class7394[6];
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

      Class8161 var33 = new Class8161(var2, var3, var4, 0.0F, 0.0F);
      Class8161 var20 = new Class8161(var16, var3, var4, 0.0F, 8.0F);
      Class8161 var21 = new Class8161(var16, var17, var4, 8.0F, 8.0F);
      Class8161 var22 = new Class8161(var2, var17, var4, 8.0F, 0.0F);
      Class8161 var23 = new Class8161(var2, var3, var18, 0.0F, 0.0F);
      Class8161 var24 = new Class8161(var16, var3, var18, 0.0F, 8.0F);
      Class8161 var25 = new Class8161(var16, var17, var18, 8.0F, 8.0F);
      Class8161 var26 = new Class8161(var2, var17, var18, 8.0F, 0.0F);
      this.field45149[2] = this.method37712(new Class8161[]{var24, var23, var33, var20}, var1[1], true, var12, var13, var11, Direction.DOWN);
      this.field45149[3] = this.method37712(new Class8161[]{var21, var22, var26, var25}, var1[0], true, var12, var13, var11, Direction.UP);
      this.field45149[1] = this.method37712(new Class8161[]{var33, var23, var26, var22}, var1[5], false, var12, var13, var11, Direction.WEST);
      this.field45149[4] = this.method37712(new Class8161[]{var20, var33, var22, var21}, var1[2], false, var12, var13, var11, Direction.NORTH);
      this.field45149[0] = this.method37712(new Class8161[]{var24, var20, var21, var25}, var1[4], false, var12, var13, var11, Direction.EAST);
      this.field45149[5] = this.method37712(new Class8161[]{var23, var24, var25, var26}, var1[3], false, var12, var13, var11, Direction.SOUTH);
   }

   private Class7394 method37712(Class8161[] var1, int[] var2, boolean var3, float var4, float var5, boolean var6, Direction var7) {
      if (var2 != null) {
         return !var3
            ? new Class7394(var1, (float)var2[0], (float)var2[1], (float)var2[2], (float)var2[3], var4, var5, var6, var7)
            : new Class7394(var1, (float)var2[2], (float)var2[3], (float)var2[0], (float)var2[1], var4, var5, var6, var7);
      } else {
         return null;
      }
   }

   // $VF: synthetic method
   public static Class7394[] method37713(Class9661 var0) {
      return var0.field45149;
   }
}
