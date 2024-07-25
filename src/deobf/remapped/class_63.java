package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_63 extends class_4285<class_2984> {
   public class_63(Codec<class_2984> var1) {
      super(var1);
   }

   public boolean method_43(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_2984 var5) {
      int var8 = var3.nextInt(var5.field_14684.size());
      class_5927 var9 = var5.field_14684.get(var8).get();
      return var9.method_27104(var1, var2, var3, var4);
   }
}
