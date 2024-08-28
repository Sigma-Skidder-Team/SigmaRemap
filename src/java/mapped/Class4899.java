package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class Class4899 extends Class4874<Class4486> {
   private static final ResourceLocation field22733 = new ResourceLocation("placed_block");

   @Override
   public ResourceLocation method15044() {
      return field22733;
   }

   public Class4486 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class3209 var6 = method15137(var1);
      Class7340 var7 = Class7340.method23261(var1.get("state"));
      if (var6 != null) {
         var7.method23260(var6.method11577(), var1x -> {
            throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x + ":");
         });
      }

      Class8576 var8 = Class8576.method30653(var1.get("location"));
      Class8634 var9 = Class8634.method31017(var1.get("item"));
      return new Class4486(var2, var6, var7, var8, var9);
   }

   @Nullable
   private static Class3209 method15137(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         ResourceLocation var3 = new ResourceLocation(Class8963.method32763(var0, "block"));
         return Class2348.field16072.method9187(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method15138(Class878 var1, BlockPos var2, Class8848 var3) {
      Class7380 var6 = var1.method2798().method6738(var2);
      this.method15053(var1, var4 -> var4.method14153(var6, var2, var1.method2798(), var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15142() {
      return field22733;
   }
}
