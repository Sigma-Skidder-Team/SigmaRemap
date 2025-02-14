package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.server.ServerWorld;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7886 extends Sensor<LivingEntity> {
   private static String[] field33834;

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      AxisAlignedBB var5 = var2.getBoundingBox().grow(16.0, 16.0, 16.0);
      List<LivingEntity> var6 = var1.<LivingEntity>getEntitiesInAABBexcluding(LivingEntity.class, var5, var1x -> var1x != var2 && var1x.isAlive());
      var6.sort(Comparator.comparingDouble(var2::getDistanceSq));
      Brain var7 = var2.getBrain();
      var7.method21406(MemoryModuleType.field39818, var6);
      var7.method21406(MemoryModuleType.field39819, var6.stream().filter(var1x -> method26430(var2, var1x)).collect(Collectors.<LivingEntity>toList()));
   }

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39818, MemoryModuleType.field39819);
   }
}
