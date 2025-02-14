package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.server.ServerWorld;

public class ForgetRaidTask extends Class3676<LivingEntity> {
   private static String[] field19803;

   public ForgetRaidTask() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return var1.rand.nextInt(20) == 0;
   }

   @Override
   public void startExecuting(ServerWorld var1, LivingEntity var2, long var3) {
      Brain var7 = var2.getBrain();
      Raid var8 = var1.method6957(var2.getPosition());
      if (var8 == null || var8.method25391() || var8.method25393()) {
         var7.method21424(Activity.field40220);
         var7.method21422(var1.method6784(), var1.getGameTime());
      }
   }
}
