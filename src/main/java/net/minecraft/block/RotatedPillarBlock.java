package net.minecraft.block;

import mapped.Class9779;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

public class RotatedPillarBlock extends Block {
   private static String[] field18993;
   public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

   public RotatedPillarBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      switch (Class9779.field45746[var2.ordinal()]) {
         case 1:
         case 2:
            switch (Class9779.field45745[var1.<Direction.Axis>get(AXIS).ordinal()]) {
               case 1:
                  return var1.with(AXIS, Direction.Axis.Z);
               case 2:
                  return var1.with(AXIS, Direction.Axis.X);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(AXIS);
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(AXIS, var1.getFace().getAxis());
   }
}
