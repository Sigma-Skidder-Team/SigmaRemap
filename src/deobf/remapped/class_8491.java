package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.annotation.Nullable;

public class class_8491 {
   private static String[] field_43503;
   private final Random field_43504;
   private final class_4456 field_43506;
   private final class_4456 field_43502;
   private final class_4456[] field_43500;
   private final int field_43505;
   private final int field_43501;

   public class_8491(Random var1) {
      this.field_43504 = var1;
      byte var4 = 11;
      this.field_43505 = 7;
      this.field_43501 = 4;
      this.field_43506 = new class_4456(11, 11, 5);
      this.field_43506.method_20659(this.field_43505, this.field_43501, this.field_43505 + 1, this.field_43501 + 1, 3);
      this.field_43506.method_20659(this.field_43505 - 1, this.field_43501, this.field_43505 - 1, this.field_43501 + 1, 2);
      this.field_43506.method_20659(this.field_43505 + 2, this.field_43501 - 2, this.field_43505 + 3, this.field_43501 + 3, 5);
      this.field_43506.method_20659(this.field_43505 + 1, this.field_43501 - 2, this.field_43505 + 1, this.field_43501 - 1, 1);
      this.field_43506.method_20659(this.field_43505 + 1, this.field_43501 + 2, this.field_43505 + 1, this.field_43501 + 3, 1);
      this.field_43506.method_20658(this.field_43505 - 1, this.field_43501 - 1, 1);
      this.field_43506.method_20658(this.field_43505 - 1, this.field_43501 + 2, 1);
      this.field_43506.method_20659(0, 0, 11, 1, 5);
      this.field_43506.method_20659(0, 9, 11, 11, 5);
      this.method_39137(this.field_43506, this.field_43505, this.field_43501 - 2, class_240.field_809, 6);
      this.method_39137(this.field_43506, this.field_43505, this.field_43501 + 3, class_240.field_809, 6);
      this.method_39137(this.field_43506, this.field_43505 - 2, this.field_43501 - 1, class_240.field_809, 3);
      this.method_39137(this.field_43506, this.field_43505 - 2, this.field_43501 + 2, class_240.field_809, 3);

      while (this.method_39141(this.field_43506)) {
      }

      this.field_43500 = new class_4456[3];
      this.field_43500[0] = new class_4456(11, 11, 5);
      this.field_43500[1] = new class_4456(11, 11, 5);
      this.field_43500[2] = new class_4456(11, 11, 5);
      this.method_39132(this.field_43506, this.field_43500[0]);
      this.method_39132(this.field_43506, this.field_43500[1]);
      this.field_43500[0].method_20659(this.field_43505 + 1, this.field_43501, this.field_43505 + 1, this.field_43501 + 1, 8388608);
      this.field_43500[1].method_20659(this.field_43505 + 1, this.field_43501, this.field_43505 + 1, this.field_43501 + 1, 8388608);
      this.field_43502 = new class_4456(class_4456.method_20664(this.field_43506), class_4456.method_20660(this.field_43506), 5);
      this.method_39140();
      this.method_39132(this.field_43502, this.field_43500[2]);
   }

   public static boolean method_39134(class_4456 var0, int var1, int var2) {
      int var5 = var0.method_20665(var1, var2);
      return var5 == 1 || var5 == 2 || var5 == 3 || var5 == 4;
   }

   public boolean method_39138(class_4456 var1, int var2, int var3, int var4, int var5) {
      return (this.field_43500[var4].method_20665(var2, var3) & 65535) == var5;
   }

   @Nullable
   public class_240 method_39130(class_4456 var1, int var2, int var3, int var4, int var5) {
      for (class_240 var9 : class_9594.field_48893) {
         if (this.method_39138(var1, var2 + var9.method_1041(), var3 + var9.method_1034(), var4, var5)) {
            return var9;
         }
      }

      return null;
   }

