package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunk;

import java.util.Random;

public class Class6774 extends Class6773 {
   private static final BlockState field29495 = Blocks.field36730.method11579();
   private static final BlockState field29549 = Blocks.field36731.method11579();
   private static final BlockState field29550 = Blocks.field36794.method11579();

   public Class6774(Codec<Class8278> var1) {
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
      double var17 = 0.0;
      double var19 = Math.min(Math.abs(var7), this.field29557.method25315((double)var4 * 0.25, (double)var5 * 0.25, false) * 15.0);
      if (var19 > 0.0) {
         double var29 = 0.001953125;
         double var31 = Math.abs(this.field29558.method25315((double)var4 * 0.001953125, (double)var5 * 0.001953125, false));
         var17 = var19 * var19 * 2.5;
         double var33 = Math.ceil(var31 * 50.0) + 14.0;
         if (var17 > var33) {
            var17 = var33;
         }

         var17 += 64.0;
      }

      int var21 = var4 & 15;
      int var22 = var5 & 15;
      BlockState var23 = field29495;
      Class8277 var24 = var3.method32507().method24283();
      BlockState var25 = var24.method28935();
      BlockState var26 = var24.method28934();
      BlockState var27 = var25;
      int var28 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var35 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var36 = -1;
      boolean var37 = false;
      BlockPos.Mutable var38 = new BlockPos.Mutable();

      for (int var39 = Math.max(var6, (int)var17 + 1); var39 >= 0; var39--) {
         var38.method8372(var21, var39, var22);
         if (var2.getBlockState(var38).isAir() && var39 < (int)var17) {
            var2.setBlockState(var38, var9, false);
         }

         BlockState var40 = var2.getBlockState(var38);
         if (!var40.isAir()) {
            if (var40.isIn(var9.getBlock())) {
               if (var36 != -1) {
                  if (var36 > 0) {
                     var36--;
                     if (!var37) {
                        var2.setBlockState(var38, this.method20660(var4, var39, var5), false);
                     } else {
                        var2.setBlockState(var38, field29549, false);
                     }
                  }
               } else {
                  var37 = false;
                  if (var28 > 0) {
                     if (var39 >= var11 - 4 && var39 <= var11 + 1) {
                        var23 = field29495;
                        var27 = var25;
                     }
                  } else {
                     var23 = Blocks.AIR.method11579();
                     var27 = var9;
                  }

                  if (var39 < var11 && (var23 == null || var23.isAir())) {
                     var23 = var10;
                  }

                  var36 = var28 + Math.max(0, var39 - var11);
                  if (var39 < var11 - 1) {
                     var2.setBlockState(var38, var27, false);
                     Block var41 = var27.getBlock();
                     if (var41 == Blocks.field36730
                        || var41 == Blocks.field36731
                        || var41 == Blocks.field36732
                        || var41 == Blocks.field36733
                        || var41 == Blocks.field36734
                        || var41 == Blocks.field36735
                        || var41 == Blocks.field36736
                        || var41 == Blocks.field36737
                        || var41 == Blocks.field36738
                        || var41 == Blocks.field36739
                        || var41 == Blocks.field36740
                        || var41 == Blocks.field36741
                        || var41 == Blocks.field36742
                        || var41 == Blocks.field36743
                        || var41 == Blocks.field36744
                        || var41 == Blocks.field36745) {
                        var2.setBlockState(var38, field29549, false);
                     }
                  } else if (var39 > var11 + 3 + var28) {
                     BlockState var43;
                     if (var39 < 64 || var39 > 127) {
                        var43 = field29549;
                     } else if (!var35) {
                        var43 = this.method20660(var4, var39, var5);
                     } else {
                        var43 = field29550;
                     }

                     var2.setBlockState(var38, var43, false);
                  } else {
                     var2.setBlockState(var38, var26, false);
                     var37 = true;
                  }
               }
            }
         } else {
            var36 = -1;
         }
      }
   }
}
