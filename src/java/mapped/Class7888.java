package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7888 extends Class7882<Class1045> {
   private static String[] field33839;

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39846, MemoryModuleType.field39819);
   }

   public void method26425(ServerWorld var1, Class1045 var2) {
      var2.getBrain().<List<LivingEntity>>getMemory(MemoryModuleType.field39819).ifPresent(var2x -> this.method26448(var2, (List<LivingEntity>)var2x));
   }

   private void method26448(Class1045 var1, List<LivingEntity> var2) {
      Optional var5 = var2.stream()
         .filter(var1x -> var1x.getType() == var1.getType())
         .<Class1045>map(var0 -> (Class1045)var0)
         .filter(var0 -> !var0.isChild())
         .findFirst();
      var1.getBrain().method21408(MemoryModuleType.field39846, var5);
   }
}
