package remapped;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class class_5837 implements class_2913 {
   public final class_7279[] field_29682;
   private final Predicate<class_2792> field_29683;

   public class_5837(class_7279[] var1) {
      this.field_29682 = var1;
      this.field_29683 = class_5110.<class_2792>method_23432(var1);
   }

   public final ItemStack apply(ItemStack var1, class_2792 var2) {
      return !this.field_29683.test(var2) ? var1 : this.method_26627(var1, var2);
   }

   public abstract ItemStack method_26627(ItemStack var1, class_2792 var2);

   @Override
   public void method_12680(class_4737 var1) {
      class_2913.super.method_12680(var1);

      for (int var4 = 0; var4 < this.field_29682.length; var4++) {
         this.field_29682[var4].method_12680(var1.method_21888(".conditions[" + var4 + "]"));
      }
   }

   public static class_5363<?> method_26628(Function<class_7279[], class_2913> var0) {
      return new class_8724(var0);
   }
}
