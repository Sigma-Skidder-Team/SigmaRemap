package mapped;

import java.util.function.Predicate;

public abstract class Class4688 implements Class4693 {
   public final Class122[] field22271;
   private final Predicate<Class7812> field22272;

   public Class4688(Class122[] var1) {
      this.field22271 = var1;
      this.field22272 = Class8582.<Class7812>method30665(var1);
   }

   public void method14703(Class8478 var1) {
      for (int var4 = 0; var4 < this.field22271.length; var4++) {
         this.field22271[var4].method367(var1.method29956(".condition[" + var4 + "]"));
      }
   }

   public final boolean method14709(Class7812 var1) {
      return this.field22272.test(var1);
   }

   public abstract Class7131 method14694();
}
