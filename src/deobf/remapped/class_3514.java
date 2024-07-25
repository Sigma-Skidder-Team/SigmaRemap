package remapped;

import java.util.function.Predicate;

public class class_3514 implements class_7279 {
   private final class_7279[] field_17233;
   private final Predicate<class_2792> field_17231;

   private class_3514(class_7279[] var1) {
      this.field_17233 = var1;
      this.field_17231 = class_5110.<class_2792>method_23435(var1);
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26356;
   }

   public final boolean test(class_2792 var1) {
      return this.field_17231.test(var1);
   }

   @Override
   public void method_12680(class_4737 var1) {
      class_7279.super.method_12680(var1);

      for (int var4 = 0; var4 < this.field_17233.length; var4++) {
         this.field_17233[var4].method_12680(var1.method_21888(".term[" + var4 + "]"));
      }
   }

   public static class_2093 method_16192(class_5704... var0) {
      return new class_2093(var0);
   }
}
