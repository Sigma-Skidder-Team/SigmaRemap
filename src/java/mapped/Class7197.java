package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class7197 extends Class7196 {
   public Class7197(Codec<Class4728> var1) {
      super(var1);
      this.field30897 = ImmutableSet.of(
         Blocks.STONE,
         Blocks.GRANITE,
         Blocks.DIORITE,
         Blocks.ANDESITE,
         Blocks.DIRT,
         Blocks.COARSE_DIRT,
         new Block[]{
            Blocks.PODZOL,
            Blocks.GRASS_BLOCK,
            Blocks.TERRACOTTA,
            Blocks.WHITE_TERRACOTTA,
            Blocks.ORANGE_TERRACOTTA,
            Blocks.MAGENTA_TERRACOTTA,
            Blocks.LIGHT_BLUE_TERRACOTTA,
            Blocks.YELLOW_TERRACOTTA,
            Blocks.LIME_TERRACOTTA,
            Blocks.PINK_TERRACOTTA,
            Blocks.GRAY_TERRACOTTA,
            Blocks.LIGHT_GRAY_TERRACOTTA,
            Blocks.CYAN_TERRACOTTA,
            Blocks.PURPLE_TERRACOTTA,
            Blocks.BLUE_TERRACOTTA,
            Blocks.BROWN_TERRACOTTA,
            Blocks.GREEN_TERRACOTTA,
            Blocks.RED_TERRACOTTA,
            Blocks.BLACK_TERRACOTTA,
            Blocks.SANDSTONE,
            Blocks.RED_SANDSTONE,
            Blocks.MYCELIUM,
            Blocks.SNOW,
            Blocks.SAND,
            Blocks.GRAVEL,
            Blocks.WATER,
            Blocks.LAVA,
            Blocks.OBSIDIAN,
            Blocks.AIR,
            Blocks.field37012
         }
      );
   }

   @Override
   public boolean method22611(IChunk var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
   }

   @Override
   public boolean method22596(
      IChunk var1,
      Function<BlockPos, Biome> var2,
      BitSet var3,
      Random var4,
      BlockPos.Mutable var5,
      BlockPos.Mutable var6,
      BlockPos.Mutable var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      MutableBoolean var16
   ) {
      return Class7198.method22615(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }
}
