package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2925 extends Class2898<Class4714> {
   public Class2925(Codec<Class4714> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4714 var5) {
      if (var5.field22356.contains(var1.getBlockState(var4.method8313()))
         && var5.field22357.contains(var1.getBlockState(var4))
         && var5.field22358.contains(var1.getBlockState(var4.method8311()))) {
         var1.method6725(var4, var5.field22355, 2);
         return true;
      } else {
         return false;
      }
   }
}
