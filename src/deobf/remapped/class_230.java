package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class class_230 implements class_857 {
   public class_230(class_3257 var1) {
      this.field_752 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);

      try {
         JsonObject var5 = (JsonObject)class_9012.method_41350().fromJson(var4, JsonObject.class);
         if (var5.has("favicon")) {
            var5.addProperty("favicon", var5.get("favicon").getAsString().replace("\n", ""));
         }

         var1.method_23257(class_8039.field_41171, 0, class_9012.method_41350().toJson(var5));
      } catch (JsonParseException var6) {
         var6.printStackTrace();
      }
   }
}
