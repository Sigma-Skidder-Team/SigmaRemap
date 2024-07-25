package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class_6995 extends class_6127<class_5834> {
   private static String[] field_35909;

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      Box var5 = var2.method_37241().method_18899(16.0, 16.0, 16.0);
      List var6 = var1.<class_5834>method_25869(class_5834.class, var5, var1x -> var1x != var2 && var1x.method_37330());
      var6.sort(Comparator.comparingDouble(var2::method_37275));
      class_1150 var7 = var2.method_26525();
      var7.method_5105(class_6044.field_30907, var6);
      var7.method_5105(class_6044.field_30901, var6.stream().filter(var1x -> method_28150(var2, var1x)).collect(Collectors.<class_5834>toList()));
   }

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30907, class_6044.field_30901);
   }
}
