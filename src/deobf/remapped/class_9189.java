package remapped;

public class class_9189 {
   private static String[] field_47006;
   private static MinecraftClient field_47005 = MinecraftClient.method_8510();

   public static double method_42352(class_8145 var0) {
      double var3 = method_42357(field_47005.field_9632).field_42648 - method_42357(var0).field_42648;
      double var5 = method_42357(field_47005.field_9632).field_42646 - method_42357(var0).field_42646;
      double var7 = method_42357(field_47005.field_9632).field_42649 - method_42357(var0).field_42649;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static double method_42355(class_1331 var0) {
      double var3 = method_42357(field_47005.field_9632).field_42648 - (double)var0.method_12173();
      double var5 = method_42357(field_47005.field_9632).field_42646 - (double)var0.method_12165();
      double var7 = method_42357(field_47005.field_9632).field_42649 - (double)var0.method_12185();
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static class_8328 method_42357(class_8145 var0) {
      return new class_8328(
         var0.field_41754 + (var0.method_37302() - var0.field_41754) * (double)field_47005.field_9616.field_32600,
         var0.field_41713 + (var0.method_37309() - var0.field_41713) * (double)field_47005.field_9616.field_32600,
         var0.field_41724 + (var0.method_37156() - var0.field_41724) * (double)field_47005.field_9616.field_32600
      );
   }

   public static class_8328 method_42353(class_8145 var0) {
      class_8328 var3 = method_42357(var0);
      return new class_8328(
         var3.field_42648 - MinecraftClient.method_8510().field_9590.method_35949().method_41627().method_61(),
         var3.field_42646 - MinecraftClient.method_8510().field_9590.method_35949().method_41627().method_60(),
         var3.field_42649 - MinecraftClient.method_8510().field_9590.method_35949().method_41627().method_62()
      );
   }

   public static class_8328 method_42356(class_1331 var0) {
      return new class_8328(
         (double)var0.method_12173() - MinecraftClient.method_8510().field_9590.method_35949().method_41627().method_61(),
         (double)var0.method_12165() - MinecraftClient.method_8510().field_9590.method_35949().method_41627().method_60(),
         (double)var0.method_12185() - MinecraftClient.method_8510().field_9590.method_35949().method_41627().method_62()
      );
   }
}
