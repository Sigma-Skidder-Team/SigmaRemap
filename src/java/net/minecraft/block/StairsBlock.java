package net.minecraft.block;

import mapped.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.stream.IntStream;

public class StairsBlock extends Block implements IWaterLoggable {
   public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
   public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
   public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;
   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape AABB_SLAB_TOP = SlabBlock.TOP_SHAPE;
   public static final VoxelShape AABB_SLAB_BOTTOM = SlabBlock.BOTTOM_SHAPE;
   protected static final VoxelShape NWD_CORNER = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);
   protected static final VoxelShape SWD_CORNER = Block.makeCuboidShape(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);
   protected static final VoxelShape NWU_CORNER = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 8.0D);
   protected static final VoxelShape SWU_CORNER = Block.makeCuboidShape(0.0D, 8.0D, 8.0D, 8.0D, 16.0D, 16.0D);
   protected static final VoxelShape NED_CORNER = Block.makeCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
   protected static final VoxelShape SED_CORNER = Block.makeCuboidShape(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
   protected static final VoxelShape NEU_CORNER = Block.makeCuboidShape(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
   protected static final VoxelShape SEU_CORNER = Block.makeCuboidShape(8.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);
   protected static final VoxelShape[] SLAB_TOP_SHAPES = makeShapes(AABB_SLAB_TOP, NWD_CORNER, NED_CORNER, SWD_CORNER, SED_CORNER);
   protected static final VoxelShape[] SLAB_BOTTOM_SHAPES = makeShapes(AABB_SLAB_BOTTOM, NWU_CORNER, NEU_CORNER, SWU_CORNER, SEU_CORNER);
   private static final int[] PALETTE_SHAPE_MAP = new int[] {12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final Block modelBlock;
   private final BlockState modelState;

   private static VoxelShape[] makeShapes(VoxelShape slabShape, VoxelShape nwCorner, VoxelShape neCorner, VoxelShape swCorner, VoxelShape seCorner) {
      return IntStream.range(0, 16).mapToObj((bits) ->
              combineShapes(bits, slabShape, nwCorner, neCorner, swCorner, seCorner)).toArray(VoxelShape[]::new);
   }

   private static VoxelShape combineShapes(int bitfield, VoxelShape slabShape, VoxelShape nwCorner, VoxelShape neCorner, VoxelShape swCorner, VoxelShape seCorner) {
      VoxelShape voxelshape = slabShape;
      if ((bitfield & 1) != 0)
      {
         voxelshape = VoxelShapes.or(slabShape, nwCorner);
      }

      if ((bitfield & 2) != 0)
      {
         voxelshape = VoxelShapes.or(voxelshape, neCorner);
      }

      if ((bitfield & 4) != 0)
      {
         voxelshape = VoxelShapes.or(voxelshape, swCorner);
      }

      if ((bitfield & 8) != 0)
      {
         voxelshape = VoxelShapes.or(voxelshape, seCorner);
      }

      return voxelshape;
   }

   public StairsBlock(BlockState state, Properties properties) {
      super(properties);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(FACING, Direction.NORTH)
            .with(HALF, Half.BOTTOM)
            .with(SHAPE, StairsShape.STRAIGHT)
            .with(WATERLOGGED, Boolean.valueOf(false))
      );
      this.modelBlock = state.getBlock();
      this.modelState = state;
   }

   public boolean isTransparent(BlockState var1) {
      return true;
   }

   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
   {
      return (state.get(HALF) == Half.TOP ? SLAB_TOP_SHAPES : SLAB_BOTTOM_SHAPES)[PALETTE_SHAPE_MAP[this.getPaletteId(state)]];
   }

   private int getPaletteId(BlockState state)
   {
      return state.get(SHAPE).ordinal() * 4 + state.get(FACING).getHorizontalIndex();
   }

   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      this.modelBlock.animateTick(var1, var2, var3, var4);
   }

   public void onBlockClicked(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      this.modelState.onBlockClicked(var2, var3, var4);
   }

   public void onPlayerDestroy(IWorld var1, BlockPos var2, BlockState var3) {
      this.modelBlock.onPlayerDestroy(var1, var2, var3);
   }

   public float getExplosionResistance() {
      return this.modelBlock.getExplosionResistance();
   }

   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var1.getBlock())) {
         this.modelState.neighborChanged(var2, var3, Blocks.AIR, var3, false);
         this.modelBlock.onBlockAdded(this.modelState, var2, var3, var4, false);
      }
   }

   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         this.modelState.onReplaced(var2, var3, var4, var5);
      }
   }

   public void onEntityWalk(World var1, BlockPos var2, Entity var3) {
      this.modelBlock.onEntityWalk(var1, var2, var3);
   }

   public boolean ticksRandomly(BlockState var1) {
      return this.modelBlock.ticksRandomly(var1);
   }

   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.modelBlock.randomTick(var1, var2, var3, var4);
   }

   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.modelBlock.tick(var1, var2, var3, var4);
   }

   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      return this.modelState.onBlockActivated(var2, var4, var5, var6);
   }

   public void onExplosionDestroy(World var1, BlockPos var2, Explosion var3) {
      this.modelBlock.onExplosionDestroy(var1, var2, var3);
   }

   public BlockState getStateForPlacement(BlockItemUseContext context) {
      Direction direction = context.getFace();
      BlockPos blockpos = context.getPos();
      FluidState fluidstate = context.getWorld().getFluidState(blockpos);
      BlockState blockstate = this.getDefaultState()
         .with(FACING, context.getPlacementHorizontalFacing())
         .with(
                 HALF,
            direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D))
               ? Half.BOTTOM
               : Half.TOP
         )
         .with(WATERLOGGED, Boolean.valueOf(fluidstate.getFluid() == Fluids.WATER));
      return blockstate.with(SHAPE, getShapeProperty(blockstate, context.getWorld(), blockpos));
   }

   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.get(WATERLOGGED)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return !var2.getAxis().isHorizontal()
         ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6)
         : var1.with(SHAPE, getShapeProperty(var1, var4, var5));
   }

   public static StairsShape getShapeProperty(BlockState state, IBlockReader worldIn, BlockPos pos) {
      Direction direction = state.get(FACING);
      BlockState blockstate = worldIn.getBlockState(pos.offset(direction));

      if (isBlockStairs(blockstate) && state.get(HALF) == blockstate.get(HALF)) {
         Direction direction1 = blockstate.get(FACING);

         if (direction1.getAxis() != state.get(FACING).getAxis() && isDifferentStairs(state, worldIn, pos, direction1.getOpposite())) {
            if (direction1 == direction.rotateYCCW())
            {
               return StairsShape.OUTER_LEFT;
            }

            return StairsShape.OUTER_RIGHT;
         }
      }

      BlockState blockstate1 = worldIn.getBlockState(pos.offset(direction.getOpposite()));

      if (isBlockStairs(blockstate1) && state.get(HALF) == blockstate1.get(HALF)) {
         Direction direction2 = blockstate1.get(FACING);

         if (direction2.getAxis() != state.get(FACING).getAxis() && isDifferentStairs(state, worldIn, pos, direction2)) {
            if (direction2 == direction.rotateYCCW())
            {
               return StairsShape.INNER_LEFT;
            }

            return StairsShape.INNER_RIGHT;
         }
      }

      return StairsShape.STRAIGHT;
   }

   private static boolean isDifferentStairs(BlockState state, IBlockReader worldIn, BlockPos pos, Direction dir) {
      BlockState blockstate = worldIn.getBlockState(pos.offset(dir));
      return !isBlockStairs(blockstate)
         || blockstate.get(FACING) != state.get(FACING)
         || blockstate.get(HALF) != state.get(HALF);
   }

   public static boolean isBlockStairs(BlockState state) {
      return state.getBlock() instanceof StairsBlock;
   }

   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(FACING, var2.rotate(var1.get(FACING)));
   }

   public BlockState mirror(BlockState state, Mirror mirrorIn) {
      Direction direction = state.get(FACING);
      StairsShape stairsshape = state.get(SHAPE);
      switch (Class8332.field35835[mirrorIn.ordinal()]) {
         case 1:
            if (direction.getAxis() == Direction.Axis.Z) {
               switch (stairsshape)
               {
                  case INNER_LEFT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_RIGHT);

                  case INNER_RIGHT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_LEFT);

                  case OUTER_LEFT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_RIGHT);

                  case OUTER_RIGHT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_LEFT);

                  default:
                     return state.rotate(Rotation.CLOCKWISE_180);
               }
            }
            break;
         case 2:
            if (direction.getAxis() == Direction.Axis.X) {
               switch (stairsshape)
               {
                  case INNER_LEFT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_LEFT);

                  case INNER_RIGHT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.INNER_RIGHT);

                  case OUTER_LEFT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_RIGHT);

                  case OUTER_RIGHT:
                     return state.rotate(Rotation.CLOCKWISE_180).with(SHAPE, StairsShape.OUTER_LEFT);

                  case STRAIGHT:
                     return state.rotate(Rotation.CLOCKWISE_180);
               }
            }
      }

      return super.mirror(state, mirrorIn);
   }

   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(FACING, HALF, SHAPE, WATERLOGGED);
   }

   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(WATERLOGGED) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
