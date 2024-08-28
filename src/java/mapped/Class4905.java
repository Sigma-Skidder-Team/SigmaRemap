package mapped;

import com.google.gson.JsonObject;

public class Class4905 extends Class4874<Class4476> {
   private final ResourceLocation field22739;

   public Class4905(ResourceLocation var1) {
      this.field22739 = var1;
   }

   @Override
   public ResourceLocation method15044() {
      return this.field22739;
   }

   public Class4476 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      return new Class4476(this.field22739, var2, Class9587.method37223(var1, "entity", var3), Class9539.method36913(var1.get("killing_blow")));
   }

   public void method15158(ServerPlayerEntity var1, Entity var2, Class8654 var3) {
      Class7812 var6 = Class6671.method20332(var1, var2);
      this.method15053(var1, var3x -> var3x.method14138(var1, var6, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15160(Class4905 var0) {
      return var0.field22739;
   }
}
