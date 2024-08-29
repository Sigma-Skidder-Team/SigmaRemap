package mapped;

public class Class9647 {
   private static String[] field45106;
   private static Minecraft field45107 = Minecraft.getInstance();

   public static double method37620(Entity var0) {
      double var3 = method37622(field45107.player).field43722 - method37622(var0).field43722;
      double var5 = method37622(field45107.player).field43723 - method37622(var0).field43723;
      double var7 = method37622(field45107.player).field43724 - method37622(var0).field43724;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static double method37621(BlockPos var0) {
      double var3 = method37622(field45107.player).field43722 - (double)var0.getX();
      double var5 = method37622(field45107.player).field43723 - (double)var0.getY();
      double var7 = method37622(field45107.player).field43724 - (double)var0.getZ();
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static Class9425 method37622(Entity var0) {
      return new Class9425(
         var0.lastTickPosX + (var0.getPosX() - var0.lastTickPosX) * (double)field45107.timer.renderPartialTicks,
         var0.lastTickPosY + (var0.getPosY() - var0.lastTickPosY) * (double)field45107.timer.renderPartialTicks,
         var0.lastTickPosZ + (var0.getPosZ() - var0.lastTickPosZ) * (double)field45107.timer.renderPartialTicks
      );
   }

   public static Class9425 method37623(Entity var0) {
      Class9425 var3 = method37622(var0);
      return new Class9425(
         var3.field43722 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11320(),
         var3.field43723 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11321(),
         var3.field43724 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11322()
      );
   }

   public static Class9425 method37624(BlockPos var0) {
      return new Class9425(
         (double)var0.getX() - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11320(),
         (double)var0.getY() - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11321(),
         (double)var0.getZ() - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11322()
      );
   }
}
