package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7890 extends Class7882<LivingEntity> {
   private static String[] field33841;

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39819, MemoryModuleType.field39848, MemoryModuleType.field39861);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      Brain<?> var5 = var2.getBrain();
      Optional var6 = Optional.empty();
      ArrayList var7 = Lists.newArrayList();

      for (LivingEntity var9 : var5.<List<LivingEntity>>getMemory(MemoryModuleType.field39819).orElse(ImmutableList.of())) {
         if (var9 instanceof WitherSkeletonEntity || var9 instanceof WitherEntity) {
            var6 = Optional.<LivingEntity>of((MobEntity)var9);
            break;
         }
      }

      for (LivingEntity var11 : var5.<List<LivingEntity>>getMemory(MemoryModuleType.field39818).orElse(ImmutableList.of())) {
         if (var11 instanceof AbstractPiglinEntity && ((AbstractPiglinEntity)var11).func_242337_eM()) {
            var7.add((AbstractPiglinEntity)var11);
         }
      }

      var5.method21408(MemoryModuleType.field39848, var6);
      var5.method21406(MemoryModuleType.field39861, var7);
   }
}
