package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.world.GameRules;
import net.minecraft.world.server.ServerWorld;

public class Class3701<E extends MobEntity> extends Class3676<E> {
   private static String[] field19756;

   public Class3701() {
      super(ImmutableMap.of(MemoryModuleType.field39849, Class2217.field14484));
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      Class6983.method21586(var2, MemoryModuleType.field39849).ifPresent(var2x -> {
         if (var2x.getShouldBeDead() && (var2x.getType() != EntityType.PLAYER || var1.getGameRules().getBoolean(GameRules.field24254))) {
            var2.getBrain().method21405(MemoryModuleType.field39849);
         }
      });
   }
}
