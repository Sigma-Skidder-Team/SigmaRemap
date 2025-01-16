package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3711 extends Class3676<VillagerEntity> {
   private static String[] field19777;

   public Class3711() {
      super(ImmutableMap.of());
   }

   public boolean method12499(ServerWorld var1, VillagerEntity var2, long var3) {
      return method12592(var2) || method12591(var2);
   }

   public void method12502(ServerWorld var1, VillagerEntity var2, long var3) {
      if (method12592(var2) || method12591(var2)) {
         Brain var7 = var2.getBrain();
         if (!var7.method21430(Activity.field40225)) {
            var7.method21405(Class8830.field39831);
            var7.method21405(Class8830.field39824);
            var7.method21405(Class8830.field39825);
            var7.method21405(Class8830.field39829);
            var7.method21405(Class8830.field39828);
         }

         var7.method21419(Activity.field40225);
      }
   }

   public void method12504(ServerWorld var1, VillagerEntity var2, long var3) {
      if (var3 % 100L == 0L) {
         var2.method4716(var1, var3, 3);
      }
   }

   public static boolean method12591(LivingEntity var0) {
      return var0.getBrain().method21404(Class8830.field39838);
   }

   public static boolean method12592(LivingEntity var0) {
      return var0.getBrain().method21404(Class8830.field39835);
   }
}
