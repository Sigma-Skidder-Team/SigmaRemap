package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2945 extends Class2898<Class4728> {
   public Class2945(Codec<Class4728> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4728 var5) {
      boolean var8 = false;
      int var9 = var3.nextInt(8) - var3.nextInt(8);
      int var10 = var3.nextInt(8) - var3.nextInt(8);
      int var11 = var1.method6736(Class101.field298, var4.method8304() + var9, var4.method8306() + var10);
      BlockPos var12 = new BlockPos(var4.method8304() + var9, var11, var4.method8306() + var10);
      if (var1.method6738(var12).method23448(Class8487.field36413)) {
         boolean var13 = var3.nextDouble() < (double)var5.field22399;
         Class7380 var14 = !var13 ? Class8487.field36485.method11579() : Class8487.field36486.method11579();
         if (var14.method23443(var1, var12)) {
            if (!var13) {
               var1.method6725(var12, var14, 2);
            } else {
               Class7380 var15 = var14.method23465(Class3455.field19274, Class84.field209);
               BlockPos var16 = var12.method8311();
               if (var1.method6738(var16).method23448(Class8487.field36413)) {
                  var1.method6725(var12, var14, 2);
                  var1.method6725(var16, var15, 2);
               }
            }

            var8 = true;
         }
      }

      return var8;
   }
}
