package mapped;

import java.util.function.Predicate;

public enum Class2093 {
   field13635(Class9343::method35353),
   field13636(Class9343::method35354),
   field13637(var0 -> true);

   private final Predicate<? super Class9343> field13638;
   private static final Class2093[] field13639 = new Class2093[]{field13635, field13636, field13637};

   private Class2093(Predicate<? super Class9343> var3) {
      this.field13638 = var3;
   }

   public Predicate<? super Class9343> method8754() {
      return this.field13638;
   }
}
