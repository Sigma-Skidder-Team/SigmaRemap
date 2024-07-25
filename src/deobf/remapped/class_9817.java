package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Optional;

public class class_9817 extends class_9111 {
   private static String[] field_49754;
   private final String field_49753;

   public class_9817(String var1, String var2) {
      super(var1);
      this.field_49753 = var2;
   }

   @Override
   public <T extends Comparable<T>> boolean method_41959(class_2243<?, ?> var1, class_5019<T> var2) {
      Comparable var5 = var1.<Comparable>method_10313(var2);
      Optional var6 = var2.method_23108(this.field_49753);
      return var6.isPresent() && var5.compareTo(var6.get()) == 0;
   }

   @Override
   public JsonElement method_41960() {
      return new JsonPrimitive(this.field_49753);
   }
}
