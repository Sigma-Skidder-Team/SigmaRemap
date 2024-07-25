package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class class_6062<C extends class_9472> {
   public static final class_6062<class_4080> field_31015 = method_27721("cave", new class_4107(class_4080.field_19858, 256));
   public static final class_6062<class_4080> field_31007 = method_27721("nether_cave", new class_1501(class_4080.field_19858));
   public static final class_6062<class_4080> field_31012 = method_27721("canyon", new class_9686(class_4080.field_19858));
   public static final class_6062<class_4080> field_31005 = method_27721("underwater_canyon", new class_3099(class_4080.field_19858));
   public static final class_6062<class_4080> field_31014 = method_27721("underwater_cave", new class_1943(class_4080.field_19858));
   public static final class_2522 field_31013 = class_4783.field_23184.method_29260();
   public static final class_2522 field_31009 = class_4783.field_23765.method_29260();
   public static final class_4774 field_31006 = class_8532.field_43674.method_10710();
   public static final class_4774 field_31008 = class_8532.field_43675.method_10710();
   public Set<class_6414> field_31004 = ImmutableSet.of(
      class_4783.field_23644,
      class_4783.field_23695,
      class_4783.field_23440,
      class_4783.field_23271,
      class_4783.field_23592,
      class_4783.field_23577,
      new class_6414[]{
         class_4783.field_23201,
         class_4783.field_23259,
         class_4783.field_23344,
         class_4783.field_23264,
         class_4783.field_23486,
         class_4783.field_23908,
         class_4783.field_23840,
         class_4783.field_23243,
         class_4783.field_23857,
         class_4783.field_23625,
         class_4783.field_23198,
         class_4783.field_23229,
         class_4783.field_23387,
         class_4783.field_23816,
         class_4783.field_23793,
         class_4783.field_23330,
         class_4783.field_23773,
         class_4783.field_23659,
         class_4783.field_23711,
         class_4783.field_23459,
         class_4783.field_23160,
         class_4783.field_23162,
         class_4783.field_23552,
         class_4783.field_23829
      }
   );
   public Set<class_2340> field_31010 = ImmutableSet.of(class_8532.field_43674);
   private final Codec<class_987<C>> field_31003;
   public final int field_31011;

   private static <C extends class_9472, F extends class_6062<C>> F method_27721(String var0, F var1) {
      return class_8669.<F>method_39791(class_8669.field_44368, var0, (F)var1);
   }

   public class_6062(Codec<C> var1, int var2) {
      this.field_31011 = var2;
      this.field_31003 = var1.fieldOf("config").xmap(this::method_27724, class_987::method_4313).codec();
   }

   public class_987<C> method_27724(C var1) {
      return new class_987<C>(this, var1);
   }

   public Codec<class_987<C>> method_27729() {
      return this.field_31003;
   }

   public int method_27720() {
      return 4;
   }

   public boolean method_27730(
      class_5990 var1,
      Function<BlockPos, class_6325> var2,
      long var3,
      int var5,
      int var6,
      int var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      BitSet var18
   ) {
      Random var21 = new Random(var3 + (long)var6 + (long)var7);
      double var22 = (double)(var6 * 16 + 8);
      double var24 = (double)(var7 * 16 + 8);
      if (!(var8 < var22 - 16.0 - var14 * 2.0)
         && !(var12 < var24 - 16.0 - var14 * 2.0)
         && !(var8 > var22 + 16.0 + var14 * 2.0)
         && !(var12 > var24 + 16.0 + var14 * 2.0)) {
         int var26 = Math.max(class_9299.method_42847(var8 - var14) - var6 * 16 - 1, 0);
         int var27 = Math.min(class_9299.method_42847(var8 + var14) - var6 * 16 + 1, 16);
         int var28 = Math.max(class_9299.method_42847(var10 - var16) - 1, 1);
         int var29 = Math.min(class_9299.method_42847(var10 + var16) + 1, this.field_31011 - 8);
         int var30 = Math.max(class_9299.method_42847(var12 - var14) - var7 * 16 - 1, 0);
         int var31 = Math.min(class_9299.method_42847(var12 + var14) - var7 * 16 + 1, 16);
         if (this.method_27723(var1, var6, var7, var26, var27, var28, var29, var30, var31)) {
            return false;
         } else {
            boolean var32 = false;
            class_2921 var33 = new class_2921();
            class_2921 var34 = new class_2921();
            class_2921 var35 = new class_2921();

            for (int var36 = var26; var36 < var27; var36++) {
               int var37 = var36 + var6 * 16;
               double var38 = ((double)var37 + 0.5 - var8) / var14;

               for (int var40 = var30; var40 < var31; var40++) {
                  int var41 = var40 + var7 * 16;
                  double var42 = ((double)var41 + 0.5 - var12) / var14;
                  if (!(var38 * var38 + var42 * var42 >= 1.0)) {
                     MutableBoolean var44 = new MutableBoolean(false);

                     for (int var45 = var29; var45 > var28; var45--) {
                        double var46 = ((double)var45 - 0.5 - var10) / var16;
                        if (!this.method_27725(var38, var46, var42, var45)) {
                           var32 |= this.method_27719(var1, var2, var18, var21, var33, var34, var35, var5, var6, var7, var37, var41, var36, var45, var40, var44);
                        }
                     }
                  }
               }
            }

            return var32;
         }
      } else {
         return false;
      }
   }

   public boolean method_27719(
      class_5990 var1,
      Function<BlockPos, class_6325> var2,
      BitSet var3,
      Random var4,
      class_2921 var5,
      class_2921 var6,
      class_2921 var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      MutableBoolean var16
   ) {
      int var19 = var13 | var15 << 4 | var14 << 8;
      if (var3.get(var19)) {
         return false;
      } else {
         var3.set(var19);
         var5.method_13362(var11, var14, var12);
         class_2522 var20 = var1.method_28262(var5);
         class_2522 var21 = var1.method_28262(var6.method_13371(var5, Direction.field_817));
         if (var20.method_8350(class_4783.field_23259) || var20.method_8350(class_4783.field_23162)) {
            var16.setTrue();
         }

         if (this.method_27733(var20, var21)) {
            if (var14 >= 11) {
               var1.method_27348(var5, field_31009, false);
               if (var16.isTrue()) {
                  var7.method_13371(var5, Direction.field_802);
                  if (var1.method_28262(var7).method_8350(class_4783.field_23592)) {
                     var1.method_27348(var7, ((class_6325)var2.apply(var5)).method_28875().method_9460().method_19215(), false);
                  }
               }
            } else {
               var1.method_27348(var5, field_31008.method_22006(), false);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public abstract boolean method_27722(
           class_5990 var1, Function<BlockPos, class_6325> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, C var10
   );

   public abstract boolean method_27726(Random var1, int var2, int var3, C var4);

   public boolean method_27731(class_2522 var1) {
      return this.field_31004.contains(var1.method_8360());
   }

   public boolean method_27733(class_2522 var1, class_2522 var2) {
      return this.method_27731(var1)
         || (var1.method_8350(class_4783.field_23216) || var1.method_8350(class_4783.field_23709)) && !var2.method_8364().method_22007(class_6503.field_33094);
   }

   public boolean method_27723(class_5990 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class_2921 var12 = new class_2921();

      for (int var13 = var4; var13 < var5; var13++) {
         for (int var14 = var8; var14 < var9; var14++) {
            for (int var15 = var6 - 1; var15 <= var7 + 1; var15++) {
               if (this.field_31010.contains(var1.method_28258(var12.method_13362(var13 + var2 * 16, var15, var14 + var3 * 16)).method_22005())) {
                  return true;
               }

               if (var15 != var7 + 1 && !this.method_27732(var4, var5, var8, var9, var13, var14)) {
                  var15 = var7;
               }
            }
         }
      }

      return false;
   }

   private boolean method_27732(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var5 == var1 || var5 == var2 - 1 || var6 == var3 || var6 == var4 - 1;
   }

   public boolean method_27727(int var1, int var2, double var3, double var5, int var7, int var8, float var9) {
      double var12 = (double)(var1 * 16 + 8);
      double var14 = (double)(var2 * 16 + 8);
      double var16 = var3 - var12;
      double var18 = var5 - var14;
      double var20 = (double)(var8 - var7);
      double var22 = (double)(var9 + 2.0F + 16.0F);
      return var16 * var16 + var18 * var18 - var20 * var20 <= var22 * var22;
   }

   public abstract boolean method_27725(double var1, double var3, double var5, int var7);
}
