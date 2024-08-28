package mapped;

import java.util.function.Predicate;

public class Class125 implements Class122 {
   private final Class122[] field439;
   private final Predicate<Class7812> field440;

   public Class125(Class122[] var1) {
      this.field439 = var1;
      this.field440 = Class8582.<Class7812>method30665(var1);
   }

   public final boolean test(Class7812 var1) {
      return this.field440.test(var1);
   }

   @Override
   public void method367(Class8478 var1) {
      Class122.super.method367(var1);

      for (int var4 = 0; var4 < this.field439.length; var4++) {
         this.field439[var4].method367(var1.method29956(".term[" + var4 + "]"));
      }
   }

   @Override
   public Class7130 method354() {
      throw new UnsupportedOperationException();
   }
}
