package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class4911 extends Class4874<Class4489> {
   private static final ResourceLocation field22744 = new ResourceLocation("consume_item");

   @Override
   public ResourceLocation method15044() {
      return field22744;
   }

   public Class4489 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      return new Class4489(var2, Class8634.method31017(var1.get("item")));
   }

   public void method15174(ServerPlayerEntity var1, ItemStack var2) {
      this.method15053(var1, var1x -> var1x.method14160(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15176() {
      return field22744;
   }
}
