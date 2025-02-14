package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.server.ServerWorld;

public class FindHidingPlaceDuringRaidTask extends FindHidingPlaceTask {
   private static String[] field19902;

   public FindHidingPlaceDuringRaidTask(int var1, float var2) {
      super(var1, var2, 1);
   }

   @Override
   public boolean method12508(ServerWorld worldIn, LivingEntity var2) {
      Raid var5 = worldIn.method6957(var2.getPosition());
      return super.method12508(worldIn, var2) && var5 != null && var5.method25433() && !var5.method25392() && !var5.method25393();
   }
}
