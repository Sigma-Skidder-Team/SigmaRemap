package remapped;

public class class_762 extends class_3962 {
   private static String[] field_4123;

   public class_762(int var1, float var2) {
      super(var1, var2, 1);
   }

   @Override
   public boolean method_27088(class_6331 var1, LivingEntity var2) {
      class_2452 var5 = var1.method_28984(var2.method_37075());
      return super.method_27088(var1, var2) && var5 != null && var5.method_11306() && !var5.method_11303() && !var5.method_11295();
   }
}
