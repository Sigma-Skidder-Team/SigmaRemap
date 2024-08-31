package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

public class Class4891 extends Class4874<Class4462> {
   private static final ResourceLocation field22725 = new ResourceLocation("bred_animals");

   @Override
   public ResourceLocation method15044() {
      return field22725;
   }

   public Class4462 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587 var6 = Class9587.method37223(var1, "parent", var3);
      Class9587 var7 = Class9587.method37223(var1, "partner", var3);
      Class9587 var8 = Class9587.method37223(var1, "child", var3);
      return new Class4462(var2, var6, var7, var8);
   }

   public void method15112(ServerPlayerEntity var1, Class1018 var2, Class1018 var3, Class1045 var4) {
      LootContext var7 = Class6671.method20332(var1, var2);
      LootContext var8 = Class6671.method20332(var1, var3);
      LootContext var9 = var4 == null ? null : Class6671.method20332(var1, var4);
      this.method15053(var1, var3x -> var3x.method14107(var7, var8, var9));
   }

   // $VF: synthetic method
   public static ResourceLocation method15114() {
      return field22725;
   }
}
