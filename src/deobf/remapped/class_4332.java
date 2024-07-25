package remapped;

import java.util.Random;

public class class_4332 extends class_5837 {
   private static String[] field_21070;

   private class_4332(class_7279[] var1) {
      super(var1);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26384;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      Float var5 = var2.<Float>method_12698(class_8712.field_44672);
      if (var5 != null) {
         Random var6 = var2.method_12693();
         float var7 = 1.0F / var5;
         int var8 = var1.method_27997();
         int var9 = 0;

         for (int var10 = 0; var10 < var8; var10++) {
            if (var6.nextFloat() <= var7) {
               var9++;
            }
         }

         var1.method_28017(var9);
      }

      return var1;
   }

   public static class_5363<?> method_20157() {
      return method_26628(class_4332::new);
   }
}
