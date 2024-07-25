package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;

public class class_5366 extends class_9111 {
   private final String field_27379;
   private final String field_27378;

   public class_5366(String var1, String var2, String var3) {
      super(var1);
      this.field_27379 = var2;
      this.field_27378 = var3;
   }

   @Override
   public <T extends Comparable<T>> boolean method_41959(class_2243<?, ?> var1, class_5019<T> var2) {
      Comparable var5 = var1.<Comparable>method_10313(var2);
      if (this.field_27379 != null) {
         Optional var6 = var2.method_23108(this.field_27379);
         if (!var6.isPresent() || var5.compareTo(var6.get()) < 0) {
            return false;
         }
      }

      if (this.field_27378 != null) {
         Optional var7 = var2.method_23108(this.field_27378);
         if (!var7.isPresent() || var5.compareTo(var7.get()) > 0) {
            return false;
         }
      }

      return true;
   }

   @Override
   public JsonElement method_41960() {
      JsonObject var3 = new JsonObject();
      if (this.field_27379 != null) {
         var3.addProperty("min", this.field_27379);
      }

      if (this.field_27378 != null) {
         var3.addProperty("max", this.field_27378);
      }

      return var3;
   }
}
