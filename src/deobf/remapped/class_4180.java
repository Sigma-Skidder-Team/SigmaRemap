package remapped;

import java.util.Random;

public class class_4180 extends class_1595 {
   private static String[] field_20350;

   public class_4180(class_6629<? extends class_4180> var1, World var2) {
      super(var1, var2);
   }

   public static boolean method_19449(class_6629<class_4180> var0, class_1556 var1, class_2417 var2, BlockPos var3, Random var4) {
      return method_5199(var0, var1, var2, var3, var4) && (var2 == class_2417.field_12024 || var1.method_25263(var3));
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2718;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2905;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2433;
   }

   @Override
   public class_8461 method_7150() {
      return class_463.field_2502;
   }

   @Override
   public class_6749 method_7152(ItemStack var1, float var2) {
      class_6749 var5 = super.method_7152(var1, var2);
      if (var5 instanceof class_581) {
         ((class_581)var5).method_2752(new class_2250(Effects.field_19743, 600));
      }

      return var5;
   }
}
