package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6149 extends class_4285<class_1941> {
   public class_6149(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_28200(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      if (var1.method_22548(var4) && var1.method_28262(var4.method_6100()).method_8350(class_4783.field_23894)) {
         class_9176.method_42288(var1, var4, var3, 8);
         return true;
      } else {
         return false;
      }
   }
}
