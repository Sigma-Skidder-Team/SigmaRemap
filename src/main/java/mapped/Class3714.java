package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.function.Predicate;

public class Class3714<E extends LivingEntity> extends Class3676<E> {
   private static String[] field19782;
   private final Predicate<E> field19783;
   private final MemoryModuleType<?> field19784;

   public Class3714(Predicate<E> var1, MemoryModuleType<?> var2) {
      super(ImmutableMap.of(var2, Class2217.field14484));
      this.field19783 = var1;
      this.field19784 = var2;
   }

   @Override
   public boolean method12508(ServerWorld var1, E var2) {
      return this.field19783.test((E)var2);
   }

   @Override
   public void startExecuting(ServerWorld var1, E var2, long var3) {
      var2.getBrain().method21405(this.field19784);
   }
}
