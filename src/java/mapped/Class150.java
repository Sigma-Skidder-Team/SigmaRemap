package mapped;

import java.util.function.Predicate;

public class Class150 implements Class122 {
   private final Class122[] field495;
   private final Predicate<Class7812> field496;

   public Class150(Class122[] var1) {
      this.field495 = var1;
      this.field496 = Class8582.<Class7812>method30666(var1);
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38596;
   }

   public final boolean test(Class7812 var1) {
      return this.field496.test(var1);
   }

   @Override
   public void method367(Class8478 var1) {
      Class122.super.method367(var1);

      for (int var4 = 0; var4 < this.field495.length; var4++) {
         this.field495[var4].method367(var1.method29956(".term[" + var4 + "]"));
      }
   }

   public static Class7518 method454(Class7519... var0) {
      return new Class7518(var0);
   }

   // $VF: synthetic method
   public static Class122[] method455(Class150 var0) {
      return var0.field495;
   }
}
