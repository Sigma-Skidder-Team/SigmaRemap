package net.minecraft.block;

import mapped.*;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class DoorBlock extends Block {
   public static final DirectionProperty HORIZONTAL_FACING = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
   public static final EnumProperty<DoorHingeSide> DOOR_HINGE = BlockStateProperties.DOOR_HINGE;
   public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
   public static final EnumProperty<DoubleBlockHalf> DOUBLE_BLOCK_HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
   public static final VoxelShape field19298 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final VoxelShape field19299 = Block.makeCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19300 = Block.makeCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19301 = Block.makeCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

   public DoorBlock(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(HORIZONTAL_FACING, Direction.NORTH)
            .with(OPEN, Boolean.valueOf(false))
            .with(DOOR_HINGE, DoorHingeSide.field664)
            .with(POWERED, Boolean.valueOf(false))
            .with(DOUBLE_BLOCK_HALF, DoubleBlockHalf.field210)
      );
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Direction var7 = var1.<Direction>get(HORIZONTAL_FACING);
      boolean var8 = !var1.<Boolean>get(OPEN);
      boolean var9 = var1.<DoorHingeSide>get(DOOR_HINGE) == DoorHingeSide.field665;
      switch (Class5988.field26125[var7.ordinal()]) {
         case 1:
         default:
            return var8 ? field19301 : (var9 ? field19299 : field19298);
         case 2:
            return var8 ? field19298 : (var9 ? field19301 : field19300);
         case 3:
            return var8 ? field19300 : (var9 ? field19298 : field19299);
         case 4:
            return var8 ? field19299 : (var9 ? field19300 : field19301);
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      DoubleBlockHalf var9 = var1.<DoubleBlockHalf>get(DOUBLE_BLOCK_HALF);
      if (var2.getAxis() == Direction.Axis.Y && var9 == DoubleBlockHalf.field210 == (var2 == Direction.UP)) {
         return var3.isIn(this) && var3.get(DOUBLE_BLOCK_HALF) != var9
            ? var1.with(HORIZONTAL_FACING, var3.<Direction>get(HORIZONTAL_FACING))
               .with(OPEN, var3.<Boolean>get(OPEN))
               .with(DOOR_HINGE, var3.<DoorHingeSide>get(DOOR_HINGE))
               .with(POWERED, var3.<Boolean>get(POWERED))
            : Blocks.AIR.getDefaultState();
      } else {
         return var9 == DoubleBlockHalf.field210 && var2 == Direction.DOWN && !var1.isValidPosition(var4, var5)
            ? Blocks.AIR.getDefaultState()
            : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && var4.isCreative()) {
         LargeFernBlock.method12130(var1, var2, var3, var4);
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      switch (Class5988.field26126[var4.ordinal()]) {
         case 1:
            return var1.<Boolean>get(OPEN);
         case 2:
            return false;
         case 3:
            return var1.<Boolean>get(OPEN);
         default:
            return false;
      }
   }

   private int method12138() {
      return this.field19004 != Material.field38967 ? 1012 : 1011;
   }

   private int method12139() {
      return this.field19004 != Material.field38967 ? 1006 : 1005;
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockPos var4 = var1.getPos();
      if (var4.getY() < 255 && var1.getWorld().getBlockState(var4.up()).method23441(var1)) {
         World var5 = var1.getWorld();
         boolean var6 = var5.method6780(var4) || var5.method6780(var4.up());
         return this.getDefaultState()
            .with(HORIZONTAL_FACING, var1.getPlacementHorizontalFacing())
            .with(DOOR_HINGE, this.method12140(var1))
            .with(POWERED, Boolean.valueOf(var6))
            .with(OPEN, Boolean.valueOf(var6))
            .with(DOUBLE_BLOCK_HALF, DoubleBlockHalf.field210);
      } else {
         return null;
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      var1.setBlockState(var2.up(), var3.with(DOUBLE_BLOCK_HALF, DoubleBlockHalf.field209), 3);
   }

   private DoorHingeSide method12140(BlockItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      Direction var6 = var1.getPlacementHorizontalFacing();
      BlockPos var7 = var5.up();
      Direction var8 = var6.rotateYCCW();
      BlockPos var9 = var5.offset(var8);
      BlockState var10 = var4.getBlockState(var9);
      BlockPos var11 = var7.offset(var8);
      BlockState var12 = var4.getBlockState(var11);
      Direction var13 = var6.rotateY();
      BlockPos var14 = var5.offset(var13);
      BlockState var15 = var4.getBlockState(var14);
      BlockPos var16 = var7.offset(var13);
      BlockState var17 = var4.getBlockState(var16);
      int var18 = (!var10.method23456(var4, var9) ? 0 : -1)
         + (!var12.method23456(var4, var11) ? 0 : -1)
         + (!var15.method23456(var4, var14) ? 0 : 1)
         + (!var17.method23456(var4, var16) ? 0 : 1);
      boolean var19 = var10.isIn(this) && var10.<DoubleBlockHalf>get(DOUBLE_BLOCK_HALF) == DoubleBlockHalf.field210;
      boolean var20 = var15.isIn(this) && var15.<DoubleBlockHalf>get(DOUBLE_BLOCK_HALF) == DoubleBlockHalf.field210;
      if ((!var19 || var20) && var18 <= 0) {
         if ((!var20 || var19) && var18 >= 0) {
            int var21 = var6.getXOffset();
            int var22 = var6.getZOffset();
            Vector3d var23 = var1.getHitVec();
            double var24 = var23.x - (double)var5.getX();
            double var26 = var23.z - (double)var5.getZ();
            return var21 < 0 && var26 < 0.5 || var21 > 0 && var26 > 0.5 || var22 < 0 && var24 > 0.5 || var22 > 0 && var24 < 0.5
               ? DoorHingeSide.field665
               : DoorHingeSide.field664;
         } else {
            return DoorHingeSide.field664;
         }
      } else {
         return DoorHingeSide.field665;
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (this.field19004 != Material.field38967) {
         var1 = var1.method23459(OPEN);
         var2.setBlockState(var3, var1, 10);
         var2.method6869(var4, !var1.<Boolean>get(OPEN) ? this.method12138() : this.method12139(), var3, 0);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public boolean method12141(BlockState var1) {
      return var1.<Boolean>get(OPEN);
   }

   public void method12142(World var1, BlockState var2, BlockPos var3, boolean var4) {
      if (var2.isIn(this) && var2.<Boolean>get(OPEN) != var4) {
         var1.setBlockState(var3, var2.with(OPEN, Boolean.valueOf(var4)), 10);
         this.method12143(var1, var3, var4);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3)
         || var2.method6780(var3.offset(var1.get(DOUBLE_BLOCK_HALF) != DoubleBlockHalf.field210 ? Direction.DOWN : Direction.UP));
      if (var4 != this && var9 != var1.<Boolean>get(POWERED)) {
         if (var9 != var1.<Boolean>get(OPEN)) {
            this.method12143(var2, var3, var9);
         }

         var2.setBlockState(var3, var1.with(POWERED, Boolean.valueOf(var9)).with(OPEN, Boolean.valueOf(var9)), 2);
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      BlockState var7 = var2.getBlockState(var6);
      return var1.get(DOUBLE_BLOCK_HALF) != DoubleBlockHalf.field210 ? var7.isIn(this) : var7.method23454(var2, var6, Direction.UP);
   }

   private void method12143(World var1, BlockPos var2, boolean var3) {
      var1.method6869((PlayerEntity)null, !var3 ? this.method12138() : this.method12139(), var2, 0);
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15863;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(HORIZONTAL_FACING, var2.rotate(var1.<Direction>get(HORIZONTAL_FACING)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var2 != Mirror.field13614 ? var1.rotate(var2.toRotation(var1.<Direction>get(HORIZONTAL_FACING))).method23459(DOOR_HINGE) : var1;
   }

   @Override
   public long method11691(BlockState var1, BlockPos var2) {
      return MathHelper.method37810(var2.getX(), var2.method8340(var1.get(DOUBLE_BLOCK_HALF) != DoubleBlockHalf.field210 ? 1 : 0).getY(), var2.getZ());
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(DOUBLE_BLOCK_HALF, HORIZONTAL_FACING, OPEN, DOOR_HINGE, POWERED);
   }

   public static boolean method12144(World var0, BlockPos var1) {
      return method12145(var0.getBlockState(var1));
   }

   public static boolean method12145(BlockState var0) {
      return var0.getBlock() instanceof DoorBlock && (var0.getMaterial() == Material.field38956 || var0.getMaterial() == Material.field38957);
   }
}
