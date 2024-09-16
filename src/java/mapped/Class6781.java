package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunk;

import java.util.Random;
import java.util.stream.IntStream;

public class Class6781 extends Class6768<Class8278> {
   private static final BlockState field29573 = Blocks.field37012.method11579();
   private static final BlockState field29490 = Blocks.GRAVEL.method11579();
   private static final BlockState field29574 = Blocks.SOUL_SAND.method11579();
   public long field29575;
   public Class7689 field29576;

   public Class6781(Codec<Class8278> var1) {
      super(var1);
   }

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
      int var17 = var11;
      int var18 = var4 & 15;
      int var19 = var5 & 15;
      double var20 = 0.03125;
      boolean var22 = this.field29576.method25310((double)var4 * 0.03125, (double)var5 * 0.03125, 0.0) * 75.0 + var1.nextDouble() > 0.0;
      boolean var23 = this.field29576.method25310((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      BlockPos.Mutable var25 = new BlockPos.Mutable();
      int var26 = -1;
      BlockState var27 = var14.method28934();
      BlockState var28 = var14.method28935();

      for (int var29 = 127; var29 >= 0; var29--) {
         var25.method8372(var18, var29, var19);
         BlockState var30 = var2.getBlockState(var25);
         if (!var30.isAir()) {
            if (var30.isIn(var9.getBlock())) {
               if (var26 != -1) {
                  if (var26 > 0) {
                     var26--;
                     var2.setBlockState(var25, var28, false);
                  }
               } else {
                  boolean var31 = false;
                  if (var24 > 0) {
                     if (var29 >= var17 - 4 && var29 <= var17 + 1) {
                        var27 = var14.method28934();
                        var28 = var14.method28935();
                        if (var23) {
                           var27 = field29490;
                           var28 = var14.method28935();
                        }

                        if (var22) {
                           var27 = field29574;
                           var28 = field29574;
                        }
                     }
                  } else {
                     var31 = true;
                     var28 = var14.method28935();
                  }

                  if (var29 < var17 && var31) {
                     var27 = var10;
                  }

                  var26 = var24;
                  if (var29 < var17 - 1) {
                     var2.setBlockState(var25, var28, false);
                  } else {
                     var2.setBlockState(var25, var27, false);
                  }
               }
            }
         } else {
            var26 = -1;
         }
      }
   }

   @Override
   public void method20658(long var1) {
      if (this.field29575 != var1 || this.field29576 == null) {
         this.field29576 = new Class7689(new Class2420(var1), IntStream.rangeClosed(-3, 0));
      }

      this.field29575 = var1;
   }
}
