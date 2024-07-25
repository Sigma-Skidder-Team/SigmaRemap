package remapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.HashSet;

public class class_3694 extends class_7789<class_4849> {
   public void method_17179(JsonObject var1, class_4849 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("block", class_8669.field_44462.method_39797(class_4849.method_22322(var2)).toString());
      JsonArray var6 = new JsonArray();
      class_4849.method_22323(var2).forEach(var1x -> var6.add(var1x.method_23109()));
      var1.add("properties", var6);
   }

   public class_4849 method_17180(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_4639 var6 = new class_4639(class_6539.method_29796(var1, "block"));
      class_6414 var7 = class_8669.field_44462.method_39794(var6).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var6));
      class_8021 var8 = var7.method_29306();
      HashSet var9 = Sets.newHashSet();
      JsonArray var10 = class_6539.method_29788(var1, "properties", (JsonArray)null);
      if (var10 != null) {
         var10.forEach(var2x -> var9.add(var8.method_36440(class_6539.method_29795(var2x, "property"))));
      }

      return new class_4849(var3, var7, var9, null);
   }
}
