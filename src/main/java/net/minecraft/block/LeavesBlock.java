package net.minecraft.block;

import mapped.ParticleTypes;
import mapped.VoxelShapes;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class LeavesBlock extends Block {
   private static String[] field19304;
   public static final IntegerProperty field19305 = BlockStateProperties.DISTANCE;
   public static final BooleanProperty field19306 = BlockStateProperties.PERSISTENT;

   public LeavesBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19305, Integer.valueOf(7)).with(field19306, Boolean.valueOf(false)));
   }

   @Override
   public VoxelShape method11995(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.empty();
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Integer>get(field19305) == 7 && !var1.<Boolean>get(field19306);
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.<Boolean>get(field19306) && var1.<Integer>get(field19305) == 7) {
         method11554(var1, var2, var3);
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      var2.setBlockState(var3, method12149(var1, var2, var3), 3);
   }

   @Override
   public int method11996(BlockState var1, IBlockReader var2, BlockPos var3) {
      return 1;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      int var9 = method12150(var3) + 1;
      if (var9 != 1 || var1.<Integer>get(field19305) != var9) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
      }

      return var1;
   }

   private static BlockState method12149(BlockState var0, IWorld var1, BlockPos var2) {
      int var5 = 7;
      BlockPos.Mutable var6 = new BlockPos.Mutable();

      for (Direction var10 : Direction.values()) {
         var6.method8377(var2, var10);
         var5 = Math.min(var5, method12150(var1.getBlockState(var6)) + 1);
         if (var5 == 1) {
            break;
         }
      }

      return var0.with(field19305, Integer.valueOf(var5));
   }

   private static int method12150(BlockState var0) {
      if (!BlockTags.field32751.contains(var0.getBlock())) {
         return !(var0.getBlock() instanceof LeavesBlock) ? 7 : var0.<Integer>get(field19305);
      } else {
         return 0;
      }
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var2.isRainingAt(var3.up()) && var4.nextInt(15) == 1) {
         BlockPos var7 = var3.down();
         BlockState var8 = var2.getBlockState(var7);
         if (!var8.isSolid() || !var8.method23454(var2, var7, Direction.UP)) {
            double var9 = (double)var3.getX() + var4.nextDouble();
            double var11 = (double)var3.getY() - 0.05;
            double var13 = (double)var3.getZ() + var4.nextDouble();
            var2.addParticle(ParticleTypes.field34060, var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19305, field19306);
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return method12149(this.getDefaultState().with(field19306, Boolean.valueOf(true)), var1.getWorld(), var1.getPos());
   }
}
