package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3489 extends BushBlock {
   private static String[] field18470;
   public static final IntegerProperty field19354 = BlockStateProperties.AGE3;
   private static final VoxelShape[] field19355 = new VoxelShape[]{
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   public Class3489(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19354, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19355[var1.<Integer>get(field19354)];
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.isIn(Blocks.SOUL_SAND);
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Integer>get(field19354) < 3;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>get(field19354);
      if (var7 < 3 && var4.nextInt(10) == 0) {
         var1 = var1.with(field19354, Integer.valueOf(var7 + 1));
         var2.setBlockState(var3, var1, 2);
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Items.field37970);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19354);
   }
}
