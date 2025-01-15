package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class3483 extends Class3480 {
   private static String[] field19339;
   private static final VoxelShape[] field19340 = new VoxelShape[]{
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   public Class3483(Properties var1) {
      super(var1);
   }

   @Override
   public IItemProvider method12183() {
      return Items.field38052;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19340[var1.<Integer>get(this.method12175())];
   }
}
