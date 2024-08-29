package mapped;

import java.util.UUID;

public class Class5995 {
   private static String[] field26171;

   public static ServerWorld method18604() {
      Minecraft var2 = Class7944.method26860();
      ClientWorld var3 = var2.world;
      if (var3 == null) {
         return null;
      } else if (!var2.isIntegratedServerRunning()) {
         return null;
      } else {
         IntegratedServer var4 = var2.getIntegratedServer();
         if (var4 == null) {
            return null;
         } else {
            RegistryKey var5 = var3.getDimensionKey();
            if (var5 == null) {
               return null;
            } else {
               try {
                  return var4.method1318(var5);
               } catch (NullPointerException var7) {
                  return null;
               }
            }
         }
      }
   }

   public static Entity method18605(UUID var0) {
      ServerWorld var3 = method18604();
      return var3 != null ? var3.method6942(var0) : null;
   }

   public static TileEntity method18606(BlockPos var0) {
      ServerWorld var3 = method18604();
      if (var3 != null) {
         Class1670 var4 = var3.method6883().method7346(var0.getX() >> 4, var0.getZ() >> 4, Class9176.field42145, false);
         return var4 != null ? var4.getTileEntity(var0) : null;
      } else {
         return null;
      }
   }
}
