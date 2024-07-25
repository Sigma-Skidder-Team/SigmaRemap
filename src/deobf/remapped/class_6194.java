package remapped;

import com.google.gson.JsonElement;
import java.util.function.Function;

public class class_6194<T> {
   private static String[] field_31634;
   private final String field_31633;
   private final Function<T, JsonElement> field_31632;

   public class_6194(String var1, Function<T, JsonElement> var2) {
      this.field_31633 = var1;
      this.field_31632 = var2;
   }

   public class_6194<T>.Field method_28327(T var1) {
      return new class_5816((T)this, var1);
   }

   @Override
   public String toString() {
      return this.field_31633;
   }
}
