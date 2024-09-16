package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;

import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;

public class Class7196 extends Class7195<Class4728> {
   private final float[] field30901 = new float[1024];

   public Class7196(Codec<Class4728> var1) {
      super(var1, 256);
   }

   public boolean method22602(Random var1, int var2, int var3, Class4728 var4) {
      return var1.nextFloat() <= var4.field22399;
   }

   public boolean method22603(
           IChunk var1, Function<BlockPos, Biome> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, Class4728 var10
   ) {
      int var13 = (this.method22607() * 2 - 1) * 16;
      double var14 = (double)(var5 * 16 + var3.nextInt(16));
      double var16 = (double)(var3.nextInt(var3.nextInt(40) + 8) + 20);
      double var18 = (double)(var6 * 16 + var3.nextInt(16));
      float var20 = var3.nextFloat() * (float) (Math.PI * 2);
      float var21 = (var3.nextFloat() - 0.5F) * 2.0F / 8.0F;
      double var22 = 3.0;
      float var24 = (var3.nextFloat() * 2.0F + var3.nextFloat()) * 2.0F;
      int var25 = var13 - var3.nextInt(var13 / 4);
      boolean var26 = false;
      this.method22614(var1, var2, var3.nextLong(), var4, var7, var8, var14, var16, var18, var24, var20, var21, 0, var25, 3.0, var9);
      return true;
   }

   private void method22614(
      IChunk var1,
      Function<BlockPos, Biome> var2,
      long var3,
      int var5,
      int var6,
      int var7,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      int var17,
      int var18,
      double var19,
      BitSet var21
   ) {
      Random var24 = new Random(var3);
      float var25 = 1.0F;

      for (int var26 = 0; var26 < 256; var26++) {
         if (var26 == 0 || var24.nextInt(3) == 0) {
            var25 = 1.0F + var24.nextFloat() * var24.nextFloat();
         }

         this.field30901[var26] = var25 * var25;
      }

      float var36 = 0.0F;
      float var27 = 0.0F;

      for (int var28 = var17; var28 < var18; var28++) {
         double var29 = 1.5 + (double)(MathHelper.sin((float)var28 * (float) Math.PI / (float)var18) * var14);
         double var31 = var29 * var19;
         var29 *= (double)var24.nextFloat() * 0.25 + 0.75;
         var31 *= (double)var24.nextFloat() * 0.25 + 0.75;
         float var33 = MathHelper.cos(var16);
         float var34 = MathHelper.sin(var16);
         var8 += (double)(MathHelper.cos(var15) * var33);
         var10 += (double)var34;
         var12 += (double)(MathHelper.sin(var15) * var33);
         var16 *= 0.7F;
         var16 += var27 * 0.05F;
         var15 += var36 * 0.05F;
         var27 *= 0.8F;
         var36 *= 0.5F;
         var27 += (var24.nextFloat() - var24.nextFloat()) * var24.nextFloat() * 2.0F;
         var36 += (var24.nextFloat() - var24.nextFloat()) * var24.nextFloat() * 4.0F;
         if (var24.nextInt(4) != 0) {
            if (!this.method22613(var6, var7, var8, var12, var28, var18, var14)) {
               return;
            }

            this.method22608(var1, var2, var3, var5, var6, var7, var8, var10, var12, var29, var31, var21);
         }
      }
   }

   @Override
   public boolean method22601(double var1, double var3, double var5, int var7) {
      return (var1 * var1 + var5 * var5) * (double)this.field30901[var7 - 1] + var3 * var3 / 6.0 >= 1.0;
   }
}
