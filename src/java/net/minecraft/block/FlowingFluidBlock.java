package net.minecraft.block;

import com.google.common.collect.Lists;
import mapped.*;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FlowingFluidBlock extends Block implements Class3405 {
   private static String[] field19078;
   public static final IntegerProperty field19079 = BlockStateProperties.LEVEL;
   public final FlowingFluid field19080;
   private final List<FluidState> field19081;
   public static final VoxelShape field19082 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

   public FlowingFluidBlock(FlowingFluid var1, Properties var2) {
      super(var2);
      this.field19080 = var1;
      this.field19081 = Lists.newArrayList();
      this.field19081.add(var1.getStillFluidState(false));

      for (int var5 = 1; var5 < 8; var5++) {
         this.field19081.add(var1.method25076(8 - var5, false));
      }

      this.field19081.add(var1.method25076(8, true));
      this.setDefaultState(this.stateContainer.getBaseState().with(field19079, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return var4.method14950(field19082, var3, true)
            && var1.<Integer>get(field19079) == 0
            && var4.method14952(var2.getFluidState(var3.up()), this.field19080)
         ? field19082
         : VoxelShapes.empty();
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.getFluidState().method23481();
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      var1.getFluidState().method23482(var2, var3, var4);
   }

   @Override
   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return false;
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return !this.field19080.method25067(FluidTags.field40470);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      int var4 = var1.<Integer>get(field19079);
      return this.field19081.get(Math.min(var4, 8));
   }

   @Override
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      return var2.getFluidState().getFluid().method25066(this.field19080);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      return Collections.<ItemStack>emptyList();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.empty();
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (this.method12043(var2, var3, var1)) {
         var2.getPendingFluidTicks().scheduleTick(var3, var1.getFluidState().getFluid(), this.field19080.getTickRate(var2));
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.getFluidState().isSource() || var3.getFluidState().isSource()) {
         var4.getPendingFluidTicks().scheduleTick(var5, var1.getFluidState().getFluid(), this.field19080.getTickRate(var4));
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (this.method12043(var2, var3, var1)) {
         var2.getPendingFluidTicks().scheduleTick(var3, var1.getFluidState().getFluid(), this.field19080.getTickRate(var2));
      }
   }

   private boolean method12043(World var1, BlockPos var2, BlockState var3) {
      if (this.field19080.method25067(FluidTags.field40470)) {
         boolean var6 = var1.getBlockState(var2.down()).isIn(Blocks.SOUL_SOIL);

         for (Direction var10 : Direction.values()) {
            if (var10 != Direction.DOWN) {
               BlockPos var11 = var2.offset(var10);
               if (var1.getFluidState(var11).method23486(FluidTags.WATER)) {
                  Block var12 = !var1.getFluidState(var2).isSource() ? Blocks.COBBLESTONE : Blocks.field36527;
                  var1.setBlockState(var2, var12.getDefaultState());
                  this.method12044(var1, var2);
                  return false;
               }

               if (var6 && var1.getBlockState(var11).isIn(Blocks.field37006)) {
                  var1.setBlockState(var2, Blocks.BASALT.getDefaultState());
                  this.method12044(var1, var2);
                  return false;
               }
            }
         }
      }

      return true;
   }

   private void method12044(IWorld var1, BlockPos var2) {
      var1.playEvent(1501, var2, 0);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19079);
   }

   @Override
   public Fluid method11533(IWorld var1, BlockPos var2, BlockState var3) {
      if (var3.<Integer>get(field19079) != 0) {
         return Fluids.EMPTY;
      } else {
         var1.setBlockState(var2, Blocks.AIR.getDefaultState(), 11);
         return this.field19080;
      }
   }
}
