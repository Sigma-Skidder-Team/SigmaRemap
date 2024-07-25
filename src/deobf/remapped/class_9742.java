package remapped;

public class class_9742 extends class_2451 {
   private static String[] field_49503;
   private final class_1525 field_49502;

   public class_9742(class_1525 var1, class_317 var2) {
      super(var2.method_1471(var1.method_6960()));
      this.field_49502 = var1;
   }

   public class_1525 method_44987() {
      return this.field_49502;
   }

   @Override
   public int method_11213() {
      return this.field_49502.method_6958();
   }

   @Override
   public boolean method_11223(ItemStack var1, ItemStack var2) {
      return this.field_49502.method_6962().test(var2) || super.method_11223(var1, var2);
   }
}
