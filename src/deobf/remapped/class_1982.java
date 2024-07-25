package remapped;

import java.util.OptionalInt;

public final class class_1982 implements class_1720<OptionalInt> {
   private static String[] field_10046;

   public void method_9132(class_8248 var1, OptionalInt var2) {
      var1.method_37743(var2.orElse(-1) + 1);
   }

   public OptionalInt method_9134(class_8248 var1) {
      int var4 = var1.method_37778();
      return var4 != 0 ? OptionalInt.of(var4 - 1) : OptionalInt.empty();
   }

   public OptionalInt method_9133(OptionalInt var1) {
      return var1;
   }
}
