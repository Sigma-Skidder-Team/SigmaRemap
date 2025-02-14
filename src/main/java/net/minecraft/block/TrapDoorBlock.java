package net.minecraft.block;

import mapped.Class8826;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class TrapDoorBlock extends HorizontalBlock implements IWaterLoggable {
   private static String[] field18593;
   public static final BooleanProperty field18594 = BlockStateProperties.OPEN;
   public static final EnumProperty<Half> field18595 = BlockStateProperties.HALF;
   public static final BooleanProperty field18596 = BlockStateProperties.POWERED;
   public static final BooleanProperty field18597 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field18598 = Block.makeCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   public static final VoxelShape field18599 = Block.makeCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field18600 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final VoxelShape field18601 = Block.makeCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field18602 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   public static final VoxelShape field18603 = Block.makeCuboidShape(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

   public TrapDoorBlock(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(HORIZONTAL_FACING, Direction.NORTH)
            .with(field18594, Boolean.valueOf(false))
            .with(field18595, Half.BOTTOM)
            .with(field18596, Boolean.valueOf(false))
            .with(field18597, Boolean.valueOf(false))
      );
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (!var1.<Boolean>get(field18594)) {
         return var1.get(field18595) == Half.TOP ? field18603 : field18602;
      } else {
         switch (Class8826.field39790[var1.<Direction>get(HORIZONTAL_FACING).ordinal()]) {
            case 1:
            default:
               return field18601;
            case 2:
               return field18600;
            case 3:
               return field18599;
            case 4:
               return field18598;
         }
      }
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      switch (Class8826.field39791[var4.ordinal()]) {
         case 1:
            return var1.<Boolean>get(field18594);
         case 2:
            return var1.<Boolean>get(field18597);
         case 3:
            return var1.<Boolean>get(field18594);
         default:
            return false;
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (this.field19004 != Material.field38967) {
         var1 = var1.method23459(field18594);
         var2.setBlockState(var3, var1, 2);
         if (var1.<Boolean>get(field18597)) {
            var2.getPendingFluidTicks().scheduleTick(var3, Fluids.WATER, Fluids.WATER.getTickRate(var2));
         }

         this.method11530(var4, var2, var3, var1.<Boolean>get(field18594));
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public void method11530(PlayerEntity var1, World var2, BlockPos var3, boolean var4) {
      if (!var4) {
         int var7 = this.field19004 != Material.field38967 ? 1013 : 1036;
         var2.method6869(var1, var7, var3, 0);
      } else {
         int var8 = this.field19004 != Material.field38967 ? 1007 : 1037;
         var2.method6869(var1, var8, var3, 0);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         boolean var9 = var2.method6780(var3);
         if (var9 != var1.<Boolean>get(field18596)) {
            if (var1.<Boolean>get(field18594) != var9) {
               var1 = var1.with(field18594, Boolean.valueOf(var9));
               this.method11530((PlayerEntity)null, var2, var3, var9);
            }

            var2.setBlockState(var3, var1.with(field18596, Boolean.valueOf(var9)), 2);
            if (var1.<Boolean>get(field18597)) {
               var2.getPendingFluidTicks().scheduleTick(var3, Fluids.WATER, Fluids.WATER.getTickRate(var2));
            }
         }
      }
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = this.getDefaultState();
      FluidState var5 = var1.getWorld().getFluidState(var1.getPos());
      Direction var6 = var1.getFace();
      if (!var1.method18347() && var6.getAxis().isHorizontal()) {
         var4 = var4.with(HORIZONTAL_FACING, var6)
            .with(field18595, !(var1.getHitVec().y - (double)var1.getPos().getY() > 0.5) ? Half.BOTTOM : Half.TOP);
      } else {
         var4 = var4.with(HORIZONTAL_FACING, var1.getPlacementHorizontalFacing().getOpposite())
            .with(field18595, var6 != Direction.UP ? Half.TOP : Half.BOTTOM);
      }

      if (var1.getWorld().method6780(var1.getPos())) {
         var4 = var4.with(field18594, Boolean.valueOf(true)).with(field18596, Boolean.valueOf(true));
      }

      return var4.with(field18597, Boolean.valueOf(var5.getFluid() == Fluids.WATER));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, field18594, field18595, field18596, field18597);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18597) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18597)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }
}
