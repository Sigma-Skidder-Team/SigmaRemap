package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public abstract class Class3452 extends Class3444 implements IGrowable {
   public static final IntegerProperty field19267 = BlockStateProperties.field39744;
   private final double field19268;

   public Class3452(Properties var1, Direction var2, VoxelShape var3, boolean var4, double var5) {
      super(var1, var2, var3, var4);
      this.field19268 = var5;
      this.setDefaultState(this.stateContainer.getBaseState().with(field19267, Integer.valueOf(0)));
   }

   @Override
   public BlockState method12122(IWorld var1) {
      return this.getDefaultState().with(field19267, Integer.valueOf(var1.method6814().nextInt(25)));
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Integer>get(field19267) < 25;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>get(field19267) < 25 && var4.nextDouble() < this.field19268) {
         BlockPos var7 = var3.offset(this.field19256);
         if (this.method12127(var2.getBlockState(var7))) {
            var2.setBlockState(var7, var1.method23459(field19267));
         }
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2 == this.field19256.getOpposite() && !var1.isValidPosition(var4, var5)) {
         var4.method6860().scheduleTick(var5, this, 1);
      }

      if (var2 != this.field19256 || !var3.isIn(this) && !var3.isIn(this.method12125())) {
         if (this.field19257) {
            var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
         }

         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         return this.method12125().getDefaultState();
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19267);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return this.method12127(var1.getBlockState(var2.offset(this.field19256)));
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockPos var7 = var3.offset(this.field19256);
      int var8 = Math.min(var4.<Integer>get(field19267) + 1, 25);
      int var9 = this.method12128(var2);

      for (int var10 = 0; var10 < var9 && this.method12127(var1.getBlockState(var7)); var10++) {
         var1.setBlockState(var7, var4.with(field19267, Integer.valueOf(var8)));
         var7 = var7.offset(this.field19256);
         var8 = Math.min(var8 + 1, 25);
      }
   }

   public abstract int method12128(Random var1);

   public abstract boolean method12127(BlockState var1);

   @Override
   public Class3452 method12124() {
      return this;
   }
}
