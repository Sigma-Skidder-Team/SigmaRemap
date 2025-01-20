package net.minecraft.block;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Random;

public class WeepingVinesBlock extends Class3452 {
   private static String[] field19271;
   public static final VoxelShape field19272 = Block.makeCuboidShape(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   public WeepingVinesBlock(Properties var1) {
      super(var1, Direction.DOWN, field19272, false, 0.1);
   }

   @Override
   public int method12128(Random var1) {
      return Class8633.method31015(var1);
   }

   @Override
   public Block method12125() {
      return Blocks.WEEPING_VINES_PLANT;
   }

   @Override
   public boolean method12127(BlockState var1) {
      return Class8633.method31014(var1);
   }
}
