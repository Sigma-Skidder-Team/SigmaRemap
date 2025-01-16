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
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39819, Class8830.field39848, Class8830.field39861);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      Brain<?> var5 = var2.getBrain();
      Optional var6 = Optional.empty();
      ArrayList var7 = Lists.newArrayList();

      for (LivingEntity var9 : var5.<List<LivingEntity>>method21410(Class8830.field39819).orElse(ImmutableList.of())) {
         if (var9 instanceof WitherSkeletonEntity || var9 instanceof WitherEntity) {
            var6 = Optional.<LivingEntity>of((MobEntity)var9);
            break;
         }
      }

      for (LivingEntity var11 : var5.<List<LivingEntity>>method21410(Class8830.field39818).orElse(ImmutableList.of())) {
         if (var11 instanceof Class1035 && ((Class1035)var11).method4635()) {
            var7.add((Class1035)var11);
         }
      }

      var5.method21408(Class8830.field39848, var6);
      var5.method21406(Class8830.field39861, var7);
   }
}
