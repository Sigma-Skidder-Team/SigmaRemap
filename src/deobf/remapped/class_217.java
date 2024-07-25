package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class class_217 extends class_3418 {
   public class_217(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public boolean method_15772(class_9379 var1, Random var2, BlockPos var3, class_2522 var4) {
      if (!this.method_15774(var1, var2, var3, var4)) {
         return false;
      } else {
         Direction var7 = class_9594.field_48893.method_44313(var2);
         int var8 = var2.nextInt(2) + 2;
         ArrayList var9 = Lists.newArrayList(new Direction[]{var7, var7.method_1042(), var7.method_1053()});
         Collections.shuffle(var9, var2);

         for (Direction var11 : var9.subList(0, var8)) {
            class_2921 var12 = var3.method_6089();
            int var13 = var2.nextInt(2) + 1;
            var12.method_13368(var11);
            Direction var15;
            int var16;
            if (var11 != var7) {
               var12.method_13368(Direction.field_817);
               Direction[] var14 = new Direction[]{var11, Direction.field_817};
               var15 = Util.<Direction>method_44697(var14, var2);
               var16 = var2.nextInt(3) + 3;
            } else {
               var15 = var7;
               var16 = var2.nextInt(3) + 2;
            }

            for (int var17 = 0; var17 < var13 && this.method_15774(var1, var2, var12, var4); var17++) {
               var12.method_13368(var15);
            }

            var12.method_13368(var15.method_1046());
            var12.method_13368(Direction.field_817);

            for (int var18 = 0; var18 < var16; var18++) {
               var12.method_13368(var7);
               if (!this.method_15774(var1, var2, var12, var4)) {
                  break;
               }

               if (var2.nextFloat() < 0.25F) {
                  var12.method_13368(Direction.field_817);
               }
            }
         }

         return true;
      }
   }
}
