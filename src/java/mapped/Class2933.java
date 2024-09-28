package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;

import java.util.BitSet;
import java.util.Random;

public class Class2933 extends Class2898<Class4734> {
   public Class2933(Codec<Class4734> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4734 var5) {
      float var8 = var3.nextFloat() * (float) Math.PI;
      float var9 = (float)var5.field22423 / 8.0F;
      int var10 = MathHelper.ceil(((float)var5.field22423 / 16.0F * 2.0F + 1.0F) / 2.0F);
      double var11 = (double)var4.getX() + Math.sin((double)var8) * (double)var9;
      double var13 = (double)var4.getX() - Math.sin((double)var8) * (double)var9;
      double var15 = (double)var4.getZ() + Math.cos((double)var8) * (double)var9;
      double var17 = (double)var4.getZ() - Math.cos((double)var8) * (double)var9;
      double var20 = (double)(var4.getY() + var3.nextInt(3) - 2);
      double var22 = (double)(var4.getY() + var3.nextInt(3) - 2);
      int var24 = var4.getX() - MathHelper.ceil(var9) - var10;
      int var25 = var4.getY() - 2 - var10;
      int var26 = var4.getZ() - MathHelper.ceil(var9) - var10;
      int var27 = 2 * (MathHelper.ceil(var9) + var10);
      int var28 = 2 * (2 + var10);

      for (int var29 = var24; var29 <= var24 + var27; var29++) {
         for (int var30 = var26; var30 <= var26 + var27; var30++) {
            if (var25 <= var1.method6736(Heightmap.Type.OCEAN_FLOOR_WG, var29, var30)) {
               return this.method11270(var1, var3, var5, var11, var13, var15, var17, var20, var22, var24, var25, var26, var27, var28);
            }
         }
      }

      return false;
   }

   public boolean method11270(
      IWorld var1,
      Random var2,
      Class4734 var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      int var23 = 0;
      BitSet var24 = new BitSet(var19 * var20 * var19);
      BlockPos.Mutable var25 = new BlockPos.Mutable();
      int var26 = var3.field22423;
      double[] var27 = new double[var26 * 4];

      for (int var28 = 0; var28 < var26; var28++) {
         float var29 = (float)var28 / (float)var26;
         double var30 = MathHelper.lerp((double)var29, var4, var6);
         double var32 = MathHelper.lerp((double)var29, var12, var14);
         double var34 = MathHelper.lerp((double)var29, var8, var10);
         double var36 = var2.nextDouble() * (double)var26 / 16.0;
         double var38 = ((double)(MathHelper.sin((float) Math.PI * var29) + 1.0F) * var36 + 1.0) / 2.0;
         var27[var28 * 4 + 0] = var30;
         var27[var28 * 4 + 1] = var32;
         var27[var28 * 4 + 2] = var34;
         var27[var28 * 4 + 3] = var38;
      }

      for (int var64 = 0; var64 < var26 - 1; var64++) {
         if (!(var27[var64 * 4 + 3] <= 0.0)) {
            for (int var66 = var64 + 1; var66 < var26; var66++) {
               if (!(var27[var66 * 4 + 3] <= 0.0)) {
                  double var67 = var27[var64 * 4 + 0] - var27[var66 * 4 + 0];
                  double var68 = var27[var64 * 4 + 1] - var27[var66 * 4 + 1];
                  double var69 = var27[var64 * 4 + 2] - var27[var66 * 4 + 2];
                  double var70 = var27[var64 * 4 + 3] - var27[var66 * 4 + 3];
                  if (var70 * var70 > var67 * var67 + var68 * var68 + var69 * var69) {
                     if (!(var70 > 0.0)) {
                        var27[var64 * 4 + 3] = -1.0;
                     } else {
                        var27[var66 * 4 + 3] = -1.0;
                     }
                  }
               }
            }
         }
      }

      for (int var65 = 0; var65 < var26; var65++) {
         double var40 = var27[var65 * 4 + 3];
         if (!(var40 < 0.0)) {
            double var42 = var27[var65 * 4 + 0];
            double var44 = var27[var65 * 4 + 1];
            double var46 = var27[var65 * 4 + 2];
            int var48 = Math.max(MathHelper.floor(var42 - var40), var16);
            int var49 = Math.max(MathHelper.floor(var44 - var40), var17);
            int var50 = Math.max(MathHelper.floor(var46 - var40), var18);
            int var51 = Math.max(MathHelper.floor(var42 + var40), var48);
            int var52 = Math.max(MathHelper.floor(var44 + var40), var49);
            int var53 = Math.max(MathHelper.floor(var46 + var40), var50);

            for (int var54 = var48; var54 <= var51; var54++) {
               double var55 = ((double)var54 + 0.5 - var42) / var40;
               if (var55 * var55 < 1.0) {
                  for (int var57 = var49; var57 <= var52; var57++) {
                     double var58 = ((double)var57 + 0.5 - var44) / var40;
                     if (var55 * var55 + var58 * var58 < 1.0) {
                        for (int var60 = var50; var60 <= var53; var60++) {
                           double var61 = ((double)var60 + 0.5 - var46) / var40;
                           if (var55 * var55 + var58 * var58 + var61 * var61 < 1.0) {
                              int var63 = var54 - var16 + (var57 - var17) * var19 + (var60 - var18) * var19 * var20;
                              if (!var24.get(var63)) {
                                 var24.set(var63);
                                 var25.method8372(var54, var57, var60);
                                 if (var3.field22422.method19540(var1.getBlockState(var25), var2)) {
                                    var1.setBlockState(var25, var3.field22424, 2);
                                    var23++;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var23 > 0;
   }
}
