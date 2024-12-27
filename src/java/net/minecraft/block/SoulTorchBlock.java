package net.minecraft.block;

import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class SoulTorchBlock extends Block {
   private static String[] field18982;
   public static final VoxelShape field18983 = Block.makeCuboidShape(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   public final IParticleData field18984;

   public SoulTorchBlock(Properties var1, IParticleData var2) {
      super(var1);
      this.field18984 = var2;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18983;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !this.isValidPosition(var1, var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method11548(var2, var3.down(), Direction.UP);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + 0.5;
      double var9 = (double)var3.getY() + 0.7;
      double var11 = (double)var3.getZ() + 0.5;
      var2.addParticle(ParticleTypes.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
      var2.addParticle(this.field18984, var7, var9, var11, 0.0, 0.0, 0.0);
   }
}
