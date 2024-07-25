package remapped;

public class class_6811 {
   private static String[] field_35143;
   private static final MinecraftClient field_35144 = MinecraftClient.getInstance();

   public static double[] method_31263(LivingEntity var0) {
      if (var0 != null) {
         double var3 = var0.getPosX() - var0.field_41754;
         double var5 = 0.0;
         double var7 = var0.getPosZ() - var0.field_41724;
         return new double[]{var0.getPosX() + var3 * 2.0, var0.method_37309() + 0.0, var0.getPosZ() + var7 * 2.0};
      } else {
         return new double[]{0.0, 0.0, 0.0};
      }
   }

   public static double[] method_31265(LivingEntity var0) {
      if (var0 != null) {
         double var3 = var0.getPosX() - var0.field_41754;
         double var5 = 0.0;
         double var7 = var0.getPosZ() - var0.field_41724;
         return new double[]{
            var0.getPosX() + var3 * (double)class_314.method_1448() / 50.0,
            var0.method_37309() + 0.0 * (double)class_314.method_1448() / 50.0,
            var0.getPosZ() + var7 * (double)class_314.method_1448() / 50.0
         };
      } else {
         return new double[]{0.0, 0.0, 0.0};
      }
   }
}
