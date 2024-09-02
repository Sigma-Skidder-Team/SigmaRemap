package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3719 extends Class3676<LivingEntity> {
   private static String[] field19803;

   public Class3719() {
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
      if (var8 == null || var8.method25391() || var8.method25393()) {
         var7.method21424(Class8890.field40220);
         var7.method21422(var1.method6784(), var1.method6783());
      }
   }
}
