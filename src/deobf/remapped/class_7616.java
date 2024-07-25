package remapped;

public enum class_7616 implements class_5700 {
   field_38760(0, class_8039.field_41133),
   field_38764(1, class_8039.field_41166),
   field_38759(2, class_8039.field_41179),
   field_38753(3, class_8039.field_41146),
   field_38763(4, class_8039.field_41171),
   field_38758(5, class_8039.field_41149),
   field_38754(6, class_8039.field_41172),
   field_38762(7, class_8039.field_41132),
   field_38757(-1, class_8039.field_41145);

   private final int field_38756;
   private final class_8039 field_38765;

   private class_7616(int var3, class_8039 var4) {
      this.field_38756 = var3;
      this.field_38765 = var4;
   }

   public static class_7616 method_34537(int var0) {
      return values()[var0];
   }

   @Override
   public int method_25778() {
      return this.field_38756;
   }

   @Override
   public class_8039 method_25777() {
      return this.field_38765;
   }
}
