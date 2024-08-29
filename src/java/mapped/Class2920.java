package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2920 extends Class2898<Class4703> {
   public Class2920(Codec<Class4703> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4703 var5) {
      BlockState var8 = var5.field22306.method20424(var3, var4);
      BlockPos var9;
      if (!var5.field22315) {
         var9 = var4;
      } else {
         var9 = var1.method7006(Class101.field295, var4);
      }

      int var10 = 0;
      Mutable var11 = new Mutable();

      for (int var12 = 0; var12 < var5.field22310; var12++) {
         var11.method8378(
            var9,
            var3.nextInt(var5.field22311 + 1) - var3.nextInt(var5.field22311 + 1),
            var3.nextInt(var5.field22312 + 1) - var3.nextInt(var5.field22312 + 1),
            var3.nextInt(var5.field22313 + 1) - var3.nextInt(var5.field22313 + 1)
         );
         BlockPos var13 = var11.method8313();
         BlockState var14 = var1.getBlockState(var13);
         if ((var1.method7007(var11) || var5.field22314 && var1.getBlockState(var11).method23384().method31089())
            && var8.method23443(var1, var11)
            && (var5.field22308.isEmpty() || var5.field22308.contains(var14.getBlock()))
            && !var5.field22309.contains(var14)
            && (
               !var5.field22316
                  || var1.method6739(var13.method8345()).method23486(Class8953.field40469)
                  || var1.method6739(var13.method8347()).method23486(Class8953.field40469)
                  || var1.method6739(var13.method8341()).method23486(Class8953.field40469)
                  || var1.method6739(var13.method8343()).method23486(Class8953.field40469)
            )) {
            var5.field22307.method19061(var1, var11, var8, var3);
            var10++;
         }
      }

      return var10 > 0;
   }
}
