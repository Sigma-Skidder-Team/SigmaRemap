package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.Biome;

public class Class8527 {
   private static String[] field38300;
   public static final Class8980 field38301 = Biome::method32510;
   public static final Class8980 field38302 = (var0, var1, var3) -> var0.method32512();
   public static final Class8980 field38303 = (var0, var1, var3) -> var0.method32520();

   private static int method30241(IBlockDisplayReader var0, BlockPos var1, Class8980 var2) {
      return var0.method6878(var1, var2);
   }

   public static int method30242(IBlockDisplayReader var0, BlockPos var1) {
      return method30241(var0, var1, field38301);
   }

   public static int method30243(IBlockDisplayReader var0, BlockPos var1) {
      return method30241(var0, var1, field38302);
   }

   public static int method30244(IBlockDisplayReader var0, BlockPos var1) {
      return method30241(var0, var1, field38303);
   }
}
