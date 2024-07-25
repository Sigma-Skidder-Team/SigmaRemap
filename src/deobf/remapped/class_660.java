package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_660 extends class_5837 {
   private static String[] field_3659;
   private final class_7986 field_3658;
   private final int field_3660;

   private class_660(class_7279[] var1, class_7986 var2, int var3) {
      super(var1);
      this.field_3658 = var2;
      this.field_3660 = var3;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26402;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44678);
   }

   private boolean method_3014() {
      return this.field_3660 > 0;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      class_8145 var5 = var2.<class_8145>method_12698(class_8712.field_44678);
      if (var5 instanceof class_5834) {
         int var6 = class_2931.method_13397((class_5834)var5);
         if (var6 == 0) {
            return var1;
         }

         float var7 = (float)var6 * this.field_3658.method_36244(var2.method_12693());
         var1.method_28030(Math.round(var7));
         if (this.method_3014() && var1.method_27997() > this.field_3660) {
            var1.method_28017(this.field_3660);
         }
      }

      return var1;
   }

   public static class_7475 method_3018(class_7986 var0) {
      return new class_7475(var0);
   }
}
