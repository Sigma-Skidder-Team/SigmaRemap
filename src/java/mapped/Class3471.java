package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class Class3471 extends Block {
   private static String[] field19322;
   public static final BooleanProperty field19323 = BlockStateProperties.field39707;

   public Class3471(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19323, Boolean.valueOf(false)));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.UP
         ? var1.with(field19323, Boolean.valueOf(var3.isIn(Blocks.SNOW_BLOCK) || var3.isIn(Blocks.SNOW)))
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = var1.getWorld().getBlockState(var1.getPos().up());
      return this.getDefaultState().with(field19323, Boolean.valueOf(var4.isIn(Blocks.SNOW_BLOCK) || var4.isIn(Blocks.SNOW)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19323);
   }
}
