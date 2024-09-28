package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class3453 extends Class3452 {
   private static String[] field19269;
   public static final VoxelShape field19270 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   public Class3453(Properties var1) {
      super(var1, Direction.UP, field19270, false, 0.1);
   }

   @Override
   public int method12128(Random var1) {
      return Class8633.method31015(var1);
   }

   @Override
   public Block method12125() {
      return Blocks.field37089;
   }

   @Override
   public boolean method12127(BlockState var1) {
      return Class8633.method31014(var1);
   }
}
