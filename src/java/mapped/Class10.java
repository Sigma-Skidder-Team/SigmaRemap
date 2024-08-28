package mapped;

import java.util.Map.Entry;
import java.util.function.Function;

public final class Class10 implements Function<Entry<Class8550<?>, Comparable<?>>, String> {
   public String apply(Entry<Class8550<?>, Comparable<?>> var1) {
      if (var1 != null) {
         Class8550 var4 = (Class8550)var1.getKey();
         return var4.method30472() + "=" + this.method56(var4, (Comparable<?>)var1.getValue());
      } else {
         return "<NULL>";
      }
   }

   private <T extends Comparable<T>> String method56(Class8550<T> var1, Comparable<?> var2) {
      return var1.method30475((T)var2);
   }
}
