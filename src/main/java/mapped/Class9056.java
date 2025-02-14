package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class Class9056 {
   private static String[] field41454;

   public static Effect method33703(ResourceLocation var0) {
      return Registry.EFFECTS.method9193(var0) ? Registry.EFFECTS.getOrDefault(var0) : null;
   }
}
