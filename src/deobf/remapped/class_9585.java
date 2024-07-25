package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import java.util.function.Function;

public class class_9585 implements class_5503 {
   private final Identifier field_48753;

   public class_9585(Identifier var1) {
      this.field_48753 = var1;
   }

   @Override
   public <T> boolean method_24969(Function<Identifier, class_2307<T>> var1, Function<Identifier, T> var2, Consumer<T> var3) {
      class_2307 var6 = (class_2307)var1.apply(this.field_48753);
      if (var6 != null) {
         var6.method_10608().forEach(var3);
      }

      return true;
   }

   @Override
   public void method_24970(JsonArray var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("id", "#" + this.field_48753);
      var4.addProperty("required", false);
      var1.add(var4);
   }

   @Override
   public String toString() {
      return "#" + this.field_48753 + "?";
   }
}
