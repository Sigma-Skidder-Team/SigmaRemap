package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_9270 extends class_4285<class_8351> {
   private static String[] field_47292;

   public class_9270(Codec<class_8351> var1) {
      super(var1);
   }

   public boolean method_42716(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_8351 var5) {
      boolean var8 = false;
      int var9 = var5.field_42764.method_15936(var3);

      for (int var10 = var4.getX() - var9; var10 <= var4.getX() + var9; var10++) {
         for (int var11 = var4.method_12185() - var9; var11 <= var4.method_12185() + var9; var11++) {
            int var12 = var10 - var4.getX();
            int var13 = var11 - var4.method_12185();
            if (var12 * var12 + var13 * var13 <= var9 * var9) {
               for (int var14 = var4.method_12165() - var5.field_42766; var14 <= var4.method_12165() + var5.field_42766; var14++) {
                  BlockPos var15 = new BlockPos(var10, var14, var11);
                  class_6414 var16 = var1.method_28262(var15).method_8360();

                  for (class_2522 var18 : var5.field_42761) {
                     if (var18.method_8350(var16)) {
                        var1.method_7513(var15, var5.field_42763, 2);
                        var8 = true;
                        break;
                     }
                  }
               }
            }
         }
      }

      return var8;
   }
}
