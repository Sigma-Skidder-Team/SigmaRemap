package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_71 {
   private static final Identifier field_99 = new Identifier("igloo/top");
   private static final Identifier field_96 = new Identifier("igloo/middle");
   private static final Identifier field_101 = new Identifier("igloo/bottom");
   private static final Map<Identifier, BlockPos> field_98 = ImmutableMap.of(
      field_99, new BlockPos(3, 5, 5), field_96, new BlockPos(1, 3, 1), field_101, new BlockPos(3, 6, 7)
   );
   private static final Map<Identifier, BlockPos> field_100 = ImmutableMap.of(
      field_99, BlockPos.field_7306, field_96, new BlockPos(2, -3, 4), field_101, new BlockPos(0, -3, -2)
   );

   public static void method_78(class_5799 var0, BlockPos var1, class_6631 var2, List<class_7060> var3, Random var4) {
      if (var4.nextDouble() < 0.5) {
         int var7 = var4.nextInt(8) + 4;
         var3.add(new class_861(var0, field_101, var1, var2, var7 * 3));

         for (int var8 = 0; var8 < var7 - 1; var8++) {
            var3.add(new class_861(var0, field_96, var1, var2, var8 * 3));
         }
      }

      var3.add(new class_861(var0, field_99, var1, var2, 0));
   }
}
