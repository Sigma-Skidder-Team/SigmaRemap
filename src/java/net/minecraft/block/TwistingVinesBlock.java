package net.minecraft.block;

import net.minecraft.util.Direction;

import java.util.Random;

public class TwistingVinesBlock extends Class3452 {
   private static String[] field19269;
   public static final VoxelShape field19270 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   public TwistingVinesBlock(Properties var1) {
      super(var1, Direction.UP, field19270, false, 0.1);
   }

   @Override
   public int method12128(Random var1) {
      return Class8633.method31015(var1);
   }

   @Override
   public Block method12125() {
      return Blocks.TWISTING_VINES_PLANT;
   }

   @Override
   public boolean method12127(BlockState var1) {
      return Class8633.method31014(var1);
   }
}
