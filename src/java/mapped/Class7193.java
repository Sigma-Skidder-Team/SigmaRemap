package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class7193 extends Class7194 {
   public Class7193(Codec<Class4728> var1) {
      super(var1, 128);
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
            Blocks.NETHERRACK,
            Blocks.SOUL_SAND,
            Blocks.SOUL_SOIL,
            Blocks.CRIMSON_NYLIUM,
            Blocks.WARPED_NYLIUM,
            Blocks.field36891,
            Blocks.field37076,
            Blocks.BASALT,
            Blocks.field37130
         }
      );
      this.field30898 = ImmutableSet.of(Fluids.LAVA, Fluids.WATER);
   }

   @Override
   public int method22592() {
      return 10;
   }

   @Override
   public float method22593(Random var1) {
      return (var1.nextFloat() * 2.0F + var1.nextFloat()) * 2.0F;
   }

   @Override
   public double method22594() {
      return 5.0;
   }

   @Override
   public int method22595(Random var1) {
      return var1.nextInt(this.field30900);
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
      int var19 = var13 | var15 << 4 | var14 << 8;
      if (!var3.get(var19)) {
         var3.set(var19);
         var5.setPos(var11, var14, var12);
         if (!this.method22609(var1.getBlockState(var5))) {
            return false;
         } else {
            BlockState var20;
            if (var14 > 31) {
               var20 = field30894;
            } else {
               var20 = field30896.getBlockState();
            }

            var1.setBlockState(var5, var20, false);
            return true;
         }
      } else {
         return false;
      }
   }
}
