package remapped;

import java.util.function.Function;

public final class class_8724 extends class_5363<class_8724> {
   private static String[] field_44710;
   private final Function<class_7279[], class_2913> field_44711;

   public class_8724(Function<class_7279[], class_2913> var1) {
      this.field_44711 = var1;
   }

   public class_8724 method_40071() {
      return this;
   }

   @Override
   public class_2913 method_8947() {
      return this.field_44711.apply(this.method_24475());
   }
}
