package remapped;

import java.util.BitSet;

public class class_8742 {
   private static String[] field_44769;
   private final float[] field_44771 = new float[4];
   private final int[] field_44770 = new int[4];
   private class_523 field_44772 = new class_523();

   public class_8742() {
      this((class_2174)null);
   }

   public class_8742(class_2174 var1) {
   }

   public void method_40137() {
      int var3 = class_5778.field_29187;
      this.field_44770[0] = var3;
      this.field_44770[1] = var3;
      this.field_44770[2] = var3;
      this.field_44770[3] = var3;
      this.field_44771[0] = 1.0F;
      this.field_44771[1] = 1.0F;
      this.field_44771[2] = 1.0F;
      this.field_44771[3] = 1.0F;
   }

   public void method_40134(class_5561 var1, class_2522 var2, class_1331 var3, Direction var4, float[] var5, BitSet var6, boolean var7) {
      class_1331 var10 = !var6.get(0) ? var3 : var3.method_6098(var4);
      class_9356 var11 = class_9356.method_43210(var4);
      class_523 var12 = this.field_44772;
      class_109 var13 = class_2174.method_10098();
      var12.method_2549(var10, class_9356.method_43217(var11)[0]);
      class_2522 var14 = var1.method_28262(var12);
      int var15 = class_109.method_335(var14, var1, var12);
      float var16 = class_109.method_336(var14, var1, var12);
      var12.method_2549(var10, class_9356.method_43217(var11)[1]);
      class_2522 var17 = var1.method_28262(var12);
      int var18 = class_109.method_335(var17, var1, var12);
      float var19 = class_109.method_336(var17, var1, var12);
      var12.method_2549(var10, class_9356.method_43217(var11)[2]);
      class_2522 var20 = var1.method_28262(var12);
      int var21 = class_109.method_335(var20, var1, var12);
      float var22 = class_109.method_336(var20, var1, var12);
      var12.method_2549(var10, class_9356.method_43217(var11)[3]);
      class_2522 var23 = var1.method_28262(var12);
      int var24 = class_109.method_335(var23, var1, var12);
      float var25 = class_109.method_336(var23, var1, var12);
      var12.method_2550(var10, class_9356.method_43217(var11)[0], var4);
      boolean var26 = var1.method_28262(var12).method_8320(var1, var12) == 0;
      var12.method_2550(var10, class_9356.method_43217(var11)[1], var4);
      boolean var27 = var1.method_28262(var12).method_8320(var1, var12) == 0;
      var12.method_2550(var10, class_9356.method_43217(var11)[2], var4);
      boolean var28 = var1.method_28262(var12).method_8320(var1, var12) == 0;
      var12.method_2550(var10, class_9356.method_43217(var11)[3], var4);
      boolean var29 = var1.method_28262(var12).method_8320(var1, var12) == 0;
      float var31;
      int var32;
      if (!var28 && !var26) {
         var31 = var16;
         var32 = var15;
      } else {
         var12.method_2550(var10, class_9356.method_43217(var11)[0], class_9356.method_43217(var11)[2]);
         class_2522 var30 = var1.method_28262(var12);
         var31 = class_109.method_336(var30, var1, var12);
         var32 = class_109.method_335(var30, var1, var12);
      }

      float var34;
      int var66;
      if (!var29 && !var26) {
         var34 = var16;
         var66 = var15;
      } else {
         var12.method_2550(var10, class_9356.method_43217(var11)[0], class_9356.method_43217(var11)[3]);
         class_2522 var33 = var1.method_28262(var12);
         var34 = class_109.method_336(var33, var1, var12);
         var66 = class_109.method_335(var33, var1, var12);
      }

      float var36;
      int var67;
      if (!var28 && !var27) {
         var36 = var16;
         var67 = var15;
      } else {
         var12.method_2550(var10, class_9356.method_43217(var11)[1], class_9356.method_43217(var11)[2]);
         class_2522 var35 = var1.method_28262(var12);
         var36 = class_109.method_336(var35, var1, var12);
         var67 = class_109.method_335(var35, var1, var12);
      }

      float var38;
      int var68;
      if (!var29 && !var27) {
         var38 = var16;
         var68 = var15;
      } else {
         var12.method_2550(var10, class_9356.method_43217(var11)[1], class_9356.method_43217(var11)[3]);
         class_2522 var37 = var1.method_28262(var12);
         var38 = class_109.method_336(var37, var1, var12);
         var68 = class_109.method_335(var37, var1, var12);
      }

      int var69 = class_109.method_335(var2, var1, var3);
      var12.method_2549(var3, var4);
      class_2522 var39 = var1.method_28262(var12);
      if (var6.get(0) || !var39.method_8321(var1, var12)) {
         var69 = class_109.method_335(var39, var1, var12);
      }

      float var40 = !var6.get(0) ? class_109.method_336(var1.method_28262(var3), var1, var3) : class_109.method_336(var1.method_28262(var10), var1, var10);
      class_9000 var41 = class_9000.method_41282(var4);
      if (var6.get(1) && class_9356.method_43212(var11)) {
         float var70 = (var25 + var16 + var34 + var40) * 0.25F;
         float var72 = (var22 + var16 + var31 + var40) * 0.25F;
         float var74 = (var22 + var19 + var36 + var40) * 0.25F;
         float var75 = (var25 + var19 + var38 + var40) * 0.25F;
         float var46 = var5[class_4899.method_22442(class_9356.method_43211(var11)[0])] * var5[class_4899.method_22442(class_9356.method_43211(var11)[1])];
         float var47 = var5[class_4899.method_22442(class_9356.method_43211(var11)[2])] * var5[class_4899.method_22442(class_9356.method_43211(var11)[3])];
         float var48 = var5[class_4899.method_22442(class_9356.method_43211(var11)[4])] * var5[class_4899.method_22442(class_9356.method_43211(var11)[5])];
         float var49 = var5[class_4899.method_22442(class_9356.method_43211(var11)[6])] * var5[class_4899.method_22442(class_9356.method_43211(var11)[7])];
         float var50 = var5[class_4899.method_22442(class_9356.method_43214(var11)[0])] * var5[class_4899.method_22442(class_9356.method_43214(var11)[1])];
         float var51 = var5[class_4899.method_22442(class_9356.method_43214(var11)[2])] * var5[class_4899.method_22442(class_9356.method_43214(var11)[3])];
         float var52 = var5[class_4899.method_22442(class_9356.method_43214(var11)[4])] * var5[class_4899.method_22442(class_9356.method_43214(var11)[5])];
         float var53 = var5[class_4899.method_22442(class_9356.method_43214(var11)[6])] * var5[class_4899.method_22442(class_9356.method_43214(var11)[7])];
         float var54 = var5[class_4899.method_22442(class_9356.method_43213(var11)[0])] * var5[class_4899.method_22442(class_9356.method_43213(var11)[1])];
         float var55 = var5[class_4899.method_22442(class_9356.method_43213(var11)[2])] * var5[class_4899.method_22442(class_9356.method_43213(var11)[3])];
         float var56 = var5[class_4899.method_22442(class_9356.method_43213(var11)[4])] * var5[class_4899.method_22442(class_9356.method_43213(var11)[5])];
         float var57 = var5[class_4899.method_22442(class_9356.method_43213(var11)[6])] * var5[class_4899.method_22442(class_9356.method_43213(var11)[7])];
         float var58 = var5[class_4899.method_22442(class_9356.method_43216(var11)[0])] * var5[class_4899.method_22442(class_9356.method_43216(var11)[1])];
         float var59 = var5[class_4899.method_22442(class_9356.method_43216(var11)[2])] * var5[class_4899.method_22442(class_9356.method_43216(var11)[3])];
         float var60 = var5[class_4899.method_22442(class_9356.method_43216(var11)[4])] * var5[class_4899.method_22442(class_9356.method_43216(var11)[5])];
         float var61 = var5[class_4899.method_22442(class_9356.method_43216(var11)[6])] * var5[class_4899.method_22442(class_9356.method_43216(var11)[7])];
         this.field_44771[class_9000.method_41286(var41)] = var70 * var46 + var72 * var47 + var74 * var48 + var75 * var49;
         this.field_44771[class_9000.method_41283(var41)] = var70 * var50 + var72 * var51 + var74 * var52 + var75 * var53;
         this.field_44771[class_9000.method_41285(var41)] = var70 * var54 + var72 * var55 + var74 * var56 + var75 * var57;
         this.field_44771[class_9000.method_41281(var41)] = var70 * var58 + var72 * var59 + var74 * var60 + var75 * var61;
         int var62 = this.method_40138(var24, var15, var66, var69);
         int var63 = this.method_40138(var21, var15, var32, var69);
         int var64 = this.method_40138(var21, var18, var67, var69);
         int var65 = this.method_40138(var24, var18, var68, var69);
         this.field_44770[class_9000.method_41286(var41)] = this.method_40139(var62, var63, var64, var65, var46, var47, var48, var49);
         this.field_44770[class_9000.method_41283(var41)] = this.method_40139(var62, var63, var64, var65, var50, var51, var52, var53);
         this.field_44770[class_9000.method_41285(var41)] = this.method_40139(var62, var63, var64, var65, var54, var55, var56, var57);
         this.field_44770[class_9000.method_41281(var41)] = this.method_40139(var62, var63, var64, var65, var58, var59, var60, var61);
      } else {
         float var42 = (var25 + var16 + var34 + var40) * 0.25F;
         float var43 = (var22 + var16 + var31 + var40) * 0.25F;
         float var44 = (var22 + var19 + var36 + var40) * 0.25F;
         float var45 = (var25 + var19 + var38 + var40) * 0.25F;
         this.field_44770[class_9000.method_41286(var41)] = this.method_40138(var24, var15, var66, var69);
         this.field_44770[class_9000.method_41283(var41)] = this.method_40138(var21, var15, var32, var69);
         this.field_44770[class_9000.method_41285(var41)] = this.method_40138(var21, var18, var67, var69);
         this.field_44770[class_9000.method_41281(var41)] = this.method_40138(var24, var18, var68, var69);
         this.field_44771[class_9000.method_41286(var41)] = var42;
         this.field_44771[class_9000.method_41283(var41)] = var43;
         this.field_44771[class_9000.method_41285(var41)] = var44;
         this.field_44771[class_9000.method_41281(var41)] = var45;
      }

      float var71 = var1.method_25265(var4, var7);

      for (int var73 = 0; var73 < this.field_44771.length; var73++) {
         this.field_44771[var73] = this.field_44771[var73] * var71;
      }
   }

   private int method_40138(int var1, int var2, int var3, int var4) {
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

   private int method_40139(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      int var11 = (int)(
            (float)(var1 >> 16 & 0xFF) * var5 + (float)(var2 >> 16 & 0xFF) * var6 + (float)(var3 >> 16 & 0xFF) * var7 + (float)(var4 >> 16 & 0xFF) * var8
         )
         & 0xFF;
      int var12 = (int)((float)(var1 & 0xFF) * var5 + (float)(var2 & 0xFF) * var6 + (float)(var3 & 0xFF) * var7 + (float)(var4 & 0xFF) * var8) & 0xFF;
      return var11 << 16 | var12;
   }
}
