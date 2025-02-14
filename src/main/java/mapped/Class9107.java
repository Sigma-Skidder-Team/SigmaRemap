package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;

public class Class9107<P extends Class6896> {
   public static final Class9107<Class6897> field41831 = method33959("straight_trunk_placer", Class6897.field29889);
   public static final Class9107<Class6902> field41832 = method33959("forking_trunk_placer", Class6902.field29899);
   public static final Class9107<Class6899> field41833 = method33959("giant_trunk_placer", Class6899.field29893);
   public static final Class9107<Class6900> field41834 = method33959("mega_jungle_trunk_placer", Class6900.field29895);
   public static final Class9107<Class6901> field41835 = method33959("dark_oak_trunk_placer", Class6901.field29897);
   public static final Class9107<Class6898> field41836 = method33959("fancy_trunk_placer", Class6898.field29891);
   private final Codec<P> field41837;

   private static <P extends Class6896> Class9107<P> method33959(String var0, Codec<P> var1) {
      return Registry.<Class9107<P>>register(Registry.field16132, var0, new Class9107<P>(var1));
   }

   private Class9107(Codec<P> var1) {
      this.field41837 = var1;
   }

   public Codec<P> method33960() {
      return this.field41837;
   }
}
