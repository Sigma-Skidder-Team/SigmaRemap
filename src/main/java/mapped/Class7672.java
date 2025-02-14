package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class7672 {
   private static String[] field32877;
   private final List<Class9059> field32878 = Lists.newArrayList();

   public void method25204(BlockPos var1, double var2) {
      if (var2 != 0.0) {
         this.field32878.add(new Class9059(var1, var2));
      }
   }

   public double method25205(BlockPos var1, double var2) {
      if (var2 == 0.0) {
         return 0.0;
      } else {
         double var6 = 0.0;

         for (Class9059 var9 : this.field32878) {
            var6 += var9.method33719(var1);
         }

         return var6 * var2;
      }
   }
}
