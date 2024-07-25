package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_5275 extends class_6127<LivingEntity> {
   private static String[] field_26950;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30901, class_6044.field_30891, class_6044.field_30876);
   }

   @Override
   public void method_28154(class_6331 var1, LivingEntity var2) {
      class_1150 var5 = var2.method_26525();
      Optional var6 = Optional.empty();
      ArrayList var7 = Lists.newArrayList();

      for (LivingEntity var9 : var5.<List<LivingEntity>>method_5138(class_6044.field_30901).orElse(ImmutableList.of())) {
         if (var9 instanceof class_3204 || var9 instanceof class_4653) {
            var6 = Optional.<LivingEntity>of((MobEntity)var9);
            break;
         }
      }

      for (LivingEntity var11 : var5.<List<LivingEntity>>method_5138(class_6044.field_30907).orElse(ImmutableList.of())) {
         if (var11 instanceof class_6993 && ((class_6993)var11).method_31995()) {
            var7.add((class_6993)var11);
         }
      }

      var5.method_5106(class_6044.field_30891, var6);
      var5.method_5105(class_6044.field_30876, var7);
   }
}
