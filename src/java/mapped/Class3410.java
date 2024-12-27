package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.LightType;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3410 extends Block {
   private static String[] field19091;
   public static final IntegerProperty field19092 = BlockStateProperties.field39750;
   public static final VoxelShape[] field19093 = new VoxelShape[]{
      VoxelShapes.empty(),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public Class3410(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19092, Integer.valueOf(1)));
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      switch (Class9444.field43874[var4.ordinal()]) {
         case 1:
            return var1.<Integer>get(field19092) < 5;
         case 2:
            return false;
         case 3:
            return false;
         default:
            return false;
      }
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19093[var1.<Integer>get(field19092)];
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19093[var1.<Integer>get(field19092) - 1];
   }

   @Override
   public VoxelShape method11995(BlockState var1, IBlockReader var2, BlockPos var3) {
      return field19093[var1.<Integer>get(field19092)];
   }

   @Override
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19093[var1.<Integer>get(field19092)];
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return true;
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      if (var6.isIn(Blocks.ICE) || var6.isIn(Blocks.PACKED_ICE) || var6.isIn(Blocks.BARRIER)) {
         return false;
      } else {
         return !var6.isIn(Blocks.field37119) && !var6.isIn(Blocks.SOUL_SAND)
            ? Block.method11549(var6.method23414(var2, var3.down()), Direction.UP)
               || var6.getBlock() == this && var6.<Integer>get(field19092) == 8
            : true;
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var1.isValidPosition(var4, var5) ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6) : Blocks.AIR.getDefaultState();
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.getLightFor(LightType.BLOCK, var3) > 11) {
         method11554(var1, var2, var3);
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public boolean method11497(BlockState var1, BlockItemUseContext var2) {
      int var5 = var1.<Integer>get(field19092);
      if (var2.method18357().getItem() != this.asItem() || var5 >= 8) {
         return var5 == 1;
      } else {
         return !var2.method18347() ? true : var2.getFace() == Direction.UP;
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = var1.getWorld().getBlockState(var1.getPos());
      if (!var4.isIn(this)) {
         return super.getStateForPlacement(var1);
      } else {
         int var5 = var4.<Integer>get(field19092);
         return var4.with(field19092, Integer.valueOf(Math.min(8, var5 + 1)));
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19092);
   }
}
