package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class6775 extends Class6773 {
   private static final BlockState field29495 = Blocks.field36730.method11579();
   private static final BlockState field29549 = Blocks.field36731.method11579();
   private static final BlockState field29550 = Blocks.field36794.method11579();

   public Class6775(Codec<Class8278> var1) {
      super(var1);
   }

   @Override
   public void method20654(
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
      int var17 = var4 & 15;
      int var18 = var5 & 15;
      BlockState var19 = field29495;
      Class8277 var20 = var3.method32507().method24283();
      BlockState var21 = var20.method28935();
      BlockState var22 = var20.method28934();
      BlockState var23 = var21;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var25 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var26 = -1;
      boolean var27 = false;
      int var28 = 0;
      BlockPos.Mutable var29 = new BlockPos.Mutable();

      for (int var30 = var6; var30 >= 0; var30--) {
         if (var28 < 15) {
            var29.method8372(var17, var30, var18);
            BlockState var31 = var2.getBlockState(var29);
            if (!var31.isAir()) {
               if (var31.isIn(var9.getBlock())) {
                  if (var26 != -1) {
                     if (var26 > 0) {
                        var26--;
                        if (!var27) {
                           var2.setBlockState(var29, this.method20660(var4, var30, var5), false);
                        } else {
                           var2.setBlockState(var29, field29549, false);
                        }
                     }
                  } else {
                     var27 = false;
                     if (var24 > 0) {
                        if (var30 >= var11 - 4 && var30 <= var11 + 1) {
                           var19 = field29495;
                           var23 = var21;
                        }
                     } else {
                        var19 = Blocks.AIR.method11579();
                        var23 = var9;
                     }

                     if (var30 < var11 && (var19 == null || var19.isAir())) {
                        var19 = var10;
                     }

                     var26 = var24 + Math.max(0, var30 - var11);
                     if (var30 < var11 - 1) {
                        var2.setBlockState(var29, var23, false);
                        if (var23 == field29495) {
                           var2.setBlockState(var29, field29549, false);
                        }
                     } else if (var30 <= 86 + var24 * 2) {
                        if (var30 <= var11 + 3 + var24) {
                           var2.setBlockState(var29, var22, false);
                           var27 = true;
                        } else {
                           BlockState var32;
                           if (var30 < 64 || var30 > 127) {
                              var32 = field29549;
                           } else if (!var25) {
                              var32 = this.method20660(var4, var30, var5);
                           } else {
                              var32 = field29550;
                           }

                           var2.setBlockState(var29, var32, false);
                        }
                     } else if (!var25) {
                        var2.setBlockState(var29, Blocks.field36395.method11579(), false);
                     } else {
                        var2.setBlockState(var29, Blocks.field36397.method11579(), false);
                     }
                  }

                  var28++;
               }
            } else {
               var26 = -1;
            }
         }
      }
   }
}
