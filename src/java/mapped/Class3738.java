package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.function.Predicate;

public class Class3738 extends Class3676<LivingEntity> {
   private static String[] field19860;
   private final Predicate<LivingEntity> field19861;
   private final float field19862;

   public Class3738(EntityClassification var1, float var2) {
      this(var1x -> var1.equals(var1x.getType().method33209()), var2);
   }

   public Class3738(EntityType<?> var1, float var2) {
      this(var1x -> var1.equals(var1x.getType()), var2);
   }

   public Class3738(float var1) {
      this(var0 -> true, var1);
   }

   public Class3738(Predicate<LivingEntity> var1, float var2) {
      super(ImmutableMap.of(MemoryModuleType.field39825, Class2217.field14485, MemoryModuleType.field39819, Class2217.field14484));
      this.field19861 = var1;
      this.field19862 = var2 * var2;
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return var2.getBrain().<List<LivingEntity>>getMemory(MemoryModuleType.field39819).get().stream().anyMatch(this.field19861);
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Brain<?> var7 = var2.getBrain();
      var7.<List<LivingEntity>>getMemory(MemoryModuleType.field39819)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(this.field19861)
                  .filter(var2xx -> var2xx.getDistanceSq(var2) <= (double)this.field19862)
                  .findFirst()
                  .ifPresent(var1xx -> var7.method21406(MemoryModuleType.field39825, new Class7865(var1xx, true)))
         );
   }
}
