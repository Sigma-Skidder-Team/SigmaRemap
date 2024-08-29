package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2932 extends Class2930 {
   public Class2932(Codec<Class4727> var1) {
      super(var1);
   }

   @Override
   public void method11269(Class1660 var1, Random var2, BlockPos var3, int var4, Mutable var5, Class4727 var6) {
      int var9 = var6.field22397;

      for (int var10 = -var9; var10 <= var9; var10++) {
         for (int var11 = -var9; var11 <= var9; var11++) {
            boolean var12 = var10 == -var9;
            boolean var13 = var10 == var9;
            boolean var14 = var11 == -var9;
            boolean var15 = var11 == var9;
            boolean var16 = var12 || var13;
            boolean var17 = var14 || var15;
            if (!var16 || !var17) {
               var5.method8378(var3, var10, var4, var11);
               if (!var1.getBlockState(var5).method23409(var1, var5)) {
                  boolean var18 = var12 || var17 && var10 == 1 - var9;
                  boolean var19 = var13 || var17 && var10 == var9 - 1;
                  boolean var20 = var14 || var16 && var11 == 1 - var9;
                  boolean var21 = var15 || var16 && var11 == var9 - 1;
                  this.method11217(
                     var1,
                     var5,
                     var6.field22395
                        .method20424(var2, var3)
                        .method23465(Class3443.field19252, Boolean.valueOf(var18))
                        .method23465(Class3443.field19250, Boolean.valueOf(var19))
                        .method23465(Class3443.field19249, Boolean.valueOf(var20))
                        .method23465(Class3443.field19251, Boolean.valueOf(var21))
                  );
               }
            }
         }
      }
   }

   @Override
   public int method11268(int var1, int var2, int var3, int var4) {
      return var4 > 3 ? var3 : 0;
   }
}
