package mapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Class4887 extends Class4874<Class4493> {
   private static final ResourceLocation field22721 = new ResourceLocation("channeled_lightning");

   @Override
   public ResourceLocation method15044() {
      return field22721;
   }

   public Class4493 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587[] var6 = Class9587.method37224(var1, "victims", var3);
      return new Class4493(var2, var6);
   }

   public void method15099(ServerPlayerEntity var1, Collection<? extends Entity> var2) {
      List var5 = var2.stream().<LootContext>map(var1x -> Class6671.method20332(var1, var1x)).collect(Collectors.toList());
      this.method15053(var1, var1x -> var1x.method14170(var5));
   }

   // $VF: synthetic method
   public static ResourceLocation method15102() {
      return field22721;
   }
}
