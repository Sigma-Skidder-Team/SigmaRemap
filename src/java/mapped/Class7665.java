package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class7665 {
   @Nullable
   public abstract Class7909<Class4733, ?> method25186(Random var1, boolean var2);

   public boolean method25182(ServerWorld var1, Class5646 var2, BlockPos var3, BlockState var4, Random var5) {
      Class7909 var8 = this.method25186(var5, this.method25187(var1, var3));
      if (var8 != null) {
         var1.method6725(var3, Blocks.AIR.method11579(), 4);
         ((Class4733)var8.field33887).method14849();
         if (!var8.method26521(var1, var2, var5, var3)) {
            var1.method6725(var3, var4, 4);
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean method25187(Class1660 var1, BlockPos var2) {
      for (BlockPos var6 : Mutable.method8359(var2.method8313().method8342(2).method8346(2), var2.method8311().method8344(2).method8348(2))) {
         if (var1.getBlockState(var6).method23446(Class7645.field32773)) {
            return true;
         }
      }

      return false;
   }
}
