package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_2012 implements class_6478<class_1130> {
   public void method_9332(JsonObject var1, class_1130 var2, JsonSerializationContext var3) {
      var1.addProperty("name", class_1130.method_4960(var2).toString());
   }

   public class_1130 method_9333(JsonObject var1, JsonDeserializationContext var2) {
      Identifier var5 = new Identifier(class_6539.method_29796(var1, "name"));
      return new class_1130(var5, null);
   }
}
