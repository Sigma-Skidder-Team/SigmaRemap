package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BambooLeaves;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3418 extends Block implements IGrowable {
   private static String[] field19121;
   public static final VoxelShape field19122 = Block.makeCuboidShape(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   public static final VoxelShape field19123 = Block.makeCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   public static final VoxelShape field19124 = Block.makeCuboidShape(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final IntegerProperty field19125 = BlockStateProperties.AGE;
   public static final EnumProperty<BambooLeaves> field19126 = BlockStateProperties.LEAVES;
   public static final IntegerProperty field19127 = BlockStateProperties.STAGE;

   public Class3418(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19125, Integer.valueOf(0))
            .with(field19126, BambooLeaves.field642)
            .with(field19127, Integer.valueOf(0))
      );
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19125, field19126, field19127);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   @Override
   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return true;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      VoxelShape var7 = var1.get(field19126) != BambooLeaves.field644 ? field19122 : field19123;
      Vector3d var8 = var1.method23421(var2, var3);
      return var7.withOffset(var8.x, var8.y, var8.z);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Vector3d var7 = var1.method23421(var2, var3);
      return field19124.withOffset(var7.x, var7.y, var7.z);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());
      if (var4.isEmpty()) {
         BlockState var5 = var1.getWorld().getBlockState(var1.getPos().down());
         if (!var5.isIn(BlockTags.field32787)) {
            return null;
         } else if (!var5.isIn(Blocks.field37008)) {
            if (var5.isIn(Blocks.field37009)) {
               int var7 = var5.<Integer>get(field19125) <= 0 ? 0 : 1;
               return this.getDefaultState().with(field19125, Integer.valueOf(var7));
            } else {
               BlockState var6 = var1.getWorld().getBlockState(var1.getPos().up());
               return !var6.isIn(Blocks.field37009) && !var6.isIn(Blocks.field37008)
                  ? Blocks.field37008.getDefaultState()
                  : this.getDefaultState().with(field19125, var6.<Integer>get(field19125));
            }
         } else {
            return this.getDefaultState().with(field19125, Integer.valueOf(0));
         }
      } else {
         return null;
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.isValidPosition(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Integer>get(field19127) == 0;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>get(field19127) == 0
         && var4.nextInt(3) == 0
         && var2.method7007(var3.up())
         && var2.method7021(var3.up(), 0) >= 9) {
         int var7 = this.method12067(var2, var3) + 1;
         if (var7 < 16) {
            this.method12065(var1, var2, var3, var4, var7);
         }
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).isIn(BlockTags.field32787);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (!var1.isValidPosition(var4, var5)) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
      }

      if (var2 == Direction.UP && var3.isIn(Blocks.field37009) && var3.<Integer>get(field19125) > var1.<Integer>get(field19125)) {
         var4.setBlockState(var5, var1.method23459(field19125), 2);
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      int var7 = this.method12066(var1, var2);
      int var8 = this.method12067(var1, var2);
      return var7 + var8 + 1 < 16 && var1.getBlockState(var2.up(var7)).<Integer>get(field19127) != 1;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      int var7 = this.method12066(var1, var3);
      int var8 = this.method12067(var1, var3);
      int var9 = var7 + var8 + 1;
      int var10 = 1 + var2.nextInt(2);

      for (int var11 = 0; var11 < var10; var11++) {
         BlockPos var12 = var3.up(var7);
         BlockState var13 = var1.getBlockState(var12);
         if (var9 >= 16 || var13.<Integer>get(field19127) == 1 || !var1.method7007(var12.up())) {
            return;
         }

         this.method12065(var13, var1, var12, var2, var9);
         var7++;
         var9++;
      }
   }

   @Override
   public float method11997(BlockState var1, PlayerEntity var2, IBlockReader var3, BlockPos var4) {
      return !(var2.getHeldItemMainhand().getItem() instanceof SwordItem) ? super.method11997(var1, var2, var3, var4) : 1.0F;
   }

   public void method12065(BlockState var1, World var2, BlockPos var3, Random var4, int var5) {
      BlockState var8 = var2.getBlockState(var3.down());
      BlockPos var9 = var3.method8340(2);
      BlockState var10 = var2.getBlockState(var9);
      BambooLeaves var11 = BambooLeaves.field642;
      if (var5 >= 1) {
         if (!var8.isIn(Blocks.field37009) || var8.<BambooLeaves>get(field19126) == BambooLeaves.field642) {
            var11 = BambooLeaves.field643;
         } else if (var8.isIn(Blocks.field37009) && var8.<BambooLeaves>get(field19126) != BambooLeaves.field642) {
            var11 = BambooLeaves.field644;
            if (var10.isIn(Blocks.field37009)) {
               var2.setBlockState(var3.down(), var8.with(field19126, BambooLeaves.field643), 3);
               var2.setBlockState(var9, var10.with(field19126, BambooLeaves.field642), 3);
            }
         }
      }

      int var12 = var1.<Integer>get(field19125) != 1 && !var10.isIn(Blocks.field37009) ? 0 : 1;
      int var13 = (var5 < 11 || !(var4.nextFloat() < 0.25F)) && var5 != 15 ? 0 : 1;
      var2.setBlockState(
         var3.up(),
         this.getDefaultState().with(field19125, Integer.valueOf(var12)).with(field19126, var11).with(field19127, Integer.valueOf(var13)),
         3
      );
   }

   public int method12066(IBlockReader var1, BlockPos var2) {
      int var5 = 0;

      while (var5 < 16 && var1.getBlockState(var2.up(var5 + 1)).isIn(Blocks.field37009)) {
         var5++;
      }

      return var5;
   }

   public int method12067(IBlockReader var1, BlockPos var2) {
      int var5 = 0;

      while (var5 < 16 && var1.getBlockState(var2.method8340(var5 + 1)).isIn(Blocks.field37009)) {
         var5++;
      }

      return var5;
   }
}
