package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_6169 extends class_6414 {
   private static String[] field_31572;
   private static final class_240[] field_31565 = class_240.values();
   public static final class_6720 field_31564 = class_6023.field_30734;
   public static final class_6720 field_31567 = class_6023.field_30669;
   public static final class_6720 field_31569 = class_6023.field_30730;
   public static final class_6720 field_31566 = class_6023.field_30675;
   public static final class_6720 field_31563 = class_6023.field_30711;
   public static final class_6720 field_31568 = class_6023.field_30740;
   public static final Map<class_240, class_6720> field_31571 = Util.<Map<class_240, class_6720>>method_44659(Maps.newEnumMap(class_240.class), var0 -> {
      var0.put(class_240.field_818, field_31564);
      var0.put(class_240.field_804, field_31567);
      var0.put(class_240.field_800, field_31569);
      var0.put(class_240.field_809, field_31566);
      var0.put(class_240.field_817, field_31563);
      var0.put(class_240.field_802, field_31568);
   });
   public final class_4190[] field_31570;

   public class_6169(float var1, class_3073 var2) {
      super(var2);
      this.field_31570 = this.method_28281(var1);
   }

   private class_4190[] method_28281(float var1) {
      float var4 = 0.5F - var1;
      float var5 = 0.5F + var1;
      class_4190 var6 = class_6414.method_29292(
         (double)(var4 * 16.0F), (double)(var4 * 16.0F), (double)(var4 * 16.0F), (double)(var5 * 16.0F), (double)(var5 * 16.0F), (double)(var5 * 16.0F)
      );
      class_4190[] var7 = new class_4190[field_31565.length];

      for (int var8 = 0; var8 < field_31565.length; var8++) {
         class_240 var9 = field_31565[var8];
         var7[var8] = class_3370.method_15522(
            0.5 + Math.min((double)(-var1), (double)var9.method_1041() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var9.method_1054() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var9.method_1034() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.method_1041() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.method_1054() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.method_1034() * 0.5)
         );
      }

      class_4190[] var12 = new class_4190[64];

      for (int var13 = 0; var13 < 64; var13++) {
         class_4190 var10 = var6;

         for (int var11 = 0; var11 < field_31565.length; var11++) {
            if ((var13 & 1 << var11) != 0) {
               var10 = class_3370.method_15530(var10, var7[var11]);
            }
         }

         var12[var13] = var10;
      }

      return var12;
   }

   @Override
   public boolean method_29275(class_2522 var1, class_6163 var2, class_1331 var3) {
      return false;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.field_31570[this.method_28282(var1)];
   }

   public int method_28282(class_2522 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < field_31565.length; var5++) {
         if (var1.<Boolean>method_10313(field_31571.get(field_31565[var5]))) {
            var4 |= 1 << var5;
         }
      }

      return var4;
   }
}
