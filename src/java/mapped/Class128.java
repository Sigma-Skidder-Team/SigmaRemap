package mapped;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Class128 implements Class127 {
   public final Class122[] field441;
   private final Predicate<Class7812> field442;

   public Class128(Class122[] var1) {
      this.field441 = var1;
      this.field442 = Class8582.<Class7812>method30665(var1);
   }

   public final ItemStack apply(ItemStack var1, Class7812 var2) {
      return !this.field442.test(var2) ? var1 : this.method371(var1, var2);
   }

   public abstract ItemStack method371(ItemStack var1, Class7812 var2);

   @Override
   public void method367(Class8478 var1) {
      Class127.super.method367(var1);

      for (int var4 = 0; var4 < this.field441.length; var4++) {
         this.field441[var4].method367(var1.method29956(".conditions[" + var4 + "]"));
      }
   }

   public static Class5876<?> method372(Function<Class122[], Class127> var0) {
      return new Class5884(var0);
   }
}
