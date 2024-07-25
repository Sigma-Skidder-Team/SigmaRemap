package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_6597 extends class_6127<MobEntity> {
   private static String[] field_34031;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30869);
   }

   public void method_30377(class_6331 var1, MobEntity var2) {
      class_1150 var5 = var2.method_26525();
      List var6 = var1.<class_91>method_25869(class_91.class, var2.method_37241().method_18899(8.0, 4.0, 8.0), var0 -> true);
      var6.sort(Comparator.comparingDouble(var2::method_37275));
      Optional var7 = var6.stream()
         .filter(var1x -> var2.method_26873(var1x.method_264()))
         .filter(var1x -> var1x.method_37124(var2, 9.0))
         .filter(var2::method_26420)
         .findFirst();
      var5.method_5106(class_6044.field_30869, var7);
   }
}
