package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Optional;

public class Class3727 extends Class3676<Class880> {
   private static String[] field19824;

   public Class3727() {
      super(
         ImmutableMap.of(
            Class8830.field39824,
            Class2217.field14486,
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39816,
            Class2217.field14484,
            Class8830.field39819,
            Class2217.field14484,
            Class8830.field39828,
            Class2217.field14485
         )
      );
   }

   @Override
   public boolean method12508(Class1657 var1, Class880 var2) {
      Class6947<?> var5 = var2.method2992();
      Optional var6 = var5.<Class9378>method21410(Class8830.field39816);
      return var1.method6814().nextInt(100) == 0
         && var6.isPresent()
         && var1.method6813() == ((Class9378)var6.get()).method35578()
         && ((Class9378)var6.get()).method35579().method8317(var2.method3431(), 4.0)
         && var5.method21410(Class8830.field39819).get().stream().anyMatch(var0 -> Class8992.field41098.equals(var0.method3204()));
   }

   @Override
   public void method12502(Class1657 var1, Class880 var2, long var3) {
      Class6947<?> var7 = var2.method2992();
      var7.method21410(Class8830.field39819)
         .ifPresent(
            var2x -> var2x.stream()
                  .filter(var0x -> Class8992.field41098.equals(var0x.method3204()))
                  .filter(var1xx -> var1xx.method3277(var2) <= 32.0)
                  .findFirst()
                  .ifPresent(var1xx -> {
                     var7.method21406(Class8830.field39828, var1xx);
                     var7.method21406(Class8830.field39825, new Class7865(var1xx, true));
                     var7.method21406(Class8830.field39824, new Class8999(new Class7865(var1xx, false), 0.3F, 1));
                  })
         );
   }
}
