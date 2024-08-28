package mapped;

import java.util.function.Predicate;

public enum Class1985 {
   field12962(var0 -> false),
   field12963(Class7379::method23473),
   field12964(var0 -> !var0.method23474());

   private final Predicate<Class7379> field12965;
   private static final Class1985[] field12966 = new Class1985[]{field12962, field12963, field12964};

   private Class1985(Predicate<Class7379> var3) {
      this.field12965 = var3;
   }

   public boolean method8273(Class7379 var1) {
      return this.field12965.test(var1);
   }
}
