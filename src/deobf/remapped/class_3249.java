package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class class_3249 extends class_7789<class_4724> {
   public void method_14862(JsonObject var1, class_4724 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      JsonArray var6 = new JsonArray();

      for (class_1090 var8 : class_4724.method_21839(var2)) {
         var6.add(var8.method_4775(var3));
      }

      var1.add("modifiers", var6);
   }

   public class_4724 method_14863(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      JsonArray var6 = class_6539.method_29787(var1, "modifiers");
      ArrayList var7 = Lists.newArrayListWithExpectedSize(var6.size());

      for (JsonElement var9 : var6) {
         var7.add(class_1090.method_4770(class_6539.method_29782(var9, "modifier"), var2));
      }

      if (!var7.isEmpty()) {
         return new class_4724(var3, var7, null);
      } else {
         throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
      }
   }
}