   private void method_39137(class_4456 var1, int var2, int var3, class_240 var4, int var5) {
      if (var5 > 0) {
         var1.method_20658(var2, var3, 1);
         var1.method_20661(var2 + var4.method_1041(), var3 + var4.method_1034(), 0, 1);

         for (int var8 = 0; var8 < 8; var8++) {
            class_240 var9 = class_240.method_1040(this.field_43504.nextInt(4));
            if (var9 != var4.method_1046() && (var9 != class_240.field_804 || !this.field_43504.nextBoolean())) {
               int var10 = var2 + var4.method_1041();
               int var11 = var3 + var4.method_1034();
               if (var1.method_20665(var10 + var9.method_1041(), var11 + var9.method_1034()) == 0
                  && var1.method_20665(var10 + var9.method_1041() * 2, var11 + var9.method_1034() * 2) == 0) {
                  this.method_39137(var1, var2 + var4.method_1041() + var9.method_1041(), var3 + var4.method_1034() + var9.method_1034(), var9, var5 - 1);
                  break;
               }
            }
         }

         class_240 var12 = var4.method_1042();
         class_240 var13 = var4.method_1053();
         var1.method_20661(var2 + var12.method_1041(), var3 + var12.method_1034(), 0, 2);
         var1.method_20661(var2 + var13.method_1041(), var3 + var13.method_1034(), 0, 2);
         var1.method_20661(var2 + var4.method_1041() + var12.method_1041(), var3 + var4.method_1034() + var12.method_1034(), 0, 2);
         var1.method_20661(var2 + var4.method_1041() + var13.method_1041(), var3 + var4.method_1034() + var13.method_1034(), 0, 2);
         var1.method_20661(var2 + var4.method_1041() * 2, var3 + var4.method_1034() * 2, 0, 2);
         var1.method_20661(var2 + var12.method_1041() * 2, var3 + var12.method_1034() * 2, 0, 2);
         var1.method_20661(var2 + var13.method_1041() * 2, var3 + var13.method_1034() * 2, 0, 2);
      }
   }

