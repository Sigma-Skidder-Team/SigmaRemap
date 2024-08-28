package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Random;
import java.util.Set;

public class Class162 implements Class122 {
   private static String[] field525;
   private static final Class162 field526 = new Class162();

   private Class162() {
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38605;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44339);
   }

   public boolean test(Class7812 var1) {
      Float var4 = var1.<Float>method26081(Class9525.field44339);
      if (var4 == null) {
         return true;
      } else {
         Random var5 = var1.method26088();
         float var6 = 1.0F / var4;
         return var5.nextFloat() <= var6;
      }
   }

   public static Class7519 method489() {
      return () -> field526;
   }

   // $VF: synthetic method
   public static Class162 method491() {
      return field526;
   }
}
