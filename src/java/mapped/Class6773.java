package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Class6773 extends Class6768<Class8278> {
   private static final BlockState field29495 = Blocks.field36730.method11579();
   private static final BlockState field29549 = Blocks.field36731.method11579();
   private static final BlockState field29550 = Blocks.field36794.method11579();
   private static final BlockState field29551 = Blocks.field36734.method11579();
   private static final BlockState field29552 = Blocks.field36742.method11579();
   private static final BlockState field29553 = Blocks.field36744.method11579();
   private static final BlockState field29554 = Blocks.field36738.method11579();
   public BlockState[] field29555;
   public long field29556;
   public Class7691 field29557;
   public Class7691 field29558;
   public Class7691 field29559;

   public Class6773(Codec<Class8278> var1) {
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
      Mutable var29 = new Mutable();

      for (int var30 = var6; var30 >= 0; var30--) {
         if (var28 < 15) {
            var29.method8372(var17, var30, var18);
            BlockState var31 = var2.getBlockState(var29);
            if (!var31.isAir()) {
               if (var31.method23448(var9.getBlock())) {
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
                        Block var33 = var23.getBlock();
                        if (var33 == Blocks.field36730
                           || var33 == Blocks.field36731
                           || var33 == Blocks.field36732
                           || var33 == Blocks.field36733
                           || var33 == Blocks.field36734
                           || var33 == Blocks.field36735
                           || var33 == Blocks.field36736
                           || var33 == Blocks.field36737
                           || var33 == Blocks.field36738
                           || var33 == Blocks.field36739
                           || var33 == Blocks.field36740
                           || var33 == Blocks.field36741
                           || var33 == Blocks.field36742
                           || var33 == Blocks.field36743
                           || var33 == Blocks.field36744
                           || var33 == Blocks.field36745) {
                           var2.setBlockState(var29, field29549, false);
                        }
                     } else if (var30 <= var11 + 3 + var24) {
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
                  }

                  var28++;
               }
            } else {
               var26 = -1;
            }
         }
      }
   }

   @Override
   public void method20658(long var1) {
      if (this.field29556 != var1 || this.field29555 == null) {
         this.method20659(var1);
      }

      if (this.field29556 != var1 || this.field29557 == null || this.field29558 == null) {
         Class2420 var5 = new Class2420(var1);
         this.field29557 = new Class7691(var5, IntStream.rangeClosed(-3, 0));
         this.field29558 = new Class7691(var5, ImmutableList.of(0));
      }

      this.field29556 = var1;
   }

   public void method20659(long var1) {
      this.field29555 = new BlockState[64];
      Arrays.fill(this.field29555, field29550);
      Class2420 var5 = new Class2420(var1);
      this.field29559 = new Class7691(var5, ImmutableList.of(0));

      for (int var14 = 0; var14 < 64; var14++) {
         var14 += var5.nextInt(5) + 1;
         if (var14 < 64) {
            this.field29555[var14] = field29549;
         }
      }

      int var15 = var5.nextInt(4) + 2;

      for (int var7 = 0; var7 < var15; var7++) {
         int var8 = var5.nextInt(3) + 1;
         int var9 = var5.nextInt(64);

         for (int var10 = 0; var9 + var10 < 64 && var10 < var8; var10++) {
            this.field29555[var9 + var10] = field29551;
         }
      }

      int var16 = var5.nextInt(4) + 2;

      for (int var17 = 0; var17 < var16; var17++) {
         int var19 = var5.nextInt(3) + 2;
         int var22 = var5.nextInt(64);

         for (int var11 = 0; var22 + var11 < 64 && var11 < var19; var11++) {
            this.field29555[var22 + var11] = field29552;
         }
      }

      int var18 = var5.nextInt(4) + 2;

      for (int var20 = 0; var20 < var18; var20++) {
         int var23 = var5.nextInt(3) + 1;
         int var25 = var5.nextInt(64);

         for (int var12 = 0; var25 + var12 < 64 && var12 < var23; var12++) {
            this.field29555[var25 + var12] = field29553;
         }
      }

      int var21 = var5.nextInt(3) + 3;
      int var24 = 0;

      for (int var26 = 0; var26 < var21; var26++) {
         boolean var27 = true;
         var24 += var5.nextInt(16) + 4;

         for (int var13 = 0; var24 + var13 < 64 && var13 < 1; var13++) {
            this.field29555[var24 + var13] = field29495;
            if (var24 + var13 > 1 && var5.nextBoolean()) {
               this.field29555[var24 + var13 - 1] = field29554;
            }

            if (var24 + var13 < 63 && var5.nextBoolean()) {
               this.field29555[var24 + var13 + 1] = field29554;
            }
         }
      }
   }

   public BlockState method20660(int var1, int var2, int var3) {
      int var6 = (int)Math.round(this.field29559.method25315((double)var1 / 512.0, (double)var3 / 512.0, false) * 2.0);
      return this.field29555[(var2 + var6 + 64) % 64];
   }
}
