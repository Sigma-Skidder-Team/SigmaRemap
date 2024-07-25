package remapped;

public class class_5286 {
   private static String[] field_27030;
   private static MinecraftClient field_27031 = MinecraftClient.getInstance();

   public static boolean method_24123(class_8670 var0) {
      boolean var3 = true;

      for (long var5 : var0.field_44472) {
         BlockPos var7 = BlockPos.method_6088(var5);
         if (!field_27031.theWorld.method_28262(var7).method_8345()) {
            var3 = false;
            break;
         }
      }

      return var3;
   }

   public static boolean method_24125() {
      return field_27031.thePlayer.field_41726
         && field_27031.theWorld.method_6680(field_27031.thePlayer, field_27031.thePlayer.method_37241().method_18918(0.0, 1.0, 0.0)).count() == 0L;
   }
}
