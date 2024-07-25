package remapped;

import java.util.List;

public interface class_9168 {
   default boolean method_42263(ItemStack var1) {
      CompoundNBT var4 = var1.method_28021("display");
      return var4 != null && var4.contains("color", 99);
   }

   default int method_42261(ItemStack var1) {
      CompoundNBT var4 = var1.method_28021("display");
      return var4 != null && var4.contains("color", 99) ? var4.method_25947("color") : 10511680;
   }

   default void method_42260(ItemStack var1) {
      CompoundNBT var4 = var1.method_28021("display");
      if (var4 != null && var4.method_25938("color")) {
         var4.method_25959("color");
      }
   }

   default void method_42262(ItemStack var1, int var2) {
      var1.method_27978("display").method_25931("color", var2);
   }

   static ItemStack method_42264(ItemStack var0, List<class_239> var1) {
      ItemStack var4 = ItemStack.EMPTY;
      int[] var5 = new int[3];
      int var6 = 0;
      int var7 = 0;
      class_9168 var8 = null;
      class_2451 var9 = var0.method_27960();
      if (var9 instanceof class_9168) {
         var8 = (class_9168)var9;
         var4 = var0.method_27973();
         var4.method_28017(1);
         if (var8.method_42263(var0)) {
            int var10 = var8.method_42261(var4);
            float var11 = (float)(var10 >> 16 & 0xFF) / 255.0F;
            float var12 = (float)(var10 >> 8 & 0xFF) / 255.0F;
            float var13 = (float)(var10 & 0xFF) / 255.0F;
            var6 = (int)((float)var6 + Math.max(var11, Math.max(var12, var13)) * 255.0F);
            var5[0] = (int)((float)var5[0] + var11 * 255.0F);
            var5[1] = (int)((float)var5[1] + var12 * 255.0F);
            var5[2] = (int)((float)var5[2] + var13 * 255.0F);
            var7++;
         }

         for (class_239 var19 : var1) {
            float[] var22 = var19.method_1015().method_41792();
            int var25 = (int)(var22[0] * 255.0F);
            int var14 = (int)(var22[1] * 255.0F);
            int var15 = (int)(var22[2] * 255.0F);
            var6 += Math.max(var25, Math.max(var14, var15));
            var5[0] += var25;
            var5[1] += var14;
            var5[2] += var15;
            var7++;
         }
      }

      if (var8 != null) {
         int var17 = var5[0] / var7;
         int var20 = var5[1] / var7;
         int var23 = var5[2] / var7;
         float var26 = (float)var6 / (float)var7;
         float var27 = (float)Math.max(var17, Math.max(var20, var23));
         var17 = (int)((float)var17 * var26 / var27);
         var20 = (int)((float)var20 * var26 / var27);
         var23 = (int)((float)var23 * var26 / var27);
         int var28 = (var17 << 8) + var20;
         var28 = (var28 << 8) + var23;
         var8.method_42262(var4, var28);
         return var4;
      } else {
         return ItemStack.EMPTY;
      }
   }
}
