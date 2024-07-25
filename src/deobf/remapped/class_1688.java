package remapped;

public enum class_1688 implements class_5700 {
   field_8730(0, class_8039.field_41133),
   field_8742(1, class_8039.field_41157),
   field_8732(2, class_8039.field_41146),
   field_8729(3, class_8039.field_41171),
   field_8738(4, class_8039.field_41143),
   field_8743(5, class_8039.field_41149),
   field_8735(6, class_8039.field_41161),
   field_8726(7, class_8039.field_41132),
   field_8733(8, class_8039.field_41137),
   field_8737(9, class_8039.field_41140),
   field_8727(10, class_8039.field_41157),
   field_8741(11, class_8039.field_41183),
   field_8728(12, class_8039.field_41157),
   field_8740(13, class_8039.field_41158),
   field_8725(99, null);

   private final int field_8739;
   private final class_8039 field_8734;

   private class_1688(int var3, class_8039 var4) {
      this.field_8739 = var3;
      this.field_8734 = var4;
   }

   public static class_1688 method_7603(int var0) {
      return values()[var0];
   }

   @Override
   public int method_25778() {
      return this.field_8739;
   }

   @Override
   public class_8039 method_25777() {
      return this.field_8734;
   }
}
