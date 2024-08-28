package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class Class4940 extends Class4936<Class4685> {
   public void method15249(JsonObject var1, Class4685 var2, JsonSerializationContext var3) {
      super.method15249(var1, var2, var3);
      var1.addProperty("name", Class9443.method36296().method32658().method27136(Class4685.method14701(var2)).toString());
      var1.addProperty("expand", Class4685.method14702(var2));
   }

   public Class4685 method15251(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, ILootCondition[] var5, ILootFunction[] var6) {
      ResourceLocation var9 = new ResourceLocation(JSONUtils.method32763(var1, "name"));
      Class7608 var10 = Class9443.method36296().method32658().method27135(var9);
      if (var10 != null) {
         boolean var11 = JSONUtils.method32768(var1, "expand");
         return new Class4685(var10, var11, var3, var4, var5, var6, null);
      } else {
         throw new JsonParseException("Can't find tag: " + var9);
      }
   }
}
