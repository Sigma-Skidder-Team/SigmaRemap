package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_67 extends class_5390<class_1941> {
   public class_67(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public boolean method_24544() {
      return false;
   }

   public boolean method_63(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_1941 var10
   ) {
      return method_65(var6, var7, var1) >= 60;
   }

   @Override
   public class_1329<class_1941> method_24558() {
      return class_7160::new;
   }

   private static int method_65(int var0, int var1, class_6541 var2) {
      Random var5 = new Random((long)(var0 + var1 * 10387313));
      class_6631 var6 = class_6631.method_30492(var5);
      byte var7 = 5;
      byte var8 = 5;
      if (var6 != class_6631.field_34334) {
         if (var6 != class_6631.field_34338) {
            if (var6 == class_6631.field_34335) {
               var8 = -5;
            }
         } else {
            var7 = -5;
            var8 = -5;
         }
      } else {
         var7 = -5;
      }

      int var9 = (var0 << 4) + 7;
      int var10 = (var1 << 4) + 7;
      int var11 = var2.method_29819(var9, var10, class_3801.field_18598);
      int var12 = var2.method_29819(var9, var10 + var8, class_3801.field_18598);
      int var13 = var2.method_29819(var9 + var7, var10, class_3801.field_18598);
      int var14 = var2.method_29819(var9 + var7, var10 + var8, class_3801.field_18598);
      return Math.min(Math.min(var11, var12), Math.min(var13, var14));
   }
}
