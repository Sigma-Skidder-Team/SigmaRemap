package mapped;

import net.minecraft.util.registry.WorldGenRegistries;

public class Class7827 {
   public static final Class6815<Class4728> field33606 = method26202("cave", Class7195.field30888.method22605(new Class4728(0.14285715F)));
   public static final Class6815<Class4728> field33607 = method26202("canyon", Class7195.field30890.method22605(new Class4728(0.02F)));
   public static final Class6815<Class4728> field33608 = method26202("ocean_cave", Class7195.field30888.method22605(new Class4728(0.06666667F)));
   public static final Class6815<Class4728> field33609 = method26202("underwater_canyon", Class7195.field30891.method22605(new Class4728(0.02F)));
   public static final Class6815<Class4728> field33610 = method26202("underwater_cave", Class7195.field30892.method22605(new Class4728(0.06666667F)));
   public static final Class6815<Class4728> field33611 = method26202("nether_cave", Class7195.field30889.method22605(new Class4728(0.2F)));

   private static <WC extends Class4729> Class6815<WC> method26202(String var0, Class6815<WC> var1) {
      return WorldGenRegistries.<Class6815<WC>>method20496(WorldGenRegistries.field29425, var0, var1);
   }
}
