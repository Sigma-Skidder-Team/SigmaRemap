package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Class3733<E extends Class1006> extends Class3676<E> {
   private static String[] field19845;
   private final Predicate<E> field19846;
   private final Function<E, Optional<? extends Class880>> field19847;

   public Class3733(Predicate<E> var1, Function<E, Optional<? extends Class880>> var2) {
      super(ImmutableMap.of(Class8830.field39826, Class2217.field14485, Class8830.field39841, Class2217.field14486));
      this.field19846 = var1;
      this.field19847 = var2;
   }

   public Class3733(Function<E, Optional<? extends Class880>> var1) {
      this(var0 -> true, var1);
   }

   public boolean method12508(Class1657 var1, E var2) {
      if (!this.field19846.test((E)var2)) {
         return false;
      } else {
         Optional var5 = this.field19847.apply((E)var2);
         return var5.isPresent() && ((Class880)var5.get()).method3066();
      }
   }

   public void method12502(Class1657 var1, E var2, long var3) {
      this.field19847.apply((E)var2).ifPresent(var2x -> this.method12659((E)var2, var2x));
   }

   private void method12659(E var1, Class880 var2) {
      var1.method2992().method21406(Class8830.field39826, var2);
      var1.method2992().method21405(Class8830.field39841);
   }
}
