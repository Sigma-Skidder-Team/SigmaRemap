package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Set;

public class class_6957 extends class_6127<class_7666> {
   private static String[] field_35763;

   public class_6957() {
      super(40);
   }

   public void method_31807(class_6331 var1, class_7666 var2) {
      class_5621 var5 = var1.method_29545();
      class_1331 var6 = var2.method_37075();
      ArrayList var7 = Lists.newArrayList();
      byte var8 = 4;

      for (int var9 = -4; var9 <= 4; var9++) {
         for (int var10 = -2; var10 <= 2; var10++) {
            for (int var11 = -4; var11 <= 4; var11++) {
               class_1331 var12 = var6.method_6104(var9, var10, var11);
               if (var2.method_15891().method_13910().method_20724().contains(var1.method_28262(var12).method_8360())) {
                  var7.add(class_8150.method_37410(var5, var12));
               }
            }
         }
      }

      class_1150 var13 = var2.method_26525();
      if (var7.isEmpty()) {
         var13.method_5127(class_6044.field_30887);
      } else {
         var13.method_5105(class_6044.field_30887, var7);
      }
   }

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30887);
   }
}
