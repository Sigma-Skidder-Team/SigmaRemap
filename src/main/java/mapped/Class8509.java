package mapped;

import net.minecraft.world.World;

public class Class8509 {
   private static String[] field37207;

   public static int method30144(World var0) {
      return var0 != null ? method30145(var0.getDimensionKey()) : 0;
   }

   public static int method30145(RegistryKey<World> var0) {
      if (var0 != World.THE_NETHER) {
         if (var0 != World.OVERWORLD) {
            return var0 != World.THE_END ? 0 : 1;
         } else {
            return 0;
         }
      } else {
         return -1;
      }
   }

   public static boolean method30146(World var0) {
      return var0.getDimensionKey() == World.THE_NETHER;
   }

   public static boolean method30147(World var0) {
      RegistryKey var3 = var0.getDimensionKey();
      return method30145(var3) == 0;
   }

   public static boolean method30148(World var0) {
      return var0.getDimensionKey() == World.THE_END;
   }
}
