package net.minecraft.block;

import mapped.Class166;
import mapped.Class9659;
import mapped.Class9803;
import mapped.VoxelShapes;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import com.google.common.base.Predicates;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3400 extends Block {
   public static final DirectionProperty field19053 = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty field19054 = BlockStateProperties.EYE;
   public static final VoxelShape field19055 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   public static final VoxelShape field19056 = Block.makeCuboidShape(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   public static final VoxelShape field19057 = VoxelShapes.or(field19055, field19056);
   private static Class9803 field19058;

   public Class3400(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19053, Direction.NORTH).with(field19054, Boolean.valueOf(false)));
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return true;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return !var1.<Boolean>get(field19054) ? field19055 : field19057;
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field19053, var1.getPlacementHorizontalFacing().getOpposite()).with(field19054, Boolean.valueOf(false));
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return !var1.<Boolean>get(field19054) ? 0 : 15;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19053, var2.rotate(var1.<Direction>get(field19053)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19053)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19053, field19054);
   }

   public static Class9803 method12029() {
      if (field19058 == null) {
         field19058 = Class9659.method37706()
            .method37705("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .method37707('?', CachedBlockInfo.method37552(Class166.field534))
            .method37707(
               '^',
               CachedBlockInfo.method37552(
                  Class166.method497(Blocks.END_PORTAL_FRAME)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.SOUTH))
               )
            )
            .method37707(
               '>',
               CachedBlockInfo.method37552(
                  Class166.method497(Blocks.END_PORTAL_FRAME)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.WEST))
               )
            )
            .method37707(
               'v',
               CachedBlockInfo.method37552(
                  Class166.method497(Blocks.END_PORTAL_FRAME)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.NORTH))
               )
            )
            .method37707(
               '<',
               CachedBlockInfo.method37552(
                  Class166.method497(Blocks.END_PORTAL_FRAME)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.EAST))
               )
            )
            .method37708();
      }

      return field19058;
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
