package remapped;

import java.util.List;

public class class_9341 extends class_7238 {
   private static String[] field_47673;

   public class_9341(class_7015 var1) {
      super(var1, class_6373.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) {
      if (var3.method_24609() instanceof class_9530) {
         class_4524.method_21021((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var2 == class_5935.field_30234 && var3.method_24602() == 12) {
            var3.method_24605(13);
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_2618.method_11866(var1, false);
   }

   @Override
   public class_754 method_33114(int var1) {
      return class_2618.method_11866(var1, true);
   }
}
