package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Random;

public class GrassBlock extends Class3472 implements IGrowable {
   private static String[] field19322;

   public GrassBlock(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var1.getBlockState(var2.up()).isAir();
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockPos var7 = var3.up();
      BlockState var8 = Blocks.GRASS.getDefaultState();

      label61:
      for (int var9 = 0; var9 < 128; var9++) {
         BlockPos var10 = var7;

         for (int var11 = 0; var11 < var9 / 16; var11++) {
            var10 = var10.add(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
            if (!var1.getBlockState(var10.down()).isIn(this) || var1.getBlockState(var10).method23456(var1, var10)) {
               continue label61;
            }
         }

         BlockState var16 = var1.getBlockState(var10);
         if (var16.isIn(var8.getBlock()) && var2.nextInt(10) == 0) {
            ((IGrowable)var8.getBlock()).method11488(var1, var2, var10, var16);
         }

         if (var16.isAir()) {
            BlockState var12;
            if (var2.nextInt(8) != 0) {
               var12 = var8;
            } else {
               List var13 = var1.getBiome(var10).getGenerationSettings().method24280();
               if (var13.isEmpty()) {
                  continue;
               }

               ConfiguredFeature var14 = (ConfiguredFeature)var13.get(0);
               Class2921 var15 = (Class2921)var14.feature;
               var12 = var15.method11254(var2, var10, var14.method26519());
            }

            if (var12.isValidPosition(var1, var10)) {
               var1.setBlockState(var10, var12, 3);
            }
         }
      }
   }
}
