package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class161 implements Class122 {
   private static String[] field522;
   private final Block field523;
   private final Class7340 field524;

   public Class161(Block var1, Class7340 var2) {
      this.field523 = var1;
      this.field524 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38602;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44336);
   }

   public boolean test(Class7812 var1) {
      Class7380 var4 = var1.<Class7380>method26081(Class9525.field44336);
      return var4 != null && this.field523 == var4.method23383() && this.field524.method23258(var4);
   }

   public static Class7520 method486(Block var0) {
      return new Class7520(var0);
   }

   // $VF: synthetic method
   public static Block method487(Class161 var0) {
      return var0.field523;
   }

   // $VF: synthetic method
   public static Class7340 method488(Class161 var0) {
      return var0.field524;
   }
}
