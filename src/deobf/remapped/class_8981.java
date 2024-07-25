package remapped;

import java.util.Random;

public class class_8981 extends class_4382 {
   private static String[] field_46017;

   public class_8981(class_5855 var1, class_6943... var2) {
      super(var1, class_8718.field_44695, var2);
   }

   @Override
   public int method_20433(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   @Override
   public int method_20437(int var1) {
      return super.method_20433(var1) + 50;
   }

   @Override
   public int method_20417() {
      return 3;
   }

   @Override
   public boolean method_20430(class_6098 var1) {
      return !var1.method_27959() ? super.method_20430(var1) : true;
   }

   public static boolean method_41175(class_6098 var0, int var1, Random var2) {
      return var0.method_27960() instanceof class_8228 && var2.nextFloat() < 0.6F ? false : var2.nextInt(var1 + 1) > 0;
   }
}
