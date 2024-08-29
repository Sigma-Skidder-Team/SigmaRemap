package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2927 extends Class2898<Class4709> {
   public Class2927(Codec<Class4709> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4709 var5) {
      Block var8 = var5.field22337.getBlock();
      BlockPos var9 = null;
      Block var10 = var1.getBlockState(var4.down()).getBlock();
      if (var10 == var8) {
         var9 = var4;
      }

      if (var9 == null) {
         return false;
      } else {
         int var11 = MathHelper.method37782(var3, 4, 13);
         if (var3.nextInt(12) == 0) {
            var11 *= 2;
         }

         if (!var5.field22341) {
            int var12 = var2.method17806();
            if (var9.getY() + var11 + 1 >= var12) {
               return false;
            }
         }

         boolean var13 = !var5.field22341 && var3.nextFloat() < 0.06F;
         var1.setBlockState(var4, Blocks.AIR.method11579(), 4);
         this.method11258(var1, var3, var5, var9, var11, var13);
         this.method11259(var1, var3, var5, var9, var11, var13);
         return true;
      }
   }

   private static boolean method11257(Class1660 var0, BlockPos var1, boolean var2) {
      return var0.method6815(var1, var1x -> {
         Class8649 var4 = var1x.method23384();
         return var1x.method23384().method31089() || var2 && var4 == Class8649.field38936;
      });
   }

   private void method11258(Class1660 var1, Random var2, Class4709 var3, BlockPos var4, int var5, boolean var6) {
      Mutable var9 = new Mutable();
      BlockState var10 = var3.field22338;
      int var11 = !var6 ? 0 : 1;

      for (int var12 = -var11; var12 <= var11; var12++) {
         for (int var13 = -var11; var13 <= var11; var13++) {
            boolean var14 = var6 && MathHelper.method37772(var12) == var11 && MathHelper.method37772(var13) == var11;

            for (int var15 = 0; var15 < var5; var15++) {
               var9.method8378(var4, var12, var15, var13);
               if (method11257(var1, var9, true)) {
                  if (!var3.field22341) {
                     if (!var14) {
                        this.method11217(var1, var9, var10);
                     } else if (var2.nextFloat() < 0.1F) {
                        this.method11217(var1, var9, var10);
                     }
                  } else {
                     if (!var1.getBlockState(var9.down()).isAir()) {
                        var1.method7179(var9, true);
                     }

                     var1.setBlockState(var9, var10, 3);
                  }
               }
            }
         }
      }
   }

   private void method11259(Class1660 var1, Random var2, Class4709 var3, BlockPos var4, int var5, boolean var6) {
      Mutable var9 = new Mutable();
      boolean var10 = var3.field22339.method23448(Blocks.field36891);
      int var11 = Math.min(var2.nextInt(1 + var5 / 3) + 5, var5);
      int var12 = var5 - var11;

      for (int var13 = var12; var13 <= var5; var13++) {
         int var14 = var13 >= var5 - var2.nextInt(3) ? 1 : 2;
         if (var11 > 8 && var13 < var12 + 4) {
            var14 = 3;
         }

         if (var6) {
            var14++;
         }

         for (int var15 = -var14; var15 <= var14; var15++) {
            for (int var16 = -var14; var16 <= var14; var16++) {
               boolean var17 = var15 == -var14 || var15 == var14;
               boolean var18 = var16 == -var14 || var16 == var14;
               boolean var19 = !var17 && !var18 && var13 != var5;
               boolean var20 = var17 && var18;
               boolean var21 = var13 < var12 + 3;
               var9.method8378(var4, var15, var13, var16);
               if (method11257(var1, var9, false)) {
                  if (var3.field22341 && !var1.getBlockState(var9.down()).isAir()) {
                     var1.method7179(var9, true);
                  }

                  if (!var21) {
                     if (!var19) {
                        if (!var20) {
                           this.method11260(var1, var2, var3, var9, 5.0E-4F, 0.98F, !var10 ? 0.0F : 0.07F);
                        } else {
                           this.method11260(var1, var2, var3, var9, 0.01F, 0.7F, !var10 ? 0.0F : 0.083F);
                        }
                     } else {
                        this.method11260(var1, var2, var3, var9, 0.1F, 0.2F, !var10 ? 0.0F : 0.1F);
                     }
                  } else if (!var19) {
                     this.method11261(var1, var2, var9, var3.field22339, var10);
                  }
               }
            }
         }
      }
   }

   private void method11260(Class1660 var1, Random var2, Class4709 var3, Mutable var4, float var5, float var6, float var7) {
      if (!(var2.nextFloat() < var5)) {
         if (var2.nextFloat() < var6) {
            this.method11217(var1, var4, var3.field22339);
            if (var2.nextFloat() < var7) {
               method11262(var4, var1, var2);
            }
         }
      } else {
         this.method11217(var1, var4, var3.field22340);
      }
   }

   private void method11261(Class1660 var1, Random var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.getBlockState(var3.down()).method23448(var4.getBlock())) {
         if ((double)var2.nextFloat() < 0.15) {
            this.method11217(var1, var3, var4);
            if (var5 && var2.nextInt(11) == 0) {
               method11262(var3, var1, var2);
            }
         }
      } else {
         this.method11217(var1, var3, var4);
      }
   }

   private static void method11262(BlockPos var0, Class1660 var1, Random var2) {
      Mutable var5 = var0.method8354().method8379(Direction.DOWN);
      if (var1.method7007(var5)) {
         int var6 = MathHelper.method37782(var2, 1, 5);
         if (var2.nextInt(7) == 0) {
            var6 *= 2;
         }

         byte var7 = 23;
         byte var8 = 25;
         Class2949.method11291(var1, var2, var5, var6, 23, 25);
      }
   }
}
