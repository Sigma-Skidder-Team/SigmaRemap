package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public final class NoiseChunkGenerator extends ChunkGenerator {
   public static final Codec<NoiseChunkGenerator> field24963 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class1685.field9159.fieldOf("biome_source").forGetter(var0x -> var0x.field24985),
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field24981),
               DimensionSettings.field43221.fieldOf("settings").forGetter(var0x -> var0x.field24982)
            )
            .apply(var0, var0.stable(NoiseChunkGenerator::new))
   );
   private static final float[] field24964 = Util.<float[]>make(new float[13824], var0 -> {
      for (int var3 = 0; var3 < 24; var3++) {
         for (int var4 = 0; var4 < 24; var4++) {
            for (int var5 = 0; var5 < 24; var5++) {
               var0[var3 * 24 * 24 + var4 * 24 + var5] = (float)method17805(var4 - 12, var5 - 12, var3 - 12);
            }
         }
      }
   });
   private static final float[] field24965 = Util.<float[]>make(new float[25], var0 -> {
      for (int var3 = -2; var3 <= 2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            float var5 = 10.0F / MathHelper.method37765((float)(var3 * var3 + var4 * var4) + 0.2F);
            var0[var3 + 2 + (var4 + 2) * 5] = var5;
         }
      }
   });
   private static final BlockState field24966 = Blocks.AIR.method11579();
   private final int field24967;
   private final int field24968;
   private final int field24969;
   private final int field24970;
   private final int field24971;
   public final Class2420 field24972;
   private final Class7689 field24973;
   private final Class7689 field24974;
   private final Class7689 field24975;
   private final Class7690 field24976;
   private final Class7689 field24977;
   private final Class8972 field24978;
   public final BlockState field24979;
   public final BlockState field24980;
   private final long field24981;
   public final Supplier<DimensionSettings> field24982;
   private final int field24983;

   public NoiseChunkGenerator(Class1685 var1, long var2, Supplier<DimensionSettings> var4) {
      this(var1, var1, var2, var4);
   }

   private NoiseChunkGenerator(Class1685 var1, Class1685 var2, long var3, Supplier<DimensionSettings> var5) {
      super(var1, var2, ((DimensionSettings)var5.get()).method35160(), var3);
      this.field24981 = var3;
      DimensionSettings var8 = (DimensionSettings)var5.get();
      this.field24982 = var5;
      Class9556 var9 = var8.method35161();
      this.field24983 = var9.method37010();
      this.field24967 = var9.method37015() * 4;
      this.field24968 = var9.method37014() * 4;
      this.field24979 = var8.method35162();
      this.field24980 = var8.method35163();
      this.field24969 = 16 / this.field24968;
      this.field24970 = var9.method37010() / this.field24967;
      this.field24971 = 16 / this.field24968;
      this.field24972 = new Class2420(var3);
      this.field24973 = new Class7689(this.field24972, IntStream.rangeClosed(-15, 0));
      this.field24974 = new Class7689(this.field24972, IntStream.rangeClosed(-15, 0));
      this.field24975 = new Class7689(this.field24972, IntStream.rangeClosed(-7, 0));
      this.field24976 = (Class7690)(!var9.method37018()
         ? new Class7689(this.field24972, IntStream.rangeClosed(-3, 0))
         : new Class7691(this.field24972, IntStream.rangeClosed(-3, 0)));
      this.field24972.method10369(2620);
      this.field24977 = new Class7689(this.field24972, IntStream.rangeClosed(-15, 0));
      if (!var9.method37020()) {
         this.field24978 = null;
      } else {
         Class2420 var10 = new Class2420(var3);
         var10.method10369(17292);
         this.field24978 = new Class8972(var10);
      }
   }

   @Override
   public Codec<? extends ChunkGenerator> method17790() {
      return field24963;
   }

   @Override
   public ChunkGenerator method17791(long var1) {
      return new NoiseChunkGenerator(this.field24985.method7200(var1), var1, this.field24982);
   }

   public boolean method17792(long var1, RegistryKey<DimensionSettings> var3) {
      return this.field24981 == var1 && this.field24982.get().method35168(var3);
   }

   private double method17793(int var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      double var14 = 0.0;
      double var16 = 0.0;
      double var18 = 0.0;
      boolean var20 = true;
      double var21 = 1.0;

      for (int var23 = 0; var23 < 16; var23++) {
         double var24 = Class7689.method25313((double)var1 * var4 * var21);
         double var26 = Class7689.method25313((double)var2 * var6 * var21);
         double var28 = Class7689.method25313((double)var3 * var4 * var21);
         double var30 = var6 * var21;
         Class8718 var32 = this.field24973.method25312(var23);
         if (var32 != null) {
            var14 += var32.method31444(var24, var26, var28, var30, (double)var2 * var30) / var21;
         }

         Class8718 var33 = this.field24974.method25312(var23);
         if (var33 != null) {
            var16 += var33.method31444(var24, var26, var28, var30, (double)var2 * var30) / var21;
         }

         if (var23 < 8) {
            Class8718 var34 = this.field24975.method25312(var23);
            if (var34 != null) {
               var18 += var34.method31444(
                     Class7689.method25313((double)var1 * var8 * var21),
                     Class7689.method25313((double)var2 * var10 * var21),
                     Class7689.method25313((double)var3 * var8 * var21),
                     var10 * var21,
                     (double)var2 * var10 * var21
                  )
                  / var21;
            }
         }

         var21 /= 2.0;
      }

      return MathHelper.method37779(var14 / 512.0, var16 / 512.0, (var18 / 10.0 + 1.0) / 2.0);
   }

   private double[] method17794(int var1, int var2) {
      double[] var5 = new double[this.field24970 + 1];
      this.method17795(var5, var1, var2);
      return var5;
   }

   private void method17795(double[] var1, int var2, int var3) {
      Class9556 var6 = this.field24982.get().method35161();
      double var14;
      double var16;
      if (this.field24978 == null) {
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = 0.0F;
         int var10 = 2;
         int var11 = this.method17807();
         float var12 = this.field24985.method7005(var2, var11, var3).method32515();

         for (int var13 = -2; var13 <= 2; var13++) {
            for (int var18 = -2; var18 <= 2; var18++) {
               Biome var23 = this.field24985.method7005(var2 + var13, var11, var3 + var18);
               float var24 = var23.method32515();
               float var25 = var23.method32517();
               float var26;
               float var27;
               if (var6.method37021() && var24 > 0.0F) {
                  var26 = 1.0F + var24 * 2.0F;
                  var27 = 1.0F + var25 * 4.0F;
               } else {
                  var26 = var24;
                  var27 = var25;
               }

               float var28 = !(var24 > var12) ? 1.0F : 0.5F;
               float var29 = var28 * field24965[var13 + 2 + (var18 + 2) * 5] / (var26 + 2.0F);
               var7 += var27 * var29;
               var8 += var26 * var29;
               var9 += var29;
            }
         }

         float var63 = var8 / var9;
         float var64 = var7 / var9;
         double var19 = (double)(var63 * 0.5F - 0.125F);
         double var21 = (double)(var64 * 0.9F + 0.1F);
         var14 = var19 * 0.265625;
         var16 = 96.0 / var21;
      } else {
         var14 = (double)(EndBiomeProvider.method7237(this.field24978, var2, var3) - 8.0F);
         if (!(var14 > 0.0)) {
            var16 = 1.0;
         } else {
            var16 = 0.25;
         }
      }

      double var30 = 684.412 * var6.method37011().method30550();
      double var32 = 684.412 * var6.method37011().method30551();
      double var34 = var30 / var6.method37011().method30552();
      double var36 = var32 / var6.method37011().method30553();
      double var65 = (double)var6.method37012().method28511();
      double var66 = (double)var6.method37012().method28512();
      double var38 = (double)var6.method37012().method28513();
      double var40 = (double)var6.method37013().method28511();
      double var42 = (double)var6.method37013().method28512();
      double var44 = (double)var6.method37013().method28513();
      double var46 = !var6.method37019() ? 0.0 : this.method17796(var2, var3);
      double var48 = var6.method37016();
      double var50 = var6.method37017();

      for (int var52 = 0; var52 <= this.field24970; var52++) {
         double var53 = this.method17793(var2, var52, var3, var30, var32, var34, var36);
         double var55 = 1.0 - (double)var52 * 2.0 / (double)this.field24970 + var46;
         double var57 = var55 * var48 + var50;
         double var59 = (var57 + var14) * var16;
         if (!(var59 > 0.0)) {
            var53 += var59;
         } else {
            var53 += var59 * 4.0;
         }

         if (var66 > 0.0) {
            double var61 = ((double)(this.field24970 - var52) - var38) / var66;
            var53 = MathHelper.method37779(var65, var53, var61);
         }

         if (var42 > 0.0) {
            double var68 = ((double)var52 - var44) / var42;
            var53 = MathHelper.method37779(var40, var53, var68);
         }

         var1[var52] = var53;
      }
   }

   private double method17796(int var1, int var2) {
      double var5 = this.field24977.method25311((double)(var1 * 200), 10.0, (double)(var2 * 200), 1.0, 0.0, true);
      double var7;
      if (!(var5 < 0.0)) {
         var7 = var5;
      } else {
         var7 = -var5 * 0.3;
      }

      double var9 = var7 * 24.575625 - 2.0;
      return !(var9 < 0.0) ? Math.min(var9, 1.0) * 0.006640625 : var9 * 0.009486607142857142;
   }

   @Override
   public int method17797(int var1, int var2, Class101 var3) {
      return this.method17799(var1, var2, (BlockState[])null, var3.method287());
   }

   @Override
   public Class1665 method17798(int var1, int var2) {
      BlockState[] var5 = new BlockState[this.field24970 * this.field24967];
      this.method17799(var1, var2, var5, (Predicate<BlockState>)null);
      return new Class1669(var5);
   }

   private int method17799(int var1, int var2, BlockState[] var3, Predicate<BlockState> var4) {
      int var7 = Math.floorDiv(var1, this.field24968);
      int var8 = Math.floorDiv(var2, this.field24968);
      int var9 = Math.floorMod(var1, this.field24968);
      int var10 = Math.floorMod(var2, this.field24968);
      double var11 = (double)var9 / (double)this.field24968;
      double var13 = (double)var10 / (double)this.field24968;
      double[][] var15 = new double[][]{
         this.method17794(var7, var8), this.method17794(var7, var8 + 1), this.method17794(var7 + 1, var8), this.method17794(var7 + 1, var8 + 1)
      };

      for (int var16 = this.field24970 - 1; var16 >= 0; var16--) {
         double var17 = var15[0][var16];
         double var19 = var15[1][var16];
         double var21 = var15[2][var16];
         double var23 = var15[3][var16];
         double var25 = var15[0][var16 + 1];
         double var27 = var15[1][var16 + 1];
         double var29 = var15[2][var16 + 1];
         double var31 = var15[3][var16 + 1];

         for (int var33 = this.field24967 - 1; var33 >= 0; var33--) {
            double var34 = (double)var33 / (double)this.field24967;
            double var36 = MathHelper.method37824(var34, var11, var13, var17, var25, var21, var29, var19, var27, var23, var31);
            int var38 = var16 * this.field24967 + var33;
            BlockState var39 = this.method17800(var36, var38);
            if (var3 != null) {
               var3[var38] = var39;
            }

            if (var4 != null && var4.test(var39)) {
               return var38 + 1;
            }
         }
      }

      return 0;
   }

   public BlockState method17800(double var1, int var3) {
      BlockState var6;
      if (!(var1 > 0.0)) {
         if (var3 >= this.method17807()) {
            var6 = field24966;
         } else {
            var6 = this.field24980;
         }
      } else {
         var6 = this.field24979;
      }

      return var6;
   }

   @Override
   public void method17801(Class1691 var1, IChunk var2) {
      Class7481 var5 = var2.method7072();
      int var6 = var5.field32174;
      int var7 = var5.field32175;
      Class2420 var8 = new Class2420();
      var8.method10370(var6, var7);
      Class7481 var9 = var2.method7072();
      int var10 = var9.method24356();
      int var11 = var9.method24357();
      double var12 = 0.0625;
      Mutable var14 = new Mutable();

      for (int var15 = 0; var15 < 16; var15++) {
         for (int var16 = 0; var16 < 16; var16++) {
            int var17 = var10 + var15;
            int var18 = var11 + var16;
            int var19 = var2.method7071(Class101.field295, var15, var16) + 1;
            double var20 = this.field24976.method25314((double)var17 * 0.0625, (double)var18 * 0.0625, 0.0625, (double)var15 * 0.0625) * 15.0;
            var1.getBiome(var14.method8372(var10 + var15, var19, var11 + var16))
               .method32514(var8, var2, var17, var18, var19, var20, this.field24979, this.field24980, this.method17807(), var1.method6967());
         }
      }

      this.method17802(var2, var8);
   }

   private void method17802(IChunk var1, Random var2) {
      Mutable var5 = new Mutable();
      int var6 = var1.method7072().method24356();
      int var7 = var1.method7072().method24357();
      DimensionSettings var8 = this.field24982.get();
      int var9 = var8.method35165();
      int var10 = this.field24983 - 1 - var8.method35164();
      int var11 = 5;
      boolean var12 = var10 + 4 >= 0 && var10 < this.field24983;
      boolean var13 = var9 + 4 >= 0 && var9 < this.field24983;
      if (var12 || var13) {
         for (BlockPos var15 : BlockPos.method8364(var6, 0, var7, var6 + 15, 0, var7 + 15)) {
            if (var12) {
               for (int var16 = 0; var16 < 5; var16++) {
                  if (var16 <= var2.nextInt(5)) {
                     var1.setBlockState(var5.method8372(var15.getX(), var10 - var16, var15.getZ()), Blocks.BEDROCK.method11579(), false);
                  }
               }
            }

            if (var13) {
               for (int var17 = 4; var17 >= 0; var17--) {
                  if (var17 <= var2.nextInt(5)) {
                     var1.setBlockState(var5.method8372(var15.getX(), var9 + var17, var15.getZ()), Blocks.BEDROCK.method11579(), false);
                  }
               }
            }
         }
      }
   }

   @Override
   public void method17803(Class1660 var1, Class7480 var2, IChunk var3) {
      ObjectArrayList var6 = new ObjectArrayList(10);
      ObjectArrayList var7 = new ObjectArrayList(32);
      Class7481 var8 = var3.method7072();
      int var9 = var8.field32174;
      int var10 = var8.field32175;
      int var11 = var9 << 4;
      int var12 = var10 << 4;

      for (Structure var14 : Structure.field18076) {
         var2.method24340(Class2002.method8391(var8, 0), var14).forEach(var5 -> {
            for (Class4178 var9x : var5.method17111()) {
               if (var9x.method12917(var8, 12)) {
                  if (!(var9x instanceof Class4193)) {
                     var6.add(var9x);
                  } else {
                     Class4193 var10x = (Class4193)var9x;
                     Class109 var11x = var10x.method12977().method24382();
                     if (var11x == Class109.field367) {
                        var6.add(var10x);
                     }

                     for (Class3637 var13 : var10x.method12981()) {
                        int var14x = var13.method12345();
                        int var15x = var13.method12347();
                        if (var14x > var11 - 12 && var15x > var12 - 12 && var14x < var11 + 15 + 12 && var15x < var12 + 15 + 12) {
                           var7.add(var13);
                        }
                     }
                  }
               }
            }
         });
      }

      double[][][] var77 = new double[2][this.field24971 + 1][this.field24970 + 1];

      for (int var78 = 0; var78 < this.field24971 + 1; var78++) {
         var77[0][var78] = new double[this.field24970 + 1];
         this.method17795(var77[0][var78], var9 * this.field24969, var10 * this.field24971 + var78);
         var77[1][var78] = new double[this.field24970 + 1];
      }

      Class1672 var79 = (Class1672)var3;
      Class7527 var15 = var79.method7070(Class101.field297);
      Class7527 var16 = var79.method7070(Class101.field295);
      Mutable var17 = new Mutable();
      ObjectListIterator var18 = var6.iterator();
      ObjectListIterator var19 = var7.iterator();

      for (int var20 = 0; var20 < this.field24969; var20++) {
         for (int var21 = 0; var21 < this.field24971 + 1; var21++) {
            this.method17795(var77[1][var21], var9 * this.field24969 + var20 + 1, var10 * this.field24971 + var21);
         }

         for (int var80 = 0; var80 < this.field24971; var80++) {
            Class7038 var22 = var79.method7106(15);
            var22.method21854();

            for (int var23 = this.field24970 - 1; var23 >= 0; var23--) {
               double var24 = var77[0][var80][var23];
               double var26 = var77[0][var80 + 1][var23];
               double var28 = var77[1][var80][var23];
               double var30 = var77[1][var80 + 1][var23];
               double var32 = var77[0][var80][var23 + 1];
               double var34 = var77[0][var80 + 1][var23 + 1];
               double var36 = var77[1][var80][var23 + 1];
               double var38 = var77[1][var80 + 1][var23 + 1];

               for (int var40 = this.field24967 - 1; var40 >= 0; var40--) {
                  int var41 = var23 * this.field24967 + var40;
                  int var42 = var41 & 15;
                  int var43 = var41 >> 4;
                  if (var22.method21863() >> 4 != var43) {
                     var22.method21855();
                     var22 = var79.method7106(var43);
                     var22.method21854();
                  }

                  double var44 = (double)var40 / (double)this.field24967;
                  double var46 = MathHelper.method37822(var44, var24, var32);
                  double var48 = MathHelper.method37822(var44, var28, var36);
                  double var50 = MathHelper.method37822(var44, var26, var34);
                  double var52 = MathHelper.method37822(var44, var30, var38);

                  for (int var54 = 0; var54 < this.field24968; var54++) {
                     int var55 = var11 + var20 * this.field24968 + var54;
                     int var56 = var55 & 15;
                     double var57 = (double)var54 / (double)this.field24968;
                     double var59 = MathHelper.method37822(var57, var46, var48);
                     double var61 = MathHelper.method37822(var57, var50, var52);

                     for (int var63 = 0; var63 < this.field24968; var63++) {
                        int var64 = var12 + var80 * this.field24968 + var63;
                        int var65 = var64 & 15;
                        double var66 = (double)var63 / (double)this.field24968;
                        double var68 = MathHelper.method37822(var66, var59, var61);
                        double var70 = MathHelper.method37778(var68 / 200.0, -1.0, 1.0);
                        var70 = var70 / 2.0 - var70 * var70 * var70 / 24.0;

                        while (var18.hasNext()) {
                           Class4178 var72 = (Class4178)var18.next();
                           Class9764 var73 = var72.method12915();
                           int var74 = Math.max(0, Math.max(var73.field45678 - var55, var55 - var73.field45681));
                           int var75 = var41 - (var73.field45679 + (!(var72 instanceof Class4193) ? 0 : ((Class4193)var72).method12979()));
                           int var76 = Math.max(0, Math.max(var73.field45680 - var64, var64 - var73.field45683));
                           var70 += method17804(var74, var75, var76) * 0.8;
                        }

                        var18.back(var6.size());

                        while (var19.hasNext()) {
                           Class3637 var83 = (Class3637)var19.next();
                           int var85 = var55 - var83.method12345();
                           int var86 = var41 - var83.method12346();
                           int var87 = var64 - var83.method12347();
                           var70 += method17804(var85, var86, var87) * 0.4;
                        }

                        var19.back(var7.size());
                        BlockState var84 = this.method17800(var70, var41);
                        if (var84 != field24966) {
                           if (var84.getLightValue() != 0) {
                              var17.method8372(var55, var41, var64);
                              var79.method7105(var17);
                           }

                           var22.method21857(var56, var42, var65, var84, false);
                           var15.method24578(var56, var41, var65, var84);
                           var16.method24578(var56, var41, var65, var84);
                        }
                     }
                  }
               }
            }

            var22.method21855();
         }

         double[][] var81 = var77[0];
         var77[0] = var77[1];
         var77[1] = var81;
      }
   }

   private static double method17804(int var0, int var1, int var2) {
      int var5 = var0 + 12;
      int var6 = var1 + 12;
      int var7 = var2 + 12;
      if (var5 < 0 || var5 >= 24) {
         return 0.0;
      } else if (var6 >= 0 && var6 < 24) {
         return var7 >= 0 && var7 < 24 ? (double)field24964[var7 * 24 * 24 + var5 * 24 + var6] : 0.0;
      } else {
         return 0.0;
      }
   }

   private static double method17805(int var0, int var1, int var2) {
      double var5 = (double)(var0 * var0 + var2 * var2);
      double var7 = (double)var1 + 0.5;
      double var9 = var7 * var7;
      double var11 = Math.pow(Math.E, -(var9 / 16.0 + var5 / 16.0));
      double var13 = -var7 * MathHelper.method37816(var9 / 2.0 + var5 / 2.0) / 2.0;
      return var13 * var11;
   }

   @Override
   public int method17806() {
      return this.field24983;
   }

   @Override
   public int method17807() {
      return this.field24982.get().method35166();
   }

   @Override
   public List<Class6692> method17808(Biome var1, Class7480 var2, Class179 var3, BlockPos var4) {
      if (var2.method24345(var4, true, Structure.field18066).method17117()) {
         if (var3 == Class179.field623) {
            return Structure.field18066.method11374();
         }

         if (var3 == Class179.field624) {
            return Structure.field18066.method11375();
         }
      }

      if (var3 == Class179.field623) {
         if (var2.method24345(var4, false, Structure.field18058).method17117()) {
            return Structure.field18058.method11374();
         }

         if (var2.method24345(var4, false, Structure.field18068).method17117()) {
            return Structure.field18068.method11374();
         }

         if (var2.method24345(var4, true, Structure.field18070).method17117()) {
            return Structure.field18070.method11374();
         }
      }

      return super.method17808(var1, var2, var3, var4);
   }

   @Override
   public void method17809(Class1691 var1) {
      if (!this.field24982.get().method35167()) {
         int var4 = var1.method7241();
         int var5 = var1.method7242();
         Biome var6 = var1.getBiome(new Class7481(var4, var5).method24364());
         Class2420 var7 = new Class2420();
         var7.method10371(var1.method6967(), var4 << 4, var5 << 4);
         Class8170.method28430(var1, var6, var4, var5, var7);
      }
   }
}