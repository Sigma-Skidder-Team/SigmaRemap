package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2904 extends Class2898<Class4731> {
   public Class2904(Codec<Class4731> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4731 var5) {
      if (var1.getBlockState(var4).isIn(var5.field22405.getBlock())) {
         var1.setBlockState(var4, var5.field22406, 2);
      }

      return true;
   }
}
