package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import java.util.function.Function;

public class class_3833 implements class_5503 {
   private final Identifier field_18721;

   public class_3833(Identifier var1) {
      this.field_18721 = var1;
   }

   @Override
   public <T> boolean method_24969(Function<Identifier, class_2307<T>> var1, Function<Identifier, T> var2, Consumer<T> var3) {
      Object var6 = var2.apply(this.field_18721);
      if (var6 != null) {
         var3.accept(var6);
      }

      return true;
   }

   @Override
   public void method_24970(JsonArray var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("id", this.field_18721.toString());
      var4.addProperty("required", false);
      var1.add(var4);
   }

   @Override
   public String toString() {
      return this.field_18721.toString() + "?";
   }
}
