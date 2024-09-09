package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3703 extends Class3676<LivingEntity> {
   private static String[] field19762;

   public Class3703() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return !var2.getBrain().method21430(Activity.field40223) && var2.isSleeping();
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      var2.wakeUp();
   }
}
