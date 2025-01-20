package net.minecraft.block;

import net.minecraft.block.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.function.Supplier;

public class CrimsonFungusBlock extends BushBlock implements IGrowable {
   private static String[] field18470;
   public static final VoxelShape field19345 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private final Supplier<ConfiguredFeature<Class4709, ?>> field19346;

   public CrimsonFungusBlock(Properties var1, Supplier<ConfiguredFeature<Class4709, ?>> var2) {
      super(var1);
      this.field19346 = var2;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19345;
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.isIn(BlockTags.field32799)
         || state.isIn(Blocks.MYCELIUM)
         || state.isIn(Blocks.SOUL_SOIL)
         || super.isValidGround(state, var2, var3);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      Block var7 = ((Class4709)this.field19346.get().config).field22337.getBlock();
      Block var8 = var1.getBlockState(var2.down()).getBlock();
      return var8 == var7;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.field19346.get().func_242765_a(var1, var1.getChunkProvider().getChunkGenerator(), var2, var3);
   }
}
