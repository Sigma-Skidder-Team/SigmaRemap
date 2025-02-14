package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7883 extends Sensor<LivingEntity> {
   private static String[] field33830;
   private static final ImmutableMap<EntityType<?>, Float> field33831 = ImmutableMap.<EntityType<?>, Float> builder()
      .put(EntityType.DROWNED, 8.0F)
      .put(EntityType.EVOKER, 12.0F)
      .put(EntityType.HUSK, 8.0F)
      .put(EntityType.ILLUSIONER, 12.0F)
      .put(EntityType.PILLAGER, 15.0F)
      .put(EntityType.RAVAGER, 12.0F)
      .put(EntityType.VEX, 8.0F)
      .put(EntityType.VINDICATOR, 10.0F)
      .put(EntityType.ZOGLIN, 10.0F)
      .put(EntityType.ZOMBIE, 8.0F)
      .put(EntityType.ZOMBIE_VILLAGER, 8.0F)
      .build();

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39838);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      var2.getBrain().method21408(MemoryModuleType.field39838, this.method26431(var2));
   }

   private Optional<LivingEntity> method26431(LivingEntity var1) {
      return this.method26432(var1)
         .<LivingEntity>flatMap(
            var2 -> var2.stream()
                  .filter(this::method26435)
                  .filter(var2x -> this.method26434(var1, var2x))
                  .min((var2x, var3) -> this.method26433(var1, var2x, var3))
         );
   }

   private Optional<List<LivingEntity>> method26432(LivingEntity var1) {
      return var1.getBrain().<List<LivingEntity>>getMemory(MemoryModuleType.field39819);
   }

   private int method26433(LivingEntity var1, LivingEntity var2, LivingEntity var3) {
      return MathHelper.floor(var2.getDistanceSq(var1) - var3.getDistanceSq(var1));
   }

   private boolean method26434(LivingEntity var1, LivingEntity var2) {
      float var5 = (Float)field33831.get(var2.getType());
      return var2.getDistanceSq(var1) <= (double)(var5 * var5);
   }

   private boolean method26435(LivingEntity var1) {
      return field33831.containsKey(var1.getType());
   }
}
