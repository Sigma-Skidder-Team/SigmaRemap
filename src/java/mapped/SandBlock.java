package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class SandBlock extends FallingBlock {
   private final int color; // Searge: field_196445_a

   public SandBlock(int color, Properties properties) {
      super(properties);
      this.color = color;
   }

   @Override
   public int getColor(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.color;
   }
}
