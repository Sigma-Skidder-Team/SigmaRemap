package remapped;

import java.util.List;

public class class_1134 extends class_7238 {
   private static String[] field_6453;

   public class_1134(class_5541 var1) {
      super(var1, class_1030.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) {
      if (var2 != null) {
         if ((var2 == class_6124.field_31442 || var2 == class_6124.field_31318) && var3.method_24602() >= 15) {
            var3.method_24605(var3.method_24602() + 1);
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_415.method_2063(var1);
   }
}
