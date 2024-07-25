package remapped;

import java.util.BitSet;
import java.util.List;
import java.util.Random;

public class class_2174 {
   private final class_4468 field_10831;
   private static final ThreadLocal<class_1541> field_10832 = ThreadLocal.<class_1541>withInitial(() -> new class_1541(null));
   private static float field_10836 = 0.2F;
   private static boolean field_10834 = false;
   private static final class_109 field_10833 = new class_109();
   private static final RenderLayer[] field_10835 = new RenderLayer[]{class_6727.field_34743, class_6727.field_34746, class_6727.field_34740};
   private boolean field_10837 = class_7860.field_40161.method_45472();

   private void method_10107(
      class_5561 var1,
      class_2522 var2,
      class_1331 var3,
      class_7966 var4,
      class_7907 var5,
      List<class_5024> var6,
      float[] var7,
      BitSet var8,
      class_8742 var9,
      int var10
   ) {
      for (class_5024 var14 : var6) {
         this.method_10109(var1, var2, var3, var14.method_23155(), var14.method_23150(), var7, var8);
         var9.method_40134(var1, var2, var3, var14.method_23150(), var7, var8, var14.method_23168());
         this.method_10115(
            var1,
            var2,
            var3,
            var5,
            var4.method_36058(),
            var14,
            class_8742.method_40133(var9)[0],
            class_8742.method_40133(var9)[1],
            class_8742.method_40133(var9)[2],
            class_8742.method_40133(var9)[3],
            class_8742.method_40135(var9)[0],
            class_8742.method_40135(var9)[1],
            class_8742.method_40135(var9)[2],
            class_8742.method_40135(var9)[3],
            var10
         );
      }
   }

   private void method_10115(
      class_5561 var1,
      class_2522 var2,
      class_1331 var3,
      class_7907 var4,
      class_6279 var5,
      class_5024 var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15
   ) {
      float var18;
      float var19;
      float var20;
      if (!var6.method_23149()) {
         var18 = 1.0F;
         var19 = 1.0F;
         var20 = 1.0F;
      } else {
         int var21 = this.field_10831.method_20749(var2, var1, var3, var6.method_23160());
         var18 = (float)(var21 >> 16 & 0xFF) / 255.0F;
         var19 = (float)(var21 >> 8 & 0xFF) / 255.0F;
         var20 = (float)(var21 & 0xFF) / 255.0F;
      }

      var4.method_35759(var5, var6, new float[]{var7, var8, var9, var10}, var18, var19, var20, new int[]{var11, var12, var13, var14}, var15, true);
   }

   private void method_10110(
      class_5561 var1,
      class_2522 var2,
      class_1331 var3,
      int var4,
      int var5,
      boolean var6,
      class_7966 var7,
      class_7907 var8,
      List<class_5024> var9,
      BitSet var10
   ) {
      for (class_5024 var14 : var9) {
         if (var6) {
            this.method_10109(var1, var2, var3, var14.method_23155(), var14.method_23150(), (float[])null, var10);
            class_1331 var15 = !var10.get(0) ? var3 : var3.method_6098(var14.method_23150());
            var4 = WorldRenderer.method_20052(var1, var2, var15);
         }

         float var16 = var1.method_25265(var14.method_23150(), var14.method_23168());
         this.method_10115(var1, var2, var3, var8, var7.method_36058(), var14, var16, var16, var16, var16, var4, var4, var4, var4, var5);
      }
   }

   public class_2174(class_4468 var1) {
      this.field_10831 = var1;
   }

   public boolean method_10103(
      class_5561 var1, class_7373 var2, class_2522 var3, class_1331 var4, class_7966 var5, class_7907 var6, boolean var7, Random var8, long var9, int var11
   ) {
      return this.method_10104(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, class_6652.field_34420);
   }

