package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;

import java.util.Collection;

public class Class4895 extends Class4874<Class4487> {
   private static final ResourceLocation field22729 = new ResourceLocation("fishing_rod_hooked");

   @Override
   public ResourceLocation method15044() {
      return field22729;
   }

   public Class4487 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("rod"));
      Class9587 var7 = Class9587.method37223(var1, "entity", var3);
      Class8634 var8 = Class8634.method31017(var1.get("item"));
      return new Class4487(var2, var6, var7, var8);
   }

   public void method15124(ServerPlayerEntity var1, ItemStack var2, Class904 var3, Collection<ItemStack> var4) {
      LootContext var7 = Class6671.method20332(var1, (Entity)(var3.method3545() == null ? var3 : var3.method3545()));
      this.method15053(var1, var3x -> var3x.method14155(var2, var7, var4));
   }

   // $VF: synthetic method
   public static ResourceLocation method15126() {
      return field22729;
   }
}
