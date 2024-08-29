package mapped;

public class Class9047 {
   private static String[] field41425;
   private static final Minecraft field41426 = Minecraft.getInstance();

   public static double[] method33642(Class880 var0) {
      if (var0 != null) {
         double var3 = var0.getPosX() - var0.lastTickPosX;
         double var5 = 0.0;
         double var7 = var0.getPosZ() - var0.lastTickPosZ;
         return new double[]{var0.getPosX() + var3 * 2.0, var0.getPosY() + 0.0, var0.getPosZ() + var7 * 2.0};
      } else {
         return new double[]{0.0, 0.0, 0.0};
      }
   }

   public static double[] method33643(Class880 var0) {
      if (var0 != null) {
         double var3 = var0.getPosX() - var0.lastTickPosX;
         double var5 = 0.0;
         double var7 = var0.getPosZ() - var0.lastTickPosZ;
         return new double[]{
            var0.getPosX() + var3 * (double)Class5628.method17705() / 50.0,
            var0.getPosY() + 0.0 * (double)Class5628.method17705() / 50.0,
            var0.getPosZ() + var7 * (double)Class5628.method17705() / 50.0
         };
      } else {
         return new double[]{0.0, 0.0, 0.0};
      }
   }
}
