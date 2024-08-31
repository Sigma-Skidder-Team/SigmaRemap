package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7893 extends Class7882<LivingEntity> {
   private static String[] field33844;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39821, Class8830.field39822, Class8830.field39823);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      List<ServerPlayerEntity> var5 = var1.method6870()
         .stream()
         .filter(Class8088.field34763)
         .filter(var1x -> var2.isEntityInRange(var1x, 16.0))
         .sorted(Comparator.comparingDouble(var2::getDistanceSq))
         .collect(Collectors.toList());
      Class6947 var6 = var2.method2992();
      var6.method21406(Class8830.field39821, var5);
      List var7 = var5.stream().filter(var1x -> method26430(var2, var1x)).collect(Collectors.toList());
      var6.method21406(Class8830.field39822, !var7.isEmpty() ? (PlayerEntity)var7.get(0) : null);
      Optional var8 = var7.stream().filter(Class8088.field34762).findFirst();
      var6.method21408(Class8830.field39823, var8);
   }
}
