package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_6960 extends class_6127<class_1899> {
   private static String[] field_35771;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30885, class_6044.field_30901);
   }

   public void method_31816(class_6331 var1, class_1899 var2) {
      var2.method_26525().<List<LivingEntity>>method_5138(class_6044.field_30901).ifPresent(var2x -> this.method_31815(var2, (List<LivingEntity>)var2x));
   }

   private void method_31815(class_1899 var1, List<LivingEntity> var2) {
      Optional var5 = var2.stream()
         .filter(var1x -> var1x.getType() == var1.getType())
         .<class_1899>map(var0 -> (class_1899)var0)
         .filter(var0 -> !var0.method_26449())
         .findFirst();
      var1.method_26525().method_5106(class_6044.field_30885, var5);
   }
}
