package remapped;

import java.util.Random;
import java.util.Map.Entry;

public class class_7403 extends class_4382 {
   private static String[] field_37784;

   public class_7403(class_5855 var1, class_6943... var2) {
      super(var1, class_8718.field_44698, var2);
   }

   @Override
   public int method_20433(int var1) {
      return 10 + 20 * (var1 - 1);
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
   public boolean method_20430(ItemStack var1) {
      return !(var1.method_27960() instanceof class_8228) ? super.method_20430(var1) : true;
   }

   @Override
   public void method_20427(LivingEntity var1, Entity var2, int var3) {
      Random var6 = var1.method_26594();
      Entry var7 = class_2931.method_13412(class_3668.field_17882, var1);
      if (method_33706(var3, var6)) {
         if (var2 != null) {
            var2.attackEntityFrom(DamageSource.method_28364(var1), (float)method_33705(var3, var6));
         }

         if (var7 != null) {
            ((ItemStack)var7.getValue()).method_28003(2, var1, var1x -> var1x.method_26448((class_6943)var7.getKey()));
         }
      }
   }

   public static boolean method_33706(int var0, Random var1) {
      return var0 > 0 ? var1.nextFloat() < 0.15F * (float)var0 : false;
   }

   public static int method_33705(int var0, Random var1) {
      return var0 <= 10 ? 1 + var1.nextInt(4) : var0 - 10;
   }
}
