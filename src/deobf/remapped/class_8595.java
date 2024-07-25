package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_8595 extends class_9270 {
   public class_8595(Codec<class_8351> var1) {
      super(var1);
   }

   @Override
   public boolean method_42716(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_8351 var5) {
      while (var1.method_22548(var4) && var4.method_12165() > 2) {
         var4 = var4.method_6100();
      }

      return var1.method_28262(var4).method_8350(class_4783.field_23813) ? super.method_42716(var1, var2, var3, var4, var5) : false;
   }
}
