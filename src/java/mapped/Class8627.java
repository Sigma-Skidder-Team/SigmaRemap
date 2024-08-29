package mapped;

public class Class8627 {
   private static String[] field38806;
   private static Minecraft field38807 = Minecraft.getInstance();

   public static boolean method30924(Class9510 var0) {
      boolean var3 = true;

      for (long var5 : var0.field44281) {
         BlockPos var7 = BlockPos.method8331(var5);
         if (!field38807.world.getBlockState(var7).isAir()) {
            var3 = false;
            break;
         }
      }

      return var3;
   }

   public static boolean method30925() {
      return field38807.player.field5036
         && field38807.world.method7055(field38807.player, field38807.player.method3389().method19667(0.0, 1.0, 0.0)).count() == 0L;
   }
}
