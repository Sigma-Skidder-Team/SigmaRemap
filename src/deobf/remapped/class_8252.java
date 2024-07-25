package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class class_8252 extends class_6127<class_5834> {
   private static String[] field_42349;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30886, class_6044.field_30870, class_6044.field_30912);
   }

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      List var5 = var1.method_25873()
         .stream()
         .filter(class_3572.field_17483)
         .filter(var1x -> var2.method_37124(var1x, 16.0))
         .sorted(Comparator.comparingDouble(var2::method_37275))
         .collect(Collectors.toList());
      class_1150 var6 = var2.method_26525();
      var6.method_5105(class_6044.field_30886, var5);
      List var7 = var5.stream().filter(var1x -> method_28150(var2, var1x)).collect(Collectors.toList());
      var6.method_5105(class_6044.field_30870, !var7.isEmpty() ? (class_704)var7.get(0) : null);
      Optional var8 = var7.stream().filter(class_3572.field_17480).findFirst();
      var6.method_5106(class_6044.field_30912, var8);
   }
}
