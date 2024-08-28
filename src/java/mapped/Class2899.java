package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2899 extends Class2898<Class4699> {
   private static String[] field17989;

   public Class2899(Codec<Class4699> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4699 var5) {
      boolean var8 = false;
      int var9 = var5.field22293.method27633(var3);

      for (int var10 = var4.method8304() - var9; var10 <= var4.method8304() + var9; var10++) {
         for (int var11 = var4.method8306() - var9; var11 <= var4.method8306() + var9; var11++) {
            int var12 = var10 - var4.method8304();
            int var13 = var11 - var4.method8306();
            if (var12 * var12 + var13 * var13 <= var9 * var9) {
               for (int var14 = var4.getY() - var5.field22294; var14 <= var4.getY() + var5.field22294; var14++) {
                  BlockPos var15 = new BlockPos(var10, var14, var11);
                  Block var16 = var1.method6738(var15).method23383();

                  for (Class7380 var18 : var5.field22295) {
                     if (var18.method23448(var16)) {
                        var1.method6725(var15, var5.field22292, 2);
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
