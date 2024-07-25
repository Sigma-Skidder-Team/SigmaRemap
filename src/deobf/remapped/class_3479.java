package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class_3479 {
   private final class_7781 field_17058;
   private final class_7781 field_17061;
   private final Boolean field_17059;
   private final Boolean field_17057;

   public class_3479(class_7781 var1, class_7781 var2, Boolean var3, Boolean var4) {
      this.field_17058 = var1;
      this.field_17061 = var2;
      this.field_17059 = var3;
      this.field_17057 = var4;
   }

   public class_3479() {
      this(class_7781.field_39439, class_7781.field_39439, (Boolean)null, (Boolean)null);
   }

   public boolean method_15972(class_2250 var1) {
      if (var1 != null) {
         if (!this.field_17058.method_35307(var1.method_10333())) {
            return false;
         } else if (this.field_17061.method_35307(var1.method_10347())) {
            return this.field_17059 != null && this.field_17059 != var1.method_10338()
               ? false
               : this.field_17057 == null || this.field_17057 == var1.method_10336();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public JsonElement method_15973() {
      JsonObject var3 = new JsonObject();
      var3.add("amplifier", this.field_17058.method_27853());
      var3.add("duration", this.field_17061.method_27853());
      var3.addProperty("ambient", this.field_17059);
      var3.addProperty("visible", this.field_17057);
      return var3;
   }

   public static class_3479 method_15974(JsonObject var0) {
      class_7781 var3 = class_7781.method_35310(var0.get("amplifier"));
      class_7781 var4 = class_7781.method_35310(var0.get("duration"));
      Boolean var5 = !var0.has("ambient") ? null : class_6539.method_29771(var0, "ambient");
      Boolean var6 = !var0.has("visible") ? null : class_6539.method_29771(var0, "visible");
      return new class_3479(var3, var4, var5, var6);
   }
}
