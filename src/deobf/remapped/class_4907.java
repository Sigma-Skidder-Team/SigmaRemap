package remapped;

public enum class_4907 implements class_5700 {
   field_25378(0, class_8039.field_41133),
   field_25390(1, class_8039.field_41157),
   field_25382(2, class_8039.field_41146),
   field_25386(3, class_8039.field_41171),
   field_25374(4, class_8039.field_41143),
   field_25383(5, class_8039.field_41149),
   field_25380(6, class_8039.field_41161),
   field_25388(7, class_8039.field_41132),
   field_25385(8, class_8039.field_41137),
   field_25379(9, class_8039.field_41140),
   field_25377(10, class_8039.field_41157),
   field_25376(11, class_8039.field_41183),
   field_25391(12, class_8039.field_41157),
   field_25375(99, null);

   private final int field_25381;
   private final class_8039 field_25387;

   private class_4907(int var3, class_8039 var4) {
      this.field_25381 = var3;
      this.field_25387 = var4;
   }

   public static class_4907 method_22458(int var0) {
      return values()[var0];
   }

   @Override
   public int method_25778() {
      return this.field_25381;
   }

   @Override
   public class_8039 method_25777() {
      return this.field_25387;
   }
}
