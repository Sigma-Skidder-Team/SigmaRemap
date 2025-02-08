package net.minecraft.block;

import mapped.FluidTags;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.DamageSource;
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

public class Class3220 extends Block {
   private static String[] field18639;
   public static final IntegerProperty field18640 = BlockStateProperties.AGE6;
   public static final VoxelShape field18641 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   public static final VoxelShape field18642 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public Class3220(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18640, Integer.valueOf(0)));
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.isValidPosition(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.up();
      if (var2.method7007(var7)) {
         int var8 = 1;

         while (var2.getBlockState(var3.method8340(var8)).isIn(this)) {
            var8++;
         }

         if (var8 < 3) {
            int var9 = var1.<Integer>get(field18640);
            if (var9 != 15) {
               var2.setBlockState(var3, var1.with(field18640, Integer.valueOf(var9 + 1)), 4);
            } else {
               var2.setBlockState(var7, this.getDefaultState());
               BlockState var10 = var1.with(field18640, Integer.valueOf(0));
               var2.setBlockState(var3, var10, 4);
               var10.neighborChanged(var2, var7, this, var3, false);
            }
         }
      }
   }

   @Override
   public VoxelShape getCollisionShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18641;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18642;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (!var1.isValidPosition(var4, var5)) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      for (Direction var7 : Direction.Plane.HORIZONTAL) {
         BlockState var8 = var2.getBlockState(var3.offset(var7));
         Material var9 = var8.getMaterial();
         if (var9.isSolid() || var2.getFluidState(var3.offset(var7)).method23486(FluidTags.field40470)) {
            return false;
         }
      }

      BlockState var10 = var2.getBlockState(var3.down());
      return (var10.isIn(Blocks.CACTUS) || var10.isIn(Blocks.SAND) || var10.isIn(Blocks.RED_SAND))
         && !var2.getBlockState(var3.up()).getMaterial().isLiquid();
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      var4.attackEntityFrom(DamageSource.field39001, 1.0F);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18640);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
