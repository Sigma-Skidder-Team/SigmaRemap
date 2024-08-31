package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;

public class Class3750 extends Class3676<Class1042> {
   private static String[] field19901;

   public Class3750() {
      super(ImmutableMap.of());
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      boolean var7 = Class3711.method12592(var2) || Class3711.method12591(var2) || method12712(var2);
      if (!var7) {
         var2.method2992().method21405(Class8830.field39835);
         var2.method2992().method21405(Class8830.field39836);
         var2.method2992().method21422(var1.method6784(), var1.method6783());
      }
   }

   private static boolean method12712(Class1042 var0) {
      return var0.method2992().<LivingEntity>method21410(Class8830.field39836).filter(var1 -> var1.getDistanceSq(var0) <= 36.0).isPresent();
   }
}
