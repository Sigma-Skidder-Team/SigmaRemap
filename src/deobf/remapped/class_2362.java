package remapped;

import java.util.function.Consumer;

public class class_2362 implements class_3026 {
   private final class_599 field_11845 = new class_599("minecraft");

   @Override
   public void method_13812(Consumer<class_5522> var1, class_7953 var2) {
      class_5522 var5 = class_5522.method_25028("vanilla", false, () -> this.field_11845, var2, class_1154.field_6564, class_2541.field_12595);
      if (var5 != null) {
         var1.accept(var5);
      }
   }
}
