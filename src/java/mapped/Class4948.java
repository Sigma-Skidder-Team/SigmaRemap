package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.ResourceLocation;

public class Class4948 implements ILootSerializer<Class161> {
   public void serialize(JsonObject var1, Class161 var2, JsonSerializationContext var3) {
      var1.addProperty("block", Registry.BLOCK.getKey(Class161.method487(var2)).toString());
      var1.add("properties", Class161.method488(var2).method23262());
   }

   public Class161 method15248(JsonObject var1, JsonDeserializationContext var2) {
      ResourceLocation var5 = new ResourceLocation(JSONUtils.getString(var1, "block"));
      Block var6 = Registry.BLOCK.method9187(var5).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var5));
      Class7340 var7 = Class7340.method23261(var1.get("properties"));
      var7.method23260(var6.getStateContainer(), var1x -> {
         throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x);
      });
      return new Class161(var6, var7);
   }
}
