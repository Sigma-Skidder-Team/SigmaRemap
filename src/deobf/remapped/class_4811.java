package remapped;

public class class_4811 {
   private static String[] field_24068;
   private static boolean field_24066 = true;
   private static MinecraftClient field_24067 = MinecraftClient.method_8510();

   public static boolean method_22176(boolean var0) {
      boolean var3 = field_24066;
      field_24066 = var0;
      return var3;
   }

   public static boolean method_22178() {
      return field_24066;
   }

   public static void method_22179() {
      if (field_24066) {
         class_3017 var2 = field_24067.method_8589();
         var2.method_13796().method_11646();
         var2.method_13793().method_11646();
      }
   }
}
