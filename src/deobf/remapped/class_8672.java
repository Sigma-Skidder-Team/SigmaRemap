package remapped;

public enum class_8672 implements class_5700 {
   field_44518(0, class_8039.field_41133),
   field_44515(1, class_8039.field_41157),
   field_44502(2, class_8039.field_41146),
   field_44507(3, class_8039.field_41171),
   field_44503(4, class_8039.field_41143),
   field_44501(5, class_8039.field_41169),
   field_44520(6, class_8039.field_41162),
   field_44514(7, class_8039.field_41161),
   field_44500(8, class_8039.field_41132),
   field_44504(9, class_8039.field_41137),
   field_44516(10, class_8039.field_41140),
   field_44509(11, class_8039.field_41157),
   field_44511(12, class_8039.field_41183),
   field_44505(13, class_8039.field_41157),
   field_44506(14, class_8039.field_41158),
   field_44512(15, class_5628.field_28557),
   field_44508(99, null);

   private final int field_44513;
   private final class_8039 field_44517;

   private class_8672(int var3, class_8039 var4) {
      this.field_44513 = var3;
      this.field_44517 = var4;
   }

   public static class_8672 method_39848(int var0) {
      return values()[var0];
   }

   @Override
   public int method_25778() {
      return this.field_44513;
   }

   @Override
   public class_8039 method_25777() {
      return this.field_44517;
   }
}
