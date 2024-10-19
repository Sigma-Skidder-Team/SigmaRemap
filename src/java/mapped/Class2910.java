package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2910 extends Class2898<Class4732> {
   public Class2910(Codec<Class4732> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4732 var5) {
      BlockPos.Mutable var8 = new BlockPos.Mutable();

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            int var11 = var4.getX() + var9;
            int var12 = var4.getZ() + var10;
            int var13 = var5.field22408;
            var8.setPos(var11, var13, var12);
            if (var1.getBlockState(var8).isAir()) {
               var1.setBlockState(var8, var5.field22409, 2);
            }
         }
      }

      return true;
   }
}
