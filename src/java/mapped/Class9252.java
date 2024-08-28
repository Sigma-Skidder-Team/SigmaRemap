package mapped;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Class9252 {
   private static String[] field42557;

   public static Iterator<Class8066> method34804(Class1656 var0, double var1, Entity var3, int var4, Class9242 var5) {
      float var8 = Class8981.method33159();
      if (!(var8 <= 0.0F) && !(var8 >= (float)((var4 - 1) * 16))) {
         int var19 = Class9679.method37773(var8 / 16.0F) + 1;
         float var10 = var0.method6750((float)var1);
         float var11 = Class8981.field40936 * Class9679.field45214;
         float var12 = var10 > Class9679.field45212 && var10 < 3.0F * Class9679.field45212 ? var10 + Class9679.field45210 : var10;
         float var13 = -Class9679.method37763(var12);
         float var14 = Class9679.method37764(var12) * Class9679.method37764(var11);
         float var15 = -Class9679.method37764(var12) * Class9679.method37763(var11);
         BlockPos var16 = new BlockPos(
            Class9679.method37769(var3.getPosX()) >> 4, Class9679.method37769(var3.getPosY()) >> 4, Class9679.method37769(var3.getPosZ()) >> 4
         );
         BlockPos var17 = var16.method8335((double)(-var13 * (float)var19), (double)(-var14 * (float)var19), (double)(-var15 * (float)var19));
         BlockPos var18 = var16.method8335((double)(var13 * (float)var4), (double)(var14 * (float)var4), (double)(var15 * (float)var4));
         return new Class4544(var5, var17, var18, var19, var19);
      } else {
         List var9 = Arrays.<Class8066>asList(var5.field42528);
         return var9.iterator();
      }
   }
}
