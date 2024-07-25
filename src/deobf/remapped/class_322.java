package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public final class class_322 extends class_6541 {
   public static final Codec<class_322> field_1204 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_3498.field_17161.fieldOf("biome_source").forGetter(var0x -> var0x.field_33263),
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field_1184),
               class_7902.field_40400.fieldOf("settings").forGetter(var0x -> var0x.field_1186)
            )
            .apply(var0, var0.stable(class_322::new))
   );
   private static final float[] field_1188 = Util.<float[]>method_44659(new float[13824], var0 -> {
      for (int var3 = 0; var3 < 24; var3++) {
         for (int var4 = 0; var4 < 24; var4++) {
            for (int var5 = 0; var5 < 24; var5++) {
               var0[var3 * 24 * 24 + var4 * 24 + var5] = (float)method_1508(var4 - 12, var5 - 12, var3 - 12);
            }
         }
      }
   });
   private static final float[] field_1203 = Util.<float[]>method_44659(new float[25], var0 -> {
      for (int var3 = -2; var3 <= 2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            float var5 = 10.0F / class_9299.method_42843((float)(var3 * var3 + var4 * var4) + 0.2F);
            var0[var3 + 2 + (var4 + 2) * 5] = var5;
         }
      }
   });
   private static final class_2522 field_1189 = class_4783.field_23184.method_29260();
   private final int field_1196;
   private final int field_1202;
   private final int field_1195;
   private final int field_1201;
   private final int field_1192;
   public final class_8679 field_1190;
   private final class_2439 field_1198;
   private final class_2439 field_1197;
   private final class_2439 field_1205;
   private final class_5580 field_1193;
   private final class_2439 field_1187;
   private final class_6567 field_1199;
   public final class_2522 field_1191;
   public final class_2522 field_1200;
   private final long field_1184;
   public final Supplier<class_7902> field_1186;
   private final int field_1194;

   public class_322(class_3498 var1, long var2, Supplier<class_7902> var4) {
      this(var1, var1, var2, var4);
   }

   private class_322(class_3498 var1, class_3498 var2, long var3, Supplier<class_7902> var5) {
      super(var1, var2, ((class_7902)var5.get()).method_35726(), var3);
      this.field_1184 = var3;
      class_7902 var8 = (class_7902)var5.get();
      this.field_1186 = var5;
      class_8822 var9 = var8.method_35723();
      this.field_1194 = var9.method_40516();
      this.field_1196 = var9.method_40521() * 4;
      this.field_1202 = var9.method_40511() * 4;
      this.field_1191 = var8.method_35722();
      this.field_1200 = var8.method_35728();
      this.field_1195 = 16 / this.field_1202;
      this.field_1201 = var9.method_40516() / this.field_1196;
      this.field_1192 = 16 / this.field_1202;
      this.field_1190 = new class_8679(var3);
      this.field_1198 = new class_2439(this.field_1190, IntStream.rangeClosed(-15, 0));
      this.field_1197 = new class_2439(this.field_1190, IntStream.rangeClosed(-15, 0));
      this.field_1205 = new class_2439(this.field_1190, IntStream.rangeClosed(-7, 0));
      this.field_1193 = (class_5580)(!var9.method_40520()
         ? new class_2439(this.field_1190, IntStream.rangeClosed(-3, 0))
         : new class_6830(this.field_1190, IntStream.rangeClosed(-3, 0)));
      this.field_1190.method_39868(2620);
      this.field_1187 = new class_2439(this.field_1190, IntStream.rangeClosed(-15, 0));
      if (!var9.method_40515()) {
         this.field_1199 = null;
      } else {
         class_8679 var10 = new class_8679(var3);
         var10.method_39868(17292);
         this.field_1199 = new class_6567(var10);
      }
   }

   @Override
   public Codec<? extends class_6541> method_29835() {
      return field_1204;
   }

   @Override
   public class_6541 method_29828(long var1) {
      return new class_322(this.field_33263.method_16083(var1), var1, this.field_1186);
   }

   public boolean method_1503(long var1, class_5621<class_7902> var3) {
      return this.field_1184 == var1 && this.field_1186.get().method_35714(var3);
   }

   private double method_1502(int var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      double var14 = 0.0;
      double var16 = 0.0;
      double var18 = 0.0;
      boolean var20 = true;
      double var21 = 1.0;

      for (int var23 = 0; var23 < 16; var23++) {
         double var24 = class_2439.method_11113((double)var1 * var4 * var21);
         double var26 = class_2439.method_11113((double)var2 * var6 * var21);
         double var28 = class_2439.method_11113((double)var3 * var4 * var21);
         double var30 = var6 * var21;
         class_5652 var32 = this.field_1198.method_11114(var23);
         if (var32 != null) {
            var14 += var32.method_25572(var24, var26, var28, var30, (double)var2 * var30) / var21;
         }

         class_5652 var33 = this.field_1197.method_11114(var23);
         if (var33 != null) {
            var16 += var33.method_25572(var24, var26, var28, var30, (double)var2 * var30) / var21;
         }

         if (var23 < 8) {
            class_5652 var34 = this.field_1205.method_11114(var23);
            if (var34 != null) {
               var18 += var34.method_25572(
                     class_2439.method_11113((double)var1 * var8 * var21),
                     class_2439.method_11113((double)var2 * var10 * var21),
                     class_2439.method_11113((double)var3 * var8 * var21),
                     var10 * var21,
                     (double)var2 * var10 * var21
                  )
                  / var21;
            }
         }

         var21 /= 2.0;
      }

      return class_9299.method_42841(var14 / 512.0, var16 / 512.0, (var18 / 10.0 + 1.0) / 2.0);
   }

   private double[] method_1501(int var1, int var2) {
      double[] var5 = new double[this.field_1201 + 1];
      this.method_1506(var5, var1, var2);
      return var5;
   }

   private void method_1506(double[] var1, int var2, int var3) {
      class_8822 var6 = this.field_1186.get().method_35723();
      double var14;
      double var16;
      if (this.field_1199 == null) {
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = 0.0F;
         byte var10 = 2;
         int var11 = this.method_29816();
         float var12 = this.field_33263.method_28192(var2, var11, var3).method_28868();

         for (int var13 = -2; var13 <= 2; var13++) {
            for (int var18 = -2; var18 <= 2; var18++) {
               class_6325 var23 = this.field_33263.method_28192(var2 + var13, var11, var3 + var18);
               float var24 = var23.method_28868();
               float var25 = var23.method_28856();
               float var26;
               float var27;
               if (var6.method_40514() && var24 > 0.0F) {
                  var26 = 1.0F + var24 * 2.0F;
                  var27 = 1.0F + var25 * 4.0F;
               } else {
                  var26 = var24;
                  var27 = var25;
               }

               float var28 = !(var24 > var12) ? 1.0F : 0.5F;
               float var29 = var28 * field_1203[var13 + 2 + (var18 + 2) * 5] / (var26 + 2.0F);
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
         var14 = (double)(class_8627.method_39623(this.field_1199, var2, var3) - 8.0F);
         if (!(var14 > 0.0)) {
            var16 = 1.0;
         } else {
            var16 = 0.25;
         }
      }

      double var30 = 684.412 * var6.method_40517().method_23229();
      double var32 = 684.412 * var6.method_40517().method_23226();
      double var34 = var30 / var6.method_40517().method_23227();
      double var36 = var32 / var6.method_40517().method_23228();
      double var65 = (double)var6.method_40509().method_17946();
      double var66 = (double)var6.method_40509().method_17945();
      double var38 = (double)var6.method_40509().method_17944();
      double var40 = (double)var6.method_40513().method_17946();
      double var42 = (double)var6.method_40513().method_17945();
      double var44 = (double)var6.method_40513().method_17944();
      double var46 = !var6.method_40519() ? 0.0 : this.method_1504(var2, var3);
      double var48 = var6.method_40510();
      double var50 = var6.method_40512();

      for (int var52 = 0; var52 <= this.field_1201; var52++) {
         double var53 = this.method_1502(var2, var52, var3, var30, var32, var34, var36);
         double var55 = 1.0 - (double)var52 * 2.0 / (double)this.field_1201 + var46;
         double var57 = var55 * var48 + var50;
         double var59 = (var57 + var14) * var16;
         if (!(var59 > 0.0)) {
            var53 += var59;
         } else {
            var53 += var59 * 4.0;
         }

         if (var66 > 0.0) {
            double var61 = ((double)(this.field_1201 - var52) - var38) / var66;
            var53 = class_9299.method_42841(var65, var53, var61);
         }

         if (var42 > 0.0) {
            double var68 = ((double)var52 - var44) / var42;
            var53 = class_9299.method_42841(var40, var53, var68);
         }

         var1[var52] = var53;
      }
   }

   private double method_1504(int var1, int var2) {
      double var5 = this.field_1187.method_11118((double)(var1 * 200), 10.0, (double)(var2 * 200), 1.0, 0.0, true);
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
   public int method_29830(int var1, int var2, class_3801 var3) {
      return this.method_1500(var1, var2, (class_2522[])null, var3.method_17675());
   }

   @Override
   public class_6163 method_29822(int var1, int var2) {
      class_2522[] var5 = new class_2522[this.field_1201 * this.field_1196];
      this.method_1500(var1, var2, var5, (Predicate<class_2522>)null);
      return new class_4795(var5);
   }

   private int method_1500(int var1, int var2, class_2522[] var3, Predicate<class_2522> var4) {
      int var7 = Math.floorDiv(var1, this.field_1202);
      int var8 = Math.floorDiv(var2, this.field_1202);
      int var9 = Math.floorMod(var1, this.field_1202);
      int var10 = Math.floorMod(var2, this.field_1202);
      double var11 = (double)var9 / (double)this.field_1202;
      double var13 = (double)var10 / (double)this.field_1202;
      double[][] var15 = new double[][]{
         this.method_1501(var7, var8), this.method_1501(var7, var8 + 1), this.method_1501(var7 + 1, var8), this.method_1501(var7 + 1, var8 + 1)
      };

      for (int var16 = this.field_1201 - 1; var16 >= 0; var16--) {
         double var17 = var15[0][var16];
         double var19 = var15[1][var16];
         double var21 = var15[2][var16];
         double var23 = var15[3][var16];
         double var25 = var15[0][var16 + 1];
         double var27 = var15[1][var16 + 1];
         double var29 = var15[2][var16 + 1];
         double var31 = var15[3][var16 + 1];

         for (int var33 = this.field_1196 - 1; var33 >= 0; var33--) {
            double var34 = (double)var33 / (double)this.field_1196;
            double var36 = class_9299.method_42807(var34, var11, var13, var17, var25, var21, var29, var19, var27, var23, var31);
            int var38 = var16 * this.field_1196 + var33;
            class_2522 var39 = this.method_1509(var36, var38);
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

   public class_2522 method_1509(double var1, int var3) {
      class_2522 var6;
      if (!(var1 > 0.0)) {
         if (var3 >= this.method_29816()) {
            var6 = field_1189;
         } else {
            var6 = this.field_1200;
         }
      } else {
         var6 = this.field_1191;
      }

      return var6;
   }

   @Override
   public void method_29814(class_702 var1, class_5990 var2) {
      class_2034 var5 = var2.method_27352();
      int var6 = var5.field_10328;
      int var7 = var5.field_10327;
      class_8679 var8 = new class_8679();
      var8.method_39864(var6, var7);
      class_2034 var9 = var2.method_27352();
      int var10 = var9.method_9535();
      int var11 = var9.method_9545();
      double var12 = 0.0625;
      class_2921 var14 = new class_2921();

      for (int var15 = 0; var15 < 16; var15++) {
         for (int var16 = 0; var16 < 16; var16++) {
            int var17 = var10 + var15;
            int var18 = var11 + var16;
            int var19 = var2.method_27367(class_3801.field_18598, var15, var16) + 1;
            double var20 = this.field_1193.method_25346((double)var17 * 0.0625, (double)var18 * 0.0625, 0.0625, (double)var15 * 0.0625) * 15.0;
            var1.method_22561(var14.method_13362(var10 + var15, var19, var11 + var16))
               .method_28884(var8, var2, var17, var18, var19, var20, this.field_1191, this.field_1200, this.method_29816(), var1.method_3133());
         }
      }

      this.method_1507(var2, var8);
   }

   private void method_1507(class_5990 var1, Random var2) {
      class_2921 var5 = new class_2921();
      int var6 = var1.method_27352().method_9535();
      int var7 = var1.method_27352().method_9545();
      class_7902 var8 = this.field_1186.get();
      int var9 = var8.method_35727();
      int var10 = this.field_1194 - 1 - var8.method_35717();
      byte var11 = 5;
      boolean var12 = var10 + 4 >= 0 && var10 < this.field_1194;
      boolean var13 = var9 + 4 >= 0 && var9 < this.field_1194;
      if (var12 || var13) {
         for (class_1331 var15 : class_1331.method_6075(var6, 0, var7, var6 + 15, 0, var7 + 15)) {
            if (var12) {
               for (int var16 = 0; var16 < 5; var16++) {
                  if (var16 <= var2.nextInt(5)) {
                     var1.method_27348(
                        var5.method_13362(var15.method_12173(), var10 - var16, var15.method_12185()), class_4783.field_23433.method_29260(), false
                     );
                  }
               }
            }

            if (var13) {
               for (int var17 = 4; var17 >= 0; var17--) {
                  if (var17 <= var2.nextInt(5)) {
                     var1.method_27348(
                        var5.method_13362(var15.method_12173(), var9 + var17, var15.method_12185()), class_4783.field_23433.method_29260(), false
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_29824(class_9379 var1, class_2033 var2, class_5990 var3) {
      ObjectArrayList var6 = new ObjectArrayList(10);
      ObjectArrayList var7 = new ObjectArrayList(32);
      class_2034 var8 = var3.method_27352();
      int var9 = var8.field_10328;
      int var10 = var8.field_10327;
      int var11 = var9 << 4;
      int var12 = var10 << 4;

      for (class_5390 var14 : class_5390.field_27502) {
         var2.method_9531(class_6979.method_31922(var8, 0), var14).forEach(var5 -> {
            for (class_7060 var9x : var5.method_14736()) {
               if (var9x.method_32510(var8, 12)) {
                  if (!(var9x instanceof class_7624)) {
                     var6.add(var9x);
                  } else {
                     class_7624 var10x = (class_7624)var9x;
                     class_7599 var11x = var10x.method_34553().method_11834();
                     if (var11x == class_7599.field_38708) {
                        var6.add(var10x);
                     }

                     for (class_98 var13 : var10x.method_34554()) {
                        int var14x = var13.method_290();
                        int var15x = var13.method_286();
                        if (var14x > var11 - 12 && var15x > var12 - 12 && var14x < var11 + 15 + 12 && var15x < var12 + 15 + 12) {
                           var7.add(var13);
                        }
                     }
                  }
               }
            }
         });
      }

      double[][][] var77 = new double[2][this.field_1192 + 1][this.field_1201 + 1];

      for (int var78 = 0; var78 < this.field_1192 + 1; var78++) {
         var77[0][var78] = new double[this.field_1201 + 1];
         this.method_1506(var77[0][var78], var9 * this.field_1195, var10 * this.field_1192 + var78);
         var77[1][var78] = new double[this.field_1201 + 1];
      }

      class_7481 var79 = (class_7481)var3;
      class_2131 var15 = var79.method_27353(class_3801.field_18591);
      class_2131 var16 = var79.method_27353(class_3801.field_18598);
      class_2921 var17 = new class_2921();
      ObjectListIterator var18 = var6.iterator();
      ObjectListIterator var19 = var7.iterator();

      for (int var20 = 0; var20 < this.field_1195; var20++) {
         for (int var21 = 0; var21 < this.field_1192 + 1; var21++) {
            this.method_1506(var77[1][var21], var9 * this.field_1195 + var20 + 1, var10 * this.field_1192 + var21);
         }

         for (int var80 = 0; var80 < this.field_1192; var80++) {
            class_1315 var22 = var79.method_34031(15);
            var22.method_5992();

            for (int var23 = this.field_1201 - 1; var23 >= 0; var23--) {
               double var24 = var77[0][var80][var23];
               double var26 = var77[0][var80 + 1][var23];
               double var28 = var77[1][var80][var23];
               double var30 = var77[1][var80 + 1][var23];
               double var32 = var77[0][var80][var23 + 1];
               double var34 = var77[0][var80 + 1][var23 + 1];
               double var36 = var77[1][var80][var23 + 1];
               double var38 = var77[1][var80 + 1][var23 + 1];

               for (int var40 = this.field_1196 - 1; var40 >= 0; var40--) {
                  int var41 = var23 * this.field_1196 + var40;
                  int var42 = var41 & 15;
                  int var43 = var41 >> 4;
                  if (var22.method_5997() >> 4 != var43) {
                     var22.method_5987();
                     var22 = var79.method_34031(var43);
                     var22.method_5992();
                  }

                  double var44 = (double)var40 / (double)this.field_1196;
                  double var46 = class_9299.method_42794(var44, var24, var32);
                  double var48 = class_9299.method_42794(var44, var28, var36);
                  double var50 = class_9299.method_42794(var44, var26, var34);
                  double var52 = class_9299.method_42794(var44, var30, var38);

                  for (int var54 = 0; var54 < this.field_1202; var54++) {
                     int var55 = var11 + var20 * this.field_1202 + var54;
                     int var56 = var55 & 15;
                     double var57 = (double)var54 / (double)this.field_1202;
                     double var59 = class_9299.method_42794(var57, var46, var48);
                     double var61 = class_9299.method_42794(var57, var50, var52);

                     for (int var63 = 0; var63 < this.field_1202; var63++) {
                        int var64 = var12 + var80 * this.field_1202 + var63;
                        int var65 = var64 & 15;
                        double var66 = (double)var63 / (double)this.field_1202;
                        double var68 = class_9299.method_42794(var66, var59, var61);
                        double var70 = class_9299.method_42827(var68 / 200.0, -1.0, 1.0);
                        var70 = var70 / 2.0 - var70 * var70 * var70 / 24.0;

                        while (var18.hasNext()) {
                           class_7060 var72 = (class_7060)var18.next();
                           class_9616 var73 = var72.method_32512();
                           int var74 = Math.max(0, Math.max(var73.field_48996 - var55, var55 - var73.field_48991));
                           int var75 = var41 - (var73.field_48995 + (!(var72 instanceof class_7624) ? 0 : ((class_7624)var72).method_34558()));
                           int var76 = Math.max(0, Math.max(var73.field_48992 - var64, var64 - var73.field_48994));
                           var70 += method_1505(var74, var75, var76) * 0.8;
                        }

                        var18.back(var6.size());

                        while (var19.hasNext()) {
                           class_98 var83 = (class_98)var19.next();
                           int var85 = var55 - var83.method_290();
                           int var86 = var41 - var83.method_285();
                           int var87 = var64 - var83.method_286();
                           var70 += method_1505(var85, var86, var87) * 0.4;
                        }

                        var19.back(var7.size());
                        class_2522 var84 = this.method_1509(var70, var41);
                        if (var84 != field_1189) {
                           if (var84.method_8339() != 0) {
                              var17.method_13362(var55, var41, var64);
                              var79.method_34021(var17);
                           }

                           var22.method_5989(var56, var42, var65, var84, false);
                           var15.method_9958(var56, var41, var65, var84);
                           var16.method_9958(var56, var41, var65, var84);
                        }
                     }
                  }
               }
            }

            var22.method_5987();
         }

         double[][] var81 = var77[0];
         var77[0] = var77[1];
         var77[1] = var81;
      }
   }

   private static double method_1505(int var0, int var1, int var2) {
      int var5 = var0 + 12;
      int var6 = var1 + 12;
      int var7 = var2 + 12;
      if (var5 < 0 || var5 >= 24) {
         return 0.0;
      } else if (var6 >= 0 && var6 < 24) {
         return var7 >= 0 && var7 < 24 ? (double)field_1188[var7 * 24 * 24 + var5 * 24 + var6] : 0.0;
      } else {
         return 0.0;
      }
   }

   private static double method_1508(int var0, int var1, int var2) {
      double var5 = (double)(var0 * var0 + var2 * var2);
      double var7 = (double)var1 + 0.5;
      double var9 = var7 * var7;
      double var11 = Math.pow(Math.E, -(var9 / 16.0 + var5 / 16.0));
      double var13 = -var7 * class_9299.method_42835(var9 / 2.0 + var5 / 2.0) / 2.0;
      return var13 * var11;
   }

   @Override
   public int method_29826() {
      return this.field_1194;
   }

   @Override
   public int method_29816() {
      return this.field_1186.get().method_35724();
   }

   @Override
   public List<class_3222> method_29836(class_6325 var1, class_2033 var2, class_4565 var3, class_1331 var4) {
      if (var2.method_9525(var4, true, class_5390.field_27515).method_14731()) {
         if (var3 == class_4565.field_22247) {
            return class_5390.field_27515.method_24557();
         }

         if (var3 == class_4565.field_22239) {
            return class_5390.field_27515.method_24550();
         }
      }

      if (var3 == class_4565.field_22247) {
         if (var2.method_9525(var4, false, class_5390.field_27518).method_14731()) {
            return class_5390.field_27518.method_24557();
         }

         if (var2.method_9525(var4, false, class_5390.field_27509).method_14731()) {
            return class_5390.field_27509.method_24557();
         }

         if (var2.method_9525(var4, true, class_5390.field_27510).method_14731()) {
            return class_5390.field_27510.method_24557();
         }
      }

      return super.method_29836(var1, var2, var3, var4);
   }

   @Override
   public void method_29815(class_702 var1) {
      if (!this.field_1186.get().method_35725()) {
         int var4 = var1.method_3137();
         int var5 = var1.method_3139();
         class_6325 var6 = var1.method_22561(new class_2034(var4, var5).method_9546());
         class_8679 var7 = new class_8679();
         var7.method_39867(var1.method_3133(), var4 << 4, var5 << 4);
         class_3815.method_17764(var1, var6, var4, var5, var7);
      }
   }
}
