package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_4864 extends class_9448 {
   private static String[] field_24220;

   public class_4864() {
      super(class_6942.class);
   }

   @Override
   public Set<class_3841> method_43698(BlockPos var1, class_2522 var2, class_6590 var3) {
      HashSet var6 = new HashSet();
      class_2522 var7 = MinecraftClient.getInstance().theWorld.method_28262(var1);
      if (var7.method_8360() instanceof class_6942) {
         var6.add(new class_3841(var1, var7));
      }

      return var6;
   }
}
