package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7893 extends Sensor<LivingEntity> {
   private static String[] field33844;

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39821, MemoryModuleType.field39822, MemoryModuleType.field39823);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      List<ServerPlayerEntity> var5 = var1.getPlayers()
         .stream()
         .filter(EntityPredicates.field34763)
         .filter(var1x -> var2.isEntityInRange(var1x, 16.0))
         .sorted(Comparator.comparingDouble(var2::getDistanceSq))
         .collect(Collectors.toList());
      Brain var6 = var2.getBrain();
      var6.method21406(MemoryModuleType.field39821, var5);
      List var7 = var5.stream().filter(var1x -> method26430(var2, var1x)).collect(Collectors.toList());
      var6.method21406(MemoryModuleType.field39822, !var7.isEmpty() ? (PlayerEntity)var7.get(0) : null);
      Optional var8 = var7.stream().filter(EntityPredicates.field34762).findFirst();
      var6.method21408(MemoryModuleType.field39823, var8);
   }
}