   private boolean method_39141(class_4456 var1) {
      boolean var4 = false;

      for (int var5 = 0; var5 < class_4456.method_20660(var1); var5++) {
         for (int var6 = 0; var6 < class_4456.method_20664(var1); var6++) {
            if (var1.method_20665(var6, var5) == 0) {
               int var7 = 0;
               var7 += !method_39134(var1, var6 + 1, var5) ? 0 : 1;
               var7 += !method_39134(var1, var6 - 1, var5) ? 0 : 1;
               var7 += !method_39134(var1, var6, var5 + 1) ? 0 : 1;
               var7 += !method_39134(var1, var6, var5 - 1) ? 0 : 1;
               if (var7 < 3) {
                  if (var7 == 2) {
                     int var8 = 0;
                     var8 += !method_39134(var1, var6 + 1, var5 + 1) ? 0 : 1;
                     var8 += !method_39134(var1, var6 - 1, var5 + 1) ? 0 : 1;
                     var8 += !method_39134(var1, var6 + 1, var5 - 1) ? 0 : 1;
                     var8 += !method_39134(var1, var6 - 1, var5 - 1) ? 0 : 1;
                     if (var8 <= 1) {
                        var1.method_20658(var6, var5, 2);
                        var4 = true;
                     }
                  }
               } else {
                  var1.method_20658(var6, var5, 2);
                  var4 = true;
               }
            }
         }
      }

      return var4;
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_39140() {
      ArrayList var3 = Lists.newArrayList();
      class_4456 var4 = this.field_43500[1];

      for (int var5 = 0; var5 < class_4456.method_20660(this.field_43502); var5++) {
         for (int var6 = 0; var6 < class_4456.method_20664(this.field_43502); var6++) {
            int var7 = var4.method_20665(var6, var5);
            <unknown> var8;
            if (var8_1 == 131072 && (var7 & 2097152) == 2097152) {
               var3.add(new class_947<Integer, Integer>(var6, var5));
            }
         }
      }

      if (!var3.isEmpty()) {
         class_947 var13 = (class_947)var3.get(this.field_43504.nextInt(var3.size()));
         int var14 = var4.method_20665((Integer)var13.method_4141(), (Integer)var13.method_4142());
         var4.method_20658((Integer)var13.method_4141(), (Integer)var13.method_4142(), var14 | 4194304);
         class_240 var15 = this.method_39130(this.field_43506, (Integer)var13.method_4141(), (Integer)var13.method_4142(), 1, var14 & 65535);
         int var16 = (Integer)var13.method_4141() + var15.method_1041();
         int var9 = (Integer)var13.method_4142() + var15.method_1034();

         for (int var10 = 0; var10 < class_4456.method_20660(this.field_43502); var10++) {
            for (int var11 = 0; var11 < class_4456.method_20664(this.field_43502); var11++) {
               if (method_39134(this.field_43506, var11, var10)) {
                  if (var11 == (Integer)var13.method_4141() && var10 == (Integer)var13.method_4142()) {
                     this.field_43502.method_20658(var11, var10, 3);
                  } else if (var11 == var16 && var10 == var9) {
                     this.field_43502.method_20658(var11, var10, 3);
                     this.field_43500[2].method_20658(var11, var10, 8388608);
                  }
               } else {
                  this.field_43502.method_20658(var11, var10, 5);
               }
            }
         }

         ArrayList var17 = Lists.newArrayList();

         for (class_240 var12 : class_9594.field_48893) {
            if (this.field_43502.method_20665(var16 + var12.method_1041(), var9 + var12.method_1034()) == 0) {
               var17.add(var12);
            }
         }

         if (!var17.isEmpty()) {
            class_240 var19 = (class_240)var17.get(this.field_43504.nextInt(var17.size()));
            this.method_39137(this.field_43502, var16 + var19.method_1041(), var9 + var19.method_1034(), var19, 4);

            while (this.method_39141(this.field_43502)) {
            }
         } else {
            this.field_43502.method_20659(0, 0, class_4456.method_20664(this.field_43502), class_4456.method_20660(this.field_43502), 5);
            var4.method_20658((Integer)var13.method_4141(), (Integer)var13.method_4142(), var14);
         }
      } else {
         this.field_43502.method_20659(0, 0, class_4456.method_20664(this.field_43502), class_4456.method_20660(this.field_43502), 5);
      }
   }

   private void method_39132(class_4456 var1, class_4456 var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < class_4456.method_20660(var1); var6++) {
         for (int var7 = 0; var7 < class_4456.method_20664(var1); var7++) {
            if (var1.method_20665(var7, var6) == 2) {
               var5.add(new class_947<Integer, Integer>(var7, var6));
            }
         }
      }

      Collections.shuffle(var5, this.field_43504);
      int var21 = 10;

      for (class_947 var8 : var5) {
         int var9 = (Integer)var8.method_4141();
         int var10 = (Integer)var8.method_4142();
         if (var2.method_20665(var9, var10) == 0) {
            int var11 = var9;
            int var12 = var9;
            int var13 = var10;
            int var14 = var10;
            int var15 = 65536;
            if (var2.method_20665(var9 + 1, var10) == 0
               && var2.method_20665(var9, var10 + 1) == 0
               && var2.method_20665(var9 + 1, var10 + 1) == 0
               && var1.method_20665(var9 + 1, var10) == 2
               && var1.method_20665(var9, var10 + 1) == 2
               && var1.method_20665(var9 + 1, var10 + 1) == 2) {
               var12 = var9 + 1;
               var14 = var10 + 1;
               var15 = 262144;
            } else if (var2.method_20665(var9 - 1, var10) == 0
               && var2.method_20665(var9, var10 + 1) == 0
               && var2.method_20665(var9 - 1, var10 + 1) == 0
               && var1.method_20665(var9 - 1, var10) == 2
               && var1.method_20665(var9, var10 + 1) == 2
               && var1.method_20665(var9 - 1, var10 + 1) == 2) {
               var11 = var9 - 1;
               var14 = var10 + 1;
               var15 = 262144;
            } else if (var2.method_20665(var9 - 1, var10) == 0
               && var2.method_20665(var9, var10 - 1) == 0
               && var2.method_20665(var9 - 1, var10 - 1) == 0
               && var1.method_20665(var9 - 1, var10) == 2
               && var1.method_20665(var9, var10 - 1) == 2
               && var1.method_20665(var9 - 1, var10 - 1) == 2) {
               var11 = var9 - 1;
               var13 = var10 - 1;
               var15 = 262144;
            } else if (var2.method_20665(var9 + 1, var10) == 0 && var1.method_20665(var9 + 1, var10) == 2) {
               var12 = var9 + 1;
               var15 = 131072;
            } else if (var2.method_20665(var9, var10 + 1) == 0 && var1.method_20665(var9, var10 + 1) == 2) {
               var14 = var10 + 1;
               var15 = 131072;
            } else if (var2.method_20665(var9 - 1, var10) == 0 && var1.method_20665(var9 - 1, var10) == 2) {
               var11 = var9 - 1;
               var15 = 131072;
            } else if (var2.method_20665(var9, var10 - 1) == 0 && var1.method_20665(var9, var10 - 1) == 2) {
               var13 = var10 - 1;
               var15 = 131072;
            }

            int var16 = !this.field_43504.nextBoolean() ? var12 : var11;
            int var17 = !this.field_43504.nextBoolean() ? var14 : var13;
            int var18 = 2097152;
            if (!var1.method_20663(var16, var17, 1)) {
               var16 = var16 != var11 ? var11 : var12;
               var17 = var17 != var13 ? var13 : var14;
               if (!var1.method_20663(var16, var17, 1)) {
                  var17 = var17 != var13 ? var13 : var14;
                  if (!var1.method_20663(var16, var17, 1)) {
                     var16 = var16 != var11 ? var11 : var12;
                     var17 = var17 != var13 ? var13 : var14;
                     if (!var1.method_20663(var16, var17, 1)) {
                        var18 = 0;
                        var16 = var11;
                        var17 = var13;
                     }
                  }
               }
            }

            for (int var19 = var13; var19 <= var14; var19++) {
               for (int var20 = var11; var20 <= var12; var20++) {
                  if (var20 == var16 && var19 == var17) {
                     var2.method_20658(var20, var19, 1048576 | var18 | var15 | var21);
                  } else {
                     var2.method_20658(var20, var19, var15 | var21);
                  }
               }
            }

            var21++;
         }
      }
   }
}
