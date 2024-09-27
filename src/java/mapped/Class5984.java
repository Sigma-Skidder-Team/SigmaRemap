package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;

public class Class5984<P extends Class6819> {
   public static final Class5984<Class6824> field26059 = method18558("blob_foliage_placer", Class6824.field29696);
   public static final Class5984<Class6820> field26060 = method18558("spruce_foliage_placer", Class6820.field29688);
   public static final Class5984<Class6818> field26061 = method18558("pine_foliage_placer", Class6818.field29683);
   public static final Class5984<Class6821> field26062 = method18558("acacia_foliage_placer", Class6821.field29691);
   public static final Class5984<Class6826> field26063 = method18558("bush_foliage_placer", Class6826.field29701);
   public static final Class5984<Class6825> field26064 = method18558("fancy_foliage_placer", Class6825.field29699);
   public static final Class5984<Class6827> field26065 = method18558("jungle_foliage_placer", Class6827.field29702);
   public static final Class5984<Class6822> field26066 = method18558("mega_pine_foliage_placer", Class6822.field29692);
   public static final Class5984<Class6823> field26067 = method18558("dark_oak_foliage_placer", Class6823.field29695);
   private final Codec<P> field26068;

   private static <P extends Class6819> Class5984<P> method18558(String var0, Codec<P> var1) {
      return Registry.<Class5984<P>>register(Registry.field16131, var0, new Class5984<P>(var1));
   }

   private Class5984(Codec<P> var1) {
      this.field26068 = var1;
   }

   public Codec<P> method18559() {
      return this.field26068;
   }
}
