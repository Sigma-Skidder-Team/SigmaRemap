package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class class_908 extends class_7746<class_203> {
   public void method_3882(JsonObject var1, class_203 var2, JsonSerializationContext var3) {
      super.method_35073(var1, var2, var3);
      var1.addProperty("name", class_8410.method_38721().method_29393().method_43147(class_203.method_873(var2)).toString());
      var1.addProperty("expand", class_203.method_872(var2));
   }

   public class_203 method_3881(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, class_7279[] var5, class_2913[] var6) {
      class_4639 var9 = new class_4639(class_6539.method_29796(var1, "name"));
      class_2307 var10 = class_8410.method_38721().method_29393().method_43140(var9);
      if (var10 != null) {
         boolean var11 = class_6539.method_29771(var1, "expand");
         return new class_203(var10, var11, var3, var4, var5, var6, null);
      } else {
         throw new JsonParseException("Can't find tag: " + var9);
      }
   }
}
