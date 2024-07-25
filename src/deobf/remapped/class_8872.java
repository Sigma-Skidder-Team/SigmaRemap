package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_8872 extends class_6127<class_5834> {
   private static String[] field_45355;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30867, class_6044.field_30859);
   }

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      class_1150 var5 = var2.method_26525();
      class_6199 var6 = var2.method_26429();
      if (var6 == null) {
         var5.method_5127(class_6044.field_30867);
      } else {
         var5.method_5105(class_6044.field_30867, var2.method_26429());
         Entity var7 = var6.method_28372();
         if (var7 instanceof class_5834) {
            var5.method_5105(class_6044.field_30859, (class_5834)var7);
         }
      }

      var5.<class_5834>method_5138(class_6044.field_30859).ifPresent(var2x -> {
         if (!var2x.method_37330() || var2x.field_41768 != var1) {
            var5.method_5127(class_6044.field_30859);
         }
      });
   }
}
