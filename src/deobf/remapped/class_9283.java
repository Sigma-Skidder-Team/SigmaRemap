package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_9283 extends class_4285<class_1941> {
   private static final Identifier field_47352 = new Identifier("fossil/spine_1");
   private static final Identifier field_47350 = new Identifier("fossil/spine_2");
   private static final Identifier field_47357 = new Identifier("fossil/spine_3");
   private static final Identifier field_47363 = new Identifier("fossil/spine_4");
   private static final Identifier field_47351 = new Identifier("fossil/spine_1_coal");
   private static final Identifier field_47361 = new Identifier("fossil/spine_2_coal");
   private static final Identifier field_47349 = new Identifier("fossil/spine_3_coal");
   private static final Identifier field_47359 = new Identifier("fossil/spine_4_coal");
   private static final Identifier field_47362 = new Identifier("fossil/skull_1");
   private static final Identifier field_47356 = new Identifier("fossil/skull_2");
   private static final Identifier field_47354 = new Identifier("fossil/skull_3");
   private static final Identifier field_47353 = new Identifier("fossil/skull_4");
   private static final Identifier field_47355 = new Identifier("fossil/skull_1_coal");
   private static final Identifier field_47347 = new Identifier("fossil/skull_2_coal");
   private static final Identifier field_47360 = new Identifier("fossil/skull_3_coal");
   private static final Identifier field_47358 = new Identifier("fossil/skull_4_coal");
   private static final Identifier[] field_47348 = new Identifier[]{
      field_47352, field_47350, field_47357, field_47363, field_47362, field_47356, field_47354, field_47353
   };
   private static final Identifier[] field_47346 = new Identifier[]{
      field_47351, field_47361, field_47349, field_47359, field_47355, field_47347, field_47360, field_47358
   };

   public class_9283(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_42748(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      class_6631 var8 = class_6631.method_30492(var3);
      int var9 = var3.nextInt(field_47348.length);
      class_5799 var10 = var1.method_7066().method_29522().method_1670();
      class_6561 var11 = var10.method_26279(field_47348[var9]);
      class_6561 var12 = var10.method_26279(field_47346[var9]);
      class_2034 var13 = new class_2034(var4);
      class_9616 var14 = new class_9616(var13.method_9535(), 0, var13.method_9545(), var13.method_9536(), 256, var13.method_9538());
      class_8478 var15 = new class_8478().method_39053(var8).method_39051(var14).method_39041(var3).method_39048(class_2010.field_10193);
      BlockPos var16 = var11.method_29970(var8);
      int var17 = var3.nextInt(16 - var16.getX());
      int var18 = var3.nextInt(16 - var16.method_12185());
      int var19 = 256;

      for (int var20 = 0; var20 < var16.getX(); var20++) {
         for (int var21 = 0; var21 < var16.method_12185(); var21++) {
            var19 = Math.min(var19, var1.method_22562(class_3801.field_18591, var4.getX() + var20 + var17, var4.method_12185() + var21 + var18));
         }
      }

      int var24 = Math.max(var19 - 15 - var3.nextInt(10), 10);
      BlockPos var25 = var11.method_29977(var4.method_6104(var17, var24, var18), class_9022.field_46145, var8);
      class_9098 var22 = new class_9098(0.9F);
      var15.method_39035().method_39048(var22);
      var11.method_29965(var1, var25, var25, var15, var3, 4);
      var15.method_39033(var22);
      class_9098 var23 = new class_9098(0.1F);
      var15.method_39035().method_39048(var23);
      var12.method_29965(var1, var25, var25, var15, var3, 4);
      return true;
   }
}
