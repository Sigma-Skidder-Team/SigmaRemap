package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.PushReaction;

public class Class3477 extends HorizontalBlock {
   private static String[] field19330;

   public Class3477(Properties var1) {
      super(var1);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(HORIZONTAL_FACING);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().with(HORIZONTAL_FACING, var1.method18350().getOpposite());
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15866;
   }
}
