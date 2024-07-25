package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6754 extends class_4285<class_1941> {
   private static final BlockPos field_34859 = new BlockPos(8, 3, 8);
   private static final class_2034 field_34858 = new class_2034(field_34859);

   public class_6754(Codec<class_1941> var1) {
      super(var1);
   }

   private static int method_30959(int var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var0 - var2), Math.abs(var1 - var3));
   }

   public boolean method_30958(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      class_2034 var8 = new class_2034(var4);
      if (method_30959(var8.field_10328, var8.field_10327, field_34858.field_10328, field_34858.field_10327) > 1) {
         return true;
      } else {
         class_2921 var9 = new class_2921();

         for (int var10 = var8.method_9545(); var10 <= var8.method_9538(); var10++) {
            for (int var11 = var8.method_9535(); var11 <= var8.method_9536(); var11++) {
               if (method_30959(field_34859.getX(), field_34859.getZ(), var11, var10) <= 16) {
                  var9.method_13362(var11, field_34859.getY(), var10);
                  if (!var9.equals(field_34859)) {
                     var1.method_7513(var9, class_4783.field_23644.method_29260(), 2);
                  } else {
                     var1.method_7513(var9, class_4783.field_23808.method_29260(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
