package mapped;

import com.google.gson.JsonObject;

public class Class4881 extends Class4874<Class4456> {
   private static final ResourceLocation field22715 = new ResourceLocation("summoned_entity");

   @Override
   public ResourceLocation method15044() {
      return field22715;
   }

   public Class4456 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587 var6 = Class9587.method37223(var1, "entity", var3);
      return new Class4456(var2, var6);
   }

   public void method15080(Class878 var1, Entity var2) {
      Class7812 var5 = Class6671.method20332(var1, var2);
      this.method15053(var1, var1x -> var1x.method14091(var5));
   }

   // $VF: synthetic method
   public static ResourceLocation method15082() {
      return field22715;
   }
}
