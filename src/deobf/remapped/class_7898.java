package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class class_7898 extends class_7789<class_6382> {
   public void method_35696(JsonObject var1, class_6382 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("tag", class_6382.method_29168(var2).toString());
   }

   public class_6382 method_35697(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      try {
         class_5734 var6 = class_2392.method_10916(class_6539.method_29796(var1, "tag"));
         return new class_6382(var3, var6, null);
      } catch (CommandSyntaxException var7) {
         throw new JsonSyntaxException(var7.getMessage());
      }
   }
}
