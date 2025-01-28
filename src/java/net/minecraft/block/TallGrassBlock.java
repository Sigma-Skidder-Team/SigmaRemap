package net.minecraft.block;

import mapped.Class2260;
import mapped.Class3456;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class TallGrassBlock extends BushBlock implements IGrowable {
   private static String[] field19350;
   public static final VoxelShape field19351 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public TallGrassBlock(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19351;
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      Class3456 var7 = (Class3456)(this != Blocks.FERN ? Blocks.TALL_GRASS : Blocks.LARGE_FERN);
      if (var7.getDefaultState().isValidPosition(var1, var3) && var1.method7007(var3.up())) {
         var7.method12129(var1, var3, 2);
      }
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14704;
   }
}
