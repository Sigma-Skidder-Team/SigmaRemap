package remapped;

import java.util.Map;
import java.util.stream.Collectors;

public class class_2848 {
   private static String[] field_13963;
   private final Map<class_3581, class_9633> field_13962 = class_3581.method_16770()
      .stream()
      .collect(Collectors.toMap(var0 -> (class_3581)var0, var0 -> new class_9633(var0.method_16742())));

   public class_9633 method_12956(class_3581 var1) {
      return this.field_13962.get(var1);
   }

   public void method_12958() {
      this.field_13962.values().forEach(class_9633::method_44463);
   }

   public void method_12957() {
      this.field_13962.values().forEach(class_9633::method_44460);
   }
}
