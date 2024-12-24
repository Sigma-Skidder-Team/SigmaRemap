package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7884 extends Class7882<HoglinEntity> {
   private static String[] field33832;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(
         Class8830.field39819, Class8830.field39870, Class8830.field39864, Class8830.field39863, Class8830.field39866, Class8830.field39867, new Class8830[0]
      );
   }

   public void method26425(ServerWorld var1, HoglinEntity var2) {
      Brain<?> var5 = var2.getBrain();
      var5.method21408(Class8830.field39870, this.method26439(var1, var2));
      Optional var6 = Optional.empty();
      int var7 = 0;
      ArrayList var8 = Lists.newArrayList();

      for (LivingEntity var10 : var5.<List<LivingEntity>>method21410(Class8830.field39819).orElse(Lists.newArrayList())) {
         if (var10 instanceof PiglinEntity && !var10.isChild()) {
            var7++;
            if (!var6.isPresent()) {
               var6 = Optional.<LivingEntity>of((PiglinEntity)var10);
            }
         }

         if (var10 instanceof HoglinEntity && !var10.isChild()) {
            var8.add((HoglinEntity)var10);
         }
      }

      var5.method21408(Class8830.field39864, var6);
      var5.method21406(Class8830.field39863, var8);
      var5.method21406(Class8830.field39866, var7);
      var5.method21406(Class8830.field39867, var8.size());
   }

   private Optional<BlockPos> method26439(ServerWorld var1, HoglinEntity var2) {
      return BlockPos.method8357(var2.getPosition(), 8, 4, var1x -> var1.getBlockState(var1x).isIn(BlockTags.field32806));
   }
}
