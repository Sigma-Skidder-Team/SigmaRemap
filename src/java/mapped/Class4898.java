package mapped;

import com.google.gson.JsonObject;

public class Class4898 extends Class4874<Class4461> {
   private static final ResourceLocation field22732 = new ResourceLocation("villager_trade");

   @Override
   public ResourceLocation method15044() {
      return field22732;
   }

   public Class4461 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587 var6 = Class9587.method37223(var1, "villager", var3);
      Class8634 var7 = Class8634.method31017(var1.get("item"));
      return new Class4461(var2, var6, var7);
   }

   public void method15134(Class878 var1, Class1043 var2, ItemStack var3) {
      Class7812 var6 = Class6671.method20332(var1, var2);
      this.method15053(var1, var2x -> var2x.method14103(var6, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15136() {
      return field22732;
   }
}
