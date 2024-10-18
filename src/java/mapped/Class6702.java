package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;

import java.util.Random;

public class Class6702 extends Class6698 {
   private static String[] field29337;
   public static final Codec<Class6702> field29338 = Codec.unit(() -> Class6702.field29340);
   private static final BlockState[] field29339 = new BlockState[]{
      Blocks.DANDELION.getDefaultState(),
      Blocks.POPPY.getDefaultState(),
      Blocks.ALLIUM.getDefaultState(),
      Blocks.AZURE_BLUET.getDefaultState(),
      Blocks.RED_TULIP.getDefaultState(),
      Blocks.ORANGE_TULIP.getDefaultState(),
      Blocks.WHITE_TULIP.getDefaultState(),
      Blocks.PINK_TULIP.getDefaultState(),
      Blocks.OXEYE_DAISY.getDefaultState(),
      Blocks.CORNFLOWER.getDefaultState(),
      Blocks.LILY_OF_THE_VALLEY.getDefaultState()
   };
   public static final Class6702 field29340 = new Class6702();

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45134;
   }

   @Override
   public BlockState method20424(Random var1, BlockPos var2) {
      double var5 = MathHelper.clamp(
         (1.0 + Biome.INFO_NOISE.noiseAt((double)var2.getX() / 48.0, (double)var2.getZ() / 48.0, false)) / 2.0, 0.0, 0.9999
      );
      return field29339[(int)(var5 * (double)field29339.length)];
   }
}
