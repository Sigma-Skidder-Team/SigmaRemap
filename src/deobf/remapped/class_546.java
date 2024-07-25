package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_546 implements class_6142 {
   private static final Logger field_3278 = LogManager.getLogger();
   private static final int field_3280 = (int)Math.round(Math.log(16.0) / Math.log(2.0)) - 2;
   private static final int field_3276 = (int)Math.round(Math.log(256.0) / Math.log(2.0)) - 2;
   public static final int field_3277 = 1 << field_3280 + field_3280 + field_3276;
   public static final int field_3275 = (1 << field_3280) - 1;
   public static final int field_3273 = (1 << field_3276) - 1;
   private final class_3072<class_6325> field_3274;
   private final class_6325[] field_3279;

   public class_546(class_3072<class_6325> var1, class_6325[] var2) {
      this.field_3274 = var1;
      this.field_3279 = var2;
   }

   private class_546(class_3072<class_6325> var1) {
      this(var1, new class_6325[field_3277]);
   }

   public class_546(class_3072<class_6325> var1, int[] var2) {
      this(var1);

      for (int var5 = 0; var5 < this.field_3279.length; var5++) {
         int var6 = var2[var5];
         class_6325 var7 = (class_6325)var1.method_14040(var6);
         if (var7 != null) {
            this.field_3279[var5] = var7;
         } else {
            field_3278.warn("Received invalid biome id: " + var6);
            this.field_3279[var5] = (class_6325)var1.method_14040(0);
         }
      }
   }

   public class_546(class_3072<class_6325> var1, class_2034 var2, class_3498 var3) {
      this(var1);
      int var6 = var2.method_9535() >> 2;
      int var7 = var2.method_9545() >> 2;

      for (int var8 = 0; var8 < this.field_3279.length; var8++) {
         int var9 = var8 & field_3275;
         int var10 = var8 >> field_3280 + field_3280 & field_3273;
         int var11 = var8 >> field_3280 & field_3275;
         this.field_3279[var8] = var3.method_28192(var6 + var9, var10, var7 + var11);
      }
   }

   public class_546(class_3072<class_6325> var1, class_2034 var2, class_3498 var3, int[] var4) {
      this(var1);
      int var7 = var2.method_9535() >> 2;
      int var8 = var2.method_9545() >> 2;
      if (var4 == null) {
         for (int var9 = 0; var9 < this.field_3279.length; var9++) {
            int var10 = var9 & field_3275;
            int var11 = var9 >> field_3280 + field_3280 & field_3273;
            int var12 = var9 >> field_3280 & field_3275;
            this.field_3279[var9] = var3.method_28192(var7 + var10, var11, var8 + var12);
         }
      } else {
         for (int var13 = 0; var13 < var4.length; var13++) {
            this.field_3279[var13] = (class_6325)var1.method_14040(var4[var13]);
            if (this.field_3279[var13] == null) {
               int var14 = var13 & field_3275;
               int var15 = var13 >> field_3280 + field_3280 & field_3273;
               int var16 = var13 >> field_3280 & field_3275;
               this.field_3279[var13] = var3.method_28192(var7 + var14, var15, var8 + var16);
            }
         }
      }
   }

   public int[] method_2643() {
      int[] var3 = new int[this.field_3279.length];

      for (int var4 = 0; var4 < this.field_3279.length; var4++) {
         var3[var4] = this.field_3274.method_14041(this.field_3279[var4]);
      }

      return var3;
   }

   @Override
   public class_6325 method_28192(int var1, int var2, int var3) {
      int var6 = var1 & field_3275;
      int var7 = class_9299.method_42829(var2, 0, field_3273);
      int var8 = var3 & field_3275;
      return this.field_3279[var7 << field_3280 + field_3280 | var8 << field_3280 | var6];
   }
}
