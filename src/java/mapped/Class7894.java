package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.server.ServerWorld;

import java.util.Set;

public class Class7894 extends Class7882<LivingEntity> {
   private static String[] field33845;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39835, Class8830.field39836);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      Brain<?> var5 = var2.getBrain();
      DamageSource var6 = var2.getLastDamageSource();
      if (var6 == null) {
         var5.method21405(Class8830.field39835);
      } else {
         var5.method21406(Class8830.field39835, var2.getLastDamageSource());
         Entity var7 = var6.getTrueSource();
         if (var7 instanceof LivingEntity) {
            var5.method21406(Class8830.field39836, (LivingEntity)var7);
         }
      }

      var5.method21410(Class8830.field39836).ifPresent(var2x -> {
         if (!var2x.isAlive() || var2x.world != var1) {
            var5.method21405(Class8830.field39836);
         }
      });
   }
}
