package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2936 extends Class2898<Class4712> {
   public Class2936(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      if (var1.method7007(var4) && var1.method6738(var4.method8313()).method23448(Blocks.field36651)) {
         Class3211.method11593(var1, var4, var3, 8);
         return true;
      } else {
         return false;
      }
   }
}
