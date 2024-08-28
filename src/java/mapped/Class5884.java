package mapped;

import java.util.function.Function;

public final class Class5884 extends Class5876<Class5884> {
   private static String[] field25687;
   private final Function<Class122[], Class127> field25688;

   public Class5884(Function<Class122[], Class127> var1) {
      this.field25688 = var1;
   }

   public Class5884 method18305() {
      return this;
   }

   @Override
   public Class127 method18309() {
      return this.field25688.apply(this.method18306());
   }
}
