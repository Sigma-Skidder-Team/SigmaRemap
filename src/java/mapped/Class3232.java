package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public abstract class Class3232 extends Class3231 {
   public Class3232(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.empty();
   }

   @Override
   public float method11636(BlockState var1, IBlockReader var2, BlockPos var3) {
      return 1.0F;
   }

   @Override
   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return true;
   }
}
