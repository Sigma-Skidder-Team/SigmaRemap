package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class_6995 extends class_6127<LivingEntity> {
   private static String[] field_35909;

   @Override
   public void method_28154(class_6331 var1, LivingEntity var2) {
      Box var5 = var2.getBoundingBox().method_18899(16.0, 16.0, 16.0);
      List var6 = var1.<LivingEntity>method_25869(LivingEntity.class, var5, var1x -> var1x != var2 && var1x.isAlive());
      var6.sort(Comparator.comparingDouble(var2::method_37275));
      class_1150 var7 = var2.method_26525();
      var7.method_5105(class_6044.field_30907, var6);
      var7.method_5105(class_6044.field_30901, var6.stream().filter(var1x -> method_28150(var2, var1x)).collect(Collectors.<LivingEntity>toList()));
   }

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30907, class_6044.field_30901);
   }
}
