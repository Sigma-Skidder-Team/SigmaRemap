package net.minecraft.block;

import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class HornCoralFanBlock extends DeadHornCoralFanBlock {
   private static String[] field18666;
   private final Block field18667;

   public HornCoralFanBlock(Block var1, Properties var2) {
      super(var2);
      this.field18667 = var1;
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      this.method11632(var1, var2, var3);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!method11633(var1, var2, var3)) {
         var2.setBlockState(var3, this.field18667.getDefaultState().with(field18663, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.DOWN && !var1.isValidPosition(var4, var5)) {
         return Blocks.AIR.getDefaultState();
      } else {
         this.method11632(var1, var4, var5);
         if (var1.<Boolean>get(field18663)) {
            var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
         }

         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      }
   }
}
