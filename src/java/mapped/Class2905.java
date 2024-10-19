package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2905 extends Class2898<Class4712> {
   public Class2905(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      while (var1.method7007(var4) && var4.getY() > 2) {
         var4 = var4.down();
      }

      if (!var1.getBlockState(var4).isIn(Blocks.SNOW_BLOCK)) {
         return false;
      } else {
         var4 = var4.up(var3.nextInt(4));
         int var8 = var3.nextInt(4) + 7;
         int var9 = var8 / 4 + var3.nextInt(2);
         if (var9 > 1 && var3.nextInt(60) == 0) {
            var4 = var4.up(10 + var3.nextInt(30));
         }

         for (int var10 = 0; var10 < var8; var10++) {
            float var11 = (1.0F - (float)var10 / (float)var8) * (float)var9;
            int var12 = MathHelper.ceil(var11);

            for (int var13 = -var12; var13 <= var12; var13++) {
               float var14 = (float) MathHelper.abs(var13) - 0.25F;

               for (int var15 = -var12; var15 <= var12; var15++) {
                  float var16 = (float) MathHelper.abs(var15) - 0.25F;
                  if ((var13 == 0 && var15 == 0 || !(var14 * var14 + var16 * var16 > var11 * var11))
                     && (var13 != -var12 && var13 != var12 && var15 != -var12 && var15 != var12 || !(var3.nextFloat() > 0.75F))) {
                     BlockState var17 = var1.getBlockState(var4.add(var13, var10, var15));
                     Block var18 = var17.getBlock();
                     if (var17.isAir() || method11219(var18) || var18 == Blocks.SNOW_BLOCK || var18 == Blocks.ICE) {
                        this.method11217(var1, var4.add(var13, var10, var15), Blocks.PACKED_ICE.getDefaultState());
                     }

                     if (var10 != 0 && var12 > 1) {
                        var17 = var1.getBlockState(var4.add(var13, -var10, var15));
                        var18 = var17.getBlock();
                        if (var17.isAir() || method11219(var18) || var18 == Blocks.SNOW_BLOCK || var18 == Blocks.ICE) {
                           this.method11217(var1, var4.add(var13, -var10, var15), Blocks.PACKED_ICE.getDefaultState());
                        }
                     }
                  }
               }
            }
         }

         int var20 = var9 - 1;
         if (var20 >= 0) {
            if (var20 > 1) {
               var20 = 1;
            }
         } else {
            var20 = 0;
         }

         for (int var21 = -var20; var21 <= var20; var21++) {
            for (int var22 = -var20; var22 <= var20; var22++) {
               BlockPos var23 = var4.add(var21, -1, var22);
               int var24 = 50;
               if (Math.abs(var21) == 1 && Math.abs(var22) == 1) {
                  var24 = var3.nextInt(5);
               }

               while (var23.getY() > 50) {
                  BlockState var25 = var1.getBlockState(var23);
                  Block var26 = var25.getBlock();
                  if (!var25.isAir()
                     && !method11219(var26)
                     && var26 != Blocks.SNOW_BLOCK
                     && var26 != Blocks.ICE
                     && var26 != Blocks.PACKED_ICE) {
                     break;
                  }

                  this.method11217(var1, var23, Blocks.PACKED_ICE.getDefaultState());
                  var23 = var23.down();
                  if (--var24 <= 0) {
                     var23 = var23.method8340(var3.nextInt(5) + 1);
                     var24 = var3.nextInt(5);
                  }
               }
            }
         }

         return true;
      }
   }
}
