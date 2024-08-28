package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Class4958 extends Class4928<Class136> {
   public void method15246(JsonObject var1, Class136 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.addProperty("tag", Class136.method401(var2).toString());
   }

   public Class136 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      try {
         Class39 var6 = Class7671.method25188(Class8963.method32763(var1, "tag"));
         return new Class136(var3, var6);
      } catch (CommandSyntaxException var7) {
         throw new JsonSyntaxException(var7.getMessage());
      }
   }
}
