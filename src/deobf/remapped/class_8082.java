package remapped;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class class_8082<V> implements Supplier<V> {
   private static String[] field_41364;
   private final String field_41365;
   private final V field_41367;
   private final Function<V, String> field_41368;

   private class_8082(String var1, V var2, Function<V, String> var3, Function var4) {
      this.field_41366 = var1;
      this.field_41365 = var2;
      this.field_41367 = (V)var3;
      this.field_41368 = var4;
   }

   @Override
   public V get() {
      return this.field_41367;
   }

   public T method_36703(class_6322 var1, V var2) {
      Properties var5 = this.field_41366.method_38604();
      var5.put(this.field_41365, this.field_41368.apply((V)var2));
      return (T)this.field_41366.method_38601(var1, var5);
   }
}
