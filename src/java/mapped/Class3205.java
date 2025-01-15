package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class Class3205 extends Class3200 {
   public static final VoxelShape field18528 = Block.makeCuboidShape(2.0, 0.0, 6.0, 4.0, 7.0, 10.0);
   public static final VoxelShape field18529 = Block.makeCuboidShape(12.0, 0.0, 6.0, 14.0, 7.0, 10.0);
   public static final VoxelShape field18530 = Block.makeCuboidShape(2.0, 7.0, 5.0, 4.0, 13.0, 11.0);
   public static final VoxelShape field18531 = Block.makeCuboidShape(12.0, 7.0, 5.0, 14.0, 13.0, 11.0);
   public static final VoxelShape field18532 = VoxelShapes.or(field18528, field18530);
   public static final VoxelShape field18533 = VoxelShapes.or(field18529, field18531);
   public static final VoxelShape field18534 = VoxelShapes.or(field18532, field18533);
   public static final VoxelShape field18535 = VoxelShapes.or(field18534, Block.makeCuboidShape(4.0, 4.0, 2.0, 12.0, 16.0, 14.0));
   public static final VoxelShape field18536 = Block.makeCuboidShape(6.0, 0.0, 2.0, 10.0, 7.0, 4.0);
   public static final VoxelShape field18537 = Block.makeCuboidShape(6.0, 0.0, 12.0, 10.0, 7.0, 14.0);
   public static final VoxelShape field18538 = Block.makeCuboidShape(5.0, 7.0, 2.0, 11.0, 13.0, 4.0);
   public static final VoxelShape field18539 = Block.makeCuboidShape(5.0, 7.0, 12.0, 11.0, 13.0, 14.0);
   public static final VoxelShape field18540 = VoxelShapes.or(field18536, field18538);
   public static final VoxelShape field18541 = VoxelShapes.or(field18537, field18539);
   public static final VoxelShape field18542 = VoxelShapes.or(field18540, field18541);
   public static final VoxelShape field18543 = VoxelShapes.or(field18542, Block.makeCuboidShape(2.0, 4.0, 4.0, 14.0, 16.0, 12.0));
   public static final VoxelShape field18544 = Block.makeCuboidShape(2.0, 6.0, 0.0, 4.0, 10.0, 7.0);
   public static final VoxelShape field18545 = Block.makeCuboidShape(12.0, 6.0, 0.0, 14.0, 10.0, 7.0);
   public static final VoxelShape field18546 = Block.makeCuboidShape(2.0, 5.0, 7.0, 4.0, 11.0, 13.0);
   public static final VoxelShape field18547 = Block.makeCuboidShape(12.0, 5.0, 7.0, 14.0, 11.0, 13.0);
   public static final VoxelShape field18548 = VoxelShapes.or(field18544, field18546);
   public static final VoxelShape field18549 = VoxelShapes.or(field18545, field18547);
   public static final VoxelShape field18550 = VoxelShapes.or(field18548, field18549);
   public static final VoxelShape field18551 = VoxelShapes.or(field18550, Block.makeCuboidShape(4.0, 2.0, 4.0, 12.0, 14.0, 16.0));
   public static final VoxelShape field18552 = Block.makeCuboidShape(2.0, 6.0, 7.0, 4.0, 10.0, 16.0);
   public static final VoxelShape field18553 = Block.makeCuboidShape(12.0, 6.0, 7.0, 14.0, 10.0, 16.0);
   public static final VoxelShape field18554 = Block.makeCuboidShape(2.0, 5.0, 3.0, 4.0, 11.0, 9.0);
   public static final VoxelShape field18555 = Block.makeCuboidShape(12.0, 5.0, 3.0, 14.0, 11.0, 9.0);
   public static final VoxelShape field18556 = VoxelShapes.or(field18552, field18554);
   public static final VoxelShape field18557 = VoxelShapes.or(field18553, field18555);
   public static final VoxelShape field18558 = VoxelShapes.or(field18556, field18557);
   public static final VoxelShape field18559 = VoxelShapes.or(field18558, Block.makeCuboidShape(4.0, 2.0, 0.0, 12.0, 14.0, 12.0));
   public static final VoxelShape field18560 = Block.makeCuboidShape(7.0, 6.0, 2.0, 16.0, 10.0, 4.0);
   public static final VoxelShape field18561 = Block.makeCuboidShape(7.0, 6.0, 12.0, 16.0, 10.0, 14.0);
   public static final VoxelShape field18562 = Block.makeCuboidShape(3.0, 5.0, 2.0, 9.0, 11.0, 4.0);
   public static final VoxelShape field18563 = Block.makeCuboidShape(3.0, 5.0, 12.0, 9.0, 11.0, 14.0);
   public static final VoxelShape field18564 = VoxelShapes.or(field18560, field18562);
   public static final VoxelShape field18565 = VoxelShapes.or(field18561, field18563);
   public static final VoxelShape field18566 = VoxelShapes.or(field18564, field18565);
   public static final VoxelShape field18567 = VoxelShapes.or(field18566, Block.makeCuboidShape(0.0, 2.0, 4.0, 12.0, 14.0, 12.0));
   public static final VoxelShape field18568 = Block.makeCuboidShape(0.0, 6.0, 2.0, 9.0, 10.0, 4.0);
   public static final VoxelShape field18569 = Block.makeCuboidShape(0.0, 6.0, 12.0, 9.0, 10.0, 14.0);
   public static final VoxelShape field18570 = Block.makeCuboidShape(7.0, 5.0, 2.0, 13.0, 11.0, 4.0);
   public static final VoxelShape field18571 = Block.makeCuboidShape(7.0, 5.0, 12.0, 13.0, 11.0, 14.0);
   public static final VoxelShape field18572 = VoxelShapes.or(field18568, field18570);
   public static final VoxelShape field18573 = VoxelShapes.or(field18569, field18571);
   public static final VoxelShape field18574 = VoxelShapes.or(field18572, field18573);
   public static final VoxelShape field18575 = VoxelShapes.or(field18574, Block.makeCuboidShape(4.0, 2.0, 4.0, 16.0, 14.0, 12.0));
   public static final VoxelShape field18576 = Block.makeCuboidShape(2.0, 9.0, 6.0, 4.0, 16.0, 10.0);
   public static final VoxelShape field18577 = Block.makeCuboidShape(12.0, 9.0, 6.0, 14.0, 16.0, 10.0);
   public static final VoxelShape field18578 = Block.makeCuboidShape(2.0, 3.0, 5.0, 4.0, 9.0, 11.0);
   public static final VoxelShape field18579 = Block.makeCuboidShape(12.0, 3.0, 5.0, 14.0, 9.0, 11.0);
   public static final VoxelShape field18580 = VoxelShapes.or(field18576, field18578);
   public static final VoxelShape field18581 = VoxelShapes.or(field18577, field18579);
   public static final VoxelShape field18582 = VoxelShapes.or(field18580, field18581);
   public static final VoxelShape field18583 = VoxelShapes.or(field18582, Block.makeCuboidShape(4.0, 0.0, 2.0, 12.0, 12.0, 14.0));
   public static final VoxelShape field18584 = Block.makeCuboidShape(6.0, 9.0, 2.0, 10.0, 16.0, 4.0);
   public static final VoxelShape field18585 = Block.makeCuboidShape(6.0, 9.0, 12.0, 10.0, 16.0, 14.0);
   public static final VoxelShape field18586 = Block.makeCuboidShape(5.0, 3.0, 2.0, 11.0, 9.0, 4.0);
   public static final VoxelShape field18587 = Block.makeCuboidShape(5.0, 3.0, 12.0, 11.0, 9.0, 14.0);
   public static final VoxelShape field18588 = VoxelShapes.or(field18584, field18586);
   public static final VoxelShape field18589 = VoxelShapes.or(field18585, field18587);
   public static final VoxelShape field18590 = VoxelShapes.or(field18588, field18589);
   public static final VoxelShape field18591 = VoxelShapes.or(field18590, Block.makeCuboidShape(2.0, 0.0, 4.0, 14.0, 12.0, 12.0));
   private static final ITextComponent field18592 = new TranslationTextComponent("container.grindstone_title");

   public Class3205(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH).with(field18500, AttachFace.field314));
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   private VoxelShape method11527(BlockState var1) {
      Direction var4 = var1.<Direction>get(HORIZONTAL_FACING);
      switch (Class7707.field33093[var1.<AttachFace>get(field18500).ordinal()]) {
         case 1:
            if (var4 != Direction.NORTH && var4 != Direction.SOUTH) {
               return field18543;
            }

            return field18535;
         case 2:
            if (var4 == Direction.NORTH) {
               return field18559;
            } else if (var4 == Direction.SOUTH) {
               return field18551;
            } else {
               if (var4 == Direction.EAST) {
                  return field18575;
               }

               return field18567;
            }
         case 3:
            if (var4 != Direction.NORTH && var4 != Direction.SOUTH) {
               return field18591;
            }

            return field18583;
         default:
            return field18543;
      }
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11527(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11527(var1);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return true;
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Stats.field40176);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5815(var2x, var3x, IWorldPosCallable.method31714(var2, var3)), field18592);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(HORIZONTAL_FACING, var2.rotate(var1.<Direction>get(HORIZONTAL_FACING)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(HORIZONTAL_FACING)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, field18500);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
