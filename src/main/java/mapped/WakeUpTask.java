package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class WakeUpTask extends Class3676<LivingEntity> {
   private static String[] field19762;

   public WakeUpTask() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return !var2.getBrain().method21430(Activity.field40223) && var2.isSleeping();
   }

   @Override
   public void startExecuting(ServerWorld var1, LivingEntity var2, long var3) {
      var2.wakeUp();
   }
}
