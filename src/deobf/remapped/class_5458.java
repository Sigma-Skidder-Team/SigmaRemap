package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_5458 implements class_7279 {
   private static String[] field_27813;
   private final float field_27812;
   private final float field_27811;

   private class_5458(float var1, float var2) {
      this.field_27812 = var1;
      this.field_27811 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26350;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44678);
   }

   public boolean test(class_2792 var1) {
      Entity var4 = var1.<Entity>method_12698(class_8712.field_44678);
      int var5 = 0;
      if (var4 instanceof LivingEntity) {
         var5 = class_2931.method_13397((LivingEntity)var4);
      }

      return var1.method_12693().nextFloat() < this.field_27812 + (float)var5 * this.field_27811;
   }

   public static class_5704 method_24848(float var0, float var1) {
      return () -> new class_5458(var0, var1);
   }
}
