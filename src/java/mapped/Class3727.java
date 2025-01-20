package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3727 extends Class3676<LivingEntity> {
   private static String[] field19824;

   public Class3727() {
      super(
         ImmutableMap.of(
            Class8830.field39824,
            Class2217.field14486,
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39816,
            Class2217.field14484,
            Class8830.field39819,
            Class2217.field14484,
            Class8830.field39828,
            Class2217.field14485
         )
      );
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      Brain<?> var5 = var2.getBrain();
      Optional var6 = var5.<Class9378>method21410(Class8830.field39816);
      return var1.method6814().nextInt(100) == 0
         && var6.isPresent()
         && var1.getDimensionKey() == ((Class9378)var6.get()).method35578()
         && ((Class9378)var6.get()).method35579().withinDistance(var2.getPositionVec(), 4.0)
         && var5.method21410(Class8830.field39819).get().stream().anyMatch(var0 -> EntityType.VILLAGER.equals(var0.getType()));
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Brain<?> var7 = var2.getBrain();
      var7.method21410(Class8830.field39819)
         .ifPresent(
            var2x -> var2x.stream()
                  .filter(var0x -> EntityType.VILLAGER.equals(var0x.getType()))
                  .filter(var1xx -> var1xx.getDistanceSq(var2) <= 32.0)
                  .findFirst()
                  .ifPresent(var1xx -> {
                     var7.method21406(Class8830.field39828, var1xx);
                     var7.method21406(Class8830.field39825, new Class7865(var1xx, true));
                     var7.method21406(Class8830.field39824, new Class8999(new Class7865(var1xx, false), 0.3F, 1));
                  })
         );
   }
}
