package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_9282 implements class_6478<class_1460> {
   public void method_42745(JsonObject var1, class_1460 var2, JsonSerializationContext var3) {
      var1.addProperty("raining", class_1460.method_6762(var2));
      var1.addProperty("thundering", class_1460.method_6760(var2));
   }

   public class_1460 method_42746(JsonObject var1, JsonDeserializationContext var2) {
      Boolean var5 = !var1.has("raining") ? null : class_6539.method_29771(var1, "raining");
      Boolean var6 = !var1.has("thundering") ? null : class_6539.method_29771(var1, "thundering");
      return new class_1460(var5, var6, null);
   }
}
