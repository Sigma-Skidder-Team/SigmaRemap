package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3732<E extends PiglinEntity> extends Class3676<E> {
   private static String[] field19842;
   private final int field19843;
   private final int field19844;

   public Class3732(int var1, int var2) {
      super(
         ImmutableMap.of(
            MemoryModuleType.field39851,
            Class2217.field14484,
            MemoryModuleType.field39847,
            Class2217.field14484,
            MemoryModuleType.field39852,
            Class2217.field14486,
            MemoryModuleType.field39853,
            Class2217.field14486
         )
      );
      this.field19843 = var1;
      this.field19844 = var2;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return var2.getHeldItemOffhand().isEmpty();
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      Brain var7 = var2.getBrain();
      Optional var8 = var7.<Integer>getMemory(MemoryModuleType.field39852);
      if (var8.isPresent()) {
         int var9 = (Integer)var8.get();
         if (var9 <= this.field19843) {
            var7.method21406(MemoryModuleType.field39852, var9 + 1);
         } else {
            var7.method21405(MemoryModuleType.field39851);
            var7.method21405(MemoryModuleType.field39852);
            var7.method21407(MemoryModuleType.field39853, true, (long)this.field19844);
         }
      } else {
         var7.method21406(MemoryModuleType.field39852, 0);
      }
   }
}
