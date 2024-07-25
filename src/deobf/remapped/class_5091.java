package remapped;

import com.google.gson.JsonArray;
import java.util.function.Consumer;
import java.util.function.Function;

public class class_5091 implements class_5503 {
   private final Identifier field_26268;

   public class_5091(Identifier var1) {
      this.field_26268 = var1;
   }

   @Override
   public <T> boolean method_24969(Function<Identifier, class_2307<T>> var1, Function<Identifier, T> var2, Consumer<T> var3) {
      class_2307 var6 = (class_2307)var1.apply(this.field_26268);
      if (var6 != null) {
         var6.method_10608().forEach(var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_24970(JsonArray var1) {
      var1.add("#" + this.field_26268);
   }

   @Override
   public String toString() {
      return "#" + this.field_26268;
   }
}
