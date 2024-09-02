package mapped;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.Optional;

public interface Class7207<T extends IRecipe<?>> {
   Class7207<Class4842> field30935 = method22634("crafting");
   Class7207<Class4849> field30936 = method22634("smelting");
   Class7207<Class4851> field30937 = method22634("blasting");
   Class7207<Class4848> field30938 = method22634("smoking");
   Class7207<Class4850> field30939 = method22634("campfire_cooking");
   Class7207<Class4845> field30940 = method22634("stonecutting");
   Class7207<Class4846> field30941 = method22634("smithing");

   static <T extends IRecipe<?>> Class7207<T> method22634(String var0) {
      return Registry.<Class7207<?>, Class7207<T>>register(Registry.field16085, new ResourceLocation(var0), new Class7208(var0));
   }

   default <C extends Class920> Optional<T> method22635(IRecipe<C> var1, World var2, C var3) {
      return !var1.method14963(var3, var2) ? Optional.<T>empty() : Optional.<T>of((T)var1);
   }
}
