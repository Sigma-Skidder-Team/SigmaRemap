package remapped;

public class class_5286 {
   private static String[] field_27030;
   private static MinecraftClient field_27031 = MinecraftClient.getInstance();

   public static boolean method_24123(class_8670 var0) {
      boolean var3 = true;

      for (long var5 : var0.field_44472) {
         class_1331 var7 = class_1331.method_6088(var5);
         if (!field_27031.field_9601.method_28262(var7).method_8345()) {
            var3 = false;
            break;
         }
      }

      return var3;
   }

   public static boolean method_24125() {
      return field_27031.field_9632.field_41726
         && field_27031.field_9601.method_6680(field_27031.field_9632, field_27031.field_9632.method_37241().method_18918(0.0, 1.0, 0.0)).count() == 0L;
   }
}
