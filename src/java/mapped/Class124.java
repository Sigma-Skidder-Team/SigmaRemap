package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class124 implements Class122 {
   private static String[] field436;
   private final float field437;
   private final float field438;

   public Class124(float var1, float var2) {
      this.field437 = var1;
      this.field438 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38598;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44333);
   }

   public boolean test(Class7812 var1) {
      Entity var4 = var1.<Entity>method26081(Class9525.field44333);
      int var5 = 0;
      if (var4 instanceof Class880) {
         var5 = Class7858.method26330((Class880)var4);
      }

      return var1.method26088().nextFloat() < this.field437 + (float)var5 * this.field438;
   }

   public static Class7519 method363(float var0, float var1) {
      return () -> new Class124(var0, var1);
   }

   // $VF: synthetic method
   public static float method365(Class124 var0) {
      return var0.field437;
   }

   // $VF: synthetic method
   public static float method366(Class124 var0) {
      return var0.field438;
   }
}
