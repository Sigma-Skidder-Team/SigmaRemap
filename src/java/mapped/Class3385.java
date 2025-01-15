package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3385 extends Block implements IGrowable {
   private static String[] field18992;

   public Class3385(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      if (!var1.getBlockState(var2.up()).method23386(var1, var2)) {
         return false;
      } else {
         for (BlockPos var8 : BlockPos.method8359(var2.add(-1, -1, -1), var2.add(1, 1, 1))) {
            if (var1.getBlockState(var8).isIn(BlockTags.field32799)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      boolean var7 = false;
      boolean var8 = false;

      for (BlockPos var10 : BlockPos.method8359(var3.add(-1, -1, -1), var3.add(1, 1, 1))) {
         BlockState var11 = var1.getBlockState(var10);
         if (var11.isIn(Blocks.field37074)) {
            var8 = true;
         }

         if (var11.isIn(Blocks.field37083)) {
            var7 = true;
         }

         if (var8 && var7) {
            break;
         }
      }

      if (var8 && var7) {
         var1.setBlockState(var3, !var2.nextBoolean() ? Blocks.field37083.getDefaultState() : Blocks.field37074.getDefaultState(), 3);
      } else if (!var8) {
         if (var7) {
            var1.setBlockState(var3, Blocks.field37083.getDefaultState(), 3);
         }
      } else {
         var1.setBlockState(var3, Blocks.field37074.getDefaultState(), 3);
      }
   }
}
