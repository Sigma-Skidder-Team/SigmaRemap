package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2953 extends Class2898<Class4712> {
   public Class2953(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      if (!var1.method7007(var4)) {
         return false;
      } else {
         BlockState var8 = var1.getBlockState(var4.method8311());
         if (!var8.method23448(Blocks.NETHERRACK) && !var8.method23448(Blocks.BASALT) && !var8.method23448(Blocks.field37130)) {
            return false;
         } else {
            var1.method6725(var4, Blocks.field36587.method11579(), 2);

            for (int var9 = 0; var9 < 1500; var9++) {
               BlockPos var10 = var4.method8336(var3.nextInt(8) - var3.nextInt(8), -var3.nextInt(12), var3.nextInt(8) - var3.nextInt(8));
               if (var1.getBlockState(var10).isAir()) {
                  int var11 = 0;

                  for (Direction var15 : Direction.values()) {
                     if (var1.getBlockState(var10.method8349(var15)).method23448(Blocks.field36587)) {
                        var11++;
                     }

                     if (var11 > 1) {
                        break;
                     }
                  }

                  if (var11 == 1) {
                     var1.method6725(var10, Blocks.field36587.method11579(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
