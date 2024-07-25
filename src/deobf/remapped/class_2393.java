package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_2393 {
   private static String[] field_11948;
   private final List<class_6852> field_11947 = Lists.newArrayList();

   public void method_10920(BlockPos var1, double var2) {
      if (var2 != 0.0) {
         this.field_11947.add(new class_6852(var1, var2));
      }
   }

   public double method_10919(BlockPos var1, double var2) {
      if (var2 == 0.0) {
         return 0.0;
      } else {
         double var6 = 0.0;

         for (class_6852 var9 : this.field_11947) {
            var6 += var9.method_31441(var1);
         }

         return var6 * var2;
      }
   }
}
