package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2918 extends Class2898<Class4715> {
   public Class2918(Codec<Class4715> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4715 var5) {
      int var8 = 0;
      int var9 = var5.method14807().method27633(var3);

      for (int var10 = 0; var10 < var9; var10++) {
         int var11 = var3.nextInt(8) - var3.nextInt(8);
         int var12 = var3.nextInt(8) - var3.nextInt(8);
         int var13 = var1.method6736(Heightmap.Type.field298, var4.getX() + var11, var4.getZ() + var12);
         BlockPos var14 = new BlockPos(var4.getX() + var11, var13, var4.getZ() + var12);
         BlockState var15 = Blocks.field37005.method11579().with(Class3195.field18472, Integer.valueOf(var3.nextInt(4) + 1));
         if (var1.getBlockState(var14).isIn(Blocks.WATER) && var15.method23443(var1, var14)) {
            var1.setBlockState(var14, var15, 2);
            var8++;
         }
      }

      return var8 > 0;
   }
}
