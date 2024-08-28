package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class Class4880 extends Class4874<Class4479> {
   private static final ResourceLocation field22714 = new ResourceLocation("bee_nest_destroyed");

   @Override
   public ResourceLocation method15044() {
      return field22714;
   }

   public Class4479 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Block var6 = method15075(var1);
      Class8634 var7 = Class8634.method31017(var1.get("item"));
      Class8840 var8 = Class8840.method32016(var1.get("num_bees_inside"));
      return new Class4479(var2, var6, var7, var8);
   }

   @Nullable
   private static Block method15075(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         ResourceLocation var3 = new ResourceLocation(Class8963.method32763(var0, "block"));
         return Class2348.field16072.method9187(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method15076(Class878 var1, Block var2, Class8848 var3, int var4) {
      this.method15053(var1, var3x -> var3x.method14140(var2, var3, var4));
   }

   // $VF: synthetic method
   public static ResourceLocation method15079() {
      return field22714;
   }
}
