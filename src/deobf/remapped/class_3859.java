package remapped;

import java.util.Map.Entry;
import java.util.function.Function;

public final class class_3859 implements Function<Entry<class_5019<?>, Comparable<?>>, String> {
   public String apply(Entry<class_5019<?>, Comparable<?>> var1) {
      if (var1 != null) {
         class_5019 var4 = (class_5019)var1.getKey();
         return var4.method_23109() + "=" + this.method_17901(var4, (Comparable<?>)var1.getValue());
      } else {
         return "<NULL>";
      }
   }

   private <T extends Comparable<T>> String method_17901(class_5019<T> var1, Comparable<?> var2) {
      return var1.method_23110((T)var2);
   }
}
