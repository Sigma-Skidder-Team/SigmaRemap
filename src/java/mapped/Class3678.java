package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class Class3678 extends Class3676<Class1042> {
   private static String[] field19690;

   public Class3678() {
      super(ImmutableMap.of(Class8830.field39815, Class2217.field14484));
   }

   public boolean method12508(Class1657 var1, Class1042 var2) {
      BlockPos var5 = var2.method2992().<Class9378>method21410(Class8830.field39815).get().method35579();
      return var5.method8317(var2.method3431(), 2.0) || var2.method4680();
   }

   public void method12502(Class1657 var1, Class1042 var2, long var3) {
      Class9378 var7 = var2.method2992().<Class9378>method21410(Class8830.field39815).get();
      var2.method2992().method21405(Class8830.field39815);
      var2.method2992().method21406(Class8830.field39814, var7);
      var1.method6786(var2, (byte)14);
      if (var2.method4674().method26571() == Class8395.field36011) {
         Class314 var8 = var1.method6715();
         Optional.<Class1657>ofNullable(var8.method1318(var7.method35578()))
            .<Class4913>flatMap(var1x -> var1x.method6951().method6676(var7.method35579()))
            .<Class8395>flatMap(var0 -> Class2348.field16090.method9192().filter(var1x -> var1x.method29457() == var0).findFirst())
            .ifPresent(var2x -> {
               var2.method4695(var2.method4674().method26574(var2x));
               var2.method4677(var1);
            });
      }
   }
}
