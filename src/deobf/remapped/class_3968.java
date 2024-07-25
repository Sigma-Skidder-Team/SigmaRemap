package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class class_3968 implements class_6478<class_6783> {
   public void method_18319(JsonObject var1, class_6783 var2, JsonSerializationContext var3) {
      var1.addProperty("enchantment", class_8669.field_44445.method_39797(class_6783.method_31098(var2)).toString());
      var1.add("chances", var3.serialize(class_6783.method_31097(var2)));
   }

   public class_6783 method_18320(JsonObject var1, JsonDeserializationContext var2) {
      class_4639 var5 = new class_4639(class_6539.method_29796(var1, "enchantment"));
      class_4382 var6 = class_8669.field_44445.method_39794(var5).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var5));
      float[] var7 = class_6539.<float[]>method_29778(var1, "chances", var2, float[].class);
      return new class_6783(var6, var7, null);
   }
}
