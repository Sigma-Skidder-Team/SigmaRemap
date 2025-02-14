package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.server.ServerWorld;

public class Class3695 extends Class3676<LivingEntity> {
   private static String[] field19728;

   public Class3695() {
      super(ImmutableMap.of(MemoryModuleType.field39840, Class2217.field14484));
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Brain var7 = var2.getBrain();
      Raid var8 = var1.method6957(var2.getPosition());
      if (var8 == null) {
         var7.method21419(Activity.field40228);
      }
   }
}
