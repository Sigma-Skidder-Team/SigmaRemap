package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_7588 extends class_6127<class_6704> {
   private static String[] field_38651;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(
         class_6044.field_30901,
         class_6044.field_30905,
         class_6044.field_30863,
         class_6044.field_30915,
         class_6044.field_30878,
         class_6044.field_30906,
         new class_6044[0]
      );
   }

   public void method_34482(class_6331 var1, class_6704 var2) {
      class_1150 var5 = var2.method_26525();
      var5.method_5106(class_6044.field_30905, this.method_34481(var1, var2));
      Optional var6 = Optional.empty();
      int var7 = 0;
      ArrayList var8 = Lists.newArrayList();

      for (class_5834 var10 : var5.<List<class_5834>>method_5138(class_6044.field_30901).orElse(Lists.newArrayList())) {
         if (var10 instanceof class_2599 && !var10.method_26449()) {
            var7++;
            if (!var6.isPresent()) {
               var6 = Optional.<class_5834>of((class_2599)var10);
            }
         }

         if (var10 instanceof class_6704 && !var10.method_26449()) {
            var8.add((class_6704)var10);
         }
      }

      var5.method_5106(class_6044.field_30863, var6);
      var5.method_5105(class_6044.field_30915, var8);
      var5.method_5105(class_6044.field_30878, var7);
      var5.method_5105(class_6044.field_30906, var8.size());
   }

   private Optional<BlockPos> method_34481(class_6331 var1, class_6704 var2) {
      return BlockPos.method_6102(var2.method_37075(), 8, 4, var1x -> var1.method_28262(var1x).method_8349(class_2351.field_11758));
   }
}
