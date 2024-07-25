package remapped;

public class class_2543 extends class_4382 {
   private static String[] field_12600;

   public class_2543(class_5855 var1, class_6943... var2) {
      super(var1, class_8718.field_44697, var2);
   }

   @Override
   public int method_20433(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   @Override
   public int method_20437(int var1) {
      return super.method_20433(var1) + 50;
   }

   @Override
   public int method_20417() {
      return 5;
   }

   @Override
   public boolean method_20430(ItemStack var1) {
      return var1.method_27960() != class_4897.field_24853 ? super.method_20430(var1) : true;
   }
}
