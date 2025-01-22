package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.PerlinNoiseGenerator;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;

import java.util.Random;
import java.util.stream.IntStream;

public class Class6771 extends SurfaceBuilder<Class8278> {
   public static final BlockState field29539 = Blocks.PACKED_ICE.getDefaultState();
   public static final BlockState field29540 = Blocks.SNOW_BLOCK.getDefaultState();
   private static final BlockState field29541 = Blocks.AIR.getDefaultState();
   private static final BlockState field29490 = Blocks.GRAVEL.getDefaultState();
   private static final BlockState field29542 = Blocks.ICE.getDefaultState();
   private PerlinNoiseGenerator field29543;
   private PerlinNoiseGenerator field29544;
   private long field29545;

   public Class6771(Codec<Class8278> var1) {
      super(var1);
   }

   public void buildSurface(
      Random var1,
      IChunk var2,
      Biome var3,
      int var4,
      int var5,
      int var6,
      double var7,
      BlockState var9,
      BlockState var10,
      int var11,
      long var12,
      Class8278 var14
   ) {
      double var17 = 0.0;
      double var19 = 0.0;
      BlockPos.Mutable var21 = new BlockPos.Mutable();
      float var22 = var3.getTemperature(var21.setPos(var4, 63, var5));
      double var23 = Math.min(Math.abs(var7), this.field29543.noiseAt((double)var4 * 0.1, (double)var5 * 0.1, false) * 15.0);
      if (var23 > 1.8) {
         double var38 = 0.09765625;
         double var40 = Math.abs(this.field29544.noiseAt((double)var4 * 0.09765625, (double)var5 * 0.09765625, false));
         var17 = var23 * var23 * 1.2;
         double var42 = Math.ceil(var40 * 40.0) + 14.0;
         if (var17 > var42) {
            var17 = var42;
         }

         if (var22 > 0.1F) {
            var17 -= 2.0;
         }

         if (!(var17 > 2.0)) {
            var17 = 0.0;
         } else {
            var19 = (double)var11 - var17 - 7.0;
            var17 += (double)var11;
         }
      }

      int var25 = var4 & 15;
      int var26 = var5 & 15;
      ISurfaceBuilderConfig var27 = var3.getGenerationSettings().getSurfaceBuilderConfig();
      BlockState var28 = var27.method28935();
      BlockState var29 = var27.getTop();
      BlockState var30 = var28;
      BlockState var31 = var29;
      int var32 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var33 = -1;
      int var34 = 0;
      int var35 = 2 + var1.nextInt(4);
      int var36 = var11 + 18 + var1.nextInt(10);

      for (int var37 = Math.max(var6, (int)var17 + 1); var37 >= 0; var37--) {
         var21.setPos(var25, var37, var26);
         if (var2.getBlockState(var21).isAir() && var37 < (int)var17 && var1.nextDouble() > 0.01) {
            var2.setBlockState(var21, field29539, false);
         } else if (var2.getBlockState(var21).getMaterial() == Material.field38941
            && var37 > (int)var19
            && var37 < var11
            && var19 != 0.0
            && var1.nextDouble() > 0.15) {
            var2.setBlockState(var21, field29539, false);
         }

         BlockState var44 = var2.getBlockState(var21);
         if (!var44.isAir()) {
            if (var44.isIn(var9.getBlock())) {
               if (var33 != -1) {
                  if (var33 > 0) {
                     var33--;
                     var2.setBlockState(var21, var30, false);
                     if (var33 == 0 && var30.isIn(Blocks.SAND) && var32 > 1) {
                        var33 = var1.nextInt(4) + Math.max(0, var37 - 63);
                        var30 = !var30.isIn(Blocks.RED_SAND) ? Blocks.SANDSTONE.getDefaultState() : Blocks.RED_SANDSTONE.getDefaultState();
                     }
                  }
               } else {
                  if (var32 > 0) {
                     if (var37 >= var11 - 4 && var37 <= var11 + 1) {
                        var31 = var29;
                        var30 = var28;
                     }
                  } else {
                     var31 = field29541;
                     var30 = var9;
                  }

                  if (var37 < var11 && (var31 == null || var31.isAir())) {
                     if (!(var3.getTemperature(var21.setPos(var4, var37, var5)) < 0.15F)) {
                        var31 = var10;
                     } else {
                        var31 = field29542;
                     }
                  }

                  var33 = var32;
                  if (var37 < var11 - 1) {
                     if (var37 >= var11 - 7 - var32) {
                        var2.setBlockState(var21, var30, false);
                     } else {
                        var31 = field29541;
                        var30 = var9;
                        var2.setBlockState(var21, field29490, false);
                     }
                  } else {
                     var2.setBlockState(var21, var31, false);
                  }
               }
            } else if (var44.isIn(Blocks.PACKED_ICE) && var34 <= var35 && var37 > var36) {
               var2.setBlockState(var21, field29540, false);
               var34++;
            }
         } else {
            var33 = -1;
         }
      }
   }

   @Override
   public void method20658(long var1) {
      if (this.field29545 != var1 || this.field29543 == null || this.field29544 == null) {
         SharedSeedRandom var5 = new SharedSeedRandom(var1);
         this.field29543 = new PerlinNoiseGenerator(var5, IntStream.rangeClosed(-3, 0));
         this.field29544 = new PerlinNoiseGenerator(var5, ImmutableList.of(0));
      }

      this.field29545 = var1;
   }
}
