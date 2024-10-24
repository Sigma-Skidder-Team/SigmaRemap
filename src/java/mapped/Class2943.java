package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.LightType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2943 extends Class2898<Class4705> {
   private static final BlockState field18006 = Blocks.field37012.getDefaultState();

   public Class2943(Codec<Class4705> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4705 var5) {
      while (var4.getY() > 5 && var1.method7007(var4)) {
         var4 = var4.down();
      }

      if (var4.getY() <= 4) {
         return false;
      } else {
         var4 = var4.method8340(4);
         if (var1.method6969(SectionPos.from(var4), Structure.field18073).findAny().isPresent()) {
            return false;
         } else {
            boolean[] var8 = new boolean[2048];
            int var9 = var3.nextInt(4) + 4;

            for (int var10 = 0; var10 < var9; var10++) {
               double var11 = var3.nextDouble() * 6.0 + 3.0;
               double var13 = var3.nextDouble() * 4.0 + 2.0;
               double var15 = var3.nextDouble() * 6.0 + 3.0;
               double var17 = var3.nextDouble() * (16.0 - var11 - 2.0) + 1.0 + var11 / 2.0;
               double var19 = var3.nextDouble() * (8.0 - var13 - 4.0) + 2.0 + var13 / 2.0;
               double var21 = var3.nextDouble() * (16.0 - var15 - 2.0) + 1.0 + var15 / 2.0;

               for (int var23 = 1; var23 < 15; var23++) {
                  for (int var24 = 1; var24 < 15; var24++) {
                     for (int var25 = 1; var25 < 7; var25++) {
                        double var26 = ((double)var23 - var17) / (var11 / 2.0);
                        double var28 = ((double)var25 - var19) / (var13 / 2.0);
                        double var30 = ((double)var24 - var21) / (var15 / 2.0);
                        double var32 = var26 * var26 + var28 * var28 + var30 * var30;
                        if (var32 < 1.0) {
                           var8[(var23 * 16 + var24) * 8 + var25] = true;
                        }
                     }
                  }
               }
            }

            for (int var39 = 0; var39 < 16; var39++) {
               for (int var34 = 0; var34 < 16; var34++) {
                  for (int var35 = 0; var35 < 8; var35++) {
                     boolean var36 = !var8[(var39 * 16 + var34) * 8 + var35]
                        && (
                           var39 < 15 && var8[((var39 + 1) * 16 + var34) * 8 + var35]
                              || var39 > 0 && var8[((var39 - 1) * 16 + var34) * 8 + var35]
                              || var34 < 15 && var8[(var39 * 16 + var34 + 1) * 8 + var35]
                              || var34 > 0 && var8[(var39 * 16 + (var34 - 1)) * 8 + var35]
                              || var35 < 7 && var8[(var39 * 16 + var34) * 8 + var35 + 1]
                              || var35 > 0 && var8[(var39 * 16 + var34) * 8 + (var35 - 1)]
                        );
                     if (var36) {
                        Material var37 = var1.getBlockState(var4.add(var39, var35, var34)).getMaterial();
                        if (var35 >= 4 && var37.isLiquid()) {
                           return false;
                        }

                        if (var35 < 4 && !var37.isSolid() && var1.getBlockState(var4.add(var39, var35, var34)) != var5.field22322) {
                           return false;
                        }
                     }
                  }
               }
            }

            for (int var40 = 0; var40 < 16; var40++) {
               for (int var44 = 0; var44 < 16; var44++) {
                  for (int var48 = 0; var48 < 8; var48++) {
                     if (var8[(var40 * 16 + var44) * 8 + var48]) {
                        var1.setBlockState(var4.add(var40, var48, var44), var48 < 4 ? var5.field22322 : field18006, 2);
                     }
                  }
               }
            }

            for (int var41 = 0; var41 < 16; var41++) {
               for (int var45 = 0; var45 < 16; var45++) {
                  for (int var49 = 4; var49 < 8; var49++) {
                     if (var8[(var41 * 16 + var45) * 8 + var49]) {
                        BlockPos var52 = var4.add(var41, var49 - 1, var45);
                        if (method11219(var1.getBlockState(var52).getBlock())
                           && var1.getLightFor(LightType.SKY, var4.add(var41, var49, var45)) > 0) {
                           Biome var55 = var1.getBiome(var52);
                           if (!var55.getGenerationSettings().getSurfaceBuilderConfig().getTop().isIn(Blocks.MYCELIUM)) {
                              var1.setBlockState(var52, Blocks.GRASS_BLOCK.getDefaultState(), 2);
                           } else {
                              var1.setBlockState(var52, Blocks.MYCELIUM.getDefaultState(), 2);
                           }
                        }
                     }
                  }
               }
            }

            if (var5.field22322.getMaterial() == Material.field38943) {
               for (int var42 = 0; var42 < 16; var42++) {
                  for (int var46 = 0; var46 < 16; var46++) {
                     for (int var50 = 0; var50 < 8; var50++) {
                        boolean var53 = !var8[(var42 * 16 + var46) * 8 + var50]
                           && (
                              var42 < 15 && var8[((var42 + 1) * 16 + var46) * 8 + var50]
                                 || var42 > 0 && var8[((var42 - 1) * 16 + var46) * 8 + var50]
                                 || var46 < 15 && var8[(var42 * 16 + var46 + 1) * 8 + var50]
                                 || var46 > 0 && var8[(var42 * 16 + (var46 - 1)) * 8 + var50]
                                 || var50 < 7 && var8[(var42 * 16 + var46) * 8 + var50 + 1]
                                 || var50 > 0 && var8[(var42 * 16 + var46) * 8 + (var50 - 1)]
                           );
                        if (var53 && (var50 < 4 || var3.nextInt(2) != 0) && var1.getBlockState(var4.add(var42, var50, var46)).getMaterial().isSolid()) {
                           var1.setBlockState(var4.add(var42, var50, var46), Blocks.STONE.getDefaultState(), 2);
                        }
                     }
                  }
               }
            }

            if (var5.field22322.getMaterial() == Material.WATER) {
               for (int var43 = 0; var43 < 16; var43++) {
                  for (int var47 = 0; var47 < 16; var47++) {
                     byte var51 = 4;
                     BlockPos var54 = var4.add(var43, 4, var47);
                     if (var1.getBiome(var54).doesWaterFreeze(var1, var54, false)) {
                        var1.setBlockState(var54, Blocks.ICE.getDefaultState(), 2);
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
