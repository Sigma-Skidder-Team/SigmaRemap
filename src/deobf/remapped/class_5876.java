package remapped;

public class class_5876 {
   private static String[] field_29832;

   public static boolean method_26760(PlayerEntity var0) {
      return method_26762(MinecraftClient.getInstance().thePlayer) == method_26762(var0);
   }

   public static int method_26762(PlayerEntity var0) {
      class_3903 var3 = (class_3903)var0.method_37095();
      return var3 != null && var3.method_23381().getColor() != null ? var3.method_23381().getColor() : 16777215;
   }
}
