package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_9308 implements class_6478<class_1600> {
   public void method_42967(JsonObject var1, class_1600 var2, JsonSerializationContext var3) {
      var1.add("predicate", class_1600.method_7178(var2).method_23398());
      if (class_1600.method_7180(var2).method_12173() != 0) {
         var1.addProperty("offsetX", class_1600.method_7180(var2).method_12173());
      }

      if (class_1600.method_7180(var2).method_12165() != 0) {
         var1.addProperty("offsetY", class_1600.method_7180(var2).method_12165());
      }

      if (class_1600.method_7180(var2).method_12185() != 0) {
         var1.addProperty("offsetZ", class_1600.method_7180(var2).method_12185());
      }
   }

   public class_1600 method_42969(JsonObject var1, JsonDeserializationContext var2) {
      class_5093 var5 = class_5093.method_23396(var1.get("predicate"));
      int var6 = class_6539.method_29768(var1, "offsetX", 0);
      int var7 = class_6539.method_29768(var1, "offsetY", 0);
      int var8 = class_6539.method_29768(var1, "offsetZ", 0);
      return new class_1600(var5, new BlockPos(var6, var7, var8), null);
   }
}
