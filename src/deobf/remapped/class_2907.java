package remapped;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class class_2907<T extends class_8932<?>> implements class_2994<T> {
   private static String[] field_14180;
   private final Function<Identifier, T> field_14181;

   public class_2907(Function<Identifier, T> var1) {
      this.field_14181 = var1;
   }

   @Override
   public T method_13696(Identifier var1, JsonObject var2) {
      return this.field_14181.apply(var1);
   }

   @Override
   public T method_13697(Identifier var1, class_8248 var2) {
      return this.field_14181.apply(var1);
   }

   @Override
   public void method_13694(class_8248 var1, T var2) {
   }
}
