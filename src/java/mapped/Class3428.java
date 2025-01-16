package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3428 extends Block implements IWaterLoggable {
   private static String[] field19179;
   private static final VoxelShape field19180;
   private static final VoxelShape field19181;
   private static final VoxelShape field19182 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final VoxelShape field19183 = VoxelShapes.method27426().withOffset(0.0, -1.0, 0.0);
   public static final IntegerProperty field19184 = BlockStateProperties.DISTANCE1;
   public static final BooleanProperty field19185 = BlockStateProperties.WATERLOGGED;
   public static final BooleanProperty field19186 = BlockStateProperties.BOTTOM;

   public Class3428(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19184, Integer.valueOf(7))
            .with(field19185, Boolean.valueOf(false))
            .with(field19186, Boolean.valueOf(false))
      );
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19184, field19185, field19186);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (var4.method14951(var1.getBlock().asItem())) {
         return VoxelShapes.method27426();
      } else {
         return !var1.<Boolean>get(field19186) ? field19180 : field19181;
      }
   }

   @Override
   public VoxelShape method11938(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.method27426();
   }

   @Override
   public boolean method11497(BlockState var1, BlockItemUseContext var2) {
      return var2.method18357().getItem() == this.asItem();
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockPos var4 = var1.getPos();
      World var5 = var1.getWorld();
      int var6 = method12085(var5, var4);
      return this.getDefaultState()
         .with(field19185, Boolean.valueOf(var5.getFluidState(var4).getFluid() == Fluids.WATER))
         .with(field19184, Integer.valueOf(var6))
         .with(field19186, Boolean.valueOf(this.method12084(var5, var4, var6)));
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var2.isRemote) {
         var2.getBlockTickScheduler().scheduleTick(var3, this, 1);
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field19185)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      if (!var4.isRemote()) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = method12085(var2, var3);
      BlockState var8 = var1.with(field19184, Integer.valueOf(var7)).with(field19186, Boolean.valueOf(this.method12084(var2, var3, var7)));
      if (var8.<Integer>get(field19184) != 7) {
         if (var1 != var8) {
            var2.setBlockState(var3, var8, 3);
         }
      } else if (var1.<Integer>get(field19184) != 7) {
         var2.method7179(var3, true);
      } else {
         var2.addEntity(
            new FallingBlockEntity(
               var2,
               (double)var3.getX() + 0.5,
               (double)var3.getY(),
               (double)var3.getZ() + 0.5,
               var8.with(field19185, Boolean.valueOf(false))
            )
         );
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method12085(var2, var3) < 7;
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (var4.method14950(VoxelShapes.method27426(), var3, true) && !var4.method14949()) {
         return field19180;
      } else {
         return var1.<Integer>get(field19184) != 0 && var1.<Boolean>get(field19186) && var4.method14950(field19183, var3, true)
            ? field19182
            : VoxelShapes.empty();
      }
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field19185) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   private boolean method12084(IBlockReader var1, BlockPos var2, int var3) {
      return var3 > 0 && !var1.getBlockState(var2.down()).isIn(this);
   }

   public static int method12085(IBlockReader var0, BlockPos var1) {
      BlockPos.Mutable var4 = var1.method8354().method8379(Direction.DOWN);
      BlockState var5 = var0.getBlockState(var4);
      int var6 = 7;
      if (!var5.isIn(Blocks.field37053)) {
         if (var5.method23454(var0, var4, Direction.UP)) {
            return 0;
         }
      } else {
         var6 = var5.<Integer>get(field19184);
      }

      for (Direction var8 : Direction.Plane.HORIZONTAL) {
         BlockState var9 = var0.getBlockState(var4.method8377(var1, var8));
         if (var9.isIn(Blocks.field37053)) {
            var6 = Math.min(var6, var9.<Integer>get(field19184) + 1);
            if (var6 != 1) {
               continue;
            }
            break;
         }
      }

      return var6;
   }

   static {
      VoxelShape var2 = Block.makeCuboidShape(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      VoxelShape var3 = Block.makeCuboidShape(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      VoxelShape var4 = Block.makeCuboidShape(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      VoxelShape var5 = Block.makeCuboidShape(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      VoxelShape var6 = Block.makeCuboidShape(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      field19180 = VoxelShapes.method27432(var2, var3, var4, var5, var6);
      VoxelShape var7 = Block.makeCuboidShape(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      VoxelShape var8 = Block.makeCuboidShape(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      VoxelShape var9 = Block.makeCuboidShape(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      VoxelShape var10 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      field19181 = VoxelShapes.method27432(Class3428.field19182, field19180, var8, var7, var10, var9);
   }
}
