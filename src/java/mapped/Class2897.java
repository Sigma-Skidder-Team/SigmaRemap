package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class2897 extends Class2898<Class4706> {
   public Class2897(Codec<Class4706> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4706 var5) {
      int var8 = var3.nextInt(var5.field22324.size());
      Class7909 var9 = var5.field22324.get(var8).get();
      return var9.method26521(var1, var2, var3, var4);
   }
}
