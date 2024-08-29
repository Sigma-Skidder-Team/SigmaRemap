package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class2925 extends Class2898<Class4714> {
   public Class2925(Codec<Class4714> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4714 var5) {
      if (var5.field22356.contains(var1.getBlockState(var4.down()))
         && var5.field22357.contains(var1.getBlockState(var4))
         && var5.field22358.contains(var1.getBlockState(var4.up()))) {
         var1.setBlockState(var4, var5.field22355, 2);
         return true;
      } else {
         return false;
      }
   }
}
