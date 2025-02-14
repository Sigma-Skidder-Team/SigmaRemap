package mapped;

import java.util.function.Function;

public final class Class5884 extends Class5876<Class5884> {
   private static String[] field25687;
   private final Function<ILootCondition[], ILootFunction> field25688;

   public Class5884(Function<ILootCondition[], ILootFunction> var1) {
      this.field25688 = var1;
   }

   public Class5884 method18305() {
      return this;
   }

   @Override
   public ILootFunction method18309() {
      return this.field25688.apply(this.method18306());
   }
}
