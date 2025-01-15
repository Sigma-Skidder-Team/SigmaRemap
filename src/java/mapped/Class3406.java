package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3406 extends Block implements Class3405 {
   private static String[] field19083;
   public static final BooleanProperty field19084 = BlockStateProperties.DRAG;

   public Class3406(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19084, Boolean.valueOf(true)));
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      BlockState var7 = var2.getBlockState(var3.up());
      if (!var7.isAir()) {
         var4.onEnterBubbleColumnWithAirAbove(var1.<Boolean>get(field19084));
      } else {
         var4.method3354(var1.<Boolean>get(field19084));
         if (!var2.isRemote) {
            ServerWorld var8 = (ServerWorld)var2;

            for (int var9 = 0; var9 < 2; var9++) {
               var8.spawnParticle(
                  ParticleTypes.field34099,
                  (double)var3.getX() + var2.rand.nextDouble(),
                  (double)(var3.getY() + 1),
                  (double)var3.getZ() + var2.rand.nextDouble(),
                  1,
                  0.0,
                  0.0,
                  0.0,
                  1.0
               );
               var8.spawnParticle(
                  ParticleTypes.field34052,
                  (double)var3.getX() + var2.rand.nextDouble(),
                  (double)(var3.getY() + 1),
                  (double)var3.getZ() + var2.rand.nextDouble(),
                  1,
                  0.0,
                  0.01,
                  0.0,
                  0.2
               );
            }
         }
      }
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      method12045(var2, var3.up(), method12047(var2, var3.down()));
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      method12045(var2, var3.up(), method12047(var2, var3));
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return Fluids.WATER.getStillFluidState(false);
   }

   public static void method12045(IWorld var0, BlockPos var1, boolean var2) {
      if (method12046(var0, var1)) {
         var0.setBlockState(var1, Blocks.field37013.getDefaultState().with(field19084, Boolean.valueOf(var2)), 2);
      }
   }

   public static boolean method12046(IWorld var0, BlockPos var1) {
      FluidState var4 = var0.getFluidState(var1);
      return var0.getBlockState(var1).isIn(Blocks.WATER) && var4.method23477() >= 8 && var4.isSource();
   }

   private static boolean method12047(IBlockReader var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      return !var4.isIn(Blocks.field37013) ? !var4.isIn(Blocks.SOUL_SAND) : var4.<Boolean>get(field19084);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX();
      double var9 = (double)var3.getY();
      double var11 = (double)var3.getZ();
      if (!var1.<Boolean>get(field19084)) {
         var2.method6748(ParticleTypes.field34103, var7 + 0.5, var9, var11 + 0.5, 0.0, 0.04, 0.0);
         var2.method6748(
            ParticleTypes.field34103, var7 + (double)var4.nextFloat(), var9 + (double)var4.nextFloat(), var11 + (double)var4.nextFloat(), 0.0, 0.04, 0.0
         );
         if (var4.nextInt(200) == 0) {
            var2.method6745(
               var7, var9, var11, SoundEvents.field26422, SoundCategory.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }
      } else {
         var2.method6748(ParticleTypes.field34102, var7 + 0.5, var9 + 0.8, var11, 0.0, 0.0, 0.0);
         if (var4.nextInt(200) == 0) {
            var2.method6745(
               var7, var9, var11, SoundEvents.field26424, SoundCategory.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.isValidPosition(var4, var5)) {
         if (var2 != Direction.DOWN) {
            if (var2 == Direction.UP && !var3.isIn(Blocks.field37013) && method12046(var4, var6)) {
               var4.getBlockTickScheduler().scheduleTick(var5, this, 5);
            }
         } else {
            var4.setBlockState(var5, Blocks.field37013.getDefaultState().with(field19084, Boolean.valueOf(method12047(var4, var6))), 2);
         }

         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.WATER.getDefaultState();
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      return var6.isIn(Blocks.field37013) || var6.isIn(Blocks.field36890) || var6.isIn(Blocks.SOUL_SAND);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.empty();
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19084);
   }

   @Override
   public Fluid method11533(IWorld var1, BlockPos var2, BlockState var3) {
      var1.setBlockState(var2, Blocks.AIR.getDefaultState(), 11);
      return Fluids.WATER;
   }
}