   public boolean method_10104(
      class_5561 var1,
      class_7373 var2,
      class_2522 var3,
      class_1331 var4,
      class_7966 var5,
      class_7907 var6,
      boolean var7,
      Random var8,
      long var9,
      int var11,
      class_1488 var12
   ) {
      boolean var15 = MinecraftClient.method_8541() && class_8835.method_40643(var3, var1, var4) == 0 && var2.method_33581();
      if (this.field_10837) {
         var12 = var2.method_16964(var1, var4, var3, var12);
      }

      class_1343 var16 = var3.method_8353(var1, var4);
      var5.method_36065(var16.field_7336, var16.field_7333, var16.field_7334);

      try {
         if (class_3111.method_14424()) {
            class_2448.method_11201(var3, var6);
         }

         if (!class_3111.method_14321()) {
            var9 = 0L;
         }

         class_4460 var17 = var6.method_35749(var3, var4);
         var2 = class_4690.method_21661(var2, var3, var17);
         boolean var22 = var15
            ? this.method_10102(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12)
            : this.method_10100(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
         if (var22) {
            this.method_10112(var1, var2, var3, var4, var5, var6, var11, var7, var8, var9, var17, var15, var16);
         }

         if (class_3111.method_14424()) {
            class_2448.method_11191(var6);
         }

         return var22;
      } catch (Throwable var20) {
         class_159 var18 = class_159.method_643(var20, "Tesselating block model");
         class_6544 var19 = var18.method_639("Block model being tesselated");
         class_6544.method_29843(var19, var4, var3);
         var19.method_29850("Using AO", var15);
         throw new class_3297(var18);
      }
   }

   public boolean method_10101(
      class_5561 var1, class_7373 var2, class_2522 var3, class_1331 var4, class_7966 var5, class_7907 var6, boolean var7, Random var8, long var9, int var11
   ) {
      return this.method_10102(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, class_6652.field_34420);
   }

   public boolean method_10102(
      class_5561 var1,
      class_7373 var2,
      class_2522 var3,
      class_1331 var4,
      class_7966 var5,
      class_7907 var6,
      boolean var7,
      Random var8,
      long var9,
      int var11,
      class_1488 var12
   ) {
      boolean var15 = false;
      class_4460 var16 = var6.method_35749(var3, var4);
      RenderLayer var17 = var6.method_35760();

      for (Direction var21 : Direction.field_803) {
         if (!var7 || class_9451.method_43714(var3, var1, var4, var21, var16)) {
            var8.setSeed(var9);
            List var22 = !this.field_10837 ? var2.method_33580(var3, var21, var8) : var2.method_16965(var3, var21, var8, var12);
            var22 = class_4690.method_21658(var22, var1, var3, var4, var21, var17, var9, var16);
            this.method_10106(var1, var3, var4, var5, var6, var22, var11, var16);
            var15 = true;
         }
      }

      var8.setSeed(var9);
      List var23 = !this.field_10837 ? var2.method_33580(var3, (Direction)null, var8) : var2.method_16965(var3, (Direction)null, var8, var12);
      if (!var23.isEmpty()) {
         var23 = class_4690.method_21658(var23, var1, var3, var4, (Direction)null, var17, var9, var16);
         this.method_10106(var1, var3, var4, var5, var6, var23, var11, var16);
         var15 = true;
      }

      return var15;
   }

   public boolean method_10099(
      class_5561 var1, class_7373 var2, class_2522 var3, class_1331 var4, class_7966 var5, class_7907 var6, boolean var7, Random var8, long var9, int var11
   ) {
      return this.method_10100(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, class_6652.field_34420);
   }

   public boolean method_10100(
      class_5561 var1,
      class_7373 var2,
      class_2522 var3,
      class_1331 var4,
      class_7966 var5,
      class_7907 var6,
      boolean var7,
      Random var8,
      long var9,
      int var11,
      class_1488 var12
   ) {
      boolean var15 = false;
      class_4460 var16 = var6.method_35749(var3, var4);
      RenderLayer var17 = var6.method_35760();

      for (Direction var21 : Direction.field_803) {
         if (!var7 || class_9451.method_43714(var3, var1, var4, var21, var16)) {
            var8.setSeed(var9);
            List var22 = !this.field_10837 ? var2.method_33580(var3, var21, var8) : var2.method_16965(var3, var21, var8, var12);
            int var23 = WorldRenderer.method_20052(var1, var3, var4.method_6098(var21));
            var22 = class_4690.method_21658(var22, var1, var3, var4, var21, var17, var9, var16);
            this.method_10111(var1, var3, var4, var23, var11, false, var5, var6, var22, var16);
            var15 = true;
         }
      }

      var8.setSeed(var9);
      List var24 = !this.field_10837 ? var2.method_33580(var3, (Direction)null, var8) : var2.method_16965(var3, (Direction)null, var8, var12);
      if (!var24.isEmpty()) {
         var24 = class_4690.method_21658(var24, var1, var3, var4, (Direction)null, var17, var9, var16);
         this.method_10111(var1, var3, var4, -1, var11, true, var5, var6, var24, var16);
         var15 = true;
      }

      return var15;
   }

   private void method_10106(
      class_5561 var1, class_2522 var2, class_1331 var3, class_7966 var4, class_7907 var5, List<class_5024> var6, int var7, class_4460 var8
   ) {
      float[] var11 = var8.method_20693();
      BitSet var12 = var8.method_20682();
      class_8742 var13 = var8.method_20680();
      int var14 = var6.size();

      for (int var15 = 0; var15 < var14; var15++) {
         class_5024 var16 = (class_5024)var6.get(var15);
         this.method_10109(var1, var2, var3, var16.method_23155(), var16.method_23150(), var11, var12);
         var13.method_40134(var1, var2, var3, var16.method_23150(), var11, var12, var16.method_23168());
         if (var16.method_23148().field_26528) {
            var13.method_40137();
         }

         this.method_10116(
            var1,
            var2,
            var3,
            var5,
            var4.method_36058(),
            var16,
            class_8742.method_40133(var13)[0],
            class_8742.method_40133(var13)[1],
            class_8742.method_40133(var13)[2],
            class_8742.method_40133(var13)[3],
            class_8742.method_40135(var13)[0],
            class_8742.method_40135(var13)[1],
            class_8742.method_40135(var13)[2],
            class_8742.method_40135(var13)[3],
            var7,
            var8
         );
      }
   }

   private void method_10116(
      class_5561 var1,
      class_2522 var2,
      class_1331 var3,
      class_7907 var4,
      class_6279 var5,
      class_5024 var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      class_4460 var16
   ) {
      int var19 = class_9300.method_42879(var6, var2, var1, var3, var16);
      float var20;
      float var21;
      float var22;
      if (!var6.method_23149() && var19 == -1) {
         var20 = 1.0F;
         var21 = 1.0F;
         var22 = 1.0F;
      } else {
         int var23 = var19 == -1 ? this.field_10831.method_20749(var2, var1, var3, var6.method_23160()) : var19;
         var20 = (float)(var23 >> 16 & 0xFF) / 255.0F;
         var21 = (float)(var23 >> 8 & 0xFF) / 255.0F;
         var22 = (float)(var23 & 0xFF) / 255.0F;
      }

      var4.method_35759(var5, var6, var4.method_35746(var7, var8, var9, var10), var20, var21, var22, var4.method_35739(var11, var12, var13, var14), var15, true);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_10109(class_5561 var1, class_2522 var2, class_1331 var3, int[] var4, Direction var5, float[] var6, BitSet var7) {
      float var10 = 32.0F;
      float var11 = 32.0F;
      float var12 = 32.0F;
      float var13 = -32.0F;
      float var14 = -32.0F;
      float var15 = -32.0F;
      int var16 = var4.length / 4;

      for (int var17 = 0; var17 < 4; var17++) {
         float var18 = Float.intBitsToFloat(var4[var17 * var16]);
         float var19 = Float.intBitsToFloat(var4[var17 * var16 + 1]);
         float var20 = Float.intBitsToFloat(var4[var17 * var16 + 2]);
         var10 = Math.min(var10, var18);
         var11 = Math.min(var11, var19);
         var12 = Math.min(var12, var20);
         var13 = Math.max(var13, var18);
         var14 = Math.max(var14, var19);
         var15 = Math.max(var15, var20);
      }

      if (var6 != null) {
         var6[Direction.field_809.method_1050()] = var10;
         var6[Direction.field_804.method_1050()] = var13;
         var6[Direction.field_802.method_1050()] = var11;
         var6[Direction.field_817.method_1050()] = var14;
         var6[Direction.field_818.method_1050()] = var12;
         var6[Direction.field_800.method_1050()] = var15;
         int var21 = Direction.field_803.length;
         var6[Direction.field_809.method_1050() + var21] = 1.0F - var10;
         var6[Direction.field_804.method_1050() + var21] = 1.0F - var13;
         var6[Direction.field_802.method_1050() + var21] = 1.0F - var11;
         var6[Direction.field_817.method_1050() + var21] = 1.0F - var14;
         var6[Direction.field_818.method_1050() + var21] = 1.0F - var12;
         var6[Direction.field_800.method_1050() + var21] = 1.0F - var15;
      }

      float var22 = 1.0E-4F;
      float var23 = 0.9999F;
      switch (var5) {
         case field_802:
            var7.set(1, var10 >= 1.0E-4F || var12 >= 1.0E-4F || var13 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var11 == var14 && (var11 < 1.0E-4F || var2.method_8306(var1, var3)));
            break;
         case field_817:
            var7.set(1, var10 >= 1.0E-4F || var12 >= 1.0E-4F || var13 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var11 == var14 && (var14 > 0.9999F || var2.method_8306(var1, var3)));
            break;
         case field_818:
            var7.set(1, var10 >= 1.0E-4F || var11 >= 1.0E-4F || var13 <= 0.9999F || var14 <= 0.9999F);
            var7.set(0, var12 == var15 && (var12 < 1.0E-4F || var2.method_8306(var1, var3)));
            break;
         case field_800:
            var7.set(1, var10 >= 1.0E-4F || var11 >= 1.0E-4F || var13 <= 0.9999F || var14 <= 0.9999F);
            var7.set(0, var12 == var15 && (var15 > 0.9999F || var2.method_8306(var1, var3)));
            break;
         case field_809:
            var7.set(1, var11 >= 1.0E-4F || var12 >= 1.0E-4F || var14 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var10 == var13 && (var10 < 1.0E-4F || var2.method_8306(var1, var3)));
            break;
         case field_804:
            var7.set(1, var11 >= 1.0E-4F || var12 >= 1.0E-4F || var14 <= 0.9999F || var15 <= 0.9999F);
            var7.set(0, var10 == var13 && (var13 > 0.9999F || var2.method_8306(var1, var3)));
      }
   }

   private void method_10111(
      class_5561 var1,
      class_2522 var2,
      class_1331 var3,
      int var4,
      int var5,
      boolean var6,
      class_7966 var7,
      class_7907 var8,
      List<class_5024> var9,
      class_4460 var10
   ) {
      BitSet var13 = var10.method_20682();
      int var14 = var9.size();

      for (int var15 = 0; var15 < var14; var15++) {
         class_5024 var16 = (class_5024)var9.get(var15);
         if (var6) {
            this.method_10109(var1, var2, var3, var16.method_23155(), var16.method_23150(), (float[])null, var13);
            class_1331 var17 = !var13.get(0) ? var3 : var3.method_6098(var16.method_23150());
            var4 = WorldRenderer.method_20052(var1, var2, var17);
         }

         if (var16.method_23148().field_26528) {
            var4 = class_5778.field_29187;
         }

         float var18 = var1.method_25265(var16.method_23150(), var16.method_23168());
         this.method_10116(var1, var2, var3, var8, var7.method_36058(), var16, var18, var18, var18, var18, var4, var4, var4, var4, var5, var10);
      }
   }

   public void method_10094(class_6279 var1, class_7907 var2, class_2522 var3, class_7373 var4, float var5, float var6, float var7, int var8, int var9) {
      this.method_10105(var1, var2, var3, var4, var5, var6, var7, var8, var9, class_6652.field_34420);
   }

   public void method_10105(
      class_6279 var1, class_7907 var2, class_2522 var3, class_7373 var4, float var5, float var6, float var7, int var8, int var9, class_1488 var10
   ) {
      Random var13 = new Random();
      long var14 = 42L;

      for (Direction var19 : Direction.field_803) {
         var13.setSeed(42L);
         if (!this.field_10837) {
            method_10096(var1, var2, var5, var6, var7, var4.method_33580(var3, var19, var13), var8, var9);
         } else {
            method_10096(var1, var2, var5, var6, var7, var4.method_16965(var3, var19, var13, var10), var8, var9);
         }
      }

      var13.setSeed(42L);
      if (!this.field_10837) {
         method_10096(var1, var2, var5, var6, var7, var4.method_33580(var3, (Direction)null, var13), var8, var9);
      } else {
         method_10096(var1, var2, var5, var6, var7, var4.method_16965(var3, (Direction)null, var13, var10), var8, var9);
      }
   }

   private static void method_10096(class_6279 var0, class_7907 var1, float var2, float var3, float var4, List<class_5024> var5, int var6, int var7) {
      boolean var10 = class_5052.method_23281();

      for (class_5024 var12 : var5) {
         if (var10) {
            var12 = class_5052.method_23266(var12);
            if (var12 == null) {
               continue;
            }
         }

         float var13;
         float var14;
         float var15;
         if (!var12.method_23149()) {
            var13 = 1.0F;
            var14 = 1.0F;
            var15 = 1.0F;
         } else {
            var13 = class_9299.method_42828(var2, 0.0F, 1.0F);
            var14 = class_9299.method_42828(var3, 0.0F, 1.0F);
            var15 = class_9299.method_42828(var4, 0.0F, 1.0F);
         }

         var1.method_35757(var0, var12, var13, var14, var15, var6, var7);
      }
   }

   public static void method_10113() {
      field_10832.get().method_6986();
   }

   public static void method_10095() {
      field_10832.get().method_6984();
   }

   public static float method_10108(float var0) {
      return var0 != 0.2F ? var0 : field_10836;
   }

   public static void method_10117() {
      field_10836 = 1.0F - class_3111.method_14449() * 0.8F;
      field_10834 = class_3111.method_14424() && class_6588.method_30317();
   }

   public static boolean method_10097() {
      return field_10834;
   }

   private void method_10112(
      class_5561 var1,
      class_7373 var2,
      class_2522 var3,
      class_1331 var4,
      class_7966 var5,
      class_7907 var6,
      int var7,
      boolean var8,
      Random var9,
      long var10,
      class_4460 var12,
      boolean var13,
      class_1343 var14
   ) {
      if (var12.method_20671()) {
         for (int var17 = 0; var17 < field_10835.length; var17++) {
            RenderLayer var18 = field_10835[var17];
            class_8910 var19 = var12.method_20695(var18);
            if (var19.method_40987() > 0) {
               class_2848 var20 = var12.method_20670();
               if (var20 != null) {
                  class_9633 var21 = var20.method_12956(var18);
                  if (!var21.method_44474()) {
                     var21.method_44471(7, class_7985.field_40918);
                  }

                  for (int var22 = 0; var22 < var19.method_40987(); var22++) {
                     class_5024 var23 = var19.method_40992(var22);
                     List var24 = var19.method_40991(var23);
                     class_2522 var25 = var19.method_40986(var22);
                     if (var23.method_23162() != null) {
                        var19.method_40989(var23.method_23162(), var25);
                     }

                     var12.method_20678(var25, var4);
                     if (!var13) {
                        int var26 = WorldRenderer.method_20052(var1, var25, var4.method_6098(var23.method_23150()));
                        this.method_10111(var1, var25, var4, var26, var7, false, var5, var21, var24, var12);
                     } else {
                        this.method_10106(var1, var25, var4, var5, var21, var24, var7, var12);
                     }
                  }
               }

               var19.method_40990();
            }
         }
      }

      if (class_3111.method_14395() && !var12.method_20689() && class_2986.method_13667(var1, var3, var4)) {
         class_7373 var27 = class_2986.method_13668();
         class_2522 var28 = class_2986.method_13670();
         var5.method_36065(-var14.field_7336, -var14.field_7333, -var14.field_7334);
         this.method_10103(var1, var27, var28, var4, var5, var6, var8, var9, var10, var7);
      }
   }
}
