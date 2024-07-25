package remapped;

import java.util.function.Predicate;

public class class_2801 implements class_7279 {
   private final class_7279[] field_13756;
   private final Predicate<class_2792> field_13757;

   private class_2801(class_7279[] var1) {
      this.field_13756 = var1;
      this.field_13757 = class_5110.<class_2792>method_23432(var1);
   }

   public final boolean test(class_2792 var1) {
      return this.field_13757.test(var1);
   }

   @Override
   public void method_12680(class_4737 var1) {
      class_7279.super.method_12680(var1);

      for (int var4 = 0; var4 < this.field_13756.length; var4++) {
         this.field_13756[var4].method_12680(var1.method_21888(".term[" + var4 + "]"));
      }
   }

   @Override
   public class_2190 method_33269() {
      throw new UnsupportedOperationException();
   }
}
