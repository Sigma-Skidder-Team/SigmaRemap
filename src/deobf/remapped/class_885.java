package remapped;

import com.google.common.collect.ImmutableMap;

public class class_885<E extends class_5886> extends class_5920<E> {
   private static String[] field_4555;

   public class_885() {
      super(ImmutableMap.of(class_6044.field_30866, class_561.field_3320));
   }

   public void method_3806(class_6331 var1, E var2, long var3) {
      class_1225.method_5454(var2, class_6044.field_30866).ifPresent(var2x -> {
         if (var2x.method_26450() && (var2x.method_37387() != class_6629.field_34300 || var1.method_29537().method_1285(class_291.field_1042))) {
            var2.method_26525().method_5127(class_6044.field_30866);
         }
      });
   }
}
