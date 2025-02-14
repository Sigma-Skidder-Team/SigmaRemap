package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

public class Class3680<E extends PiglinEntity> extends Class3676<E> {
   private static String[] field19692;

   public Class3680() {
      super(ImmutableMap.of(MemoryModuleType.ATTACK_TARGET, Class2217.field14484, MemoryModuleType.field39855, Class2217.field14486));
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      if (this.method12515((E)var2)) {
         Class4388.method13861(var2);
      }
   }

   private boolean method12515(E var1) {
      LivingEntity var4 = var1.getBrain().<LivingEntity>getMemory(MemoryModuleType.ATTACK_TARGET).get();
      return var4.getType() == EntityType.HOGLIN && var4.getShouldBeDead();
   }
}
