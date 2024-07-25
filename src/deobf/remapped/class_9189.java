package remapped;

public class class_9189 {
   private static String[] field_47006;
   private static MinecraftClient field_47005 = MinecraftClient.getInstance();

   public static double method_42352(Entity var0) {
      double var3 = method_42357(field_47005.thePlayer).field_42648 - method_42357(var0).field_42648;
      double var5 = method_42357(field_47005.thePlayer).field_42646 - method_42357(var0).field_42646;
      double var7 = method_42357(field_47005.thePlayer).field_42649 - method_42357(var0).field_42649;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static double method_42355(BlockPos var0) {
      double var3 = method_42357(field_47005.thePlayer).field_42648 - (double)var0.method_12173();
      double var5 = method_42357(field_47005.thePlayer).field_42646 - (double)var0.method_12165();
      double var7 = method_42357(field_47005.thePlayer).field_42649 - (double)var0.method_12185();
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static class_8328 method_42357(Entity var0) {
      return new class_8328(
         var0.field_41754 + (var0.getPosX() - var0.field_41754) * (double)field_47005.theTimer.field_32600,
         var0.field_41713 + (var0.method_37309() - var0.field_41713) * (double)field_47005.theTimer.field_32600,
         var0.field_41724 + (var0.getPosZ() - var0.field_41724) * (double)field_47005.theTimer.field_32600
      );
   }

   public static class_8328 method_42353(Entity var0) {
      class_8328 var3 = method_42357(var0);
      return new class_8328(
         var3.field_42648 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_61(),
         var3.field_42646 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_60(),
         var3.field_42649 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_62()
      );
   }

   public static class_8328 method_42356(BlockPos var0) {
      return new class_8328(
         (double)var0.method_12173() - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_61(),
         (double)var0.method_12165() - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_60(),
         (double)var0.method_12185() - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_62()
      );
   }
}
