package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class Class4884 extends Class4874<Class4492> {
   private static final ResourceLocation field22718 = new ResourceLocation("thrown_item_picked_up_by_entity");

   @Override
   public ResourceLocation method15044() {
      return field22718;
   }

   public Class4492 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      Class9587 var7 = Class9587.method37223(var1, "entity", var3);
      return new Class4492(var2, var6, var7);
   }

   public void method15090(ServerPlayerEntity var1, ItemStack var2, Entity var3) {
      LootContext var6 = Class6671.method20332(var1, var3);
      this.method15053(var1, var3x -> var3x.method14168(var1, var2, var6));
   }

   // $VF: synthetic method
   public static ResourceLocation method15092() {
      return field22718;
   }
}
