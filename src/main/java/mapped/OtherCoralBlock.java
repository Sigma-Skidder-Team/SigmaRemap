package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Class3224;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class OtherCoralBlock extends Class3224 {
   private static String[] field18662;
   private final Block field18665;
   public static final VoxelShape field18664 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   public OtherCoralBlock(Block var1, Properties var2) {
      super(var2);
      this.field18665 = var1;
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      this.method11632(var1, var2, var3);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!method11633(var1, var2, var3)) {
         var2.setBlockState(var3, this.field18665.getDefaultState().with(field18663, Boolean.valueOf(false)), 2);
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

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18664;
   }
}
