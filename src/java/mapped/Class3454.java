package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Random;

public class Class3454 extends Class3452 {
   private static String[] field19271;
   public static final VoxelShape field19272 = Block.makeCuboidShape(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   public Class3454(Properties var1) {
      super(var1, Direction.DOWN, field19272, false, 0.1);
   }

   @Override
   public int method12128(Random var1) {
      return Class8633.method31015(var1);
   }

   @Override
   public Block method12125() {
      return Blocks.field37087;
   }

   @Override
   public boolean method12127(BlockState var1) {
      return Class8633.method31014(var1);
   }
}
