package net.minecraft.block;

import net.minecraft.util.Mirror;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

public abstract class HorizontalBlock extends Block {
   public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;

   public HorizontalBlock(Properties var1) {
      super(var1);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(HORIZONTAL_FACING, var2.rotate(var1.get(HORIZONTAL_FACING)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.get(HORIZONTAL_FACING)));
   }
}
