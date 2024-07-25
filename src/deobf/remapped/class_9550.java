package remapped;

public enum class_9550 implements class_5700 {
   field_48572(0, class_8039.field_41133),
   field_48576(1, class_8039.field_41157),
   field_48577(2, class_8039.field_41146),
   field_48587(3, class_8039.field_41171),
   field_48575(4, class_8039.field_41143),
   field_48573(5, class_8039.field_41169),
   field_48589(6, class_8039.field_41184),
   field_48579(7, class_8039.field_41161),
   field_48578(8, class_8039.field_41132),
   field_48581(9, class_8039.field_41137),
   field_48586(10, class_8039.field_41140),
   field_48583(11, class_8039.field_41157),
   field_48580(12, class_8039.field_41183),
   field_48574(13, class_8039.field_41157),
   field_48590(14, class_8039.field_41158),
   field_48585(15, class_6091.field_31168),
   field_48588(99, null);

   private final int field_48584;
   private final class_8039 field_48582;

   private class_9550(int var3, class_8039 var4) {
      this.field_48584 = var3;
      this.field_48582 = var4;
   }

   public static class_9550 method_44066(int var0) {
      return values()[var0];
   }

   @Override
   public int method_25778() {
      return this.field_48584;
   }

   @Override
   public class_8039 method_25777() {
      return this.field_48582;
   }
}
