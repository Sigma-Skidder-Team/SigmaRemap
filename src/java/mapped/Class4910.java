package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class Class4910 extends Class4874<Class4466> {
   private static final ResourceLocation field22743 = new ResourceLocation("enter_block");

   @Override
   public ResourceLocation method15044() {
      return field22743;
   }

   public Class4466 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Block var6 = method15168(var1);
      Class7340 var7 = Class7340.method23261(var1.get("state"));
      if (var6 != null) {
         var7.method23260(var6.method11577(), var1x -> {
            throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x);
         });
      }

      return new Class4466(var2, var6, var7);
   }

   @Nullable
   private static Block method15168(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         ResourceLocation var3 = new ResourceLocation(Class8963.method32763(var0, "block"));
         return Registry.field16072.method9187(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method15169(ServerPlayerEntity var1, Class7380 var2) {
      this.method15053(var1, var1x -> var1x.method14114(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15173() {
      return field22743;
   }
}
