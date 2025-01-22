package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3393 extends Class3392 {
   private static String[] field19027;

   public Class3393(Properties var1) {
      super(0.3125F, var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19019, Boolean.valueOf(false))
            .with(field19020, Boolean.valueOf(false))
            .with(field19021, Boolean.valueOf(false))
            .with(field19022, Boolean.valueOf(false))
            .with(field19023, Boolean.valueOf(false))
            .with(field19024, Boolean.valueOf(false))
      );
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.method12004(var1.getWorld(), var1.getPos());
   }

   public BlockState method12004(IBlockReader var1, BlockPos var2) {
      Block var5 = var1.getBlockState(var2.down()).getBlock();
      Block var6 = var1.getBlockState(var2.up()).getBlock();
      Block var7 = var1.getBlockState(var2.north()).getBlock();
      Block var8 = var1.getBlockState(var2.east()).getBlock();
      Block var9 = var1.getBlockState(var2.south()).getBlock();
      Block var10 = var1.getBlockState(var2.west()).getBlock();
      return this.getDefaultState()
         .with(field19024, Boolean.valueOf(var5 == this || var5 == Blocks.field36879 || var5 == Blocks.END_STONE))
         .with(field19023, Boolean.valueOf(var6 == this || var6 == Blocks.field36879))
         .with(field19019, Boolean.valueOf(var7 == this || var7 == Blocks.field36879))
         .with(field19020, Boolean.valueOf(var8 == this || var8 == Blocks.field36879))
         .with(field19021, Boolean.valueOf(var9 == this || var9 == Blocks.field36879))
         .with(field19022, Boolean.valueOf(var10 == this || var10 == Blocks.field36879));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (!var1.isValidPosition(var4, var5)) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var9 = var3.getBlock() == this
            || var3.isIn(Blocks.field36879)
            || var2 == Direction.DOWN && var3.isIn(Blocks.END_STONE);
         return var1.with(field19025.get(var2), Boolean.valueOf(var9));
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.isValidPosition(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      boolean var7 = !var2.getBlockState(var3.up()).isAir() && !var6.isAir();

      for (Direction var9 : Direction.Plane.HORIZONTAL) {
         BlockPos var10 = var3.offset(var9);
         Block var11 = var2.getBlockState(var10).getBlock();
         if (var11 == this) {
            if (var7) {
               return false;
            }

            Block var12 = var2.getBlockState(var10.down()).getBlock();
            if (var12 == this || var12 == Blocks.END_STONE) {
               return true;
            }
         }
      }

      Block var13 = var6.getBlock();
      return var13 == this || var13 == Blocks.END_STONE;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19019, field19020, field19021, field19022, field19023, field19024);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
