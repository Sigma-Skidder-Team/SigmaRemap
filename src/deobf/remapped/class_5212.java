package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class class_5212 extends class_5920<class_5834> {
   private static String[] field_26773;
   private final float field_26774;

   public class_5212(float var1) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318));
      this.field_26774 = var1;
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      Optional var7 = Optional.<class_1343>ofNullable(this.method_23889(var1, var2));
      if (var7.isPresent()) {
         var2.method_26525().method_5106(class_6044.field_30889, var7.map(var1x -> new class_6651(var1x, this.field_26774, 0)));
      }
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      return !var1.method_25263(var2.method_37075());
   }

   @Nullable
   private class_1343 method_23889(class_6331 var1, class_5834 var2) {
      Random var5 = var2.method_26594();
      BlockPos var6 = var2.method_37075();

      for (int var7 = 0; var7 < 10; var7++) {
         BlockPos var8 = var6.method_6104(var5.nextInt(20) - 10, var5.nextInt(6) - 3, var5.nextInt(20) - 10);
         if (method_23890(var1, var2, var8)) {
            return class_1343.method_6200(var8);
         }
      }

      return null;
   }

   public static boolean method_23890(class_6331 var0, class_5834 var1, BlockPos var2) {
      return var0.method_25263(var2) && (double)var0.method_22563(class_3801.field_18595, var2).method_12165() <= var1.method_37309();
   }
}
