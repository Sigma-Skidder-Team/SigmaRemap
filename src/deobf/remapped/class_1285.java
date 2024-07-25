package remapped;

import java.util.UUID;

public class class_1285 extends class_2470 {
   private static String[] field_7057;

   @Override
   public void method_11363(class_1455 var1, UUID var2) {
      if (var1.method_6708(class_2583.class)) {
         class_2583 var5 = var1.<class_2583>method_6746(class_2583.class);
         if (var5.method_11752() != null) {
            var5.method_11752().add(var2);
         }
      }
   }

   @Override
   public void method_11364(class_1455 var1, UUID var2) {
      if (var1.method_6708(class_2583.class)) {
         class_2583 var5 = var1.<class_2583>method_6746(class_2583.class);
         if (var5.method_11752() != null) {
            var5.method_11752().remove(var2);
         }
      }
   }
}
