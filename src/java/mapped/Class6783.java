package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;

import java.util.Random;

public class Class6783 extends SurfaceBuilder<Class8278> {
   public Class6783(Codec<Class8278> var1) {
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
      this.method20667(var1, var2, var3, var4, var5, var6, var7, var9, var10, var14.getTop(), var14.method28935(), var14.method28936(), var11);
   }

   public void method20667(
      Random var1,
      IChunk var2,
      Biome var3,
      int var4,
      int var5,
      int var6,
      double var7,
      BlockState var9,
      BlockState var10,
      BlockState var11,
      BlockState var12,
      BlockState var13,
      int var14
   ) {
      BlockState var17 = var11;
      BlockState var18 = var12;
      BlockPos.Mutable var19 = new BlockPos.Mutable();
      int var20 = -1;
      int var21 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var22 = var4 & 15;
      int var23 = var5 & 15;

      for (int var24 = var6; var24 >= 0; var24--) {
         var19.setPos(var22, var24, var23);
         BlockState var25 = var2.getBlockState(var19);
         if (!var25.isAir()) {
            if (var25.isIn(var9.getBlock())) {
               if (var20 != -1) {
                  if (var20 > 0) {
                     var20--;
                     var2.setBlockState(var19, var18, false);
                     if (var20 == 0 && var18.isIn(Blocks.SAND) && var21 > 1) {
                        var20 = var1.nextInt(4) + Math.max(0, var24 - 63);
                        var18 = !var18.isIn(Blocks.RED_SAND) ? Blocks.SANDSTONE.getDefaultState() : Blocks.RED_SANDSTONE.getDefaultState();
                     }
                  }
               } else {
                  if (var21 > 0) {
                     if (var24 >= var14 - 4 && var24 <= var14 + 1) {
                        var17 = var11;
                        var18 = var12;
                     }
                  } else {
                     var17 = Blocks.AIR.getDefaultState();
                     var18 = var9;
                  }

                  if (var24 < var14 && (var17 == null || var17.isAir())) {
                     if (!(var3.getTemperature(var19.setPos(var4, var24, var5)) < 0.15F)) {
                        var17 = var10;
                     } else {
                        var17 = Blocks.ICE.getDefaultState();
                     }

                     var19.setPos(var22, var24, var23);
                  }

                  var20 = var21;
                  if (var24 < var14 - 1) {
                     if (var24 >= var14 - 7 - var21) {
                        var2.setBlockState(var19, var18, false);
                     } else {
                        var17 = Blocks.AIR.getDefaultState();
                        var18 = var9;
                        var2.setBlockState(var19, var13, false);
                     }
                  } else {
                     var2.setBlockState(var19, var17, false);
                  }
               }
            }
         } else {
            var20 = -1;
         }
      }
   }
}
