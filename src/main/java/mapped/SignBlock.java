package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class SignBlock extends Class3373 {
   private static String[] field18969;
   public static final IntegerProperty field18970 = BlockStateProperties.ROTATION;

   public SignBlock(Properties var1, Class9673 var2) {
      super(var1, var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18970, Integer.valueOf(0)).with(field18966, Boolean.valueOf(false)));
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).getMaterial().isSolid();
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());
      return this.getDefaultState()
         .with(field18970, Integer.valueOf(MathHelper.floor((double)((180.0F + var1.method18352()) * 16.0F / 360.0F) + 0.5) & 15))
         .with(field18966, Boolean.valueOf(var4.getFluid() == Fluids.WATER));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !this.isValidPosition(var1, var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18970, Integer.valueOf(var2.rotate(var1.<Integer>get(field18970), 16)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.with(field18970, Integer.valueOf(var2.method8748(var1.<Integer>get(field18970), 16)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18970, field18966);
   }
}
