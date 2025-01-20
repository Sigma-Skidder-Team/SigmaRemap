package net.minecraft.block;

import mapped.Class2137;
import mapped.Class3251;
import mapped.VoxelShapes;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class SkullBlock extends Class3251 {
   private static String[] field18854;
   public static final IntegerProperty field18855 = BlockStateProperties.ROTATION;
   public static final VoxelShape field18856 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public SkullBlock(Class2137 var1, Properties var2) {
      super(var1, var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18855, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18856;
   }

   @Override
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.empty();
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18855, Integer.valueOf(MathHelper.floor((double)(var1.method18352() * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18855, Integer.valueOf(var2.rotate(var1.<Integer>get(field18855), 16)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.with(field18855, Integer.valueOf(var2.method8748(var1.<Integer>get(field18855), 16)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18855);
   }
}
