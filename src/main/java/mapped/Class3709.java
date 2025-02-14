package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3709 extends Class3676<LivingEntity> {
   private static String[] field19773;
   private final int field19774;

   public Class3709(MemoryModuleType<?> var1, int var2) {
      super(ImmutableMap.of(MemoryModuleType.ATTACK_TARGET, Class2217.field14486, MemoryModuleType.field39871, Class2217.field14485, var1, Class2217.field14484));
      this.field19774 = var2;
   }

   @Override
   public void startExecuting(ServerWorld var1, LivingEntity var2, long var3) {
      var2.getBrain().method21407(MemoryModuleType.field39871, true, (long)this.field19774);
      var2.getBrain().method21405(MemoryModuleType.ATTACK_TARGET);
   }
}
