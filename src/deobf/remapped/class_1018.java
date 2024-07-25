package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class class_1018 extends class_5788<class_611> {
   public class_1018(Codec<class_611> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_4507(class_6680 var1, Random var2, class_611 var3, BlockPos var4) {
      ArrayList var7 = Lists.newArrayList();
      int var8 = 0;

      boolean var9;
      do {
         var9 = false;

         for (int var10 = 0; var10 < var3.method_2873().method_15936(var2); var10++) {
            int var11 = var2.nextInt(16) + var4.getX();
            int var12 = var2.nextInt(16) + var4.getZ();
            int var13 = var1.method_30648(class_3801.field_18595, var11, var12);
            int var14 = method_4505(var1, var11, var13, var12, var8);
            if (var14 != Integer.MAX_VALUE) {
               var7.add(new BlockPos(var11, var14, var12));
               var9 = true;
            }
         }

         var8++;
      } while (var9);

      return var7.stream();
   }

   private static int method_4505(class_6680 var0, int var1, int var2, int var3, int var4) {
      class_2921 var7 = new class_2921(var1, var2, var3);
      int var8 = 0;
      class_2522 var9 = var0.method_30650(var7);

      for (int var10 = var2; var10 >= 1; var10--) {
         var7.method_12184(var10 - 1);
         class_2522 var11 = var0.method_30650(var7);
         if (!method_4506(var11) && method_4506(var9) && !var11.method_8350(class_4783.field_23433)) {
            if (var8 == var4) {
               return var7.getY() + 1;
            }

            var8++;
         }

         var9 = var11;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean method_4506(class_2522 var0) {
      return var0.method_8345() || var0.method_8350(class_4783.field_23900) || var0.method_8350(class_4783.field_23811);
   }
}
