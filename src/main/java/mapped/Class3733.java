package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Class3733<E extends MobEntity> extends Class3676<E> {
   private static String[] field19845;
   private final Predicate<E> field19846;
   private final Function<E, Optional<? extends LivingEntity>> field19847;

   public Class3733(Predicate<E> var1, Function<E, Optional<? extends LivingEntity>> var2) {
      super(ImmutableMap.of(MemoryModuleType.ATTACK_TARGET, Class2217.field14485, MemoryModuleType.field39841, Class2217.field14486));
      this.field19846 = var1;
      this.field19847 = var2;
   }

   public Class3733(Function<E, Optional<? extends LivingEntity>> var1) {
      this(var0 -> true, var1);
   }

   public boolean method12508(ServerWorld var1, E var2) {
      if (!this.field19846.test((E)var2)) {
         return false;
      } else {
         Optional var5 = this.field19847.apply((E)var2);
         return var5.isPresent() && ((LivingEntity)var5.get()).isAlive();
      }
   }

   public void startExecuting(ServerWorld var1, E var2, long var3) {
      this.field19847.apply((E)var2).ifPresent(var2x -> this.method12659((E)var2, var2x));
   }

   private void method12659(E var1, LivingEntity var2) {
      var1.getBrain().method21406(MemoryModuleType.ATTACK_TARGET, var2);
      var1.getBrain().method21405(MemoryModuleType.field39841);
   }
}
