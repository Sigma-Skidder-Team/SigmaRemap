package remapped;

import java.util.List;

public class class_1227 extends class_2255<class_1100> {
   public static final Identifier field_6790 = new Identifier("textures/entity/beacon_beam.png");

   public class_1227(class_3569 var1) {
      super(var1);
   }

   public void method_5463(class_1100 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      long var9 = var1.method_17402().method_29546();
      List var11 = var1.method_4891();
      int var12 = 0;

      for (int var13 = 0; var13 < var11.size(); var13++) {
         class_3080 var14 = (class_3080)var11.get(var13);
         method_5465(var3, var4, var2, var9, var12, var13 != var11.size() - 1 ? var14.method_14113() : 1024, var14.method_14111());
         var12 += var14.method_14113();
      }
   }

   private static void method_5465(class_7966 var0, class_2565 var1, float var2, long var3, int var5, int var6, float[] var7) {
      method_5466(var0, var1, field_6790, var2, 1.0F, var3, var5, var6, var7, 0.2F, 0.25F);
   }

   public static void method_5466(
           class_7966 var0, class_2565 var1, Identifier var2, float var3, float var4, long var5, int var7, int var8, float[] var9, float var10, float var11
   ) {
      int var14 = var7 + var8;
      var0.method_36063();
      var0.method_36065(0.5, 0.0, 0.5);
      float var15 = (float)Math.floorMod(var5, 40L) + var3;
      float var16 = var8 >= 0 ? -var15 : var15;
      float var17 = class_9299.method_42823(var16 * 0.2F - (float)class_9299.method_42848(var16 * 0.1F));
      float var18 = var9[0];
      float var19 = var9[1];
      float var20 = var9[2];
      var0.method_36063();
      var0.method_36060(class_2426.field_12074.method_11074(var15 * 2.25F - 45.0F));
      float var21 = 0.0F;
      float var22 = 0.0F;
      float var23 = -var10;
      float var24 = 0.0F;
      float var25 = 0.0F;
      float var26 = -var10;
      float var27 = 0.0F;
      float var28 = 1.0F;
      float var29 = -1.0F + var17;
      float var30 = (float)var8 * var4 * (0.5F / var10) + var29;
      method_5464(
         var0,
         var1.method_11645(RenderLayer.method_16731(var2, false)),
         var18,
         var19,
         var20,
         1.0F,
         var7,
         var14,
         0.0F,
         var10,
         var10,
         0.0F,
         var23,
         0.0F,
         0.0F,
         var26,
         0.0F,
         1.0F,
         var30,
         var29
      );
      var0.method_36064();
      var21 = -var11;
      float var31 = -var11;
      var22 = -var11;
      var23 = -var11;
      var27 = 0.0F;
      var28 = 1.0F;
      var29 = -1.0F + var17;
      var30 = (float)var8 * var4 + var29;
      method_5464(
         var0,
         var1.method_11645(RenderLayer.method_16731(var2, true)),
         var18,
         var19,
         var20,
         0.125F,
         var7,
         var14,
         var21,
         var31,
         var11,
         var22,
         var23,
         var11,
         var11,
         var11,
         0.0F,
         1.0F,
         var30,
         var29
      );
      var0.method_36064();
   }

   private static void method_5464(
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
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19
   ) {
      class_6279 var22 = var0.method_36058();
      class_8107 var23 = var22.method_28620();
      class_6555 var24 = var22.method_28618();
      method_5468(var23, var24, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var16, var17, var18, var19);
      method_5468(var23, var24, var1, var2, var3, var4, var5, var6, var7, var14, var15, var12, var13, var16, var17, var18, var19);
      method_5468(var23, var24, var1, var2, var3, var4, var5, var6, var7, var10, var11, var14, var15, var16, var17, var18, var19);
      method_5468(var23, var24, var1, var2, var3, var4, var5, var6, var7, var12, var13, var8, var9, var16, var17, var18, var19);
   }

   private static void method_5468(
      class_8107 var0,
      class_6555 var1,
      class_7907 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      method_5469(var0, var1, var2, var3, var4, var5, var6, var8, var9, var10, var14, var15);
      method_5469(var0, var1, var2, var3, var4, var5, var6, var7, var9, var10, var14, var16);
      method_5469(var0, var1, var2, var3, var4, var5, var6, var7, var11, var12, var13, var16);
      method_5469(var0, var1, var2, var3, var4, var5, var6, var8, var11, var12, var13, var15);
   }

   private static void method_5469(
      class_8107 var0,
      class_6555 var1,
      class_7907 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      var2.method_35762(var0, var8, (float)var7, var9)
         .method_35742(var3, var4, var5, var6)
         .method_35745(var10, var11)
         .method_35737(class_5367.field_27381)
         .method_35747(15728880)
         .method_35756(var1, 0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   public boolean method_5467(class_1100 var1) {
      return true;
   }
}