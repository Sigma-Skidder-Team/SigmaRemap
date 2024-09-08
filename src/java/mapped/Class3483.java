package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Class3483 extends Class3480 {
   private static String[] field19339;
   private static final VoxelShape[] field19340 = new VoxelShape[]{
      Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   public Class3483(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class3303 method12183() {
      return Items.field38052;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19340[var1.<Integer>method23463(this.method12175())];
   }
}
