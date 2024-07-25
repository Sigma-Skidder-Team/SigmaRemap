package remapped;

import com.google.gson.JsonElement;
import java.util.function.Consumer;

public abstract class class_9111 {
   private final String field_46654;

   public class_9111(String var1) {
      this.field_46654 = var1;
   }

   public <S extends class_2243<?, S>> boolean method_41961(class_8021<?, S> var1, S var2) {
      class_5019 var5 = var1.method_36440(this.field_46654);
      return var5 != null ? this.method_41959(var2, var5) : false;
   }

   public abstract <T extends Comparable<T>> boolean method_41959(class_2243<?, ?> var1, class_5019<T> var2);

   public abstract JsonElement method_41960();

   public String method_41957() {
      return this.field_46654;
   }

   public void method_41956(class_8021<?, ?> var1, Consumer<String> var2) {
      class_5019 var5 = var1.method_36440(this.field_46654);
      if (var5 == null) {
         var2.accept(this.field_46654);
      }
   }
}
