package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.ResourceLocation;

public class Class4937 extends Class4936<Class4695> {
   public void method15249(JsonObject var1, Class4695 var2, JsonSerializationContext var3) {
      super.method15249(var1, var2, var3);
      ResourceLocation var6 = Registry.ITEM.getKey(Class4695.method14726(var2));
      if (var6 != null) {
         var1.addProperty("name", var6.toString());
      } else {
         throw new IllegalArgumentException("Can't serialize unknown item " + Class4695.method14726(var2));
      }
   }

   public Class4695 method15251(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, ILootCondition[] var5, ILootFunction[] var6) {
      Item var9 = JSONUtils.method32766(var1, "name");
      return new Class4695(var9, var3, var4, var5, var6);
   }
}
