package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_4559 extends class_4285<class_2045> {
   public class_4559(Codec<class_2045> var1) {
      super(var1);
   }

   public boolean method_21127(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_2045 var5) {
      while (var4.method_12165() > 3) {
         if (!var1.method_22548(var4.method_6100())) {
            class_6414 var8 = var1.method_28262(var4.method_6100()).method_8360();
            if (method_19910(var8) || method_19913(var8)) {
               break;
            }
         }

         var4 = var4.method_6100();
      }

      if (var4.method_12165() <= 3) {
         return false;
      } else {
         for (int var15 = 0; var15 < 3; var15++) {
            int var9 = var3.nextInt(2);
            int var10 = var3.nextInt(2);
            int var11 = var3.nextInt(2);
            float var12 = (float)(var9 + var10 + var11) * 0.333F + 0.5F;

            for (BlockPos var14 : BlockPos.method_6076(var4.method_6104(-var9, -var10, -var11), var4.method_6104(var9, var10, var11))) {
               if (var14.method_12180(var4) <= (double)(var12 * var12)) {
                  var1.method_7513(var14, var5.field_10356, 4);
               }
            }

            var4 = var4.method_6104(-1 + var3.nextInt(2), -var3.nextInt(2), -1 + var3.nextInt(2));
         }

         return true;
      }
   }
}
