package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2900 extends Class2899 {
   public Class2900(Codec<Class4699> var1) {
      super(var1);
   }

   @Override
   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4699 var5) {
      while (var1.method7007(var4) && var4.getY() > 2) {
         var4 = var4.method8313();
      }

      return var1.method6738(var4).method23448(Blocks.SNOW_BLOCK) ? super.method11213(var1, var2, var3, var4, var5) : false;
   }
}
