package net.minecraft.block;

import mapped.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
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

public class FenceGateBlock extends HorizontalBlock {
   public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
   public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
   public static final BooleanProperty IN_WALL = BlockStateProperties.IN_WALL;
   public static final VoxelShape field18489 = Block.makeCuboidShape(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   public static final VoxelShape field18490 = Block.makeCuboidShape(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   public static final VoxelShape field18491 = Block.makeCuboidShape(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   public static final VoxelShape field18492 = Block.makeCuboidShape(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   public static final VoxelShape field18493 = Block.makeCuboidShape(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   public static final VoxelShape field18494 = Block.makeCuboidShape(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   public static final VoxelShape field18495 = VoxelShapes.or(
      Block.makeCuboidShape(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), Block.makeCuboidShape(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)
   );
   public static final VoxelShape field18496 = VoxelShapes.or(
      Block.makeCuboidShape(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), Block.makeCuboidShape(7.0, 5.0, 14.0, 9.0, 16.0, 16.0)
   );
   public static final VoxelShape field18497 = VoxelShapes.or(
      Block.makeCuboidShape(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), Block.makeCuboidShape(14.0, 2.0, 7.0, 16.0, 13.0, 9.0)
   );
   public static final VoxelShape field18498 = VoxelShapes.or(
      Block.makeCuboidShape(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), Block.makeCuboidShape(7.0, 2.0, 14.0, 9.0, 13.0, 16.0)
   );

   public FenceGateBlock(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(OPEN, Boolean.valueOf(false))
            .with(POWERED, Boolean.valueOf(false))
            .with(IN_WALL, Boolean.valueOf(false))
      );
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (!var1.<Boolean>get(IN_WALL)) {
         return var1.<Direction>get(HORIZONTAL_FACING).getAxis() != Direction.Axis.X ? field18489 : field18490;
      } else {
         return var1.<Direction>get(HORIZONTAL_FACING).getAxis() != Direction.Axis.X ? field18491 : field18492;
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      Direction.Axis var9 = var2.getAxis();
      if (var1.<Direction>get(HORIZONTAL_FACING).rotateY().getAxis() != var9) {
         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var10 = this.method11504(var3) || this.method11504(var4.getBlockState(var5.offset(var2.getOpposite())));
         return var1.with(IN_WALL, Boolean.valueOf(var10));
      }
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (!var1.<Boolean>get(OPEN)) {
         return var1.<Direction>get(HORIZONTAL_FACING).getAxis() != Direction.Axis.Z ? field18494 : field18493;
      } else {
         return VoxelShapes.empty();
      }
   }

   @Override
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      if (!var1.<Boolean>get(IN_WALL)) {
         return var1.<Direction>get(HORIZONTAL_FACING).getAxis() != Direction.Axis.X ? field18495 : field18496;
      } else {
         return var1.<Direction>get(HORIZONTAL_FACING).getAxis() != Direction.Axis.X ? field18497 : field18498;
      }
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      switch (Class9845.field45949[var4.ordinal()]) {
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

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      boolean var6 = var4.method6780(var5);
      Direction var7 = var1.getPlacementHorizontalFacing();
      Direction.Axis var8 = var7.getAxis();
      boolean var9 = var8 == Direction.Axis.Z
            && (this.method11504(var4.getBlockState(var5.west())) || this.method11504(var4.getBlockState(var5.east())))
         || var8 == Direction.Axis.X && (this.method11504(var4.getBlockState(var5.north())) || this.method11504(var4.getBlockState(var5.south())));
      return this.getDefaultState()
         .with(HORIZONTAL_FACING, var7)
         .with(OPEN, Boolean.valueOf(var6))
         .with(POWERED, Boolean.valueOf(var6))
         .with(IN_WALL, Boolean.valueOf(var9));
   }

   private boolean method11504(BlockState var1) {
      return var1.getBlock().isIn(BlockTags.field32764);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var1.<Boolean>get(OPEN)) {
         Direction var9 = var4.getHorizontalFacing();
         if (var1.<Direction>get(HORIZONTAL_FACING) == var9.getOpposite()) {
            var1 = var1.with(HORIZONTAL_FACING, var9);
         }

         var1 = var1.with(OPEN, Boolean.valueOf(true));
         var2.setBlockState(var3, var1, 10);
      } else {
         var1 = var1.with(OPEN, Boolean.valueOf(false));
         var2.setBlockState(var3, var1, 10);
      }

      var2.method6869(var4, !var1.<Boolean>get(OPEN) ? 1014 : 1008, var3, 0);
      return ActionResultType.method9002(var2.isRemote);
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         boolean var9 = var2.method6780(var3);
         if (var1.<Boolean>get(POWERED) != var9) {
            var2.setBlockState(var3, var1.with(POWERED, Boolean.valueOf(var9)).with(OPEN, Boolean.valueOf(var9)), 2);
            if (var1.<Boolean>get(OPEN) != var9) {
               var2.method6869((PlayerEntity)null, !var9 ? 1014 : 1008, var3, 0);
            }
         }
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, OPEN, POWERED, IN_WALL);
   }

   public static boolean method11507(BlockState var0, Direction var1) {
      return var0.<Direction>get(HORIZONTAL_FACING).getAxis() == var1.rotateY().getAxis();
   }
}
