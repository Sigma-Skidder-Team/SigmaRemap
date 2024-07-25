package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_7747 extends class_4285<class_8342> {
   public class_7747(Codec<class_8342> var1) {
      super(var1);
   }

   public boolean method_35075(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_8342 var5) {
      if (var4.getY() >= 5) {
         int var8 = 2 + var3.nextInt(2);
         int var9 = 2 + var3.nextInt(2);

         for (BlockPos var11 : BlockPos.method_6076(var4.method_6104(-var8, 0, -var9), var4.method_6104(var8, 1, var9))) {
            int var12 = var4.getX() - var11.getX();
            int var13 = var4.getZ() - var11.getZ();
            if (!((float)(var12 * var12 + var13 * var13) <= var3.nextFloat() * 10.0F - var3.nextFloat() * 6.0F)) {
               if ((double)var3.nextFloat() < 0.031) {
                  this.method_35076(var1, var11, var3, var5);
               }
            } else {
               this.method_35076(var1, var11, var3, var5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method_35074(class_9379 var1, BlockPos var2, Random var3) {
      BlockPos var6 = var2.method_6100();
      class_2522 var7 = var1.method_28262(var6);
      return !var7.method_8350(class_4783.field_23608) ? var7.method_8308(var1, var6, Direction.field_817) : var3.nextBoolean();
   }

   private void method_35076(class_9379 var1, BlockPos var2, Random var3, class_8342 var4) {
      if (var1.method_22548(var2) && this.method_35074(var1, var2, var3)) {
         var1.method_7513(var2, var4.field_42743.method_35002(var3, var2), 4);
      }
   }
}
