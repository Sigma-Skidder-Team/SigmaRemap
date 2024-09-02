package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3745 extends Class3676<LivingEntity> {
   private static String[] field19884;

   public Class3745() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return var1.rand.nextInt(20) == 0;
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Class6947 var7 = var2.method2992();
      Class7699 var8 = var1.method6957(var2.getPosition());
      if (var8 != null) {
         if (var8.method25390() && !var8.method25389()) {
            var7.method21424(Class8890.field40226);
            var7.method21419(Class8890.field40226);
         } else {
            var7.method21424(Class8890.field40227);
            var7.method21419(Class8890.field40227);
         }
      }
   }
}
