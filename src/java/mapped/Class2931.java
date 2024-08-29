package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class2931 extends Class2930 {
   public Class2931(Codec<Class4727> var1) {
      super(var1);
   }

   @Override
   public void method11269(Class1660 var1, Random var2, BlockPos var3, int var4, Mutable var5, Class4727 var6) {
      for (int var9 = var4 - 3; var9 <= var4; var9++) {
         int var10 = var9 >= var4 ? var6.field22397 - 1 : var6.field22397;
         int var11 = var6.field22397 - 2;

         for (int var12 = -var10; var12 <= var10; var12++) {
            for (int var13 = -var10; var13 <= var10; var13++) {
               boolean var14 = var12 == -var10;
               boolean var15 = var12 == var10;
               boolean var16 = var13 == -var10;
               boolean var17 = var13 == var10;
               boolean var18 = var14 || var15;
               boolean var19 = var16 || var17;
               if (var9 >= var4 || var18 != var19) {
                  var5.method8378(var3, var12, var9, var13);
                  if (!var1.getBlockState(var5).method23409(var1, var5)) {
                     this.method11217(
                        var1,
                        var5,
                        var6.field22395
                           .method20424(var2, var3)
                           .method23465(Class3443.field19253, Boolean.valueOf(var9 >= var4 - 1))
                           .method23465(Class3443.field19252, Boolean.valueOf(var12 < -var11))
                           .method23465(Class3443.field19250, Boolean.valueOf(var12 > var11))
                           .method23465(Class3443.field19249, Boolean.valueOf(var13 < -var11))
                           .method23465(Class3443.field19251, Boolean.valueOf(var13 > var11))
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public int method11268(int var1, int var2, int var3, int var4) {
      int var7 = 0;
      if (var4 < var2 && var4 >= var2 - 3) {
         var7 = var3;
      } else if (var4 == var2) {
         var7 = var3;
      }

      return var7;
   }
}
