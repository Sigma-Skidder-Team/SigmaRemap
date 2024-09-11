package mapped;

import net.minecraft.util.registry.Registry;

import java.util.function.Function;

public class LootTypesManager {
   private static String[] field45373;

   public static <E, T extends Class7129<E>> Class8643<E, T> getLootTypeRegistryWrapper(Registry<T> var0, String var1, String var2, Function<E, T> var3) {
      return new Class8643<>(var0, var1, var2, var3);
   }
}
