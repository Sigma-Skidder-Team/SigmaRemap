package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.server.ServerWorld;

public class Class3687 extends Class3686 {
   private static String[] field19703;

   public Class3687(float var1) {
      super(var1);
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      Raid var5 = var1.method6957(var2.getPosition());
      return var5 != null && var5.method25392() && super.method12508(var1, var2);
   }
}
