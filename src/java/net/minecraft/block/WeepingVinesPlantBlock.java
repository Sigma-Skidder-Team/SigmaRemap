package net.minecraft.block;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

public class WeepingVinesPlantBlock extends Class3445 {
   private static String[] field19259;
   public static final VoxelShape field19260 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public WeepingVinesPlantBlock(Properties var1) {
      super(var1, Direction.DOWN, field19260, false);
   }

   @Override
   public Class3452 method12124() {
      return (Class3452) Blocks.WEEPING_VINES;
   }
}