package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.world.Difficulty;
import net.minecraft.world.server.ServerWorld;

public final class Class7147 extends Effect {
   private static String[] field30713;

   public Class7147(EffectType var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean isReady(int var1, int var2) {
      return true;
   }

   @Override
   public void performEffect(LivingEntity var1, int var2) {
      if (var1 instanceof ServerPlayerEntity && !var1.isSpectator()) {
         ServerPlayerEntity var5 = (ServerPlayerEntity)var1;
         ServerWorld var6 = var5.getServerWorld();
         if (var6.method6997() == Difficulty.field14351) {
            return;
         }

         if (var6.method6952(var1.getPosition())) {
            var6.method6956().method24613(var5);
         }
      }
   }
}
