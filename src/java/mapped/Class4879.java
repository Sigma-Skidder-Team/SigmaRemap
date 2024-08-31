package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.ResourceLocation;

public class Class4879 extends Class4874<Class4470> {
   private static final ResourceLocation field22713 = new ResourceLocation("brewed_potion");

   @Override
   public ResourceLocation method15044() {
      return field22713;
   }

   public Class4470 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8812 var6 = null;
      if (var1.has("potion")) {
         ResourceLocation var7 = new ResourceLocation(JSONUtils.method32763(var1, "potion"));
         var6 = Registry.field16076.method9187(var7).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var7 + "'"));
      }

      return new Class4470(var2, var6);
   }

   public void method15071(ServerPlayerEntity var1, Class8812 var2) {
      this.method15053(var1, var1x -> var1x.method14123(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15074() {
      return field22713;
   }
}
