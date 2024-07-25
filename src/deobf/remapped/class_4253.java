package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class class_4253 implements class_6478<class_5805> {
   public void method_19829(JsonObject var1, class_5805 var2, JsonSerializationContext var3) {
      var1.addProperty("block", class_8669.field_44462.method_39797(class_5805.method_26298(var2)).toString());
      var1.add("properties", class_5805.method_26296(var2).method_8078());
   }

   public class_5805 method_19830(JsonObject var1, JsonDeserializationContext var2) {
      Identifier var5 = new Identifier(class_6539.method_29796(var1, "block"));
      class_6414 var6 = class_8669.field_44462.method_39794(var5).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var5));
      class_1827 var7 = class_1827.method_8079(var1.get("properties"));
      var7.method_8075(var6.method_29306(), var1x -> {
         throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x);
      });
      return new class_5805(var6, var7, null);
   }
}
