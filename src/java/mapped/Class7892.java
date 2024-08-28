package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7892 extends Class7882<Class1006> {
   private static String[] field33843;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39847);
   }

   public void method26425(ServerWorld var1, Class1006 var2) {
      Class6947 var5 = var2.method2992();
      List<Class1000> var6 = var1.<Class1000>method6772(Class1000.class, var2.method3389().method19663(8.0, 4.0, 8.0), var0 -> true);
      var6.sort(Comparator.comparingDouble(var2::getDistanceSq));
      Optional var7 = var6.stream()
         .filter(var1x -> var2.method4253(var1x.method4124()))
         .filter(var1x -> var1x.method3213(var2, 9.0))
         .filter(var2::method3135)
         .findFirst();
      var5.method21408(Class8830.field39847, var7);
   }
}
