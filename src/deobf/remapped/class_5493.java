package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5493 extends class_4285<class_3878> {
   public class_5493(Codec<class_3878> var1) {
      super(var1);
   }

   public boolean method_24958(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_3878 var5) {
      class_2921 var8 = new class_2921();

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            int var11 = var4.getX() + var9;
            int var12 = var4.getZ() + var10;
            int var13 = var5.field_18876;
            var8.method_13362(var11, var13, var12);
            if (var1.method_28262(var8).method_8345()) {
               var1.method_7513(var8, var5.field_18877, 2);
            }
         }
      }

      return true;
   }
}
