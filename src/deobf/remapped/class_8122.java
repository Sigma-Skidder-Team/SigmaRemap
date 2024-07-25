package remapped;

import java.util.function.Predicate;

public enum class_8122 {
   field_41617(class_8009::method_36340),
   field_41618(class_8009::method_36343),
   field_41615(var0 -> true);

   private final Predicate<? super class_8009> field_41619;

   private class_8122(Predicate<? super class_8009> var3) {
      this.field_41619 = var3;
   }

   public Predicate<? super class_8009> method_36962() {
      return this.field_41619;
   }
}
