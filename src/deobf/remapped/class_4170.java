package remapped;

public class class_4170 extends class_1425 {
   private static String[] field_20301;

   public class_4170(class_7822 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public void method_6551(LivingEntity var1, class_6711 var2, int var3) {
      var1.method_26460(var1.method_26493() - (float)(4 * (var3 + 1)));
      super.method_6551(var1, var2, var3);
   }

   @Override
   public void method_6543(LivingEntity var1, class_6711 var2, int var3) {
      var1.method_26460(var1.method_26493() + (float)(4 * (var3 + 1)));
      super.method_6543(var1, var2, var3);
   }
}
