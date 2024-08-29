package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class7661 extends Class7665 {
   @Override
   public boolean method25182(ServerWorld var1, Class5646 var2, BlockPos var3, BlockState var4, Random var5) {
      for (int var8 = 0; var8 >= -1; var8--) {
         for (int var9 = 0; var9 >= -1; var9--) {
            if (method25185(var4, var1, var3, var8, var9)) {
               return this.method25184(var1, var2, var3, var4, var5, var8, var9);
            }
         }
      }

      return super.method25182(var1, var2, var3, var4, var5);
   }

   @Nullable
   public abstract Class7909<Class4733, ?> method25183(Random var1);

   public boolean method25184(ServerWorld var1, Class5646 var2, BlockPos var3, BlockState var4, Random var5, int var6, int var7) {
      Class7909 var10 = this.method25183(var5);
      if (var10 != null) {
         ((Class4733)var10.field33887).method14849();
         BlockState var11 = Blocks.AIR.method11579();
         var1.method6725(var3.method8336(var6, 0, var7), var11, 4);
         var1.method6725(var3.method8336(var6 + 1, 0, var7), var11, 4);
         var1.method6725(var3.method8336(var6, 0, var7 + 1), var11, 4);
         var1.method6725(var3.method8336(var6 + 1, 0, var7 + 1), var11, 4);
         if (!var10.method26521(var1, var2, var5, var3.method8336(var6, 0, var7))) {
            var1.method6725(var3.method8336(var6, 0, var7), var4, 4);
            var1.method6725(var3.method8336(var6 + 1, 0, var7), var4, 4);
            var1.method6725(var3.method8336(var6, 0, var7 + 1), var4, 4);
            var1.method6725(var3.method8336(var6 + 1, 0, var7 + 1), var4, 4);
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean method25185(BlockState var0, Class1665 var1, BlockPos var2, int var3, int var4) {
      Block var7 = var0.getBlock();
      return var7 == var1.getBlockState(var2.method8336(var3, 0, var4)).getBlock()
         && var7 == var1.getBlockState(var2.method8336(var3 + 1, 0, var4)).getBlock()
         && var7 == var1.getBlockState(var2.method8336(var3, 0, var4 + 1)).getBlock()
         && var7 == var1.getBlockState(var2.method8336(var3 + 1, 0, var4 + 1)).getBlock();
   }
}
