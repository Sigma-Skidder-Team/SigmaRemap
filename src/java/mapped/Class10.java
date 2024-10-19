package mapped;

import net.minecraft.state.Property;

import java.util.Map.Entry;
import java.util.function.Function;

public final class Class10 implements Function<Entry<Property<?>, Comparable<?>>, String> {
   public String apply(Entry<Property<?>, Comparable<?>> var1) {
      if (var1 != null) {
         Property var4 = (Property)var1.getKey();
         return var4.method30472() + "=" + this.method56(var4, (Comparable<?>)var1.getValue());
      } else {
         return "<NULL>";
      }
   }

   private <T extends Comparable<T>> String method56(Property<T> var1, Comparable<?> var2) {
      return var1.getName((T)var2);
   }
}
