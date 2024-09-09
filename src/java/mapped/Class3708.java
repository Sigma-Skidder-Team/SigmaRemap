package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3708 extends Class3676<LivingEntity> {
   private static String[] field19772;

   public Class3708() {
      super(ImmutableMap.of());
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      var2.getBrain().method21422(var1.method6784(), var1.getGameTime());
   }
}
