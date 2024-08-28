package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3721<E extends Class1034> extends Class3676<E> {
   private static String[] field19806;

   public Class3721() {
      super(
         ImmutableMap.of(
            Class8830.field39858,
            Class2217.field14484,
            Class8830.field39849,
            Class2217.field14485,
            Class8830.field39855,
            Class2217.field14485,
            Class8830.field39862,
            Class2217.field14486
         )
      );
   }

   public boolean method12508(Class1657 var1, Class1034 var2) {
      return !var2.method3005() && !Class4388.method13840(var2);
   }

   public void method12502(Class1657 var1, E var2, long var3) {
      Class1091 var7 = var2.method2992().<Class1091>method21410(Class8830.field39858).get();
      Class4388.method13849(var2, var7);
      Class4388.method13861(var2);
      Class4388.method13846(var2, var7);
      Class4388.method13848(var2);
   }
}
