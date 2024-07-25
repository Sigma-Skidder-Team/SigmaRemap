package remapped;

import com.google.gson.JsonArray;
import java.util.function.Consumer;
import java.util.function.Function;

public class class_4289 implements class_5503 {
   private static String[] field_20813;
   private final Identifier field_20812;

   public class_4289(Identifier var1) {
      this.field_20812 = var1;
   }

   @Override
   public <T> boolean method_24969(Function<Identifier, class_2307<T>> var1, Function<Identifier, T> var2, Consumer<T> var3) {
      Object var6 = var2.apply(this.field_20812);
      if (var6 != null) {
         var3.accept(var6);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_24970(JsonArray var1) {
      var1.add(this.field_20812.toString());
   }

   @Override
   public String toString() {
      return this.field_20812.toString();
   }
}
