package net.minecraft.block;

import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class EndRodBlock extends Class3433 {
   private static String[] field19233;
   public static final VoxelShape field19234 = Block.makeCuboidShape(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   public static final VoxelShape field19235 = Block.makeCuboidShape(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   public static final VoxelShape field19236 = Block.makeCuboidShape(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   public EndRodBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19198, Direction.UP));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19198, var2.rotate(var1.<Direction>get(field19198)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.with(field19198, var2.method8750(var1.<Direction>get(field19198)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class8694.field39238[var1.<Direction>get(field19198).getAxis().ordinal()]) {
         case 1:
         default:
            return field19236;
         case 2:
            return field19235;
         case 3:
            return field19234;
      }
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      Direction var4 = var1.getFace();
      BlockState var5 = var1.getWorld().getBlockState(var1.getPos().offset(var4.getOpposite()));
      return var5.isIn(this) && var5.get(field19198) == var4
         ? this.getDefaultState().with(field19198, var4.getOpposite())
         : this.getDefaultState().with(field19198, var4);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = var1.<Direction>get(field19198);
      double var8 = (double)var3.getX() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var10 = (double)var3.getY() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var12 = (double)var3.getZ() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var14 = (double)(0.4F - (var4.nextFloat() + var4.nextFloat()) * 0.4F);
      if (var4.nextInt(5) == 0) {
         var2.addParticle(
            ParticleTypes.field34067,
            var8 + (double)var7.getXOffset() * var14,
            var10 + (double)var7.getYOffset() * var14,
            var12 + (double)var7.getZOffset() * var14,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005
         );
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19198);
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15862;
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
