package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class class_3910 extends class_7789<class_5695> {
   public void method_18107(JsonObject var1, class_5695 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("enchantment", class_8669.field_44445.method_39797(class_5695.method_25766(var2)).toString());
      var1.addProperty("formula", class_5695.method_25770(var2).method_15563().toString());
      JsonObject var6 = new JsonObject();
      class_5695.method_25770(var2).method_15565(var6, var3);
      if (var6.size() > 0) {
         var1.add("parameters", var6);
      }
   }

   public class_5695 method_18108(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      Identifier var6 = new Identifier(class_6539.method_29796(var1, "enchantment"));
      class_4382 var7 = class_8669.field_44445.method_39794(var6).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var6));
      Identifier var8 = new Identifier(class_6539.method_29796(var1, "formula"));
      class_4503 var9 = (class_4503)class_5695.method_25767().get(var8);
      if (var9 != null) {
         class_3374 var10;
         if (!var1.has("parameters")) {
            var10 = var9.method_20940(new JsonObject(), var2);
         } else {
            var10 = var9.method_20940(class_6539.method_29783(var1, "parameters"), var2);
         }

         return new class_5695(var3, var7, var10, null);
      } else {
         throw new JsonParseException("Invalid formula id: " + var8);
      }
   }
}
