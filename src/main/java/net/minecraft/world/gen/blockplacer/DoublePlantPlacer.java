package net.minecraft.world.gen.blockplacer;

import com.mojang.serialization.Codec;
import mapped.BlockPlacer;
import mapped.Class3456;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

import java.util.Random;

public class DoublePlantPlacer extends BlockPlacer {
   private static String[] field27598;
   public static final Codec<DoublePlantPlacer> codec = Codec.unit(() -> DoublePlantPlacer.field27600);
   public static final DoublePlantPlacer field27600 = new DoublePlantPlacer();

   @Override
   public BlockPlacerType<?> method19062() {
      return BlockPlacerType.DOUBLE_PLANT_PLACER;
   }

   @Override
   public void method19061(IWorld var1, BlockPos var2, BlockState var3, Random var4) {
      ((Class3456)var3.getBlock()).method12129(var1, var2, 2);
   }
}
