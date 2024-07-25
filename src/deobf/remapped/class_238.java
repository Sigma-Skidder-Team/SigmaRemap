package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_238 extends class_4285<class_3526> {
   public class_238(Codec<class_3526> var1) {
      super(var1);
   }

   public boolean method_1014(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_3526 var5) {
      for (class_2642 var9 : var5.field_17278) {
         if (var3.nextFloat() < var9.field_13017) {
            return var9.method_11949(var1, var2, var3, var4);
         }
      }

      return var5.field_17277.get().method_27104(var1, var2, var3, var4);
   }
}
