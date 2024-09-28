package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;

public class Class3391 extends Block {
   private static String[] field19015;
   private static final VoxelShape field19016 = Block.makeCuboidShape(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public Class3391(Properties var1) {
      super(var1);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19016;
   }

   @Override
   public float method11636(BlockState var1, IBlockReader var2, BlockPos var3) {
      return 1.0F;
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15863;
   }
}
