package remapped;

import java.util.function.Predicate;

public enum class_9583 {
   field_48747(var0 -> false),
   field_48749(class_4774::method_21993),
   field_48752(var0 -> !var0.method_22001());

   private final Predicate<class_4774> field_48750;

   private class_9583(Predicate<class_4774> var3) {
      this.field_48750 = var3;
   }

   public boolean method_44270(class_4774 var1) {
      return this.field_48750.test(var1);
   }
}
