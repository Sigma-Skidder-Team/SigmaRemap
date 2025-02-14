package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3743<E extends PiglinEntity> extends Class3676<E> {
   private static String[] field19877;
   private final int field19878;

   public Class3743(int var1) {
      super(ImmutableMap.of(MemoryModuleType.field39851, Class2217.field14484, MemoryModuleType.field39847, Class2217.field14486));
      this.field19878 = var1;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      if (var2.getHeldItemOffhand().isEmpty()) {
         Optional var5 = var2.getBrain().<ItemEntity>getMemory(MemoryModuleType.field39847);
         return var5.isPresent() ? !((ItemEntity)var5.get()).isEntityInRange(var2, (double)this.field19878) : true;
      } else {
         return false;
      }
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      var2.getBrain().method21405(MemoryModuleType.field39851);
   }
}
