package mapped;

import java.util.BitSet;

public class Class9529 {
   private static String[] field44350;
   private final float[] field44351 = new float[4];
   private final int[] field44352 = new int[4];
   private Class2001 field44353 = new Class2001();

   public Class9529() {
      this((Class7551)null);
   }

   public Class9529(Class7551 var1) {
   }

   public void method36826() {
      int var3 = Class1699.field9258;
      this.field44352[0] = var3;
      this.field44352[1] = var3;
      this.field44352[2] = var3;
      this.field44352[3] = var3;
      this.field44351[0] = 1.0F;
      this.field44351[1] = 1.0F;
      this.field44351[2] = 1.0F;
      this.field44351[3] = 1.0F;
   }

   public void method36827(Class1663 var1, BlockState var2, BlockPos var3, Direction var4, float[] var5, BitSet var6, boolean var7) {
      BlockPos var10 = !var6.get(0) ? var3 : var3.method8349(var4);
      Class2208 var11 = Class2208.method8926(var4);
      Class2001 var12 = this.field44353;
      Class4049 var13 = Class7551.method24699();
      var12.method8386(var10, Class2208.method8928(var11)[0]);
      BlockState var14 = var1.getBlockState(var12);
      int var15 = Class4049.method12821(var14, var1, var12);
      float var16 = Class4049.method12820(var14, var1, var12);
      var12.method8386(var10, Class2208.method8928(var11)[1]);
      BlockState var17 = var1.getBlockState(var12);
      int var18 = Class4049.method12821(var17, var1, var12);
      float var19 = Class4049.method12820(var17, var1, var12);
      var12.method8386(var10, Class2208.method8928(var11)[2]);
      BlockState var20 = var1.getBlockState(var12);
      int var21 = Class4049.method12821(var20, var1, var12);
      float var22 = Class4049.method12820(var20, var1, var12);
      var12.method8386(var10, Class2208.method8928(var11)[3]);
      BlockState var23 = var1.getBlockState(var12);
      int var24 = Class4049.method12821(var23, var1, var12);
      float var25 = Class4049.method12820(var23, var1, var12);
      var12.method8387(var10, Class2208.method8928(var11)[0], var4);
      boolean var26 = var1.getBlockState(var12).method23387(var1, var12) == 0;
      var12.method8387(var10, Class2208.method8928(var11)[1], var4);
      boolean var27 = var1.getBlockState(var12).method23387(var1, var12) == 0;
      var12.method8387(var10, Class2208.method8928(var11)[2], var4);
      boolean var28 = var1.getBlockState(var12).method23387(var1, var12) == 0;
      var12.method8387(var10, Class2208.method8928(var11)[3], var4);
      boolean var29 = var1.getBlockState(var12).method23387(var1, var12) == 0;
      float var31;
      int var32;
      if (!var28 && !var26) {
         var31 = var16;
         var32 = var15;
      } else {
         var12.method8387(var10, Class2208.method8928(var11)[0], Class2208.method8928(var11)[2]);
         BlockState var30 = var1.getBlockState(var12);
         var31 = Class4049.method12820(var30, var1, var12);
         var32 = Class4049.method12821(var30, var1, var12);
      }

      float var34;
      int var66;
      if (!var29 && !var26) {
         var34 = var16;
         var66 = var15;
      } else {
         var12.method8387(var10, Class2208.method8928(var11)[0], Class2208.method8928(var11)[3]);
         BlockState var33 = var1.getBlockState(var12);
         var34 = Class4049.method12820(var33, var1, var12);
         var66 = Class4049.method12821(var33, var1, var12);
      }

      float var36;
      int var67;
      if (!var28 && !var27) {
         var36 = var16;
         var67 = var15;
      } else {
         var12.method8387(var10, Class2208.method8928(var11)[1], Class2208.method8928(var11)[2]);
         BlockState var35 = var1.getBlockState(var12);
         var36 = Class4049.method12820(var35, var1, var12);
         var67 = Class4049.method12821(var35, var1, var12);
      }

      float var38;
      int var68;
      if (!var29 && !var27) {
         var38 = var16;
         var68 = var15;
      } else {
         var12.method8387(var10, Class2208.method8928(var11)[1], Class2208.method8928(var11)[3]);
         BlockState var37 = var1.getBlockState(var12);
         var38 = Class4049.method12820(var37, var1, var12);
         var68 = Class4049.method12821(var37, var1, var12);
      }

      int var69 = Class4049.method12821(var2, var1, var3);
      var12.method8386(var3, var4);
      BlockState var39 = var1.getBlockState(var12);
      if (var6.get(0) || !var39.method23409(var1, var12)) {
         var69 = Class4049.method12821(var39, var1, var12);
      }

      float var40 = !var6.get(0) ? Class4049.method12820(var1.getBlockState(var3), var1, var3) : Class4049.method12820(var1.getBlockState(var10), var1, var10);
      Class1974 var41 = Class1974.method8256(var4);
      if (var6.get(1) && Class2208.method8929(var11)) {
         float var70 = (var25 + var16 + var34 + var40) * 0.25F;
         float var72 = (var22 + var16 + var31 + var40) * 0.25F;
         float var74 = (var22 + var19 + var36 + var40) * 0.25F;
         float var75 = (var25 + var19 + var38 + var40) * 0.25F;
         float var46 = var5[Class81.method256(Class2208.method8930(var11)[0])] * var5[Class81.method256(Class2208.method8930(var11)[1])];
         float var47 = var5[Class81.method256(Class2208.method8930(var11)[2])] * var5[Class81.method256(Class2208.method8930(var11)[3])];
         float var48 = var5[Class81.method256(Class2208.method8930(var11)[4])] * var5[Class81.method256(Class2208.method8930(var11)[5])];
         float var49 = var5[Class81.method256(Class2208.method8930(var11)[6])] * var5[Class81.method256(Class2208.method8930(var11)[7])];
         float var50 = var5[Class81.method256(Class2208.method8931(var11)[0])] * var5[Class81.method256(Class2208.method8931(var11)[1])];
         float var51 = var5[Class81.method256(Class2208.method8931(var11)[2])] * var5[Class81.method256(Class2208.method8931(var11)[3])];
         float var52 = var5[Class81.method256(Class2208.method8931(var11)[4])] * var5[Class81.method256(Class2208.method8931(var11)[5])];
         float var53 = var5[Class81.method256(Class2208.method8931(var11)[6])] * var5[Class81.method256(Class2208.method8931(var11)[7])];
         float var54 = var5[Class81.method256(Class2208.method8932(var11)[0])] * var5[Class81.method256(Class2208.method8932(var11)[1])];
         float var55 = var5[Class81.method256(Class2208.method8932(var11)[2])] * var5[Class81.method256(Class2208.method8932(var11)[3])];
         float var56 = var5[Class81.method256(Class2208.method8932(var11)[4])] * var5[Class81.method256(Class2208.method8932(var11)[5])];
         float var57 = var5[Class81.method256(Class2208.method8932(var11)[6])] * var5[Class81.method256(Class2208.method8932(var11)[7])];
         float var58 = var5[Class81.method256(Class2208.method8933(var11)[0])] * var5[Class81.method256(Class2208.method8933(var11)[1])];
         float var59 = var5[Class81.method256(Class2208.method8933(var11)[2])] * var5[Class81.method256(Class2208.method8933(var11)[3])];
         float var60 = var5[Class81.method256(Class2208.method8933(var11)[4])] * var5[Class81.method256(Class2208.method8933(var11)[5])];
         float var61 = var5[Class81.method256(Class2208.method8933(var11)[6])] * var5[Class81.method256(Class2208.method8933(var11)[7])];
         this.field44351[Class1974.method8258(var41)] = var70 * var46 + var72 * var47 + var74 * var48 + var75 * var49;
         this.field44351[Class1974.method8259(var41)] = var70 * var50 + var72 * var51 + var74 * var52 + var75 * var53;
         this.field44351[Class1974.method8260(var41)] = var70 * var54 + var72 * var55 + var74 * var56 + var75 * var57;
         this.field44351[Class1974.method8261(var41)] = var70 * var58 + var72 * var59 + var74 * var60 + var75 * var61;
         int var62 = this.method36828(var24, var15, var66, var69);
         int var63 = this.method36828(var21, var15, var32, var69);
         int var64 = this.method36828(var21, var18, var67, var69);
         int var65 = this.method36828(var24, var18, var68, var69);
         this.field44352[Class1974.method8258(var41)] = this.method36829(var62, var63, var64, var65, var46, var47, var48, var49);
         this.field44352[Class1974.method8259(var41)] = this.method36829(var62, var63, var64, var65, var50, var51, var52, var53);
         this.field44352[Class1974.method8260(var41)] = this.method36829(var62, var63, var64, var65, var54, var55, var56, var57);
         this.field44352[Class1974.method8261(var41)] = this.method36829(var62, var63, var64, var65, var58, var59, var60, var61);
      } else {
         float var42 = (var25 + var16 + var34 + var40) * 0.25F;
         float var43 = (var22 + var16 + var31 + var40) * 0.25F;
         float var44 = (var22 + var19 + var36 + var40) * 0.25F;
         float var45 = (var25 + var19 + var38 + var40) * 0.25F;
         this.field44352[Class1974.method8258(var41)] = this.method36828(var24, var15, var66, var69);
         this.field44352[Class1974.method8259(var41)] = this.method36828(var21, var15, var32, var69);
         this.field44352[Class1974.method8260(var41)] = this.method36828(var21, var18, var67, var69);
         this.field44352[Class1974.method8261(var41)] = this.method36828(var24, var18, var68, var69);
         this.field44351[Class1974.method8258(var41)] = var42;
         this.field44351[Class1974.method8259(var41)] = var43;
         this.field44351[Class1974.method8260(var41)] = var44;
         this.field44351[Class1974.method8261(var41)] = var45;
      }

      float var71 = var1.method6877(var4, var7);

      for (int var73 = 0; var73 < this.field44351.length; var73++) {
         this.field44351[var73] = this.field44351[var73] * var71;
      }
   }

   private int method36828(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         var1 = var4;
      }

      if (var2 == 0) {
         var2 = var4;
      }

      if (var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   private int method36829(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      int var11 = (int)(
            (float)(var1 >> 16 & 0xFF) * var5 + (float)(var2 >> 16 & 0xFF) * var6 + (float)(var3 >> 16 & 0xFF) * var7 + (float)(var4 >> 16 & 0xFF) * var8
         )
         & 0xFF;
      int var12 = (int)((float)(var1 & 0xFF) * var5 + (float)(var2 & 0xFF) * var6 + (float)(var3 & 0xFF) * var7 + (float)(var4 & 0xFF) * var8) & 0xFF;
      return var11 << 16 | var12;
   }

   // $VF: synthetic method
   public static float[] method36830(Class9529 var0) {
      return var0.field44351;
   }

   // $VF: synthetic method
   public static int[] method36831(Class9529 var0) {
      return var0.field44352;
   }
}
