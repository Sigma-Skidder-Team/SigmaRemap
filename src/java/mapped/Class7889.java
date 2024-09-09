package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7889 extends Class7882<LivingEntity> {
   private static String[] field33840;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39820);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      var2.getBrain().method21406(Class8830.field39820, this.method26453(var2));
   }

   private List<LivingEntity> method26453(LivingEntity var1) {
      return this.method26455(var1).stream().filter(this::method26454).collect(Collectors.<LivingEntity>toList());
   }

   private boolean method26454(LivingEntity var1) {
      return var1.getType() == EntityType.field41098 && var1.isChild();
   }

   private List<LivingEntity> method26455(LivingEntity var1) {
      return var1.getBrain().<List<LivingEntity>>method21410(Class8830.field39819).orElse(Lists.newArrayList());
   }
}
