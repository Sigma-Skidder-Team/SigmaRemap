package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2900 extends Class2899 {
   public Class2900(Codec<Class4699> var1) {
      super(var1);
   }

   @Override
   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4699 var5) {
      while (var1.method7007(var4) && var4.getY() > 2) {
         var4 = var4.down();
      }

      return var1.getBlockState(var4).isIn(Blocks.SNOW_BLOCK) ? super.method11213(var1, var2, var3, var4, var5) : false;
   }
}
