package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.GameRules;
import net.minecraft.world.server.ServerWorld;

import java.util.function.BiPredicate;

public class Class3705 extends Class3676<LivingEntity> {
   private static String[] field19766;
   private final int field19767;
   private final BiPredicate<LivingEntity, LivingEntity> field19768;

   public Class3705(int var1, BiPredicate<LivingEntity, LivingEntity> var2) {
      super(
         ImmutableMap.of(
            MemoryModuleType.ATTACK_TARGET,
            Class2217.field14484,
            MemoryModuleType.field39849,
            Class2217.field14486,
            MemoryModuleType.field39856,
            Class2217.field14485,
            MemoryModuleType.field39857,
            Class2217.field14486
         )
      );
      this.field19767 = var1;
      this.field19768 = var2;
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return this.method12584(var2).getShouldBeDead();
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      LivingEntity var7 = this.method12584(var2);
      if (this.field19768.test(var2, var7)) {
         var2.getBrain().method21407(MemoryModuleType.field39857, true, (long)this.field19767);
      }

      var2.getBrain().method21407(MemoryModuleType.field39856, var7.getPosition(), (long)this.field19767);
      if (var7.getType() != EntityType.PLAYER || var1.getGameRules().getBoolean(GameRules.field24254)) {
         var2.getBrain().method21405(MemoryModuleType.ATTACK_TARGET);
         var2.getBrain().method21405(MemoryModuleType.field39849);
      }
   }

   private LivingEntity method12584(LivingEntity var1) {
      return var1.getBrain().<LivingEntity>getMemory(MemoryModuleType.ATTACK_TARGET).get();
   }
}
