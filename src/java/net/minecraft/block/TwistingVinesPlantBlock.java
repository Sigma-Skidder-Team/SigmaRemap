package net.minecraft.block;

import net.minecraft.util.Direction;

public class TwistingVinesPlantBlock extends Class3445 {
   private static String[] field19261;
   public static final VoxelShape field19262 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public TwistingVinesPlantBlock(Properties var1) {
      super(var1, Direction.UP, field19262, false);
   }

   @Override
   public Class3452 method12124() {
      return (Class3452) Blocks.TWISTING_VINES;
   }
}
