package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7883 extends Class7882<LivingEntity> {
   private static String[] field33830;
   private static final ImmutableMap<EntityType<?>, Float> field33831 = ImmutableMap.<EntityType<?>, Float> builder()
      .put(EntityType.field41021, 8.0F)
      .put(EntityType.field41027, 12.0F)
      .put(EntityType.field41039, 8.0F)
      .put(EntityType.field41040, 12.0F)
      .put(EntityType.field41067, 15.0F)
      .put(EntityType.field41072, 12.0F)
      .put(EntityType.field41097, 8.0F)
      .put(EntityType.field41099, 10.0F)
      .put(EntityType.field41106, 10.0F)
      .put(EntityType.field41107, 8.0F)
      .put(EntityType.field41109, 8.0F)
      .build();

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39838);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      var2.method2992().method21408(Class8830.field39838, this.method26431(var2));
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
      return var1.method2992().<List<LivingEntity>>method21410(Class8830.field39819);
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
