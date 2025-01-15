package net.minecraft.block;

import mapped.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;

public class SlabBlock extends Block implements IWaterLoggable {
   private static String[] field18604;
   public static final EnumProperty<SlabType> field18605 = BlockStateProperties.SLAB_TYPE;
   public static final BooleanProperty field18606 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final VoxelShape TOP_SHAPE = Block.makeCuboidShape(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public SlabBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.getDefaultState().with(field18605, SlabType.field219).with(field18606, Boolean.valueOf(false)));
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return var1.<SlabType>get(field18605) != SlabType.field220;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18605, field18606);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      SlabType var7 = var1.<SlabType>get(field18605);
      switch (Class3497.field19372[var7.ordinal()]) {
         case 1:
            return VoxelShapes.method27426();
         case 2:
            return TOP_SHAPE;
         default:
            return BOTTOM_SHAPE;
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockPos var4 = var1.getPos();
      BlockState var5 = var1.getWorld().getBlockState(var4);
      if (!var5.isIn(this)) {
         FluidState var6 = var1.getWorld().getFluidState(var4);
         BlockState var7 = this.getDefaultState()
            .with(field18605, SlabType.field219)
            .with(field18606, Boolean.valueOf(var6.getFluid() == Fluids.WATER));
         Direction var8 = var1.getFace();
         return var8 != Direction.DOWN && (var8 == Direction.UP || !(var1.getHitVec().y - (double)var4.getY() > 0.5))
            ? var7
            : var7.with(field18605, SlabType.field218);
      } else {
         return var5.with(field18605, SlabType.field220).with(field18606, Boolean.valueOf(false));
      }
   }

   @Override
   public boolean method11497(BlockState var1, BlockItemUseContext var2) {
      ItemStack var5 = var2.method18357();
      SlabType var6 = var1.<SlabType>get(field18605);
      if (var6 == SlabType.field220 || var5.getItem() != this.asItem()) {
         return false;
      } else if (!var2.method18347()) {
         return true;
      } else {
         boolean var7 = var2.getHitVec().y - (double)var2.getPos().getY() > 0.5;
         Direction var8 = var2.getFace();
         return var6 != SlabType.field219
            ? var8 == Direction.DOWN || !var7 && var8.getAxis().isHorizontal()
            : var8 == Direction.UP || var7 && var8.getAxis().isHorizontal();
      }
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18606) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public boolean method11532(IWorld var1, BlockPos var2, BlockState var3, FluidState var4) {
      return var3.get(field18605) == SlabType.field220 ? false : IWaterLoggable.super.method11532(var1, var2, var3, var4);
   }

   @Override
   public boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return var3.get(field18605) == SlabType.field220 ? false : IWaterLoggable.super.method11531(var1, var2, var3, var4);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18606)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      switch (Class3497.field19373[var4.ordinal()]) {
         case 1:
            return false;
         case 2:
            return var2.getFluidState(var3).method23486(FluidTags.field40469);
         case 3:
            return false;
         default:
            return false;
      }
   }
}
