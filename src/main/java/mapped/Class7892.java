package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.server.ServerWorld;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7892 extends Sensor<MobEntity> {
   private static String[] field33843;

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39847);
   }

   public void method26425(ServerWorld var1, MobEntity var2) {
      Brain var5 = var2.getBrain();
      List<ItemEntity> var6 = var1.<ItemEntity>getEntitiesInAABBexcluding(ItemEntity.class, var2.getBoundingBox().grow(8.0, 4.0, 8.0), var0 -> true);
      var6.sort(Comparator.comparingDouble(var2::getDistanceSq));
      Optional var7 = var6.stream()
         .filter(var1x -> var2.method4253(var1x.method4124()))
         .filter(var1x -> var1x.isEntityInRange(var2, 9.0))
         .filter(var2::canEntityBeSeen)
         .findFirst();
      var5.method21408(MemoryModuleType.field39847, var7);
   }
}
