package net.minecraft.block;

import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;

public class BlackGlazedTerracottaBlock extends HorizontalBlock {
   private static String[] field19330;

   public BlackGlazedTerracottaBlock(Properties var1) {
      super(var1);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING);
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(HORIZONTAL_FACING, var1.getPlacementHorizontalFacing().getOpposite());
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15866;
   }
}
