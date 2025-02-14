package net.minecraft.world.gen.blockplacer;

import com.mojang.serialization.Codec;
import mapped.BlockPlacer;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

import java.util.Random;

public class SimpleBlockPlacer extends BlockPlacer {
   private static String[] field27595;
   public static final Codec<SimpleBlockPlacer> codec = Codec.unit(() -> SimpleBlockPlacer.field27597);
   public static final SimpleBlockPlacer field27597 = new SimpleBlockPlacer();

   @Override
   public BlockPlacerType<?> method19062() {
      return BlockPlacerType.SIMPLE_BLOCK_PLACER;
   }

   @Override
   public void method19061(IWorld var1, BlockPos var2, BlockState var3, Random var4) {
      var1.setBlockState(var2, var3, 2);
   }
}
