package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2938 extends Class2898<Class4712> {
   public Class2938(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      BlockPos.Mutable var8 = new BlockPos.Mutable();
      BlockPos.Mutable var9 = new BlockPos.Mutable();

      for (int var10 = 0; var10 < 16; var10++) {
         for (int var11 = 0; var11 < 16; var11++) {
            int var12 = var4.getX() + var10;
            int var13 = var4.getZ() + var11;
            int var14 = var1.method6736(Heightmap.Type.MOTION_BLOCKING, var12, var13);
            var8.setPos(var12, var14, var13);
            var9.method8374(var8).method8380(Direction.DOWN, 1);
            Biome var15 = var1.getBiome(var8);
            if (var15.doesWaterFreeze(var1, var9, false)) {
               var1.setBlockState(var9, Blocks.ICE.getDefaultState(), 2);
            }

            if (var15.doesSnowGenerate(var1, var8)) {
               var1.setBlockState(var8, Blocks.SNOW.getDefaultState(), 2);
               BlockState var16 = var1.getBlockState(var9);
               if (var16.hasProperty(Class3471.field19323)) {
                  var1.setBlockState(var9, var16.with(Class3471.field19323, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
