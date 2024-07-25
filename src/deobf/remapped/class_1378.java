package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class class_1378 extends class_3418 {
   public class_1378(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public boolean method_15772(class_9379 var1, Random var2, BlockPos var3, class_2522 var4) {
      class_2921 var7 = var3.method_6089();
      int var8 = var2.nextInt(3) + 1;

      for (int var9 = 0; var9 < var8; var9++) {
         if (!this.method_15774(var1, var2, var7, var4)) {
            return true;
         }

         var7.method_13368(Direction.field_817);
      }

      BlockPos var17 = var7.method_6072();
      int var10 = var2.nextInt(3) + 2;
      ArrayList var11 = Lists.newArrayList(class_9594.field_48893);
      Collections.shuffle(var11, var2);

      for (Direction var13 : var11.subList(0, var10)) {
         var7.method_13364(var17);
         var7.method_13368(var13);
         int var14 = var2.nextInt(5) + 2;
         int var15 = 0;

         for (int var16 = 0; var16 < var14 && this.method_15774(var1, var2, var7, var4); var16++) {
            var15++;
            var7.method_13368(Direction.field_817);
            if (var16 == 0 || var15 >= 2 && var2.nextFloat() < 0.25F) {
               var7.method_13368(var13);
               var15 = 0;
            }
         }
      }

      return true;
   }
}
