package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;

public class class_251 extends class_7789<class_795> {
   public void method_1093(JsonObject var1, class_795 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("source", class_795.method_3530(var2).field_48024);
      JsonArray var6 = new JsonArray();
      class_795.method_3532(var2).stream().<JsonObject>map(class_8995::method_41265).forEach(var6::add);
      var1.add("ops", var6);
   }

   public class_795 method_1094(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_9397 var6 = class_9397.method_43480(class_6539.method_29796(var1, "source"));
      ArrayList var7 = Lists.newArrayList();

      for (JsonElement var9 : class_6539.method_29787(var1, "ops")) {
         JsonObject var10 = class_6539.method_29782(var9, "op");
         var7.add(class_8995.method_41268(var10));
      }

      return new class_795(var3, var6, var7, null);
   }
}
