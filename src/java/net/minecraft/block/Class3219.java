package net.minecraft.block;

import mapped.Class2937;
import mapped.Class2946;
import mapped.Class8529;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3219 extends Block implements IGrowable {
   private static String[] field18638;

   public Class3219(Properties var1) {
      super(var1);
   }

   private static boolean method11609(BlockState var0, IWorldReader var1, BlockPos var2) {
      BlockPos var5 = var2.up();
      BlockState var6 = var1.getBlockState(var5);
      int var7 = LightEngine.func_215613_a(var1, var0, var2, var6, var5, Direction.UP, var6.getOpacity(var1, var5));
      return var7 < var1.getMaxLightLevel();
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!method11609(var1, var2, var3)) {
         var2.setBlockState(var3, Blocks.NETHERRACK.getDefaultState());
      }
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var1.getBlockState(var2.up()).isAir();
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockState var7 = var1.getBlockState(var3);
      BlockPos var8 = var3.up();
      if (!var7.isIn(Blocks.CRIMSON_NYLIUM)) {
         if (var7.isIn(Blocks.WARPED_NYLIUM)) {
            Class2946.method11288(var1, var2, var8, Class8529.field38323, 3, 1);
            Class2946.method11288(var1, var2, var8, Class8529.field38324, 3, 1);
            if (var2.nextInt(8) == 0) {
               Class2937.method11277(var1, var2, var8, 3, 1, 2);
            }
         }
      } else {
         Class2946.method11288(var1, var2, var8, Class8529.field38322, 3, 1);
      }
   }
}
