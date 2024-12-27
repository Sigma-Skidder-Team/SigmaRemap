package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3218 extends Class3213 {
   public static final DirectionProperty field18627 = HorizontalBlock.HORIZONTAL_FACING;
   private static final VoxelShape field18628 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final VoxelShape field18629 = Block.makeCuboidShape(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final VoxelShape field18630 = Block.makeCuboidShape(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final VoxelShape field18631 = Block.makeCuboidShape(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final VoxelShape field18632 = Block.makeCuboidShape(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final VoxelShape field18633 = Block.makeCuboidShape(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final VoxelShape field18634 = Block.makeCuboidShape(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final VoxelShape field18635 = VoxelShapes.method27432(field18628, field18629, field18630, field18631);
   private static final VoxelShape field18636 = VoxelShapes.method27432(field18628, field18632, field18633, field18634);
   private static final ITextComponent field18637 = new TranslationTextComponent("container.repair");

   public Class3218(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18627, Direction.NORTH));
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18627, var1.getPlacementHorizontalFacing().rotateY());
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Stats.field40175);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5824(var2x, var3x, IWorldPosCallable.method31714(var2, var3)), field18637);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Direction var7 = var1.<Direction>get(field18627);
      return var7.getAxis() != Direction.Axis.X ? field18636 : field18635;
   }

   @Override
   public void method11596(Class907 var1) {
      var1.method3555(true);
   }

   @Override
   public void method11599(World var1, BlockPos var2, BlockState var3, BlockState var4, Class907 var5) {
      if (!var5.isSilent()) {
         var1.playEvent(1031, var2, 0);
      }
   }

   @Override
   public void method11600(World var1, BlockPos var2, Class907 var3) {
      if (!var3.isSilent()) {
         var1.playEvent(1029, var2, 0);
      }
   }

   @Nullable
   public static BlockState method11607(BlockState var0) {
      if (!var0.isIn(Blocks.ANVIL)) {
         return !var0.isIn(Blocks.CHIPPED_ANVIL)
            ? null
            : Blocks.DAMAGED_ANVIL.getDefaultState().with(field18627, var0.<Direction>get(field18627));
      } else {
         return Blocks.CHIPPED_ANVIL.getDefaultState().with(field18627, var0.<Direction>get(field18627));
      }
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18627, var2.rotate(var1.<Direction>get(field18627)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18627);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   @Override
   public int method11601(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23394(var2, var3).field31006;
   }
}
